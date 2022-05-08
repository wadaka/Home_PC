package run;
import java.util.Random;
import java.util.Scanner;

public class GameApp {
	final static Scanner sc = new Scanner(System.in);
	final static Random rdm = new Random();
	public static void main(String[] args) {
		preparation();
		while(true) {
			showTitle();
			int startSelect = sc.nextInt();
			sc.nextLine();
			if(startSelect!= 1)break;
			//Op.showOp();
			//Tutorial.showTutorial();
			Hero h = new Hero();
			int ending = 0;
			
			for(int i=0;i<30;i++) {
				
				try {
					showAvant(i+1);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				showMain(h,i+1);
				int input = sc.nextInt();
				int hp = h.getHp();
				int money = h.getMoney();
				switch(input) {
					case 1:
						System.out.println("    安全な道を進んだ。");
						int E_num = rdm.nextInt(10)+1;
						h.setHp(hp+E_num);
						System.out.printf("    HPが%dポイント回復した。%n",E_num);
						break;
					case 2:
						System.out.println("    普通の道を進んだ。");
						int N_num = rdm.nextInt(11);
						h.setHp(hp-N_num);
						h.setMoney(money+2);
						if(N_num>0) System.out.printf("    HPが%dポイント減った。%n",N_num);
						System.out.println("    財宝が2ポイント増えた。");
						break;
					case 3:
						System.out.println("    危険な道を進んだ。");
						int H_num = rdm.nextInt(21);
						h.setHp(hp-H_num);
						h.setMoney(money+3);
						if(H_num>0) System.out.printf("    HPが%dポイント減った。%n",H_num);
						System.out.println("    財宝が3ポイント増えた。");
						break;
					default:
						if(h.getItem_ointment()>0) {
							h.setHp(hp+30);
							System.out.println("    傷薬を使用し、HPが30ポイント回復した！");
						}else {
							System.out.println("    しかし、傷薬を持っていなかった！");
							System.out.println("    仕方がないので、安全な道を進んだ。");
							int S_num = rdm.nextInt(10)+1;
							h.setHp(hp+S_num);
							System.out.printf("    HPが%dポイント回復した。%n",S_num);
						}
						
				}
				sc.nextLine();
				String end = sc.nextLine();
				if(h.getHp()<0) {
					break;
				}
			}
			if(h.getHp()<0) {
				ending = 0;
			}
			else if(h.getMoney()>=75) {
				ending = 1;
			}else {
				ending = 2;
			}
			try {
				showEnding(ending);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			String last = sc.nextLine();
			
		}
		System.out.println("アプリケーションを終了します。");
	}
	static void preparation() {
		System.out.println("============================================================================");
		for(int i=0;i<29;i++) {
			System.out.println();
		}
		System.out.println("              -上下の線とコンソールの表示幅を合わせてください-              ");
		System.out.println("      合わせ終わったら適当な文字を入力し、エンターキーを押してください      ");
		System.out.print("============================================================================");
		String pre = sc.nextLine();
	}
	static void showTitle() {
		System.out.println("============================================================================");
		System.out.println("============================================================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("        ■■■■■■■                                    ■■■");
		System.out.println("      ■■■■■■■■■                                  ■■■");
		System.out.println("    ■■■■■■■■■■■      ■■■■■          ■■  ■■■■■■");
		System.out.println("    ■■■■■■■■■■■    ■■■■■■■        ■■  ■■■■■■");
		System.out.println("    ■■■        ■■■    ■■          ■■      ■■  ■■■");
		System.out.println("                ■■■      ■■          ■■    ■■■■■■■■■■■");
		System.out.println("              ■■■        ■■          ■■    ■■■■■■■■■■■");
		System.out.println("            ■■■■        ■■          ■■        ■■■■■■■");
		System.out.println("        ■■■■■■■      ■■          ■■      ■■■■■■■■■");
		System.out.println("        ■■■■■■■      ■■          ■■    ■■■  ■■■  ■■■");
		System.out.println("        ■■■■■■■      ■■          ■■  ■■■■  ■■■  ■■■■");
		System.out.println("            ■■■■        ■■          ■■  ■■■    ■■■  ■■■■■");
		System.out.println("              ■■■        ■■          ■■ ■■■       ■  ■■■■■■");
		System.out.println("                ■■■      ■■          ■■                  ■■■");
		System.out.println("    ■■■        ■■■    ■■          ■■                ■■■");
		System.out.println("    ■■■■■■■■■■■    ■■■■■■■                ■■■");
		System.out.println("    ■■■■■■■■■■■      ■■■■■                ■■■");
		System.out.println("      ■■■■■■■■■                                ■■■");
		System.out.println("        ■■■■■■■                                ■■■");
		System.out.println();
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("============================================================================");;
		System.out.println("                               【1】はじめる                                ");
		System.out.println("                               【2】おわる      ");
		System.out.println("============================================================================");
		System.out.println("============================================================================");
		System.out.print("                              >>");
	}
	static void showAvant(int count) throws InterruptedException{
		System.out.println("============================================================================");
		System.out.println("============================================================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("                                  第 %02d 歩                                  %n",count);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("============================================================================");
		System.out.println("============================================================================");
		Thread.sleep(40);
	}
	static void showMain(Hero h,int count) {
		System.out.println();
		System.out.println();
		System.out.println("  ============");
		System.out.println(" |////////////|-----------------------  =================================");
		System.out.printf(" |//第 %02d 歩//|=======================||  HP  %3d/100  |  財宝  %3d/75   ||%n",count,h.getHp(),h.getMoney());
		System.out.println(" |////////////|                         ================================= ");
		System.out.println("  ============                                                            |");
		System.out.println(" |                                                                        |");
		System.out.println(" |                                                                        |");
		System.out.println(" |                                                                        |");
		System.out.println(" |                                                                        |");
		System.out.println(" |                                                                        |");
		System.out.print(" |    ");
		for(int i=0;i<32;i++) {
			if(count+1<12) {
				if(i+1==count) {
					System.out.print("▽");
				}else {
					System.out.print("  ");
				}
			}else if(count+1<22){
				if(i+2==count+2){
					System.out.print("▽");
				}else {
					System.out.print("  ");
					
				}
			}else {
				if(i+2==count+3){
					System.out.print("▽");
				}else {
					System.out.print("  ");
				}
			}
		}
		System.out.println("    |");
		System.out.print(" |    ");
		for(int i=0;i<32;i++) {
			if(i==10 || i==21) {
						System.out.print("  ");
			}else{
				if(count<11) {
					if(i+1<count) {
						System.out.print("■");
					}else{
						System.out.print("□");
					}
				}else if(count<21) {
					if(i<count) {
						System.out.print("■");
					}else{
						System.out.print("□");
					}
				}else {
					if(i-1<count) {
						System.out.print("■");
					}else{
						System.out.print("□");
					}
				}
			};
		}
		System.out.println("    |");
		System.out.println(" |                                                                        |");
		System.out.println(" |                                                                        |");
		System.out.println(" |                                                                        |");
		System.out.println("  ----------                          ----------                          |");
		System.out.println(" |   行動   |------------------------| アイテム |-------------------------|");
		System.out.println(" |-----------------------------------+------------------------------------|");
		System.out.printf(" | 【1】安全な道…財宝+0 HP+(0～10)  |  傷薬 (%d) ……　HPを30回復         |%n",h.getItem_ointment());
		System.out.println(" |                                   |------------------------------------|");
		System.out.printf(" | 【2】普通の道…財宝+2 HP-(0～10)  |  銃   (%d) ……　戦闘勝率   25%% UP  |%n",h.getItem_gun());
		System.out.println(" |                                   |------------------------------------|");
		System.out.printf(" | 【3】危険な道…財宝+3 HP-(0～20)  |  煙幕 (%d) ……　逃走成功率 25%% UP  |%n",h.getItem_smoke());
		System.out.println(" |                                   |------------------------------------|");
		System.out.printf(" | 【4】傷薬を使用する               |  ゴミ (%d) ……  盗難を防止         |%n",h.getItem_litter());
		System.out.println(" |-----------------------------------|------------------------------------|");
		System.out.println("  ------------------------------------------------------------------------");
		System.out.println();
		System.out.println("  ☆行動【1】～【4】を入力してください。");
		System.out.println();
		System.out.print("   >>");
	}
	static void showEnding(int ending) throws InterruptedException{
		for(int i=0;i<33;i++) {
			System.out.println();
		}
		
		if(ending==0) {
			System.out.println();
			System.out.println();
			System.out.println("ゲームオーバー！");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("  「無念……っ！」");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println("  志半ば、HPが0になってしまった結果、");
			Thread.sleep(2000);
			System.out.println("  あなたは地に伏した……。もう二度と目覚めることはない……。");
			Thread.sleep(4000);
			System.out.println();
			System.out.println();
			System.out.println("  文字入力&エンターキーで、タイトルへ戻る");
			Thread.sleep(2000);
			System.out.print("  >>");
		}else if(ending==1) {
			System.out.println();
			System.out.println();
			System.out.println("ゲームクリア！");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("  「あっぱれ…っ！」");
			Thread.sleep(2000);
			System.out.println("  あなたは「秘境」に打ち勝ち、借金までもチャラにした！");
			Thread.sleep(2000);
			System.out.println("  一流のトレジャーハンターだ、えらい！");
			Thread.sleep(4000);
			System.out.println();
			System.out.println();
			System.out.println("  文字入力&エンターキーで、タイトルへ戻る");
			Thread.sleep(2000);
			System.out.print("  >>");
			
		}else {
			System.out.println();
			System.out.println();
			System.out.println("ゲームオーバー！");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("  「よくがんばった…っ！」");
			Thread.sleep(2000);
			System.out.println("  ……と、言いたいところだけど、");
			Thread.sleep(2000);
			System.out.println("  残念ながら、借金を返済できなかった……。");
			Thread.sleep(4000);
			System.out.println();
			System.out.println();
			System.out.println("  生きて「秘境」を脱出できた。");
			Thread.sleep(2000);
			System.out.println("  命があるだけラッキーだ。");
			Thread.sleep(4000);
			System.out.println();
			System.out.println();
			System.out.println("  ……そうやって、自分を慰めるあなたを尻目に、");
			Thread.sleep(2000);
			System.out.println("  ガラの悪そうなアンちゃんの手が、あなたの両肩に手を伸びていく……。");
			Thread.sleep(4000);
			System.out.println();
			System.out.println();
			System.out.println("  文字入力&エンターキーで、タイトルへ戻る");
			Thread.sleep(2000);
			System.out.print("  >>");
			
		}
	}
}
