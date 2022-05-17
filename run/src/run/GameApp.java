package run;
import java.util.Random;
import java.util.Scanner;

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
	final static int[] item_H = {25,35,45,50,70};



	public static void main(String[] args) {
		preparation();
		while(true) {
			Directing_Title.showTitle();
			int startSelect = sc.nextInt();
			if(startSelect==1) {
				try {
					Directing_StartGame.showStartGame();
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(startSelect==2) {
				Directing_Op.showOp();
				continue;
			}else if(startSelect==3) {
				Directing_Tutorial.showTutorial();
				continue;
			}else if(startSelect==4) {
				break;
			}else {
				continue;
			}
			
			Directing_Op.showOp();
			
			Directing_Tutorial.showTutorial();

			Hero h = new Hero();

			//ゲームのメインループ
			//HPが0になる場合を除き、30ターン
			for(int i=0;i<30;i++) {

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
				
				//コマンド選択時に発生する処理。以後、戦闘判定→イベント判定を経由しながら
				switch(input) {
					//安全な道を選択した時の処理-----------------------------------------------------------------------------
					case 1:
						System.out.println();
						System.out.println("  ============================================================================");
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
						System.out.println("  ============================================================================");
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
						System.out.println("  ============================================================================");
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
							System.out.println("  ============================================================================");
							System.out.println();
							System.out.println("    傷薬を使用し、HPが30ポイント回復した！");
						}else {
							System.out.println();
							System.out.println("  ============================================================================");
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
							System.out.println("  ============================================================================");
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
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println("    探索終了。");
						break;
					//普通の道を選択した時の処理-----------------------------------------------------------------------------
					case 2:
						try {
							EventJudgement(input,i,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						getMoney_TurnEnd(2,h);
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println("    探索終了。");
						System.out.println("    普通の道ボーナス:財宝+1。");
						break;
					//危険な道を選択した時の処理-----------------------------------------------------------------------------
					case 3:
						try {
							EventJudgement(input,i,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						getMoney_TurnEnd(3,h);
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println("    探索終了。");
						System.out.println("    危険な道ボーナス:財宝+2。");
						break;
					//傷薬を使用した場合の処理
					default:
						System.out.println();
						System.out.println("    その後は、再三の注意を払いながら、道を進んでいった……。");
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println("    探索終了。");
						System.out.println();
				}
				
				System.out.println();
				System.out.println("    ※エンターキー入力で次へ進みます。");
				System.out.println();
				sc.nextLine();
				String turnendClick = sc.nextLine();
				
				//イベントで死亡した場合、ここでbreakし、死亡イベントへ移行
				if(h.getHp()<1) break;
			}

			//エンディングの分岐処理
			//エンディングは4種類で、１.HP0で死亡、2.借金が返せずLife is Over、3.生存+借金返済のはっぴーえんど。4は隠し（未実装）
			int ending = 0;
			if(h.getHp()<1) {
				ending = 0;
			}
			else if(h.getMoney()>=50) {
				ending = 1;
			}else {
				ending = 2;
			}
			try {
				Directing_Ending.showEnding(ending);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			sc.nextLine();
			String lastClick = sc.nextLine();

		}
		System.out.println("アプリケーションを終了します。");
	}
	static void preparation() {
		System.out.println("============================================================================");
		System.out.println("      合わせ終わったらエンターキーを押してください。ゲームが始まります    ");
		System.out.println("              -上下の線とコンソールの表示幅を合わせてください-            ");
		System.out.println("");
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
		System.out.print("============================================================================");
		String pre = sc.nextLine();
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
		if(root<=2 && first_j>=50) {
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
			}else if(second_j>0) {
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
			get_m+=rdm.nextInt(3);
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
			System.out.println();
			h.setHp(hp+3);
			System.out.println("    トカゲだ！");
			System.out.println("    まあ、食えなくもない……。");
			Thread.sleep(1000);
			System.out.println("    HP+3");
			Thread.sleep(1000);
		}else if(item_j<items[1]){
			System.out.println();
			h.setHp(hp+5);
			System.out.println("    果物だ！");
			System.out.println("    うーん、とても甘い。");
			Thread.sleep(1000);
			System.out.println("    HP+5");
			Thread.sleep(1000);
		}else if(item_j<items[2]){
			System.out.println();
			h.setHp(hp+7);
			System.out.println("    さかなだ！");
			System.out.println("    とれたてだから、鮮度がいいぜ！");
			Thread.sleep(1000);
			System.out.println("    HP+7");
			Thread.sleep(1000);
		}else if(item_j<items[3]){
			System.out.println();
			h.setHp(hp+15);
			System.out.println("    携帯食料だ！");
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
			h.setHp(hp-15);
			System.out.println();
			System.out.println("    ……手りゅう弾？");
			Thread.sleep(1000);
			System.out.println("    しまった、ブービートラップだ！！");
			Thread.sleep(1000);
			System.out.println("    HP-15");
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
			h.setHp(hp-2);
			System.out.println("    スコールだ！");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    ずぶぬれになった体が冷え、体力が奪われる……。");
			Thread.sleep(1000);
			System.out.println("    HP-2");
			Thread.sleep(1000);
		}else if(attackN_j<attackNs[1]) {
			//虫
			h.setHp(hp-3);
			System.out.println("    吸血虫だ！");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    うぅ、血を吸われて眩暈が……。");
			Thread.sleep(1000);
			System.out.println("    HP-3");
			Thread.sleep(1000);
		}else if(attackN_j<attackNs[2]) {
			//ヘビ
			h.setHp(hp-7);
			System.out.println("    ヘビだ！");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    ぎゃあ、噛まれた！！。");
			Thread.sleep(1000);
			System.out.println("    HP-7");
			Thread.sleep(1000);
		}else if(attackN_j<attackNs[3]) {
			//河
			int bad = rdm.nextInt(8)+3;
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
			h.setMoney(h.getMoney()-bad);
			System.out.println("    うわ、金食い虫に財宝を食われた！");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("    チクショー！金返せ！！");
			Thread.sleep(1000);
			System.out.printf("    財宝-%s%n",bad);
			Thread.sleep(1000);
		}
	}
	static void goToDungeon(Hero h) throws InterruptedException{
		System.out.println("    ……おぉ！遺跡があるぞ、入ってみよう！");
		Thread.sleep(2000);
		int d_f = rdm.nextInt(3);
		if(d_f>2) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("    何やら怪しいスイッチが……。押してみよう。");
			Thread.sleep(1000);
			System.out.println("    ポチ！");
			if(rdm.nextInt(2)>0) {
				h.setMoney(h.getMoney()-5);
				Thread.sleep(1000);
				System.out.println();
				System.out.println("    パカ！");
				Thread.sleep(1000);
				System.out.println("    しまった！落とし穴の作動罠だ！");
				System.out.println("    落下した時に、財宝を一部落としてしまった！");
				Thread.sleep(2000);
				System.out.println("    財宝-5");
				Thread.sleep(2000);

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
		}else if(d_f>1) {
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
				h.setMoney(h.getMoney()-5);
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
}
