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

import run.PlayerData.Directing_Ranking;
import run.PlayerData.Player;
import run.PlayerData.Ranking;

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
	final static int data_sum = 7;
	final static int id_name = 0;
	final static int id_CampEv1 = 1;
	final static int id_CampEv2 = 2;
	final static int id_ED_Bad = 3;
	final static int id_ED_Good = 4;
	final static int id_ED_Best = 5;
	final static int id_PlayerCount = 6;

	public static void main(String[] args){

		char sumsun = '１';
		for(int i=0;i<10;i++) {
			System.out.println(sumsun);
			sumsun ++;
		}

		preparation();

		while(true) {
			String[] player_data = new String[data_sum];
			try {
				player_data = player_data_read();
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}

			Player p = new Player(player_data[id_name]);
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
					for(int i=0;i<32;i++) {
						System.out.println("");
					}
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				Directing_Op.showOp(p);
				try {
					//Directing_Title.show_title_first();
					//Thread.sleep(3000);
				} catch (Exception e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				Directing_Tutorial.showTutorial();
			}else {
				try {
					if(p.isEnding_Best() == true) {
						Directing_Title.show_title_pre_after_best();
						Directing_Title.showTitle_after_best();
					}else {
						Directing_Title.show_title_pre();
						Directing_Title.showTitle();
					}
				} catch (Exception e1) {
					// TODO 自動生成された catch ブロック
					e1.printStackTrace();
				}
				int startSelect = sc.nextInt();
				if(startSelect==1) {
					try {
						if(p.isEnding_Best() == true) {
							Directing_Title.skip_select_after_best();
						}else {
							Directing_Title.skip_select();
						}
						int skipSelect = sc.nextInt();
						if(skipSelect == 2) {
							p.setSkipEvent_Already_Read(true);
						}else if(skipSelect == 3){
							p.setSkipEvent_All(true);
						}
						if(p.isEnding_Best() == true) {
							Directing_StartGame.showStartGame_after_best();
						}else {
							Directing_StartGame.showStartGame();
						}
					} catch (InterruptedException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					} catch (Exception e) {
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

			/*プレイヤーの挑戦回数を更新、記録する------------------
			 * 補足（というか備忘録）
			 * プレイヤーの挑戦回数を記録する意図は、以下ふたつである。
			 * １．ランキング機能にて、スコアが同率になった時の順位付け処理用。（挑戦回数が多い方を、上位とする）
			 * ２．リザルト画面の演出で「挑戦回数」を表記したくなった時用。（2022/06/15現在、実装するつもりはないが……。)
			 */
			p.setPlay_count(p.getPlay_count()+1);
			System.out.println(p.getPlay_count());
			List<Integer> update_play_count = new ArrayList<>();
			update_play_count.add(id_PlayerCount);
			try {
				player_data_update(update_play_count,p);
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			//------------------------------------------------------

			Hero h = new Hero(p.getName(),p.getPlay_count());
			Sister s = new Sister();

			int[] before_pl_data = {
					h.getHp(),h.getMoney(),h.getItem_ointment(),h.getItem_gun(),h.getItem_smoke(),h.getItem_litter(),
			};
			int turn_score_calc = 0;

			//ゲームのメインループ
			//HPが0になる場合を除き、30ターン
			for(int i=0;i<30;i++) {

				turn_score_calc = i+1;

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
					case 10:
						System.out.println();
						System.out.println("  =====================================================================================");
						System.out.println();
						System.out.println("    デバッグ用");
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
							} catch (Exception e) {
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
						} catch (Exception e) {
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
						} catch (Exception e) {
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
						} catch (Exception e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						End_Turn(3,h);
						break;

					case 10:
						try {
							EventJudgement(input,i,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						} catch (Exception e) {
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
			}else if(h.getMoney()>=125 && p.isCampEvent_1()==true && p.isCampEvent_2()==true){
				ending = 4;
				h.setEvent("clear_best_1");
				isEDCheck = p.isEnding_Best();
				p.setEnding_Best(true);
				List<Integer> update_ED_Be = new ArrayList<>();
				update_ED_Be.add(id_ED_Best);
				try {
					player_data_update(update_ED_Be,p);
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(h.getMoney()>=100) {
				ending = 1;
				h.setEvent("clear_good");
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
				h.setEvent("clear_bad");
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

			//エンディングとリザルト画面を表示
			int score = score_calculator(h);
			boolean isDead_directing_skip = false;
			if( h.getEvent()=="river") isDead_directing_skip = true;
			try {
				if(ending == 0 && isDead_directing_skip == false) {
					Directing_Ending.showEnding(ending);
					Thread.sleep(3000);
				}else {
					if(!p.isSkipEvent_All()){
						if(!p.isSkipEvent_Already_Read() || !isEDCheck ) {
							Directing_Ending.showEnding(ending);
						}
					}
				}
				Directing_Result.showResult(turn_score_calc,score,h);
				System.out.print("    ※エンターキー入力で次へ進みます。");
				sc.nextLine();
				String Click = sc.nextLine();

				if(ending==4) {
					if(!p.isSkipEvent_All()){
						if(!p.isSkipEvent_Already_Read() || !isEDCheck ) {
							h.setEvent("clear_best_2");
							Directing_Ending.BestEnd_2();
						}
					}
				}

				List<Ranking> r_list = ranking_data_read();
				Ranking my_rank = new Ranking(h.getName(),Integer.valueOf(score).toString(),turn_score_calc,h.getEvent(),h.getPlayer_count());
				for(int i=0;i<r_list.size();i++) {
					int s_num = Integer.parseInt(r_list.get(i).getScore());
					if(score>=s_num) {
						r_list.add(i,my_rank);
						r_list.remove(r_list.size()-1);
						ranking_data_update(r_list);
						break;
					}
				}
				Directing_Ranking.show_Ranking(r_list);
				sc.nextLine();
				String lastClick = sc.nextLine();

				if(ending==4) {
					if(!p.isSkipEvent_All()){
						if(!p.isSkipEvent_Already_Read() || !isEDCheck ) {
							for(int i=0;i<32;i++) {
								System.out.println();
							}
							Thread.sleep(3000);
							Directing_Ending.BestEnd_3();
							Thread.sleep(1500);
						}else {
							Directing_Ranking.show_Ranking_after();
							End_Adventure();
						}
					}else {
						Directing_Ranking.show_Ranking_after();
						End_Adventure();
					}
				}else {
					Directing_Ranking.show_Ranking_after();
					End_Adventure();
				}

			} catch ( Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		}
		System.out.println("アプリケーションを終了します。");
	}

//---------------------------------------------------------------------------------------------------------------
//ゲームのメインループはここまで。
//以下では、メインループ中でインスタンスとして利用する、様々なクラスを設定。
//---------------------------------------------------------------------------------------------------------------

	public static String[] player_data_read() throws IOException {

		String[] read_data = new String[data_sum];
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
		p.setPlay_count(Integer.parseInt(read_data[6]));
	}

	public static void player_data_update(List<Integer> update_num,Player p) throws IOException {
		/*
		 * 以下、対応する番号に応じて、データを更新する。
		 * 0:名前、1:キャンプ１、2:キャンプ２、3:バッドエンド、4:グッドエンド、5:ベストエンド、6:挑戦回数
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
	    	case 6:
	    		read_data[6] = Integer.toString(p.getPlay_count());
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

	public static List<Ranking> ranking_data_read() throws IOException {

		List<Ranking> read_data = new ArrayList<>();
		FileInputStream fis =new FileInputStream("src/run/PlayerData/ranking_data.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);

		String line;
		while (( line = br.readLine()) != null) {
			String[] r_data = line.split(",");
			Ranking ranking = new Ranking(r_data[0],r_data[1],Integer.parseInt(r_data[2]),r_data[3],Integer.parseInt(r_data[4]));
			read_data.add(ranking);
		}
		br.close();
		return read_data;
	}

	public static void ranking_data_update(List<Ranking> update_data) throws IOException{
		FileOutputStream fos = new FileOutputStream("src/run/PlayerData/ranking_data.txt", false);
	    OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
	    BufferedWriter bw = new BufferedWriter(osw);

		for(int i=0;i<update_data.size();i++) {
			bw.write(update_data.get(i).getName()+",");
			bw.write(update_data.get(i).getScore()+",");
			bw.write(update_data.get(i).getTurn()+",");
			bw.write(update_data.get(i).getSummry()+",");
			bw.write(update_data.get(i).getPlay_count()+",");
			bw.write("dummy");
			if(! (i==update_data.size()-1)) bw.newLine();
		}
		bw.close();
	}

	static void preparation() {
		System.out.println("==============================================================================================================");
		System.out.println("==============================================================================================================");
		System.out.println("                       合わせ終わったらエンターキーを押してください。ゲームが始まります                       ");
		System.out.println("                               -上下の線とコンソールの表示幅を合わせてください-            ");
		System.out.println("                                                      上");
		System.out.println("                                                      下");
		System.out.println("                                                      の");
		System.out.println("                                                      線");
		System.out.println("                                                      と");
		System.out.println("                                                      コ");
		System.out.println("                                                      ン");
		System.out.println("                                                      ソ");
		System.out.println("                                                       |");
		System.out.println("                                                      ル");
		System.out.println("                                                      の");
		System.out.println("                                                      表");
		System.out.println("                                                      示");
		System.out.println("                                                      幅");
		System.out.println("                                                      を");
		System.out.println("                                                      合");
		System.out.println("                                                      わ");
		System.out.println("                                                      せ");
		System.out.println("                                                      て");
		System.out.println("                                                      く");
		System.out.println("                                                      だ");
		System.out.println("                                                      さ");
		System.out.println("                                                      い");
		System.out.println("                                                      。");
		System.out.println("");
		System.out.println("                               -上下の線とコンソールの表示幅を合わせてください-            ");
		System.out.println("                       合わせ終わったらエンターキーを押してください。ゲームが始まります                       ");
		System.out.println("==============================================================================================================");
		System.out.printf("==============================================================================================================");
		String pre = sc.nextLine();
	}

	static void End_Turn(int input_num,Hero h) {

		if(h.getHp()>0) {
			if(input_num==1) {
				System.out.println();
				System.out.println("  =====================================================================================");
				System.out.println("    探索終了。");
				System.out.println("");
			}else if(input_num ==2) {
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

		//デバッグ用
		if(root==10) {

		}else {

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
	}

	static void EventJudgement(int root,int turn,Hero h) throws Exception{
		//イベント判定は、選択した「道」で変化。

		int first_j = rdm.nextInt(100);
		int second_j = rdm.nextInt(100);
		//int third_j = rdm.nextInt(100);

		//デバッグ用
		if(root==10) {
			//goToDungeon(h);
			attackNature(root,h);
		}else {

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
				}else if(second_j>65) {
					goToDungeon(h);
				}else if(second_j>40) {
					//アイテム獲得イベント
					getItem(root,h);

				}else {
					//自然の脅威イベント
					attackNature(root,h);
				}
			}
		//危険な道を選んだ時の抽選-----------------------------------------------------------
		}else if(root>=3 && first_j>=30) {
			if(second_j>80) {
				//自然の脅威イベント
				attackNature(root,h);
			}else if(second_j>50) {
				goToDungeon(h);
			}else if(second_j>40) {
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
		System.out.println("    ……なにか、落ちているぞ？");
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
			System.out.println("    こんがり焼けば、香ばしい。");
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
			System.out.println("    とれたては、鮮度がいいぜ！");
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
			h.setEvent("booby_trap");
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

	static void attackNature(int root,Hero h) throws Exception{
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

		//デバッグ用
		case 10:
			attackNs[0]=0;
			attackNs[1]=0;
			attackNs[2]=0;
			attackNs[3]=0;
			attackN_j=0;
			break;

		default:
			for(int i=0;i<attackNs.length;i++) {
				attackNs[i]=attackN_H[i];
			}
		}

		if(attackN_j<attackNs[0]) {
			//スコール
			h.setEvent("squall");
			h.setHp(hp-5);

			String name_01 = "Event/Squall/s_01";
			String name_02 = "Event/Squall/s_02";

			Tools.Graphic_Creator(name_01);
			System.out.println("");
			System.out.println("      ……ぽつ");
			System.out.println("");
			Thread.sleep(1000);

			Tools.Graphic_Creator(name_01);
			System.out.println("");
			System.out.println("      ……ぽつ、ぽつぽつ。");
			System.out.println("");
			Thread.sleep(2000);

			Tools.Graphic_Creator(name_02);
			System.out.println("");
			System.out.println("      ……ん？");
			System.out.println("");
			Thread.sleep(1000);

			Tools.Graphic_Creator(name_02);
			System.out.println("");
			System.out.println("      ……ん？ 雨か……？");
			System.out.println("");
			Thread.sleep(500);


			String name_03 = "Event/ExMark/s_01";
			String name_04 = "Event/ExMark/s_02";
			String name_05 = "Event/ExMark/s_03";
			String name_06 = "Event/ExMark/s_04";

			for(int i=0;i<5;i++) {
				Tools.Graphic_Creator(name_03);
				System.out.println("");
				System.out.println("      ざあぁぁぁぁぁぁぁぁぁ！！");
				System.out.println("");
				Thread.sleep(100);
				Tools.Graphic_Creator(name_04);
				System.out.println("");
				System.out.println("      ざあぁぁぁぁぁぁぁぁぁ！！");
				System.out.println("");
				Thread.sleep(100);
				Tools.Graphic_Creator(name_05);
				System.out.println("");
				System.out.println("      ざあぁぁぁぁぁぁぁぁぁ！！");
				System.out.println("");
				Thread.sleep(100);
				Tools.Graphic_Creator(name_06);
				System.out.println("");
				System.out.println("      ざあぁぁぁぁぁぁぁぁぁ！！");
				System.out.println("");
				Thread.sleep(100);
			}

			Thread.sleep(1000);
			Tools.Graphic_Creator(name_06);
			System.out.println("");
			System.out.println("      うわぁ、大雨だ！！");
			System.out.println("");
			Thread.sleep(2000);
			Tools.Graphic_Creator(name_06);
			System.out.println("");
			System.out.println("      うわぁ、大雨だ！！");
			System.out.println("      ずぶぬれになった体が冷え、体力が奪われる……。");
			Thread.sleep(1500);
			System.out.println("      HP-5");
			Thread.sleep(1000);

		}else if(attackN_j<attackNs[1]) {
			//虫
			h.setEvent("leeches");
			h.setHp(hp-7);

			String name_01 = "Event/ExMark/s_01";
			String name_02 = "Event/ExMark/s_02";
			String name_03 = "Event/ExMark/s_03";
			Tools.Graphic_Creator(name_01);
			System.out.println("");
			System.out.println("      ！？");
			System.out.println("");
			Thread.sleep(250);
			Tools.Graphic_Creator(name_02);
			System.out.println("");
			System.out.println("      ！？");
			System.out.println("");
			Thread.sleep(250);
			Tools.Graphic_Creator(name_03);
			System.out.println("");
			System.out.println("      ！？");
			System.out.println("");
			Thread.sleep(500);

			String name_04 = "Event/Leeches/s_01";
			Tools.Graphic_Creator(name_04);
			System.out.println("");
			System.out.println("      吸血虫だ！");
			System.out.println("");
			Thread.sleep(2000);
			Tools.Graphic_Creator(name_04);
			System.out.println("");
			System.out.println("      吸血虫だ！");
			System.out.println("      うぅ、血を吸われて眩暈が……。");
			Thread.sleep(1000);
			System.out.println("      HP-7");
			Thread.sleep(2500);
		}else if(attackN_j<attackNs[2]) {
			//ヘビ
			h.setEvent("snake");
			h.setHp(hp-10);
			String name_01 = "Event/Snake/s_01";
			Tools.Graphic_Creator(name_01);
			System.out.println("");
			System.out.println("      ヘビだ！");
			System.out.println("");
			Thread.sleep(1500);

			String name_02 = "Event/ExMark/s_01";
			String name_03 = "Event/ExMark/s_02";
			String name_04 = "Event/ExMark/s_03";

			Tools.Graphic_Creator(name_02);
			System.out.println("");
			System.out.println("      がぷっ！！");
			System.out.println("");
			Thread.sleep(250);
			Tools.Graphic_Creator(name_03);
			System.out.println("");
			System.out.println("      がぷっ！！");
			System.out.println("");
			Thread.sleep(250);
			Tools.Graphic_Creator(name_04);
			System.out.println("");
			System.out.println("      がぷっ！！");
			System.out.println("");
			Thread.sleep(1000);

			Tools.Graphic_Creator(name_04);
			System.out.println("");
			System.out.println("      ぎゃあ、噛まれた！！");
			System.out.println("");
			Thread.sleep(1000);
			System.out.println("      HP-10");
			Thread.sleep(2500);
		}else if(attackN_j<attackNs[3]) {
			//河
			h.setEvent("river");
			int bad = rdm.nextInt(8)+8;
			int bad2 = rdm.nextInt(10)+10;
			int too_bad = rdm.nextInt(100);
			h.setHp(hp-bad);

			String name_01 = "Event/River/s_01";
			Tools.Graphic_Creator(name_01);
			System.out.println("");
			System.out.println("      河だ！");
			System.out.println("");
			Thread.sleep(2000);

			String name_02 = "Event/River/s_02";

			String text_02 = "    ";

			for(int i=0;i<5;i++) {
				text_02+="  ・";
				Tools.Graphic_Creator(name_02);
				System.out.println("");
				System.out.println(text_02);
				System.out.println("");
				Thread.sleep(1000);
			}

			if(h.getHp()<1 || too_bad<30) {
				h.setHp(hp-bad2);
				String name_03 = "Event/River/s_03";
				Tools.Graphic_Creator(name_02);
				System.out.println("");
				System.out.println("      ドドドドドドド……っ！！");
				System.out.println("");
				Thread.sleep(1500);
				Tools.Graphic_Creator(name_02);
				System.out.println("");
				System.out.println("      ……？");
				System.out.println("");
				Thread.sleep(500);
				Tools.Graphic_Creator(name_03);
				System.out.println("");
				System.out.println("      ……？ なんの音だ……？");
				System.out.println("");
				Thread.sleep(1000);
				String name_04 = "Event/ExMark/s_01";
				String name_05 = "Event/ExMark/s_02";
				String name_06 = "Event/ExMark/s_03";
				String name_07 = "Event/ExMark/s_04";

				for(int i=0;i<5;i++) {
					Tools.Graphic_Creator(name_04);
					System.out.println("");
					System.out.println("      ザパーーーーーーーーン！！");
					System.out.println("");
					Thread.sleep(100);
					Tools.Graphic_Creator(name_05);
					System.out.println("");
					System.out.println("      ザパーーーーーーーーン！！");
					System.out.println("");
					Thread.sleep(100);
					Tools.Graphic_Creator(name_06);
					System.out.println("");
					System.out.println("      ザパーーーーーーーーン！！");
					System.out.println("");
					Thread.sleep(100);
					Tools.Graphic_Creator(name_07);
					System.out.println("");
					System.out.println("      ザパーーーーーーーーン！！");
					System.out.println("");
					Thread.sleep(100);
				}

				Tools.Graphic_Creator(name_07);
				System.out.println("");
				System.out.println("      しまった、洪水だ！");
				System.out.println("");
				Thread.sleep(1500);
				Tools.Graphic_Creator(name_07);
				System.out.println("");
				System.out.println("      しまった、洪水だ！流されるぅぅぅ……。");
				System.out.println("");
				Thread.sleep(2000);

				String name_08 = "Event/River/s_08";
				String text_08 = "    ";
				for(int i=0;i<8;i++) {
					text_08+="  ・";
					Tools.Graphic_Creator(name_08);
					System.out.println("");
					System.out.println(text_08);
					System.out.println("");
					Thread.sleep(300);
				}
				Thread.sleep(1000);
				for(int i=0;i<32;i++) {
					System.out.println("");
				}
				Thread.sleep(3000);
				if(h.getHp()>0) {
					String name_09 = "Event/River/s_09";
					Tools.Graphic_Creator(name_09);
					System.out.println();
					System.out.println("      …………。");
					System.out.println();
					Thread.sleep(2000);
					Tools.Graphic_Creator(name_09);
					System.out.println();
					System.out.println("      …………。死ぬかと思った………。");
					System.out.println();
					Thread.sleep(2500);
					System.out.printf("    HP-%s%n",bad+bad2);
					Thread.sleep(1000);
				}
			}else {
				String name_09 = "Event/River/s_09";
				Tools.Graphic_Creator(name_09);
				System.out.println();
				System.out.println("      腰丈まである川を渡るのは、心底しんどい……。");
				System.out.println();
				Thread.sleep(3000);
				System.out.printf("      HP-%s%n",bad);
				Thread.sleep(1000);
			}
		}else {
			//金食い虫
			int bad = rdm.nextInt(5)+1;

			String name_01 = "Event/M_Eater/s_01";
			Tools.Graphic_Creator(name_01);
			System.out.println();
			System.out.println("");
			System.out.println();
			Thread.sleep(1500);

			String name_02 = "Event/M_Eater/s_02";
			Tools.Graphic_Creator(name_02);
			System.out.println();
			System.out.println("      ……？");
			System.out.println();
			Thread.sleep(1500);

			String name_03 = "Event/M_Eater/s_03";
			Tools.Graphic_Creator(name_03);
			System.out.println();
			System.out.println("      カバンの中に何かいるのか……？");
			System.out.println();
			Thread.sleep(1500);

			String name_04 = "Event/M_Eater/s_04";
			Tools.Graphic_Creator(name_04);
			System.out.println();
			System.out.println("      カバンの中に何かいるのか……？");
			System.out.println();
			Thread.sleep(1500);

			String name_05 = "Event/M_Eater/s_05";
			Tools.Graphic_Creator(name_05);
			System.out.println();
			System.out.println("      げげ、金食い虫だ！");
			System.out.println();
			Thread.sleep(1500);
			Tools.Graphic_Creator(name_05);
			System.out.println();
			System.out.println("      ちくしょー、金目の物を食いやがった！");
			System.out.println();
			Thread.sleep(1500);
			System.out.println();
			System.out.printf("      財宝-%s%n",bad);
			System.out.println();
			Thread.sleep(500);
			h.setMoney_judge(h.getItem_litter(),bad,false);
			Thread.sleep(1000);
		}
	}
	static void goToDungeon(Hero h) throws Exception{
		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		Thread.sleep(500);
		int per = rdm.nextInt(20)+50;
		String name = "Remain/s_01";
		Tools.Graphic_Creator(name);
		System.out.println();
		System.out.println("      おぉ、遺跡があるぞ、入ってみよう！");
		System.out.println();
		Thread.sleep(3500);
		int d_f = rdm.nextInt(3);
		if(d_f>1) {

			for(int i=0;i<32;i++) {
				System.out.println("");
			}
			String name_00 = "Remain/Switch/s_00";
			Tools.Graphic_Creator(name_00);
			System.out.println();
			System.out.println("");
			System.out.println();

			Thread.sleep(2000);
			String name_01 = "Remain/Switch/s_01";
			Tools.Graphic_Creator(name_01);
			System.out.println();
			System.out.println("      何やら怪しいスイッチが……。");
			System.out.println();

			Thread.sleep(3000);
			String name_02 = "Remain/Switch/s_02";
			Tools.Graphic_Creator(name_02);
			System.out.println();
			System.out.println("");
			System.out.println();

			Thread.sleep(500);
			String name_03 = "Remain/Switch/s_03";
			Tools.Graphic_Creator(name_03);
			System.out.println();
			System.out.println("      『うわあ、「いかにも」って感じのスイッチだね。");
			System.out.println();

			Thread.sleep(3000);
			String name_04 = "Remain/Switch/s_04";
			Tools.Graphic_Creator(name_04);
			System.out.println();
			System.out.println("      『うわあ、「いかにも」って感じのスイッチだね。");
			System.out.println("        一応聞くけど、どうするの、おにいちゃん？』");

			Thread.sleep(3000);
			System.out.println("      ");
			System.out.printf("      【1】押す！  【2】押さない  (成功率:%s%%)%n",per-10);
			System.out.println("      ");
			Thread.sleep(500);
			System.out.print("       >>");
			int input=sc.nextInt();
			if(input==1) {
				/*
				Tools.Graphic_Creator(name_03);
				System.out.println();
				System.out.println("      『……どうなっても知らないよ？』");
				System.out.println();
				Thread.sleep(2000);
				*/
				String name_yes_01 = "Remain/Switch/s_yes_01";
				Tools.Graphic_Creator(name_yes_01);
				System.out.println();
				System.out.println("      「ポチ！」");
				System.out.println();
				Thread.sleep(500);

				Tools.Graphic_Creator(name_yes_01);
				System.out.println();
				System.out.println("      『え、押すの！？』");
				System.out.println();
				Thread.sleep(500);

				if(rdm.nextInt(100)>per) {
					String name_yes_fail_01 = "Remain/Switch/s_yes_fail_01";
					Tools.Graphic_Creator(name_yes_fail_01);
					System.out.println();
					System.out.println("");
					System.out.println();
					Thread.sleep(500);
					String name_yes_fail_02 = "Remain/Switch/s_yes_fail_02";
					Tools.Graphic_Creator(name_yes_fail_02);
					System.out.println();
					System.out.println("      「パカ！」");
					System.out.println();
					Thread.sleep(750);
					String name_yes_fail_03 = "Remain/Switch/s_yes_fail_03";
					Tools.Graphic_Creator(name_yes_fail_03);
					System.out.println();
					System.out.println("      なんと！？ 落とし穴の作動罠だったとは！！");
					System.out.println();
					Thread.sleep(2500);

					String name_yes_fail_05 = "Remain/Switch/s_yes_fail_05";
					Tools.Graphic_Creator(name_yes_fail_05);
					System.out.println();
					System.out.println("      『いや、どう見たって、罠でしょ……。』");
					System.out.println();
					Thread.sleep(3500);
					String name_yes_fail_06 = "Remain/Switch/s_yes_fail_06";
					Tools.Graphic_Creator(name_yes_fail_06);
					System.out.println();
					System.out.println("      落下の際に、いくつか財宝を落としてしまった……。");
					System.out.println();
					Thread.sleep(2500);
					System.out.println("      財宝-5");
					System.out.println();
					Thread.sleep(500);
					h.setMoney_judge(h.getItem_litter(),5,false);
					Thread.sleep(1000);

				}else {
					h.setMoney(h.getMoney()+10);

					String name_yes_success_01 = "Remain/Switch/s_yes_success_01";
					Tools.Graphic_Creator(name_yes_success_01);
					System.out.println();
					System.out.println("");
					System.out.println();
					Thread.sleep(750);
					String name_yes_success_02 = "Remain/Switch/s_yes_success_02";
					Tools.Graphic_Creator(name_yes_success_02);
					System.out.println();
					System.out.println("      ゴゴゴゴ！");
					System.out.println();
					Thread.sleep(750);
					String name_yes_success_03 = "Remain/Switch/s_yes_success_03";
					Tools.Graphic_Creator(name_yes_success_03);
					System.out.println();
					System.out.println("      お、ラッキー。隠し部屋を発見♪");
					System.out.println();
					Thread.sleep(1500);
					Tools.Graphic_Creator(name_yes_success_03);
					System.out.println();
					System.out.println("      『ええ、そんなことってある……？』");
					System.out.println();
					Thread.sleep(2000);
					System.out.println("      財宝+10");
					Thread.sleep(1000);
				}
			}else {
				//String name_05 = "Remain/Switch/s_05";
				Tools.Graphic_Creator(name_03);
				System.out.println();
				System.out.println("      『……ま、だよね。");
				System.out.println();
				Thread.sleep(1500);

				String name_06 = "Remain/Switch/s_06";
				Tools.Graphic_Creator(name_06);
				System.out.println();
				System.out.println("      『……ま、だよね。");
				System.out.println("        明らか罠だもん。それが良いと思うよ。』");
				Thread.sleep(2500);

				String name_08 = "Remain/Switch/s_08";
				Tools.Graphic_Creator(name_08);
				System.out.println();
				System.out.println("      遺跡をあとにしました。");
				System.out.println("");
				Thread.sleep(2000);
			}
		}else if(d_f>0) {
			h.setEvent("remain_of_rock");

			String name_01 = "Remain/Rock/s_01";
			Tools.Graphic_Creator(name_01);
			System.out.println();
			System.out.println("      おお、これは見事な黄金像！");
			System.out.println();
			Thread.sleep(2000);

			Tools.Graphic_Creator(name_01);
			System.out.println();
			System.out.println("      『うわぁ、すっごい価値がありそう。");
			System.out.println("        ね、ね、貰っていこうよ、おにいちゃん！』");

			Thread.sleep(3000);
			System.out.println("      ");
			System.out.printf("      【1】取る！  【2】取らない  (成功率:%s%%)%n",per-10);
			System.out.println("      ");
			Thread.sleep(500);
			System.out.print("       >>");
			int input=sc.nextInt();
			if(input==1) {
				String name_yes_01 = "Remain/Rock/s_yes_01";
				Tools.Graphic_Creator(name_yes_01);
				System.out.println();
				System.out.println("      「ひょい！」");
				System.out.println();
				Thread.sleep(1500);
				if(rdm.nextInt(109)>per) {
					h.setHp(h.getHp()-10);

					String name_yes_02 = "Remain/Rock/s_yes_02";
					Tools.Graphic_Creator(name_yes_02);
					System.out.println();
					System.out.println("");
					System.out.println();
					Thread.sleep(500);

					String name_yes_fail_01 = "Remain/Rock/s_yes_fail_01";
					Tools.Graphic_Creator(name_yes_fail_01);
					System.out.println();
					System.out.println("");
					System.out.println();
					Thread.sleep(125);
					String name_yes_fail_02 = "Remain/Rock/s_yes_fail_02";
					Tools.Graphic_Creator(name_yes_fail_02);
					System.out.println();
					System.out.println("");
					System.out.println();
					Thread.sleep(125);
					String name_yes_fail_03 = "Remain/Rock/s_yes_fail_03";
					Tools.Graphic_Creator(name_yes_fail_03);
					System.out.println();
					System.out.println("");
					System.out.println();
					Thread.sleep(125);
					String name_yes_fail_04_1 = "Remain/Rock/s_yes_fail_04_1";
					Tools.Graphic_Creator(name_yes_fail_04_1);
					System.out.println();
					System.out.println("      ドン！");
					System.out.println();
					Thread.sleep(124);

					String name_yes_fail_04_2 = "Remain/Rock/s_yes_fail_04_2";
					Tools.Graphic_Creator(name_yes_fail_04_2);
					System.out.println();
					System.out.println("      ドン！");
					System.out.println();
					Thread.sleep(2500);

					String name_yes_fail_04_3 = "Remain/Rock/s_yes_fail_04_3";
					Tools.Graphic_Creator(name_yes_fail_04_3);
					System.out.println();
					System.out.println("      ");
					System.out.println();
					Thread.sleep(2000);

					Tools.Graphic_Creator(name_yes_fail_04_3);
					System.out.println();
					System.out.println("      …………あ。");
					System.out.println();
					Thread.sleep(2000);

					String name_yes_fail_05 = "Remain/Rock/s_yes_fail_05";
					Tools.Graphic_Creator(name_yes_fail_05);
					Thread.sleep(2000);
					Tools.Graphic_Creator(name_yes_fail_05);
					System.out.println();
					System.out.println("      HP-10");
					System.out.println();
					Thread.sleep(2000);
				}else {
					h.setMoney(h.getMoney()+10);
					String name_yes_success_01 = "Remain/Rock/s_yes_success_01";
					Tools.Graphic_Creator(name_yes_success_01);
					System.out.println();
					System.out.println("");
					System.out.println();
					Thread.sleep(1000);
					String name_yes_success_02 = "Remain/Rock/s_yes_success_02";
					Tools.Graphic_Creator(name_yes_success_02);
					System.out.println();
					System.out.println("      ゴゴゴゴ！");
					System.out.println();
					Thread.sleep(250);
					String name_yes_success_03 = "Remain/Rock/s_yes_success_03";
					Tools.Graphic_Creator(name_yes_success_03);
					System.out.println();
					System.out.println("      ゴゴゴゴ！");
					System.out.println();
					Thread.sleep(250);
					String name_yes_success_04 = "Remain/Rock/s_yes_success_04";
					Tools.Graphic_Creator(name_yes_success_04);
					System.out.println();
					System.out.println("      ゴゴゴゴ！");
					System.out.println();
					Thread.sleep(1500);
					Tools.Graphic_Creator(name_yes_success_04);
					System.out.println();
					System.out.println("      むむ、このまま外まで運んでくれるみたいだぞ！？");
					System.out.println();
					Thread.sleep(2000);
					Tools.Graphic_Creator(name_yes_success_04);
					System.out.println();
					System.out.println("      『元々、脱出用の装置か何かだったのかな？");
					System.out.println();
					Thread.sleep(1500);
					Tools.Graphic_Creator(name_yes_success_04);
					System.out.println();
					System.out.println("      『元々、脱出用の装置か何かだったのかなぁ？ なんにしても、ラッキーだね！』");
					System.out.println("");
					Thread.sleep(1500);
					System.out.println();
					System.out.println("      財宝+10");
					System.out.println();
					Thread.sleep(1000);
				}
			}else {
				Tools.Graphic_Creator(name_01);
				System.out.println();
				System.out.println("      うーん、嫌な予感がするからやめとこう……。");
				System.out.println("");
				Thread.sleep(2000);
			}
		}else {
			h.setEvent("remain_of_natives");

			String name_01 = "Remain/Natives/s_01";
			Tools.Graphic_Creator(name_01);
			System.out.println();
			System.out.println("      ムム、高そうな水晶が祀られてるぞ！");
			System.out.println();
			Thread.sleep(2000);

			String name_02 = "Remain/Natives/s_02";
			Tools.Graphic_Creator(name_02);
			System.out.println();
			System.out.println("");
			System.out.println();
			Thread.sleep(500);

			String name_03 = "Remain/Natives/s_03";
			Tools.Graphic_Creator(name_03);
			System.out.println();
			System.out.println("      『うわ、あれ盗品登録されてる奴だよ！");
			System.out.println();
			Thread.sleep(2000);

			String name_04 = "Remain/Natives/s_04";
			Tools.Graphic_Creator(name_04);
			System.out.println();
			System.out.println("      『うわ、あれ盗品登録されてる奴だよ！");
			System.out.println("        なんとか奪い返して、持ち主に届けよう、おにいちゃん！』");

			Thread.sleep(3000);
			System.out.println("      ");
			System.out.printf("      【1】奪う！  【2】やめとく  (成功率:%s%%)%n",per-10);
			System.out.println("      ");
			Thread.sleep(500);
			System.out.print("       >>");
			int input=sc.nextInt();
			if(input==1) {
				String name_yes_01 = "Remain/Natives/s_yes_01";
				Tools.Graphic_Creator(name_yes_01);
				System.out.println();
				System.out.println("      令和のルパンと謳われた、おにいちゃんに任せろっ！！");
				System.out.println("");
				Thread.sleep(2000);
				String name_yes_03 = "Remain/Natives/s_yes_03";
				Tools.Graphic_Creator(name_yes_03);
				System.out.println();
				System.out.println("      『うわぁ、一気に不安になってきた……。』");
				System.out.println("");
				Thread.sleep(1500);

				if(rdm.nextInt(100)>per) {
					String name_yes_fail_01 = "Remain/Natives/s_yes_fail_01";
					Tools.Graphic_Creator(name_yes_fail_01);
					System.out.println();
					System.out.println("      ひいぃぃぃ、捕まったぁぁぁっ！！");
					System.out.println("");
					Thread.sleep(2000);
					String name_yes_fail_02 = "Remain/Natives/s_yes_fail_02";
					Tools.Graphic_Creator(name_yes_fail_02);
					System.out.println();
					System.out.println("      『………………。』");
					System.out.println("");
					Thread.sleep(2000);
					System.out.println("");
					System.out.println("      HP-5、財宝-5");
					System.out.println("");
					Thread.sleep(500);
					h.setHp(h.getHp()-5);
					h.setMoney_judge(h.getItem_litter(),5,false);
					Thread.sleep(1000);
				}else {
					h.setMoney(h.getMoney()+10);
					Thread.sleep(1000);
					String name_yes_success_01 = "Remain/Natives/s_yes_success_01";
					Tools.Graphic_Creator(name_yes_success_01);
					System.out.println();
					System.out.println("      ふう、なんとかバレずに盗めたぞ。");
					System.out.println();
					Thread.sleep(2000);

					Tools.Graphic_Creator(name_yes_success_01);
					System.out.println();
					System.out.println("      『す、すごい！本当に義賊みたいだよ、おにいちゃん！』");
					System.out.println();
					Thread.sleep(2000);

					String name_yes_success_02 = "Remain/Natives/s_yes_success_02";
					Tools.Graphic_Creator(name_yes_success_02);
					System.out.println();
					System.out.println();
					System.out.println();
					Thread.sleep(500);
					String name_yes_success_03 = "Remain/Natives/s_yes_success_03";
					Tools.Graphic_Creator(name_yes_success_03);
					System.out.println();
					System.out.println();
					System.out.println();
					Thread.sleep(100);
					String name_yes_success_04 = "Remain/Natives/s_yes_success_04";
					Tools.Graphic_Creator(name_yes_success_04);
					System.out.println();
					System.out.println();
					System.out.println();
					Thread.sleep(100);
					String name_yes_success_05 = "Remain/Natives/s_yes_success_05";
					Tools.Graphic_Creator(name_yes_success_05);
					System.out.println();
					System.out.println();
					System.out.println();
					Thread.sleep(1000);

					String name_yes_success_06 = "Remain/Natives/s_yes_success_06";
					Tools.Graphic_Creator(name_yes_success_06);
					System.out.println();
					System.out.println("      ギャッハー！あいつら他にも、たんまりためこんでやがったぜぇー！");
					System.out.println();
					Thread.sleep(2000);

					Tools.Graphic_Creator(name_yes_success_06);
					System.out.println();
					System.out.println("      『前言撤回、小悪党だ！！』");
					System.out.println();
					Thread.sleep(2000);

					System.out.println();
					System.out.println("      財宝+10");
					System.out.println();
					Thread.sleep(1000);
				}
			}else {
				String name_05 = "Remain/Natives/s_05";
				Tools.Graphic_Creator(name_05);
				System.out.println();
				System.out.println("      いや、危険だからやめとこう。");
				System.out.println("");
				Thread.sleep(2000);
				String name_06 = "Remain/Natives/s_06";
				Tools.Graphic_Creator(name_06);
				System.out.println();
				System.out.println("      『私たち、義賊には なれそうもないね……。』");
				System.out.println("");
				Thread.sleep(2000);
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

	static int score_calculator(Hero h) {
		int score = 0;
		if(h.getMoney()>124) {
			score+=400;
		}else if(h.getMoney()>99) {
			score+=300;
		}else {
			score+=200;
		}
		score += h.getMoney() * 10;
		score += h.getItem_ointment() * 50;
		score += h.getItem_gun() * 30;
		score += h.getItem_smoke() * 20;
		score += h.getItem_litter() * 10;
		return score;
	}

	static void End_Adventure() throws InterruptedException {

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         S");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         Se");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  Y");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  Yo");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   N");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Ne");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Nex");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next A");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next Ad");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next Adv");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next Adve");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next Adven");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next Advent");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next Adventu");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next Adventur");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next Adventure");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(80);

		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		System.out.println("                                         See  You   Next Adventure !     ");
		for(int i=0;i<17;i++) {
			System.out.println("");
		}
		Thread.sleep(2000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		Thread.sleep(1000);
	}
}
