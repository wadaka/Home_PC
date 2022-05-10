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
			
			
			Hero h = new Hero();
			int ending = 0;
			
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
				switch(input) {
					case 1:
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println();
						System.out.println("    安全な道を進むことにした。");
						try {
							EventJudgement(input,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println("    探索終了。");
						break;
					case 2:
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println();
						System.out.println("    普通の道を進むことにした。");
						try {
							EventJudgement(input,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						h.setMoney(money+1);
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println("    探索終了。");
						System.out.println("    普通の道ボーナス:財宝+1。");
						break;
					case 3:
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println();
						System.out.println("    危険な道を進むことにした。");
						try {
							EventJudgement(input,h);
						} catch (InterruptedException e) {
							// TODO 自動生成された catch ブロック
							e.printStackTrace();
						}
						h.setMoney(money+2);
						System.out.println();
						System.out.println("  ============================================================================");
						System.out.println("    探索終了。");
						System.out.println("    危険な道ボーナス:財宝+2。");
						break;
					default:
						if(h.getItem_ointment()>0) {
							h.setHp(hp+30);
							h.setItem_ointment(h.getItem_ointment()-1);
							System.out.println("    傷薬を使用し、HPが30ポイント回復した！");
							System.out.println("    その後は、再三の注意を払いながら、道を進んでいった……。");
						}else {
							System.out.println("    しかし、傷薬を持っていなかった！");
							System.out.println("    仕方がないので、安全な道を進むことにした……。");
							try {
								EventJudgement(input,h);
							} catch (InterruptedException e) {
								// TODO 自動生成された catch ブロック
								e.printStackTrace();
							}
							System.out.println();
							System.out.println("  ============================================================================");
							System.out.println("    探索終了。");
						}
						
				}
				System.out.println();
				System.out.println("    ※エンターキー入力で次へ進みます。");
				System.out.println();
				sc.nextLine();
				String turnendClick = sc.nextLine();
				if(h.getHp()<0) {
					break;
				}
			}
			if(h.getHp()<0) {
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
			String lastClick = sc.nextLine();
			
		}
		System.out.println("アプリケーションを終了します。");
	}
	static void preparation() {
		System.out.println("============================================================================");
		for(int i=0;i<29;i++) {
			System.out.println();
		}
		System.out.println("              -上下の線とコンソールの表示幅を合わせてください-            ");
		System.out.println("      合わせ終わったらエンターキーを押してください。ゲームが始まります    ");
		System.out.print("============================================================================");
		String pre = sc.nextLine();
	}
	static void EventJudgement(int root,Hero h) throws InterruptedException{
		//イベント判定は、選択した「道」で変化。
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println("    …………");
		System.out.println();
		Thread.sleep(1000);
		System.out.println("    …………");
		System.out.println();
		Thread.sleep(1000);
		System.out.println("    …………");
		System.out.println();
		Thread.sleep(1000);
		
		
		
		int first_j = rdm.nextInt(100);
		int second_j = rdm.nextInt(100);
		//int third_j = rdm.nextInt(100);
		int get_m = 0;
		
		if(root<=2 && first_j>=50) {
			//安全な道を選んだ時の抽選
			if(root==1) {
				if(second_j>=50) {
					//
					getItem(root,h);
				}else if(second_j>=25) {
					//自然の脅威イベント
					attackNature(root,h);
					
				}else {
					//敵との戦闘(仮)
					if((rdm.nextInt(4))>0) {
						h.setHp(h.getHp()-10);
						System.out.println("    敵だ！");
						Thread.sleep(1000);
						System.out.println();
						System.out.println("    負けた！ボコられて痛いぜ！");
						System.out.println("    HP-10");
						Thread.sleep(1000);
					}else {
						h.setMoney(h.getMoney()+3);
						System.out.println("    敵だ！");
						Thread.sleep(1000);
						System.out.println();
						System.out.println("    勝った！ボコボコにしてやったぜ！");
						System.out.println("    財宝+3");
						Thread.sleep(1000);
					}
				}
			//普通の道を選んだ時の抽選
			}else {
				if(second_j>=75) {
					getItem(root,h);
				}else if(second_j>=50) {
					goToDungeon(h);
				}else if(second_j>=25) {
					//自然の脅威イベント
					attackNature(root,h);
					
				}else {
					//敵との戦闘(仮)
					if((rdm.nextInt(3))>0) {
						h.setHp(h.getHp()-20);
						System.out.println("    敵だ！");
						Thread.sleep(1000);
						System.out.println();
						System.out.println("    負けた！ボコられて痛いぜ！");
						System.out.println("    HP-20");
						Thread.sleep(1000);
					}else {
						h.setMoney(h.getMoney()+5);
						System.out.println("    敵だ！");
						Thread.sleep(1000);
						System.out.println();
						System.out.println("    勝った！ボコボコにしてやったぜ！");
						System.out.println("    財宝+5");
						Thread.sleep(1000);
					}
				}
			}
		}else if(root>=3 && first_j>=30) {
			if(second_j>=80) {
				getItem(root,h);
			}else if(second_j>=50) {
				goToDungeon(h);
			}else if(second_j>=25) {
				//自然の脅威イベント
				attackNature(root,h);
				
			}else {
				//敵との戦闘(仮)
				if((rdm.nextInt(2))>0) {
					h.setHp(h.getHp()-30);
					System.out.println("    敵だ！");
					Thread.sleep(1000);
					System.out.println();
					System.out.println("    負けた！ボコられて死にそーだぜ！");
					System.out.println("    HP-30");
					Thread.sleep(1000);
				}else {
					h.setMoney(h.getMoney()+7);
					System.out.println("    敵だ！");
					Thread.sleep(1000);
					System.out.println();
					System.out.println("    勝った！ボコボコにしてやったぜ！");
					System.out.println("    財宝+7");
					Thread.sleep(1000);
				}
			}
			
		}else {
			//ラッキーパターン
			//お宝を発見できるか判定
			if((rdm.nextInt(2))>0) {
				get_m = 1;
				if(root==2) get_m+=rdm.nextInt(3);
				if(root==3) get_m+=rdm.nextInt(3)+2;
				
				System.out.println("    ラッキー！宝を発見した！");
				Thread.sleep(1000);
				System.out.printf("    財宝+%d%n",get_m);
				Thread.sleep(1000);
			}else {
				System.out.println("    安全に進むことができた。");
			}
			
		}
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
		System.out.println("    ……ムム！遺跡があるぞ、入ってみよう！");
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
				System.out.println("    おお、像を持ち上げたら外への入口が！なんて親切な遺跡なのだ！");
				Thread.sleep(2000);
				System.out.println("    なに考えてんだ、マジで！");
				Thread.sleep(2000);
				System.out.println("    財宝+10");
				Thread.sleep(1000);
			}
		}else {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("    すごそうな水晶が祀られてる！");
			Thread.sleep(1000);
			System.out.println("    でも、原住民達にしっかり守られてるぞ。");
			Thread.sleep(2000);
			System.out.println();
			System.out.println("    よーし、上手くバレないように盗み出してやろう。");
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
