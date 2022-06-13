package run;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import run.PlayerData.Player;

public class GameApp {
	final static Scanner sc = new Scanner(System.in);
	final static Random rdm = new Random();
	//イベント：大自然の脅威用配列。イベントの発生確率にあたる
	final static int[] attackN_E = {30,60,70,90};
	final static int[] attackN_N = {25,50,60,80};
	final static int[] attackN_H = {10,20,40,80};
	//イベント：アイテム発見用配列。イベントの発生確率にあたる
	final static int[] item_E = {10,30,60,75,95};
	final static int[] item_getEH = {25,40,75};
	final static int[] item_N = {20,35,50,60,90};
	final static int[] item_getN = {25,45,70};
	final static int[] item_H = {25,35,45,50,85};
	//セーブデータ管理用に使用する定数。
	final static int id_name = 0;
	final static int id_CampEv1 = 1;
	final static int id_CampEv2 = 2;
	final static int id_ED_Bad = 3;
	final static int id_ED_Good = 4;
	final static int id_ED_Best = 5;

	public static void main(String[] args){

		preparation();

		while(true) {
			String[] player_data = new String[6];
			try {
				player_data = player_data_read();
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}

			Player p = new Player(player_data[0]);
			try {
				player_data_reflect(p);
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}

			if(p.getName() == null || p.getName().length()<=0) {

				try {
					Directing_Title.showTitle_firstTime_name_entry();
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				while(true) {
					String input_name = sc.next();
					if(input_name.length() < 1 || input_name.length() > 6) {
						System.out.println("");
						System.out.println(" 1文字以上、6文字以内で入力してください。");
						System.out.println("");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						System.out.print(" >>");
					}else {
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.printf(" 「 %s 」 でよろしいですか？%n",input_name);
						System.out.println("");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						System.out.println("");
						System.out.println(" 【1】はい  【2】いいえ");
						System.out.println("");
						System.out.print(" >>");
						int input_num = sc.nextInt();

						if(input_num==1) {
							p.setName(input_name);
							List<Integer> update_name = new ArrayList<>();
							update_name.add(id_name);
							try {
								player_data_update(update_name,p);
							} catch (IOException e) {
								// TODO 自動生成された catch ブロック
								e.printStackTrace();
							}
							break;
						}else {
							for(int i=0;i<32;i++) {
								System.out.println("");
							}
							System.out.println("");
							System.out.println(" あなたの名前を入力してください (1文字以上、6文字以内)");
							System.out.println("");
							System.out.print(" >>");
						}
					}
				}

				System.out.println("");
				System.out.println(" 名前を登録しました。");
				System.out.println("");

				try {
					Thread.sleep(2000);
					for(int i=9;i<32;i++) {
						System.out.println("");
					}
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				Directing_Op.showOp(p);
				Directing_Tutorial.showTutorial();
			}else {
				Directing_Title.showTitle();
				int startSelect = sc.nextInt();
				if(startSelect==1) {
					try {
						Directing_Title.skip_select();
						int skipSelect = sc.nextInt();
						if(skipSelect == 2) {
							p.setSkipEvent_Already_Read(true);
						}else if(skipSelect == 3){
							p.setSkipEvent_All(true);
						}
						Directing_StartGame.showStartGame();
					} catch (InterruptedException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}
				}else if(startSelect==2) {
					Directing_Op.showOp(p);
					continue;
				}else if(startSelect==3) {
					Directing_Tutorial.showTutorial();
					continue;
				}else if(startSelect==4) {
					break;
				}else {
					continue;
				}
			}

			Hero h = new Hero();
			Sister s = new Sister();

			int[] before_pl_data = {
					h.getHp(),h.getMoney(),h.getItem_ointment(),h.getItem_gun(),h.getItem_smoke(),h.getItem_litter(),
			};

			//ゲームのメインループ
			//HPが0になる場合を除き、30ターン
			for(int i=9;i<30;i++) {

				try {
					Directing_GameMain.showAvant(i+1);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

				Directing_GameMain.showMain(h,i+1);
				int input = sc.nextInt();
				int hp = h.getHp();
				int money = h.getMoney();
				int[] before_action_pl_data = {
					h.getHp(),h.getMoney(),h.getItem_ointment(),h.getItem_gun(),h.getItem_smoke(),h.getItem_litter(),
				};

				//コマンド選択時に発生する処理。以後、戦闘判定→イベント判定を経由しながら
				switch(input) {
					//安全な道を選択した時の処理-----------------------------------------------------------------------------
					case 1:
						System.out.println();
						System.out.println("  =====================================================================================");
						System.out.println();
						System.out.println("    安全な道を進むことにした。");
						try {
							BattleJudgement(input,i,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						break;
					//普通の道を選択した時の処理-----------------------------------------------------------------------------
					case 2:
						System.out.println();
						System.out.println("  =====================================================================================");
						System.out.println();
						System.out.println("    普通の道を進むことにした。");
						try {
							BattleJudgement(input,i,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						break;
					//危険な道を選択した時の処理-----------------------------------------------------------------------------
					case 3:
						System.out.println();
						System.out.println("  =====================================================================================");
						System.out.println();
						System.out.println("    危険な道を進むことにした。");
						try {
							BattleJudgement(input,i,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						break;
					//傷薬を使用するときの処理、もし所持していない場合は安全な道を進むことになる。--------------------------
					default:
						if(h.getItem_ointment()>0) {
							h.setHp(hp+30);
							h.setItem_ointment(h.getItem_ointment()-1);
							System.out.println();
							System.out.println("  =====================================================================================");
							System.out.println();
							System.out.println("    傷薬を使用し、HPが30ポイント回復した！");
						}else {
							System.out.println();
							System.out.println("  =====================================================================================");
							System.out.println();
							System.out.println("    しかし、傷薬を持っていなかった！");
							System.out.println();
							System.out.println("    仕方がないので、安全な道を進むことにした……。");
							try {
								EventJudgement(1,i,h);
							} catch (InterruptedException e) {
								// TODO 自動生成された catch ブロック
								e.printStackTrace();
							}
							System.out.println();
							System.out.println("  =====================================================================================");
							System.out.println("    探索終了。");
						}
				}

				//戦闘で死亡した場合、ここでbreakし、死亡イベントへ移行
				if(h.getHp()<1) break;

				//コマンド選択時に発生する処理。以後、戦闘判定→イベント判定を経由しながら
				switch(input) {
					//安全な道を選択した時の処理-----------------------------------------------------------------------------
					case 1:
						try {
							EventJudgement(input,i,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						End_Turn(1,h);
						break;
					//普通の道を選択した時の処理-----------------------------------------------------------------------------
					case 2:
						try {
							EventJudgement(input,i,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						End_Turn(2,h);
						break;
					//危険な道を選択した時の処理-----------------------------------------------------------------------------
					case 3:
						try {
							EventJudgement(input,i,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						End_Turn(3,h);
						break;
					//傷薬を使用した場合の処理
					default:
						System.out.println();
						System.out.println("    その後は、再三の注意を払いながら、道を進んでいった……。");
						System.out.println();
						System.out.println("  =====================================================================================");
						System.out.println("    探索終了。");
						System.out.println();
				}

				//イベントで死亡した場合、ここでbreakし、死亡イベントへ移行
				if(h.getHp()<1) break;

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				if(i==9 || i==19) {

					sc.nextLine();
					System.out.println();
					System.out.println("    ※エンターキー入力で次へ進みます。");
					System.out.println();
					String turnendClick = sc.nextLine();

					boolean isFragCather = false;
					if(i==9 && p.isCampEvent_1()) {
						isFragCather = true;
					}else if(i==19 && p.isCampEvent_2()){
						isFragCather = true;
					}

					try {
						Camp.start_Camp(i,h,s,before_pl_data,p);
					} catch (InterruptedException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}

					if(i==9 && ! isFragCather) {
						if(p.isCampEvent_1()) {
							p.setCampEvent_1(true);
							List<Integer> update_CampEv1 = new ArrayList<>();
							update_CampEv1.add(id_CampEv1);
							try {
								player_data_update(update_CampEv1,p);
							} catch (IOException e) {
								// TODO 自動生成された catch ブロック
								e.printStackTrace();
							}
						}
					}else if(i==19 && ! isFragCather) {
						if(p.isCampEvent_2()) {
							p.setCampEvent_2(true);
							List<Integer> update_CampEv2 = new ArrayList<>();
							update_CampEv2.add(id_CampEv2);
							try {
								player_data_update(update_CampEv2,p);
							} catch (IOException e) {
								// TODO 自動生成された catch ブロック
								e.printStackTrace();
							}
						}
					}

					//次回の経過報告に向け、参照用のデータを更新
					before_pl_data[0] = h.getHp();
					before_pl_data[1] = h.getMoney();
					before_pl_data[2] = h.getItem_ointment();
					before_pl_data[3] = h.getItem_gun();
					before_pl_data[4] = h.getItem_smoke();
					before_pl_data[5] = h.getItem_litter();

				}else {
					dayResult(i,h,before_action_pl_data);

					sc.nextLine();
					System.out.println();
					System.out.println("      ※エンターキー入力で次へ進みます。");
					System.out.println();
					String turnendClick = sc.nextLine();
				}

			}

			//エンディングの分岐処理
			//エンディングは4種類で、１.HP0で死亡、2.借金が返せずLife is Over、3.生存+借金返済のはっぴーえんど。4は隠し（未実装）
			int ending = 0;
			boolean isEDCheck = false;
			if(h.getHp()<1) {
				ending = 0;
			}
			else if(h.getMoney()>=100) {
				ending = 1;
				isEDCheck = p.isEnding_Good();
				p.setEnding_Good(true);
				List<Integer> update_ED_G = new ArrayList<>();
				update_ED_G.add(id_ED_Good);
				try {
					player_data_update(update_ED_G,p);
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else {
				ending = 2;
				isEDCheck = p.isEnding_Bad();
				p.setEnding_Bad(true);
				List<Integer> update_ED_B = new ArrayList<>();
				update_ED_B.add(id_ED_Bad);
				try {
					player_data_update(update_ED_B,p);
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			try {
				if(!p.isSkipEvent_All()){
					if(!p.isSkipEvent_Already_Read() || !isEDCheck ) {
						Directing_Ending.showEnding(ending);
					}
				}

				Directing_Result.Result(h);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			sc.nextLine();
			String lastClick = sc.nextLine();

		}
		System.out.println("アプリケーションを終了します。");
	}

//---------------------------------------------------------------------------------------------------------------
//ゲームのメインループはここまで。
//以下では、メインループ中でインスタンスとして利用する、様々なクラスを設定。
//---------------------------------------------------------------------------------------------------------------

	public static String[] player_data_read() throws IOException {

		String[] read_data = new String[6];
		FileInputStream fis =new FileInputStream("src/run/PlayerData/player_data.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);

		String line = br.readLine();
		read_data = line.split(",");

		br.close();
		return read_data;
	}

	public static void player_data_reflect(Player p) throws IOException {
		String[] read_data = player_data_read();
		if(read_data[1].equals("true")) p.setCampEvent_1(true);
		if(read_data[2].equals("true")) p.setCampEvent_2(true);
		if(read_data[3].equals("true")) p.setEnding_Bad(true);
		if(read_data[4].equals("true")) p.setEnding_Good(true);
		if(read_data[5].equals("true")) p.setEnding_Best(true);
	}

	public static void player_data_update(List<Integer> update_num,Player p) throws IOException {
		/*
		 * 以下、対応する番号に応じて、データを更新する。
		 * 0:名前、1:キャンプ１、2:キャンプ２、3:バッドエンド、4:グッドエンド、5:ベストエンド
		 */
		String[] read_data = player_data_read();
	    FileOutputStream fos = new FileOutputStream("src/run/PlayerData/player_data.txt", false);
	    OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
	    BufferedWriter bw = new BufferedWriter(osw);

	    for(int i=0;i<update_num.size();i++) {
	    	switch(update_num.get(i)) {
	    	case 0:
	    		read_data[0] = p.getName();
	    		break;
	    	case 1:
	    		if(p.isCampEvent_1()) read_data[1] = "true";
	    		break;
	    	case 2:
	    		if(p.isCampEvent_2()) read_data[2] = "true";
	    		break;
	    	case 3:
	    		if(p.isEnding_Bad()) read_data[3] = "true";
	    		break;
	    	case 4:
	    		if(p.isEnding_Good()) read_data[4] = "true";
	    		break;
	    	case 5:
	    		if(p.isEnding_Best()) read_data[5] = "true";
	    		break;
	    		default:
	    			//今後、追加処理が発生すれば追記
	    	}
	    }

	    String write = "";
	    for(int i=0;i<read_data.length;i++) {
	    	write += read_data[i];
	    	if(i==read_data.length-1) continue;
	    	write += ",";
	    }
	    bw.write(write);
	    bw.close();
	}

	static void preparation() {
		System.out.println("============================================================================");
		System.out.println("============================================================================");
		System.out.println("      合わせ終わったらエンターキーを押してください。ゲームが始まります    ");
		System.out.println("              -上下の線とコンソールの表示幅を合わせてください-            ");
		System.out.println("                                     上");
		System.out.println("                                     下");
		System.out.println("                                     の");
		System.out.println("                                     線");
		System.out.println("                                     と");
		System.out.println("                                     コ");
		System.out.println("                                     ン");
		System.out.println("                                     ソ");
		System.out.println("                                     |");
		System.out.println("                                     ル");
		System.out.println("                                     の");
		System.out.println("                                     表");
		System.out.println("                                     示");
		System.out.println("                                     幅");
		System.out.println("                                     を");
		System.out.println("                                     合");
		System.out.println("                                     わ");
		System.out.println("                                     せ");
		System.out.println("                                     て");
		System.out.println("                                     く");
		System.out.println("                                     だ");
		System.out.println("                                     さ");
		System.out.println("                                     い");
		System.out.println("                                     。");
		System.out.println("");
		System.out.println("              -上下の線とコンソールの表示幅を合わせてください-            ");
		System.out.println("      合わせ終わったらエンターキーを押してください。ゲームが始まります    ");
		System.out.println("============================================================================");
		System.out.printf("============================================================================");
		String pre = sc.nextLine();
	}

	static void End_Turn(int input_num,Hero h) {

		if(h.getHp()>0) {
			if(input_num==0) {
				System.out.println();
				System.out.println("  =====================================================================================");
				System.out.println("    探索終了。");
				System.out.println("");
			}else if(input_num ==1) {
				getMoney_TurnEnd(2,h);
				System.out.println();
				System.out.println("  =====================================================================================");
				System.out.println("    探索終了。");
				System.out.println("    普通の道ボーナス:財宝+1。");
			}else {
				getMoney_TurnEnd(3,h);
				System.out.println();
				System.out.println("  =====================================================================================");
				System.out.println("    探索終了。");
				System.out.println("    危険な道ボーナス:財宝+2。");
			}
		}
	}

	static void BattleJudgement(int root,int turn,Hero h) throws InterruptedException{
		//イベント判定は、選択した「道」で変化。
		Thread.sleep(1000);
		System.out.println();
		System.out.println();
		System.out.println("    …………");
		System.out.println();
		System.out.println();
		Thread.sleep(1000);
		System.out.println("    ……………………");
		System.out.println();
		System.out.println();
		Thread.sleep(1000);
		System.out.println("    ………………………………");
		System.out.println();
		System.out.println();
		Thread.sleep(1000);

		int battle_j = rdm.nextInt(100);

		//まずは、戦闘判定。選択した道の危険度と経過ターンで、遭遇率が変化。
		if(turn<11) {
			if(battle_j>69 && root==1) {
				Battle.lottery_easy(h);
			}else if(battle_j>59 && root==2) {
				Battle.lottery_a_bit_easy(h);
			}else if(battle_j>49 && root==3) {
				Battle.lottery_a_bit_difficult(h);
			}
		}else if(turn<21) {
			if(battle_j>59 && root==1) {
				Battle.lottery_a_bit_easy(h);
			}else if(battle_j>59 && root==2) {
				Battle.lottery_normal(h);
			}else if(battle_j>49 && root==3) {
				Battle.lottery_a_bit_difficult(h);
			}
		}else {
			if(battle_j>59 && root==1) {
				Battle.lottery_normal(h);
			}else if(battle_j>49 && root==2) {
				Battle.lottery_a_bit_difficult(h);
			}else if(battle_j>39 && root==3) {
				Battle.lottery_difficult(h);
			}
		}
	}

	static void EventJudgement(int root,int turn,Hero h) throws InterruptedException{
		//イベント判定は、選択した「道」で変化。

		int first_j = rdm.nextInt(100);
		int second_j = rdm.nextInt(100);
		//int third_j = rdm.nextInt(100);

		//続いて、イベント判定。選択した道の危険度に応じて、発生するイベント内容が変化。
		if(root<=2 && first_j>=0) {
			//安全な道を選んだ時の抽選-------------------------------------------------------
			if(root==1) {
				if(second_j>=74) {
					getItem(root,h);
				}else if(second_j>34) {
					//アイテム獲得イベント
					getItem(root,h);
				}else {
					//自然の脅威イベント
					attackNature(root,h);
				}
			//普通の道を選んだ時の抽選-------------------------------------------------------
			}else {
				if(second_j>84) {
					getItem(root,h);
				}else if(second_j>70) {
					goToDungeon(h);
				}else if(second_j>34) {
					//アイテム獲得イベント
					getItem(root,h);

				}else {
					//自然の脅威イベント
					attackNature(root,h);
				}
			}
		//危険な道を選んだ時の抽選-----------------------------------------------------------
		}else if(root>=3 && first_j>=30) {
			if(second_j>70) {
				getItem(root,h);
			}else if(second_j>50) {
				goToDungeon(h);
			}else if(second_j>24) {
				//アイテム獲得イベント
				getItem(root,h);
			}else {
				//自然の脅威イベント
				attackNature(root,h);
			}
		//ラッキーパターン、ノーリスクで財宝をGETするチャンスだ！！	-------------------------
		}else {
			//お宝を発見できるか判定
			if((rdm.nextInt(2))>0) {

				getMoney(root,h);

			}else {
				System.out.println("    安全に進むことができた。");
			}

		}
	}

	static void getMoney_TurnEnd(int root,Hero h){
		if(root==2) {
			h.setMoney(h.getMoney()+1);
		}else {
			h.setMoney(h.getMoney()+2);
		}
	}

	static void getMoney(int root,Hero h) throws InterruptedException{

		int get_m = 1;

		if(root==2) {
			get_m+=rdm.nextInt(3)+1;
		}
		if(root==3) {
			get_m+=rdm.nextInt(3)+2;
		}

		h.setMoney(h.getMoney()+get_m);
		System.out.println("    ラッキー！宝を発見した！");
		Thread.sleep(1000);
		System.out.printf("    財宝+%d%n",get_m);
		Thread.sleep(1000);
	}

	static void getItem(int root,Hero h) throws InterruptedException{
		System.out.println("    ……なにか落ちているぞ？");
		Thread.sleep(2000);

		int item_j = rdm.nextInt(100);
		int[] items = new int[item_E.length];
		int[] getItems = new int[item_getEH.length];

		int hp = h.getHp();
		switch(root) {
		case 1:
			for(int i=0;i<items.length;i++) {
				items[i]=item_E[i];
				if(i>=items.length-2) continue;
				getItems[i]=item_getEH[i];
			}
			break;
		case 2:
			for(int i=0;i<items.length;i++) {
				items[i]=item_N[i];
				if(i>=items.length-2) continue;
				getItems[i]=item_getN[i];
			}
			break;
		default:
			for(int i=0;i<items.length;i++) {
				items[i]=item_H[i];
				if(i>=items.length-2) continue;
				getItems[i]=item_getEH[i];
			}
		}

		if(item_j<items[0]) {
			Directing_Pick_Items.Lizards();
			System.out.println();
			Thread.sleep(1000);
			h.setHp(hp+5);
			System.out.println("    ……まあ、食えなくもない。");
			Thread.sleep(1000);
			System.out.println("    HP+5");
			Thread.sleep(1000);
		}else if(item_j<items[1]){
			Directing_Pick_Items.fruit();
			System.out.println();
			Thread.sleep(1000);
			h.setHp(hp+8);
			System.out.println("    うーん、とても甘い。");
			Thread.sleep(1000);
			System.out.println("    HP+8");
			Thread.sleep(1000);
		}else if(item_j<items[2]){
			Directing_Pick_Items.fish();
			System.out.println();
			Thread.sleep(1000);
			h.setHp(hp+10);
			System.out.println("    とれたてだから、鮮度がいいぜ！");
			Thread.sleep(1000);
			System.out.println("    HP+10");
			Thread.sleep(1000);
		}else if(item_j<items[3]){
			Directing_Pick_Items.ration();
			System.out.println();
			Thread.sleep(1000);
			System.out.println("    携帯食料だ！");
			System.out.println("");
			Thread.sleep(1000);
			h.setHp(hp+15);
			System.out.println("    ありがとう、文明！ごちでーす！！");
			Thread.sleep(1000);
			System.out.println("    HP+15");
			Thread.sleep(1000);
		}else if(item_j<items[4]){
			int item_getj = rdm.nextInt(100);
			if(item_getj<items[0]) {
				h.setItem_ointment(h.getItem_ointment()+1);
				System.out.println();
				System.out.println("    傷薬だ！");
				Thread.sleep(1000);
				System.out.println("    傷薬をひとつ手に入れた！");
				Thread.sleep(1000);
			}else if(item_getj<items[1]) {
				h.setItem_gun(h.getItem_gun()+1);
				System.out.println();
				System.out.println("    銃だ！");
				Thread.sleep(1000);
				System.out.println("    銃をひとつ手に入れた！");
				Thread.sleep(1000);
			}else if(item_getj<items[2]) {
				h.setItem_smoke(h.getItem_smoke()+1);
				System.out.println();
				System.out.println("    煙幕だ！");
				Thread.sleep(1000);
				System.out.println("    煙幕をひとつ手に入れた！");
				Thread.sleep(1000);
			}else {
				h.setItem_litter(h.getItem_litter()+1);
				System.out.println();
				System.out.println("    ガラクタだ！");
				Thread.sleep(1000);
				System.out.println("    ゴミをひとつ手に入れた！あんまり嬉しくない！！");
				Thread.sleep(1000);
			}
		}else {
			h.setHp(hp-20);
			Directing_Pick_Items.hand_grenade_1();
			Thread.sleep(2000);
			System.out.println();
			System.out.println("    ……手りゅう弾？");
			Thread.sleep(2000);
			Directing_Pick_Items.hand_grenade_2();
			Thread.sleep(1000);
			Directing_Pick_Items.hand_grenade_3();
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    HP-20");
			Thread.sleep(2000);
		}
	}

	static void attackNature(int root,Hero h) throws InterruptedException{
		int attackN_j = rdm.nextInt(100);
		int[] attackNs = new int[attackN_E.length];

		int hp = h.getHp();
		switch(root) {
		case 1:
			for(int i=0;i<attackNs.length;i++) {
				attackNs[i]=attackN_E[i];
			}
			break;
		case 2:
			for(int i=0;i<attackNs.length;i++) {
				attackNs[i]=attackN_N[i];
			}
			break;
		default:
			for(int i=0;i<attackNs.length;i++) {
				attackNs[i]=attackN_H[i];
			}
		}

		if(attackN_j<attackNs[0]) {
			//スコール
			h.setHp(hp-5);
			System.out.println("    スコールだ！");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    ずぶぬれになった体が冷え、体力が奪われる……。");
			Thread.sleep(1000);
			System.out.println("    HP-5");
			Thread.sleep(1000);
		}else if(attackN_j<attackNs[1]) {
			//虫
			h.setHp(hp-7);
			System.out.println("    吸血虫だ！");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    うぅ、血を吸われて眩暈が……。");
			Thread.sleep(1000);
			System.out.println("    HP-7");
			Thread.sleep(1000);
		}else if(attackN_j<attackNs[2]) {
			//ヘビ
			h.setHp(hp-10);
			System.out.println("    ヘビだ！");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    ぎゃあ、噛まれた！！。");
			Thread.sleep(1000);
			System.out.println("    HP-10");
			Thread.sleep(1000);
		}else if(attackN_j<attackNs[3]) {
			//河
			int bad = rdm.nextInt(8)+8;
			h.setHp(hp-bad);
			System.out.println("    河だ！");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    腰丈まである川を渡るのは、心底しんどい……。");
			Thread.sleep(1000);
			System.out.printf("    HP-%s%n",bad);
			Thread.sleep(1000);
		}else {
			//金食い虫
			int bad = rdm.nextInt(5)+1;
			System.out.println("    うわ、金食い虫だ！");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    チクショー！金返せ！！");
			Thread.sleep(1000);
			System.out.printf("    財宝-%s%n",bad);
			Thread.sleep(500);
			h.setMoney_judge(h.getItem_litter(),bad,false);
			Thread.sleep(1000);
		}
	}
	static void goToDungeon(Hero h) throws InterruptedException{
		System.out.println("    ……おぉ！遺跡があるぞ、入ってみよう！");
		Thread.sleep(2000);
		int d_f = rdm.nextInt(3);
		if(d_f>1) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("    何やら怪しいスイッチが……。押してみよう。");
			Thread.sleep(1000);
			System.out.println("    ポチ！");
			if(rdm.nextInt(2)>0) {
				Thread.sleep(1000);
				System.out.println();
				System.out.println("    パカ！");
				Thread.sleep(1000);
				System.out.println("    しまった！落とし穴の作動罠だ！");
				System.out.println("    落下した時に、財宝を一部落としてしまった！");
				Thread.sleep(2000);
				System.out.println("    財宝-5");
				Thread.sleep(500);
				h.setMoney_judge(h.getItem_litter(),5,false);
				Thread.sleep(1000);

			}else {
				h.setMoney(h.getMoney()+10);
				Thread.sleep(1000);
				System.out.println();
				System.out.println("    ゴゴゴゴ！");
				Thread.sleep(1000);
				System.out.println("    なんと、隠し部屋が現れた！中の財宝をゲットだ！");
				Thread.sleep(2000);
				System.out.println("    財宝+10");
				Thread.sleep(1000);
			}
		}else if(d_f>0) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("    玉座に黄金像がある！こいつはラッキーだ！");
			Thread.sleep(1000);
			System.out.println("    ひょい！");
			Thread.sleep(2000);
			if(rdm.nextInt(2)>0) {
				Thread.sleep(1000);
				System.out.println();
				h.setHp(h.getHp()-10);
				System.out.println("    ゴロゴロゴロ！");
				Thread.sleep(1000);
				System.out.println("    うわ、像を持ち上げた瞬間、大岩が転がってきた！");
				Thread.sleep(1000);
				System.out.println("    下敷きになって大ダメージだ！");
				Thread.sleep(1000);
				System.out.println("    HP-10");
				Thread.sleep(1000);

			}else {
				h.setMoney(h.getMoney()+10);
				Thread.sleep(1000);
				System.out.println();
				System.out.println("    ゴゴゴゴ！");
				Thread.sleep(1000);
				System.out.println("    おお、像を持ち上げたら外への出口が！なんて親切な遺跡なのだ！");
				Thread.sleep(2000);
				System.out.println("    財宝+10");
				Thread.sleep(1000);
			}
		}else {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("    ムム、高価な水晶が祀られてる！");
			Thread.sleep(1000);
			System.out.println("    でも、原住民達にしっかり守られてるぞ。");
			Thread.sleep(2000);
			System.out.println();
			System.out.println("    よーし、コッソリ盗み出してやろう。");
			Thread.sleep(2000);
			if(rdm.nextInt(2)>0) {
				h.setHp(h.getHp()-5);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("    コロセー！！");
				Thread.sleep(1000);
				System.out.println("    トラエロー！！");
				Thread.sleep(2000);
				System.out.println();
				System.out.println("    ちくしょー！案の定バレちまったぜ！");
				System.out.println("    とっちめられた上に、金も取られちまった……。");
				Thread.sleep(2000);
				System.out.println("    HP-5、財宝-5");
				Thread.sleep(500);
				h.setMoney_judge(h.getItem_litter(),5,false);
				Thread.sleep(1000);
			}else {
				h.setMoney(h.getMoney()+10);
				Thread.sleep(1000);
				System.out.println();
				System.out.println("    ふう、なんとかバレずに盗めたぞ。");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("    ギャッハー！あいつら他にも、たんまりためこんでやがったぜぇー！");
				Thread.sleep(1000);
				System.out.println("    財宝+10");
				Thread.sleep(1000);
			}
		}
	}
	static void dayResult(int turn,Hero h,int[] ba) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("      -----------------------------------------------------------------------------");
		System.out.println("          ---------------------------------------------------------------------");
		System.out.println("");
		System.out.printf("            ◇本日の探索結果 (第%02d歩)%n",turn+1);
		System.out.println("           ---------------------------");
		System.out.println("");
		System.out.printf("              ＨＰ      :  ");
		if((h.getHp()-ba[0])>0) {
			System.out.printf("+%3d%n",h.getHp()-ba[0]);
		}else if((h.getHp()-ba[0])==0) {
			System.out.println("   0");
		}else {
			System.out.printf("-%3d%n",ba[0]-h.getHp());
		}
		System.out.printf("              財宝      :  ");
		if((h.getMoney()-ba[1])>0) {
			System.out.printf("+%3d%n",h.getMoney()-ba[1]);
		}else if((h.getMoney()-ba[1])==0) {
			System.out.println("   0");
		}else {
			System.out.printf("-%3d%n",ba[1]-h.getMoney());
		}
		System.out.printf("              アイテム  :  傷薬  %d  銃  %d  煙幕  %d  ゴミ  %d  %n",
				h.getItem_ointment()-ba[2],h.getItem_gun()-ba[3],h.getItem_smoke()-ba[4],h.getItem_litter()-ba[5]);
		System.out.println("");
		System.out.println("");
		System.out.println("           ◇現在のプレイヤーステータス ");
		System.out.println("           -----------------------------");
		System.out.println("");
		System.out.printf("               HP %3d/100     財産 %3d/100  %n",h.getHp(),h.getMoney());
		System.out.printf("               傷薬 (%d)       銃 (%d)        煙幕 (%d)        ゴミ (%d)%n",h.getItem_ointment(),h.getItem_gun(),h.getItem_smoke(),h.getItem_litter());
		System.out.println();
		System.out.println();
		System.out.println("          ---------------------------------------------------------------------");
		System.out.println("      -----------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
	}
}
