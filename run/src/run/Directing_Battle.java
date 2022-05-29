package run;

import java.util.Random;

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
		for(int i=0;i<32;i++) {
			System.out.println();
		}
		System.out.println("========================================================================================");
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
		System.out.printf("                                    %s が現れた！%n",enemy.name);
		System.out.println();
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
		System.out.printf("     ||  HP %3d/100  |  財産 %3d/100 || 銃(%d)…勝率25%%UP | 煙幕(%d)…成功率25%%UP ||%n",h.getHp(),h.getMoney(),h.getItem_gun(),h.getItem_smoke());
		System.out.println("     ++==============================++=========================================++");
		System.out.println("");
		System.out.println("     -----------------------------------------------------------------------------");
		System.out.println("     どうする？");
		System.out.println("");
		System.out.println("");
		System.out.println("     【1】戦う  【2】逃げる");
		System.out.println("");
		System.out.println("");
	}

	static void battleStart(boolean isBattle,boolean isItemUse) throws InterruptedException{
		for(int i=0;i<32;i++) {
			System.out.println();
		}
		System.out.println("========================================================================================");
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
		System.out.print("                       ||        ");
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
		System.out.println("     +============================================================================+");
		System.out.println();
		System.out.println("========================================================================================");
		Thread.sleep(1000);
		/*
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
		*/
		if(isBattle==true) {
			common_Battle_Direction();
			Thread.sleep(1500);
			if(isItemUse==true) {
				int random = new Random().nextInt(1);
				if(random>0) {
					gun_Used_1();
				}else {
					gun_Used_2();
				}
			}else {
				gun_unUsed();
			}
		}else {
			common_Run_Direction();
			Thread.sleep(1500);
		}
	}

	static void showResult(Hero h,int result,int hp,int money,int[] itemGetChecker,int playerMoney) {
		for(int i=0;i<32;i++) {
			System.out.println();
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
		for(int i=0;i<16;i++) {
			System.out.println();
		}
		System.out.println("                       ・");
		for(int i=0;i<16;i++) {
			System.out.println();
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		for(int i=0;i<16;i++) {
			System.out.println();
		}
		System.out.println("                       ・  ・");
		for(int i=0;i<16;i++) {
			System.out.println();
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
		for(int i=0;i<16;i++) {
			System.out.println();
		}
		System.out.print("                       ・  ・  ・  ");
		switch(result) {
		case 1:
			System.out.printf("勝    利    ！！%n");
			break;
		case 2:
			System.out.printf("・  ・  敗    北%n");
			break;
		case 3:
			System.out.printf("成    功    ！%n");
			break;
		default:
			System.out.printf("・  ・  失    敗%n");
		}
		for(int i=0;i<16;i++) {
			System.out.println();
		}
		
		
		/*
		System.out.println("      -----------------------------------------------------------------------------");
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
		System.out.println("                       +======================================+");
		System.out.println("                       ||                                    ||");
		System.out.printf("                       ||              ");
		switch(result) {
		case 1:
			System.out.printf("勝    利              ||%n");
			break;
		case 2:
			System.out.printf("敗    北              ||%n");
			break;
		case 3:
			System.out.printf("成    功              ||%n");
			break;
		default:
			System.out.printf("失    敗              ||%n");
		}
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
		System.out.println("      -----------------------------------------------------------------------------");
		*/
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("      -----------------------------------------------------------------------------");
		System.out.println("          ---------------------------------------------------------------------");
		System.out.println("");
		System.out.println("            ◇リザルト");
		System.out.println("            -----------");
		System.out.println("");
		System.out.printf("              ＨＰ  :  ");
		System.out.printf("%s%n",hp>0 ? "-"+hp:"+0");
		System.out.println("");
		System.out.printf("              財宝  :  ");
		if(money>=0) {
			System.out.printf("+%s%n",money);
		}else {
			if(playerMoney > h.getMoney()) {
				System.out.printf("%s%n",money);
			}else {
				System.out.println("  0 (ゴミを身代わりにして、財宝の喪失を防ぎました。)");
			}
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
		System.out.printf("                HP %3d/100  |  財産 %3d/100%n",h.getHp(),h.getMoney());
		System.out.println("");
		System.out.println("");
		System.out.println("              所持アイテム");
		System.out.println("              ------------");
		System.out.println("");
		System.out.printf("                傷薬(%d) | 銃(%d) | 煙幕(%d) | ゴミ(%d)%n",itemBringNow[0],itemBringNow[1],itemBringNow[2],itemBringNow[3]);
		System.out.println();
		System.out.println("          ---------------------------------------------------------------------");
		System.out.println("      -----------------------------------------------------------------------------");
	}
	
	static void common_Battle_Direction() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                                                                                       ...(MM# ");
		System.out.println("          `       `                       `               `                            .M   .N.... ");
		System.out.println("                          `                       `               `                    .MMMM#D..#3  ");
		System.out.println("         .........NMMMMNNg..  ..JNMMMMMMMMMMg,                                       jMNa.gMHYUM");
		System.out.println("      .MMM\"\"WMMH\"`     (TMMMMMMM#\"`         7WN,                                     ?7HM=` ,NMM .F (F");
		System.out.println("    .M#\"                   ?7TF!              .Mh.        `       `                     7#`..|TN]() #!");
		System.out.println("   JMF                                          UN.                                      \"\"\"WNJHMMNdM+");
		System.out.println("  -Mt                                    (sAe   .Mb                                        .MNM\"(TM#MaJN,");
		System.out.println(" .MF         ..                          M] Ub   d#       `                               .MMM~  .Mb. QJN,");
		System.out.println(" J#          .N,                  TN,    .T\"9=   JN,              `                        M9M9t  TMN/MdgM|");
		System.out.println(" J#          .MMh.        .        dm,           JM]                                      .MpN....-MM7H].NF");
		System.out.println(" JMb         .MMMMm,     M#       .MMNJ.        .d#                                       ..TMMMe   d].F Mb");
		System.out.println(" .MMx        .MMMMMN,   .M#       .MMMMMMNJ....MMM`               `                       .b. jMM;  (M\"$ TM-");
		System.out.println("  4MM,       .MM  ,MM...JMN,      .MMP` .TMMMMM\"^         `                               .M, .MP!  .MMhMMH^");
		System.out.println("  .MMM[       dM    ?YMM#7TM,       ,Mp                                                    .M^ Ma....M#?!");
		System.out.println("    MMF       MM          .MM       .MN                                                    MNMH(M#MMMMB");
		System.out.println("    MM#`    .MMF          .MM        MN.                          `                        .#M#\"4N..M\\q- ");
		System.out.println(".   \"5       \"!           .\"         \"\"`                ...................................M\\...M.MM#.J{.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("                                         .......");
		System.out.println("                                     .JMMMMMMMMM#HMMN+,");
		System.out.println("                                 .MMM\"^`           ?TMN, ");
		System.out.println("                                 .M#=                   .W.       /\"N,");
		System.out.println("                  `  .... .JF   JM^                       4b         WL  ` `");
		System.out.println("          `             !?9!   .#`                         dN.       .@ (\"WMMM`");
		System.out.println("                 .J            dN          ...-... ...     .M\\       .@.d@'    .a. ...........");
		System.out.println("                 M\\            dMx        JFM[ J#`.F.M_   .MM).Ne .(M\" (F     .gM#     ..      .");
		System.out.println("                 Wp           .dMMa.      ?NJb J\"$.MMF..J-MMM\\  ?N@!(M@^  . .#=  !   .J\"Ta.    ?THa,");
		System.out.println("         `..d9\"   .\"^  ....  .NTMMF   .(J7\".,  .`..JMDTN,^.dF   .M'      JF.!    .        M`       (He.");
		System.out.println("        .MD`             .7WNM! WN]   .$.MY\"\"\"\"\"\"\"!    (N| J] .dD     .(B'     .M\"\"M@    dF,\"MMQJJJ. .TW.");
		System.out.println("     .g#^        .,          M# JM[     dMm+.J....(+dNMMF .dF?'      MMHQQQr.MB' .#!   .d\"(J.     .N .+M\\");
		System.out.println("     dNkkMBkQ, .d\"            ?UmMM,    .MMMMMMMMMMM\">.M\\.(M'                 . ?^   ..M=  ,M     .NJB! ");
		System.out.println("            .MH=      .          .4M,  ,n,MNg++++++HM\"^ .M#'                .Mt ..,d#\"!   J9`    .M\"");
		System.out.println("                 .&.M9^ .M$d9&...  ?HMm...      .......MY^                 .MMM\"\"!     .M3      .#!");
		System.out.println("                 .#`  .aM]     _THJ.  7TMYHNNg.MMMM\"\"!`                              (@!     ..gM\"");
		System.out.println("                .#   .M\"TMMHHtdNggdM[        ?7                                     j) ...JM\"^`");
		System.out.println("               -F    M'   ?Ba.                                                     .MNdY\"!");
		System.out.println("              .M!    ?YNb.a. ?Hg, ");
		System.out.println("              M!.,.N,.#^  .7\"B\"BMN,                                  ....... ");
		System.out.println("             .JM\"  ,MF            `                              .gggMMNJ(ZMb.");
		System.out.println("               M    ,Me                                           TNadNgggMM\"TH] ");
		System.out.println("                      Nga(-......,                                   MMMHMMMMM#\" ");
		System.out.println("               .9m,     ...-JgM#\"`                                   ?7NMMNJ# ");
		System.out.println("          `      .TN..\"9\"?'                                      .ggMMpWN(HMHM&.");
		System.out.println("                                                               .J!  .@MMWM\"\"!&dN.. ");
		System.out.println("                                                          `   .@ ..MDqM}.@   .MM,?N,");
		System.out.println("                                                  `         .MMM#\"7?WM@ .F   .@dMa.D-");
		System.out.println("                                                          .M\".MD   .MMNMb    .MMF.NJ-N,  ");
		System.out.println("          `                                               M(#5!    .MF?\"\"\"T\"WNMM_  ?Haga. ");
		System.out.println("                                          `             J@!.@      J\"\"\"\"\"MaM\"`.,     ?N,W] ");
		System.out.println(".........................................................TMD.........M-...J-...M-......T5!.");
	}
	
	static void gun_Used_1() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                                              ..MB8a,                 ..............,");
		System.out.println("     `    `    `    `    `    `    `    `  .-MMYMMMgMb    `    `    ,MM~          .7TBWN|");
		System.out.println("                                         .(M\"9`    TMN,   .         .FWa+-....... ...Qd\"N");
		System.out.println("                                        .M\".(MMMMNJ ,WMN,          (M~ .??\"\"\"\"\"\"\"\"\"`    ,NN");
		System.out.println("                                       .#.g#<.ga,.WN, .MM,         dMg.                .gMMfffa..");
		System.out.println("      `  `  `   `  `  `   `  `  `   `  .@(M(MMMMMN,MN; ,MN,  `   .JMMNMe..           .MMMM#`    7HJ.  ");
		System.out.println("   `                                   .@JM(MMMMMMF,M# ,MFUJ.  ,\"!   TMMMMMNNgM..ggMMMMD!        .JL.");
		System.out.println("                                       .NJM(MMMMMMF M# ,MN ?WMNN,       (YMMMMMMMMNM#5!       .(gMM\"");
		System.out.println("             `         `         `     .N,M-WMMMM9 JMD .MM,   JMNe.                       ..MMM9\"!");
		System.out.println("     `  `       `  `      `  `      `   Mb?H+..+&&dM3  .MMHWWQ.MM]4a,            ...&&&m#Y\"M");
		System.out.println("           `                            .M-          .dM8d{   .N.   ?Na.....ggNMMMMMMM\"N.#Mb");
		System.out.println("   `                  `         `        ?Na...     .MMM_da. ..MM`    ?MMMMM@\"\"\"!`     M@.#t");
		System.out.println("                         `         `      ,N#TMBNM#\"JM#-dM%.J\"dMM,    .BM#5 .N.       .#'?.N ");
		System.out.println("      `  `   `  `  `        `              .M.      M(F.MMMNM .M,M,   (NdMN,.TD       NMaMMM+-.  ");
		System.out.println("                               `      `    .Mt     .NWNMMaMg#(NmM,JNJfQeT#\"Ma&.....qNMMMNM\"M  ?N,  ");
		System.out.println("   `                  `           `        .M,     .MMMMSM#\"Hd:.JY8M- ?Ma,MF(M-....MN#\"^ .J,   ,F");
		System.out.println("          `              `                  TMa...gM#\"MMMN, .7`HM@TNJZ` ,NM[J%  . .M!          .F");
		System.out.println("      `      `  `  `        `        `        .7\"\"MD  .M`?M!  j/^(+#^   .?.TN+JJJ.WN,          .F ");
		System.out.println("                               `  `     `        .m|   Mb M! .@  dQF             .@           .M!");
		System.out.println("   `     `            `                          J#]    ,!M! .N_.@M!  (h.        7`          .M'");
		System.out.println("            `            `                        WR,   -,N  .MM5M'..Mm.e      .J\\          .#`");
		System.out.println("                                                   7M.  .MMMM#BMMNgMMHHe.     .@            4]");
		System.out.println("                                                    THWWYM#q@.MPT\"!.#-?\"Tme-, M            .F");
		System.out.println("                                                         ,X#?\"d=     ..     ,N,va.........dM,");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	static void gun_Used_2() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                                              ..MB8a,                 ..............,");
		System.out.println("     `    `    `    `    `    `    `    `  .-MMYMMMgMb    `    `    ,MM~          .7TBWN|");
		System.out.println("                                         .(M\"9`    TMN,   .         .FWa+-....... ...Qd\"N.");
		System.out.println("                                        .M\".(MMMMNJ ,WMN,          (M~ .??\"\"\"\"\"\"\"\"\"`    ,N");
		System.out.println("                                       .#.g#<.ga,.WN, .MM,         dMg.                .gMMfffa.. ");
		System.out.println("      `  `  `   `  `  `   `  `  `   `  .@(MMMMMMMM_MN; ,MN,  `   .JMMNMe..           .MMMM#`    7HJ");
		System.out.println("   `                                   .@J#MMMMMMM],M# ,MFUJ.  ,\"!   TMMMMMNNgM..ggMMMMD!        .JL.");
		System.out.println("                                       .NJNMMMMMMM] M# ,MN ?WMNN,       (YMMMMMMMMNM#5!       .(gMM\"");
		System.out.println("             `         `         `     .N,MMMMMMMB`JMD .MM,   JMNe.                       ..MMM9\"! ");
		System.out.println("     `  `       `  `      `  `      `   Mb?H+..+&&dM3  .MMHWWQ.MM]4a,            ...&&&m#Y\"M ");
		System.out.println("           `                            .M-          .dM8d{   .N.   ?Na.....ggNMMMMMMM\"N.#Mb");
		System.out.println("   `                  `         `        ?Na...     .MMM_da. ..MM. ,  ?MMMMM@\"\"\"!`     M@.#t ");
		System.out.println("                         `         `      ,M#TMBNM#\"JM#-dM%.J\"dM~?N.. .BM#5 .N.       .#'?.N  ");
		System.out.println("      `  `   `  `  `        `              JM.      M(F.MMMNM .M#3(NM.(NdMN,.TD       NMaMMM ");
		System.out.println("                               `      `    .M$     .NWNMMaMg#(MM# (MMMMNM#\"Ma&.....qNMMMNM\" ");
		System.out.println("   `                  `           `        .M,     .MMMMTMMM\"\"SxNJ.MMN ?N,MF(M-....MN#\"^ ... ");
		System.out.println("          `              `                  TMa...gM#Ma       .MM# 7WM< ?F?`?%  . .M!      dMb.");
		System.out.println("      `      `  `  `        `        `        .7\"\"\"'dt ?SQgMMf\"`MF   d)  #        7\"       ,M/M,");
		System.out.println("                               `  `     `           .-.      74]db  .M'  #  M`             .M}.N");
		System.out.println("   `     `            `                             (..\"m,&&gVMtMt  .F  .# .N      .N       M} J]");
		System.out.println("            `            `                          .Tha..  ..MNM, .# .MWF .'       4[      d[");
		System.out.println("                                                     ., =TBT\"7M^J\\ ?~.D J\\          .N      .]");
		System.out.println("                                                     ?#M,  `  .d$. .#'  \"            M_     .]");
		System.out.println("                                                        .Ta...B(d3,3 .-D             ,F     .N");
		System.out.println("                                                           ??` M                      N      (b");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	static void gun_unUsed() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                                                             .M:");
		System.out.println("                                                            .MM:");
		System.out.println("                                                           .MMM:        \\\"\\\"\\\" ");
		System.out.println("     `    `    `    `    `    `    `    `    `    `    `  .NMMM:    ,MM~          .7TBWN| ");
		System.out.println("                                                        .Mi#`dM:    .FWa+-....... ...Qd\"N.");
		System.out.println("                                                      ..Ma#`.MM:   (M~ .??\"\"\"\"\"\"\"\"\"`    ,N");
		System.out.println("                                                      ,#TM{  dM/   dMg.                .gMMfffa");
		System.out.println("      `  `  `   `  `  `   `  `  `   `  `  `   `  `    .#.M[ .dM] .JMMNMe..           .MMMM#`    7HJ.");
		System.out.println("   `                                                   M (] .JMN\"!   TMMMMMNNgM..ggMMMMD!        .JL.");
		System.out.println("                                                   `   H (] .?MN,       (YMMMMMMMMNM#5!       .(gMM\"");
		System.out.println("                                                   `   H (] .?MN,       (YMMMMMMMMNM#5!       .(gMM\"");
		System.out.println("             `         `         `         `    `      J`d] . MMNe.                       ..MMM9\"!");
		System.out.println("     `  `       `  `      `  `      `  `               J-M] . MMM]4a,            ...&&&m#Y\"M");
		System.out.println("           `                                 `         d.d\\ . MN.   ?Na.....ggNMMMMMMM\"N.#Mb");
		System.out.println("   `                  `         `         `       `    H.Ma.. WMM. ,  ?MMMMM@\"\"\"!`     M@.#t ");
		System.out.println("                         `         `                   H-Md!, (M~?N.. .BM#5 .N.       .#'?.N");
		System.out.println("      `  `   `  `  `        `         `        `    `  H.dM`NMMM#3(NM.(NdMN,.TD       NMaMMM ");
		System.out.println("                               `         `            .MMMNMMMMM# (MMMMNM#\"Ma&.....qNMMMNM\"");
		System.out.println("   `                  `           `         `    `    JMTMMM\"\"SxNJ.MMN ?N,MF(M-....MN#\"^ .BJ ");
		System.out.println("          `              `           `               Ja       .MM# 7WM< ?F?`?%  . .M!.     dMb.");
		System.out.println("      `      `  `  `        `           `     `     Jt ?SQgMMf\"`MF   d)  #        7\" ?p    ,M/M,");
		System.out.println("                               `           `        .-.      74]db  .M'  # .d`        (] ..VH9T\"8aJ.");
		System.out.println("   `     `            `           `              `  (..\"m,&&gVMtMt  .F  .#          ` ...+B\"MY#\"N&,?#N ");
		System.out.println("            `            `           `              .Tha..  ..MNM, .# .MWF .........N++.MF .,  .  NMfM5");
		System.out.println("                                                     ., =TBT\"7M^J\\ ?~.D J\\ .gMMMMMMo(JMMN  .  .^.MMM#?");
		System.out.println("                                                     ?#M,  `  .d$. .#'  \"      (TW+JyOdBHb Ta.dmdMB\"5");
		System.out.println("                                                        .Ta...B(d3,3 .-D                 .7\"\"!");
		System.out.println("                                                           ??` M");
		System.out.println("                                                                                                              ");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	static void common_Run_Direction() {
		for(int i=0;i<32;i++) {
			System.out.println();
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  `       `               `       `.,   -7^(UM#\"\"^   \"\"! @ ");
		System.out.println("          `                     ...                 T]                   T9Nm");
		System.out.println("                                  ,F    `.......   (]        .J..         dMR    ...JJJd\"! ");
		System.out.println("                                  .NJJT\"\"^      ???M]    .JdM9  ?TMF      .d!????? ");
		System.out.println("                  `                                M]   .Mi?T?WB0TjJJHJ    .F ");
		System.out.println("                          `                        M].MFWeUMNgggkQUH\"`    .] ");
		System.out.println("          `                                       .M]     MM##`(NN.       .]");
		System.out.println("                  `                               .M].    MMMb.gMMYW(.    .]");
		System.out.println("                                                  .M  M.Fd^.MD`,M[ JMm.   .]");
		System.out.println("                          `                       MM`M_TFM .]   . .MM\"N,  .]");
		System.out.println("                                                 .MF M,.MD.#    N.MMb  \"M .]");
		System.out.println("          `       `                              JM] MFdN .F    d!MMMm. M,.]");
		System.out.println("                          `               `      MM\\ MF N .F    d! dNMN .M ]");
		System.out.println("                                                 MM .M%.# .F    d! .NdM} .M]");
		System.out.println("       .. ....gg..,  .......g..                  MM (NMMF .F....d-  (QF .#.]");
		System.out.println("    .+#\"?M\"\"``` _TMNM#^`     _Tm.               .MM MFM<YN.#f7\"M7Wa,.#  J%.] ");
		System.out.println("   .#!                         .N,        `     .M MMa.Tag.sY\"\"8?\"\"^JNMa@ .]");
		System.out.println("  J@                       .@W, .@              .MMb..+@.,   .]  NJNTMMt  .]");
		System.out.println("  #`     .h.           4,   \"T= .N,             dM MMM#?^   ..;    (]     .]");
		System.out.println("  N;     .MN,.   -[    .Mr.     .M!             M#  .M~     (Ma,    N.    .]");
		System.out.println("  dN     .MMMN, .M]    (M#WN(((dM=        `    .M]  (N.     (@MMp   -b    .] ");
		System.out.println("  -MN.    W[ .MMMHN.    Tb  _                  (M%  MM:     MF,MN.   d;   .N.");
		System.out.println("   .M]   .M[      .#    .M_                    (M~  MM'    .M) ?Mp    M,   ?b ");
		System.out.println(" .JdMBW&+MN0XaJ...-5.J00XMhJ...               .MM`  M#    .MM   ?M-    d,   W&.\"\"M.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  `  -.   77_TN#\"\"\"`  ?\"= d  ");
		System.out.println("  ...     `          ,N                   ?9WN,");
		System.out.println("    M      .......  .#        ...J         .MN-.   ..JJJd@?");
		System.out.println("    WaJV\"\"\"      ??!,#     dMY\"` ?MNJ,      (M#????! ");
		System.out.println("                    (#   .JJ/50dY59=,M]     M@! ");
		System.out.println("                    (# (NM#MUmQgggMMM=      MF");
		System.out.println("                    .#  (NJN.Mg].ddMg,      MF");
		System.out.println("                    .#  .MMWMMM#Q,(MMMN.    MF ");
		System.out.println("                    (# dMMW8M.M' TM~,#MN,   MF ");
		System.out.println("                    (t #?M(N8#   .  dNDTM,  MF");
		System.out.println("                    d -# MM5d'   J2gMN. ?MR.MF");
		System.out.println("                   .@ J#,M} M    .]JMMN, .MNMF ");
		System.out.println("          `        .@ JM J} M    .] ?NMM[ TMMF ");
		System.out.println("                   J] J@.M} M    .]  dJMF .dMF");
		System.out.println("                   M].MMM#` M ....b  .NM` (@MF            `              .......NN.... ...gggggg, ");
		System.out.println("                   MNM#(FTW&MB?\"4FTN,.M: .M<MF                    `   .d#^`T\"^     ?\"MM#'      (WN,");
		System.out.println("                  .MMMN,.N.agH\"Y\"7\"\"\"(M?NJF M)                       .M!                          WN.");
		System.out.println("          `       (M#..(#(,    #  wmUMMMMY' M)            `         -@`                  uem.  ... g]");
		System.out.println("                  dVMMMM?7   ..p    .MN\"!   M)                      M`      N,         . TNMM, .NF J$");
		System.out.println("                  M\\  ,]     .MNg    dM]    M)                    ` Wb      MMm.   (b  TN,        .F");
		System.out.println("                 .#   .&     .MMMN.  .MN    Mb                      (M,     d#\"Mp  d#   (Mb     .g# ");
		System.out.println("                 (F   .F     .#` M]   .Mb   4N.           `          WMx    ?F  TW\"YWp   .\"MMMMM#^");
		System.out.println("          `      J]   JF    .#`  (N.   JMp  .Mb                       Mb   .dF      .M~    M]");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("      `   (.,  `  `  `  ` .J+d\"\"!```````?HM_      MM.............,");
		System.out.println("          ,I]             J\"8Q.,.......(g#da     .M#\"\"WMMM\"! \"TMdNgN.");
		System.out.println("          .b]            (\\     ~~?777`   .M;    .M]                _TN,");
		System.out.println("   `  `   .Mb      .J\"774MMN,            .MML    ,M)                   ,L");
		System.out.println("          .MF    ,F      ?TMMN+,. .,..gMMMM?!TW, .M#         ....,      ?] ");
		System.out.println("          .MF    TMN..      TMMMMMMMMMM@^     .d_MM# ....  .d\"\"!(M      .F ");
		System.out.println("          .MF      ?TMMN,.                   ,.# dMMMMMMD J$..gMM\"   ?\"\"\\  ");
		System.out.println("   `  `   .MF          ,b(TMNNNJ..,       .(NJ\"  ,MMMMh,  ?\"\"D!         .. ");
		System.out.println("          .NF           N/N#,HHHMMMMMNNgMM9!     ,M#\"YMm       ..H\"WN(NT^");
		System.out.println("          .#b   `      .,T?# ..    .,?MMM;       dM@   .,  .JH=   \"W !  ");
		System.out.println("          ((#          ,Mg(N#Jg]  .d^.&Mh|      .M@@  .\"_.MD      JM,       ` ");
		System.out.println("   `  `   7.#     ..Y\"ML,YMMMam.....JM4MNbj,.   -MNMUn.#9\"  .Mm..MMM^   ,L.Y\"S-.");
		System.out.println("           .#   .d#E  `N|~  ?YMNJJJdF(MJF ?MYW, ,MMJ}  .JJ..MMMMMMM:   .M#     (h, ");
		System.out.println("           ,F .Y.Djb  ?M}     Jb .  ^ .#   -b.M] ,MMNa.MMMMMMM#(T^  .(MuM\\       /p ");
		System.out.println("       `     .nM#=-\\   #      .F    m     .F 4bNx MMMMMMMMMMMN@`   .MMWMq!        X ");
		System.out.println("   `        ,MF   -F  ,F     .F     d`    K .F dd .MMMMMMM' .D  .dNM@`JdW`       .F ");
		System.out.println("            ,1\\   -\\  .]     d'     .S    b J! dd  MMl  ?!.T^ .MMD   (MA   `    .d ");
		System.out.println("      `  `   .Z`  -eJJd)    .F......JNgG..MHn  ?d  MMMY\"\"^  .MM\"    J4N$        (`");
		System.out.println("             .{   .TBmJ\\    .mX5F              .g  ,MM}  ..MMd'    .WMt ");
		System.out.println("   `                 (F     M  -,             .d^  .MMY\"\"\"??`      .g3  ");
		System.out.println("                           .=................#\"     ?\"             .^   ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
