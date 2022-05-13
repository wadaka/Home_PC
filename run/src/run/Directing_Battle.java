package run;

public class Directing_Battle {
	static void showEncount(Enemy enemy,Hero h) throws InterruptedException{

		String[] infos = enemy.getBattleInfo();

		System.out.print("    …………！");
		Thread.sleep(1000);
		System.out.println(" 敵だ！！");
		Thread.sleep(1500);

		/*
		System.out.println("=======================================================================================");
		System.out.println();
		System.out.println("     +============================================================================+");
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
		System.out.println("     +============================================================================+");
		System.out.println("     ||                                                                          ||");
		System.out.println("     ||                  エ    ネ    ミ    ー    接    近    ！                  ||");
		System.out.println("     ||                                                                          || ");
		System.out.println("     +============================================================================+");
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
		System.out.println("     +============================================================================+");
		System.out.println();
		System.out.println("=======================================================================================");
		//System.out.printf("                                  第 %02d 歩                                  %n",count);
		//System.out.println("");
		 * *
		 */
		Thread.sleep(1500);
		System.out.println("=======================================================================================");
		System.out.println();
		System.out.println("     +============================================================================+");
		System.out.println("     ||                                                                          ||");
		System.out.println("     ||                  エ    ネ    ミ    ー    接    近    ！                  ||");
		System.out.println("     ||                                                                          || ");
		System.out.println("     +============================================================================+");
		System.out.println();
		System.out.println();
		System.out.printf("                                    %s が現れた！%n",enemy.name);
		System.out.println();
		System.out.println();
		System.out.println("     ++================++                    ++================++                      ");
		System.out.printf("     ||     戦  闘     ||  勝率   %3d %%      ||     逃  走     ||  成功率 %3d %%%n",enemy.win_per,enemy.run_per);
		System.out.println("     ++================++  -------------     ++================++  -------------");
		System.out.println("     ++================++================++  ++================++================++");
		System.out.println("     || 勝利時　　　   || 敗北時         ||  || 成功時　　　   || 失敗時         ||");
		System.out.println("     |+----------------+|----------------+|  |+----------------+|----------------+|");
		System.out.println("     ||  獲得          ||  喪失          ||  ||  獲得          ||  喪失          ||");
		System.out.println("     ||  ----          ||  ----          ||  ||  ----          ||  ----          ||");
		System.out.printf("     ||  財宝 +");
		System.out.printf("%s      ",enemy.win_money);
		if(enemy.win_money<10) System.out.printf(" ");
		System.out.printf("||  ＨＰ -%s||  ||  なし          ||  ＨＰ -%s||%n",infos[0],infos[1]);
		System.out.println("     ||  ------------  ||  ------------  ||  ||  ------------  ||  ------------  ||");
		System.out.printf("     ||  ");
		System.out.printf("%s||  なし          ||  ||  なし          ||  財宝 -%s||%n",infos[2],infos[3]);
		System.out.println("     ||  ------------  ||  ------------  ||  ||  ------------  ||  ------------  ||");
		System.out.println("     ++==================================++  ++==================================++");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		Thread.sleep(2500);
		System.out.println();
		System.out.println();
		System.out.println("     ++================++                    ++================++                      ");
		System.out.printf("     ||     戦  闘     ||  勝率   %3d %%      ||     逃  走     ||  成功率 %3d %%%n",enemy.win_per,enemy.run_per);
		System.out.println("     ++================++  -------------     ++================++  -------------");
		System.out.println("     ++================++================++  ++================++================++");
		System.out.println("     || 勝利時　　　   || 敗北時         ||  || 成功時　　　   || 失敗時         ||");
		System.out.println("     |+----------------+|----------------+|  |+----------------+|----------------+|");
		System.out.println("     ||  獲得          ||  喪失          ||  ||  獲得          ||  喪失          ||");
		System.out.println("     ||  ----          ||  ----          ||  ||  ----          ||  ----          ||");
		System.out.printf("     ||  財宝 +");
		System.out.printf("%s      ",enemy.win_money);
		if(enemy.win_money<10) System.out.printf(" ");
		System.out.printf("||  ＨＰ -%s||  ||  なし          ||  ＨＰ -%s||%n",infos[0],infos[1]);
		System.out.println("     ||  ------------  ||  ------------  ||  ||  ------------  ||  ------------  ||");
		System.out.printf("     ||  ");
		System.out.printf("%s||  なし          ||  ||  なし          ||  財宝 -%s||%n",infos[2],infos[3]);
		System.out.println("     ||  ------------  ||  ------------  ||  ||  ------------  ||  ------------  ||");
		System.out.println("     ++==================================++  ++==================================++");
		System.out.println();
		System.out.println();
		System.out.println("     ++==============================++");
		System.out.println("     ||     プレイヤーステータス     ||");
		System.out.println("     ++==============================++");
		System.out.println("     ++==============================++=========================================++");
		System.out.printf("     ||  HP %3d/100  |  財産 %3d/50  || 銃(%d)…勝率25%%UP | 煙幕(%d)…成功率25%%UP ||%n",h.getHp(),h.getMoney(),h.getItem_gun(),h.getItem_smoke());
		System.out.println("     ++==============================++=========================================++");
		System.out.println("");
		System.out.println("     -----------------------------------------------------------------------------");
		System.out.println("     どうする？");
		System.out.println("");
		System.out.println("");
		System.out.println("     【1】戦う  【2】逃げる");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("      >>");
	}

	static void battleStart(boolean isBattle) throws InterruptedException{
		for(int i=0;i<32;i++) {
			System.out.println()
;		}
		System.out.println("=======================================================================================");
		System.out.println();
		System.out.println("     +============================================================================+");
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
		System.out.println("                       +======================================+");
		System.out.println("                       ||                                    ||");
		System.out.println("                       ||        ");
		System.out.printf(isBattle ? "戦    闘    開    始" : "逃    走    開    始");
		System.out.println("        ||");
		System.out.println("                       ||                                    ||");
		System.out.println("                       +======================================+");
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
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("");
		System.out.println("                                          ・");
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("");
		System.out.println("                                          ・");
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("");
		System.out.println("                                          ・");
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("");
		System.out.println("                                          ・");
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("");
		System.out.println("                                          ・");
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("");

	}
	
	
	
	
	
	
	
	
	

	static void showResult(Hero h,int result,int hp,int money,int[] itemGetChecker) {
		System.out.println("      -----------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                       +======================================+");
		System.out.println("                       ||                                    ||");
		System.out.printf("                       ||              ");
		switch(result) {
		case 1:
			System.out.printf("勝    利              ||%n");
			s();
			break;
		case 2:
			System.out.printf("敗    北              ||%n");
			s();
			break;
		case 3:
			System.out.printf("成    功              ||%n");
			s();
			break;
		default:
			System.out.printf("失    敗              ||%n");
			s();
		}
		System.out.printf("%s%n",hp<0 ? "-"+hp:"+0");
		System.out.println("");
		System.out.printf("              財宝  :  ");
		if(money>=0) {
			System.out.printf("+%s%n",money);
		}else {
			System.out.printf("-%s%n",money);
		}
		System.out.println("");
		System.out.println("              獲得アイテム");
		System.out.println("");
		System.out.print("                ");
		int[] itemBringNow = {h.getItem_ointment(),h.getItem_gun(),h.getItem_smoke(),h.getItem_litter()};
		String[] itemLabels = {"傷薬  ","銃  ","煙幕  ","ゴミ  "};
		for(int i=0;i<itemGetChecker.length;i++) {
			if(itemBringNow[i]>itemGetChecker[i]) System.out.print(itemLabels[i]);
		};
		System.out.println();
		System.out.println("");
		System.out.println("            ◇現在のプレイヤーステータス ");
		System.out.println("            -----------------------------");
		System.out.println("");
		System.out.println("              基本ステータス");
		System.out.println("              --------------");
		System.out.println("");
		System.out.printf("                HP %3d/100  |  財産 %3d/50%n",h.getHp(),h.getMoney());
		System.out.println("");
		System.out.println("");
		System.out.println("              アイテム");
		System.out.println("              --------");
		System.out.println("");
		System.out.printf("                傷薬(%d) | 銃(%d) | 煙幕(%d) | ゴミ(%d)",itemBringNow[0],itemBringNow[1],itemBringNow[2],itemBringNow[3]);
		System.out.println("");
		System.out.println("");
		System.out.println("      -----------------------------------------------------------------------------");
	}

	static void s() {
		System.out.println("                       ||                                    ||");
		System.out.println("                       +======================================+");
		System.out.println("");
		System.out.println("");
		System.out.println("          ---------------------------------------------------------------------");
		System.out.println("");
		System.out.println("            ◇リザルト");
		System.out.println("            -----------");
		System.out.println("");
		System.out.printf("              ＨＰ  :  ");
	}
}
