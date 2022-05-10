package run;

public class Directing_GameMain {
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
		Thread.sleep(2500);
	}
	static void showMain(Hero h,int count) {
		System.out.println();
		System.out.println();
		System.out.println("  ============");
		System.out.println(" |////////////|-----------------------  =================================");
		System.out.printf(" |//第 %02d 歩//|=======================||  HP  %3d/100  |  財宝  %3d/50   ||%n",count,h.getHp(),h.getMoney());
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
		System.out.printf(" | 【1】安全な道…財宝+0             |  傷薬 (%d) ……  HPを30%%回復        |%n",h.getItem_ointment());
		System.out.println(" |                                   |------------------------------------|");
		System.out.printf(" | 【2】普通の道…財宝+1             |  銃   (%d) ……  戦闘勝率   25%% UP  |%n",h.getItem_gun());
		System.out.println(" |                                   |------------------------------------|");
		System.out.printf(" | 【3】危険な道…財宝+2             |  煙幕 (%d) ……  逃走成功率 25%% UP  |%n",h.getItem_smoke());
		System.out.println(" |                                   |------------------------------------|");
		System.out.printf(" | 【4】傷薬を使用する               |  ゴミ (%d) ……  盗難を防止         |%n",h.getItem_litter());
		System.out.println(" |-----------------------------------|------------------------------------|");
		System.out.println("  ------------------------------------------------------------------------");
		System.out.println();
		System.out.println("  ☆行動【1】～【4】を入力してください。");
		System.out.println();
		System.out.print("   >>");
	}

}
