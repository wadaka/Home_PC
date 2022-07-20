package run;

import java.util.Scanner;

public class Directing_Ending {
	final static Scanner scan = new Scanner(System.in);
	static void showEnding(int ending) throws InterruptedException{
		for(int i=0;i<33;i++) {
			System.out.println();
		}

		if(ending==0) {
			DeadEnd();
			System.out.println("");
			System.out.println("");
			System.out.print("");
		}else {
			try {
				Goal();
				if(ending==1) {
					GoodEnd();
				}else if(ending==2){
					BadEnd();
					System.out.println("");
					System.out.print("            エンターキーで、次に進む >>");
				}else {
					BestEnd_1();
				}
			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

	static void DeadEnd() throws InterruptedException {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("    `  `  `  `  `  `  `  `  `  `  `  ` ..Q\"\"\"\"\"WJ., ");
		System.out.println("                                      .FBg........dF  ");
		System.out.println("                                     .-\\    ` `    J ");
		System.out.println("   `                              .J\"`Nm.          JNJ.");
		System.out.println("      `  `  `  `  `  `  `  `  `   W,  `TMMMNNMMggM#=  .W`");
		System.out.println("                                    TNJ,,..______(,..Jd\" ");
		System.out.println("                                   .+MNMMMMMMMMMMMMN   ");
		System.out.println("   `                           `  .b WMMb   d]   (MM\"H[");
		System.out.println("      `  `  `  `  `  `  `  `    ..MMF N(WMa.....MM@b -5a   ");
		System.out.println("                              .JD   @ g.M9TMMMB\"`.[N.F .]  ");
		System.out.println("                              d#   .,adlN        ,] dW, 4| ");
		System.out.println("   `                          M'   JGMb d        .D -NN,.b  ");
		System.out.println("      `  `  `  `  `  `  `  ` .#  .M=#Mb #        (;  dp4aJ~ ");
		System.out.println("                             d'  ., =M\" @        (;  (F zM[   ");
		System.out.println("                            .F   d, .Mm.N.       .] .M\\ .T^  ");
		System.out.println("                           .F    M[ .MMhMP4TWMNKOdMMYd    ");
		System.out.println("                           .Na,...[  dN!\"\"\"\"\"\"\"\"\"\" JMM   ");
		System.out.println("                            F  (=!   g#    .N,     ?dF ");
		System.out.println("                            N. M:   .MF    .M1,     .t  ");
		System.out.println(".                           ,b(F    .MF    JM ?[       ");

		Thread.sleep(2000);

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("   `                                   .gYTTTTS(..");
		System.out.println("      `  `  `  `  `  `  `  `  `  `   .#NJ.       dF ");
		System.out.println("                                   .MM\\.MMNgggggW\"Wa.");
		System.out.println("                                 .d9(Mm.@         JNTa,");
		System.out.println("   `                             q,  JMMNg..  ...NMF  W~");
		System.out.println("      `  `  `  `  `  `  `  `  `   ?N, ?YMMMMMMMMMMF .g#`");
		System.out.println("                                  .dMMNa...........Mb.");
		System.out.println("                                .JMMMMMN\"THMMMM#dMMMMM|  ");
		System.out.println("   `                           .MMM@\"M\"MMa.. ..MM@@?MMN.");
		System.out.println("      `  `  `  `  `  `  `  `  .MM@`# JJMMMMMMY\"!d#N.FdM# ");
		System.out.println("                              dMF  .aJtMM;7     d] d5 M# ");
		System.out.println("                              MF  (MMb MMb      dF .b (M` ");
		System.out.println("                             .Mb  !MMF.MMB      M} .M[ M` ");
		System.out.println("                             MM]  (MMY!WM;     .M> -H# M`  ");
		System.out.println("                            .MM]  .MM\\g.Mb     .M| .bdJM`  ");
		System.out.println("                            .MM....MMm.dMNJ..  d@\" .MMS[ ");
		System.out.println(".                           .YMMUY7BMVTT9TQ\"\"T9TM#TwF.(F  ");

		Thread.sleep(2000);

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                               .,                                    .dE                  ");
		System.out.println("                                W.                                 .dm,                   ");
		System.out.println("                  .m            ,L                                 .Y                     ");
		System.out.println("                .#T]             H                           ..T\"..%                      ");
		System.out.println("             ..D` .8wa.....      d                          .F .V\"                        ");
		System.out.println("             ?`          .d\"     J`                        d^  .\\                         ");
		System.out.println("  (MK'                .J\"        J`                        b   W        +,        .N      ");
		System.out.println("    (W,              .F          J`                        v[  /h(.      /Hf77TYp .M,..   ");
		System.out.println("      ?b  `         .$           dF   `  `  `  `  `  `      ~ ,   H        .W,  BT9^  d` `");
		System.out.println("       Jc           \"     . .  .JD                      `     TaJNd   `      .#      .t   ");
		System.out.println("       .F    `  `.@ ?MNWMMNMnV\"^                                 M7T\"=(g?T5  ,\\     4;    ");
		System.out.println("       .b        .]                                `       `     -g,    7    H      .b    ");
		System.out.println("   ` .#j,        .]                  `  `  `  `       `            ?]        H       W.   ");
		System.out.println("  .sd#^,[   `    .]                     .            ..             E        q.      ,F  ");
		System.out.println(" (\"\"`   @        .b            `  .  ..MM#\"  ???=?! ?MMNJ.`   `     N,       ,@   `   W,. ");
		System.out.println("        #         d     `   `  .,\"     \"  .........     TMMN,        ,5        ,b        ^");
		System.out.println("        #  `  `   ,]  .,     .MmM ^   .#\"! ..N..,dNg     ?MMMa.       .]  `    ,]        ");
		System.out.println("        #      u,  (JWF     .JMD .MMMM% .f\"\"T\"\"^(NJMNNNm.   TM#N.   .VH         ^        ");
		System.out.println("    `   #     ..#.#^ dM   .JB!  .H\"`d=WHNgMMMMB7(W#M] (M'     -WmMxJ= (e   .             ");
		System.out.println("       Jt     d`?,   -[..M#^    MM- (+MM5g\"   _79a,7h,.M,     .4gMMN,  -h.M]   `  `      ");
		System.out.println("            .J^  Tm. .MM\"`      (HNgM\" .Ma.       M,.WMNo..,`    _YMMh..@! H         `   ");
		System.out.println("   `       (Y`  ..+MMN@      .Y9MMFM,  (N,?H,.  .-MF  F  ?FWjM      TNMN.  (x            ");
		System.out.println("             ..MMMMB=        H](t. Tp   TWMa,J((jg#5  F .Mh(M=       .#MMb  T`           ");
		System.out.println("            HS+M9!            ?MMMgJMN...  (\"\"\"\"?j,  .MMMM\"\"          '.4gB~             ");
		System.out.println("          .Z\"=                    .\"WMMMNMN.....MMMhdD                   ($              ");
		System.out.println("                                        .\"\"?\"\"T\"^_?\"                                     ");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		Thread.sleep(4000);

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                               .,                                    .dE                  ");
		System.out.println("                                W.                                 .dm,                   ");
		System.out.println("                  .m            ,L                                 .Y                     ");
		System.out.println("                .#T]             H                           ..T\"..%                      ");
		System.out.println("             ..D` .8wa.....      d                          .F .V\"                        ");
		System.out.println("             ?`          .d\"     J`                        d^  .\\                         ");
		System.out.println("  (MK'                .J\"        J`                        b   W        +,        .N      ");
		System.out.println("    (W,              .F          J`                        v[  /h(.      /Hf77TYp .M,..   ");
		System.out.println("      ?b  `         .$           dF   `  `  `  `  `  `      ~ ,   H        .W,  BT9^  d` `");
		System.out.println("       Jc           \"     . .  .JD                      `     TaJNd   `      .#      .t   ");
		System.out.println("       .F    `  `.@ ?MNWMMNMnV\"^                                 M7T\"=(g?T5  ,\\     4;    ");
		System.out.println("");
		System.out.println("");
		System.out.println("                                道半ば、あなたは力尽きた……。");
		System.out.println("");
		System.out.println("");
		System.out.println("        #  `  `   ,]  .,     .MmM ^   .#\"! ..N..,dNg     ?MMMa.       .]  `    ,]        ");
		System.out.println("        #      u,  (JWF     .JMD .MMMM% .f\"\"T\"\"^(NJMNNNm.   TM#N.   .VH         ^        ");
		System.out.println("    `   #     ..#.#^ dM   .JB!  .H\"`d=WHNgMMMMB7(W#M] (M'     -WmMxJ= (e   .             ");
		System.out.println("       Jt     d`?,   -[..M#^    MM- (+MM5g\"   _79a,7h,.M,     .4gMMN,  -h.M]   `  `      ");
		System.out.println("            .J^  Tm. .MM\"`      (HNgM\" .Ma.       M,.WMNo..,`    _YMMh..@! H         `   ");
		System.out.println("   `       (Y`  ..+MMN@      .Y9MMFM,  (N,?H,.  .-MF  F  ?FWjM      TNMN.  (x            ");
		System.out.println("             ..MMMMB=        H](t. Tp   TWMa,J((jg#5  F .Mh(M=       .#MMb  T`           ");
		System.out.println("            HS+M9!            ?MMMgJMN...  (\"\"\"\"?j,  .MMMM\"\"          '.4gB~             ");
		System.out.println("          .Z\"=                    .\"WMMMNMN.....MMMhdD                   ($              ");
		System.out.println("                                        .\"\"?\"\"T\"^_?\"                                     ");
		System.out.println("");
		System.out.println("");

	}

	static void Goal() throws Exception{
		//-----------------------------------------------------------------
		String name_01 = "Goal/s_01";
		System.out.println("");
		Tools.Graphic_Creator(name_01);
		System.out.println("");
		System.out.println("");
		Thread.sleep(1000);
		//-----------------------------------------------------------------
		String name_04_2 = "Goal/s_04_2";
		System.out.println("");
		Tools.Graphic_Creator(name_04_2);
		System.out.println("");
		System.out.println("");
		Thread.sleep(1000);
		//-----------------------------------------------------------------
		String name_04_3 = "Goal/s_04_3";
		System.out.println("");
		Tools.Graphic_Creator(name_04_3);
		System.out.println("");
		System.out.println("");
		Thread.sleep(1000);
		//-----------------------------------------------------------------
		String name_04_4 = "Goal/s_04_4";
		System.out.println("");
		Tools.Graphic_Creator(name_04_4);
		System.out.println("");
		System.out.println("");
		Thread.sleep(1000);
		//-----------------------------------------------------------------
		String name_04_5 = "Goal/s_04_5";
		System.out.println("");
		Tools.Graphic_Creator(name_04_5);
		System.out.println("");
		System.out.println("");
		Thread.sleep(2500);
		//-----------------------------------------------------------------
		String name_05 = "Goal/s_05";
		System.out.println("");
		Tools.Graphic_Creator(name_05);
		System.out.println("");
		System.out.println("");
		Thread.sleep(2500);
		//-----------------------------------------------------------------
		String name_06 = "Goal/s_06";
		System.out.println("");
		Tools.Graphic_Creator(name_06);
		System.out.println("");
		System.out.println("");
		Thread.sleep(2000);
		//-----------------------------------------------------------------
		String name_07 = "Goal/s_07";
		System.out.println("");
		Tools.Graphic_Creator(name_07);
		System.out.println("");
		System.out.println("");
		Thread.sleep(500);
		//-----------------------------------------------------------------
		String name_08 = "Goal/s_08";
		System.out.println("");
		Tools.Graphic_Creator(name_08);
		System.out.println("");
		System.out.println("");
		Thread.sleep(1000);
		//-----------------------------------------------------------------
		String name_09 = "Goal/s_09";
		System.out.println("");
		Tools.Graphic_Creator(name_09);
		System.out.println("");
		System.out.println("");
		Thread.sleep(2000);
		//-----------------------------------------------------------------
		String name_10 = "Goal/s_10";
		System.out.println("");
		Tools.Graphic_Creator(name_10);
		System.out.println("");
		System.out.println("");
		Thread.sleep(1250);
		//-----------------------------------------------------------------
		String name_11 = "Goal/s_11";
		System.out.println("");
		Tools.Graphic_Creator(name_11);
		System.out.println("");
		System.out.println("");
		Thread.sleep(2500);
		//-----------------------------------------------------------------
		String name_12 = "Goal/s_12";
		System.out.println("");
		Tools.Graphic_Creator(name_12);
		System.out.println("");
		System.out.println("");
		Thread.sleep(1000);
		//-----------------------------------------------------------------
		String name_13 = "Goal/s_13";
		System.out.println("");
		Tools.Graphic_Creator(name_13);
		System.out.println("");
		System.out.println("");
		Thread.sleep(2000);
	}

	static void BadEnd() throws Exception{
		//-----------------------------------------------------------------
		String name_01 = "BadEnd/s_01";
		System.out.println("");
		Tools.Graphic_Creator(name_01);
		System.out.println("");
		System.out.println("");
		Thread.sleep(500);
		//-----------------------------------------------------------------
		String name_02 = "BadEnd/s_02";
		System.out.println("");
		Tools.Graphic_Creator(name_02);
		System.out.println("");
		System.out.println("");
		Thread.sleep(2000);
		//-----------------------------------------------------------------
		String name_03 = "BadEnd/s_03";
		System.out.println("");
		Tools.Graphic_Creator(name_03);
		System.out.println("");
		System.out.println("");
		Thread.sleep(3000);
		//-----------------------------------------------------------------
		String name_04 = "BadEnd/s_04";
		System.out.println("");
		Tools.Graphic_Creator(name_04);
		System.out.println("");
		System.out.println("");
		Thread.sleep(3000);
		//-----------------------------------------------------------------
		String name_05 = "BadEnd/s_05";
		System.out.println("");
		Tools.Graphic_Creator(name_05);
		System.out.println("");
		System.out.println("");
		Thread.sleep(2000);

		String bad_back_up = "BadEnd/bad_back_1";
		String bad_back_down = "BadEnd/bad_back_2";

		Tools.Graphic_Creator_ED(bad_back_up);
		for(int i=0;i<18;i++) {
			System.out.println("");
		}
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(1000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(1000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  数々の困難を超え、秘境を無事脱出したけど……");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(1000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  数々の困難を超え、秘境を無事脱出したけど……");
		System.out.println("");
		System.out.println("                  それが、おにいちゃんにとって幸せだったのかは、わかりません。");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(4000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  数々の困難を超え、秘境を無事脱出したけど……");
		System.out.println("");
		System.out.println("                  それが、おにいちゃんにとって幸せだったのかは、わかりません。");
		System.out.println("");
		System.out.println("                  結局、収支はマイナス。");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(2000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  数々の困難を超え、秘境を無事脱出したけど……");
		System.out.println("");
		System.out.println("                  それが、おにいちゃんにとって幸せだったのかは、わかりません。");
		System.out.println("");
		System.out.println("                  結局、収支はマイナス。");
		System.out.println("");
		System.out.println("                  帰ってきてすぐ、おにいちゃんは、");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(1000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  数々の困難を超え、秘境を無事脱出したけど……");
		System.out.println("");
		System.out.println("                  それが、おにいちゃんにとって幸せだったのかは、わかりません。");
		System.out.println("");
		System.out.println("                  結局、収支はマイナス。");
		System.out.println("");
		System.out.println("                  帰ってきてすぐ、おにいちゃんは、");
		System.out.println("");
		System.out.println("                  怖いお兄さんに連れられて、どこかへ消えていきました。");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(4000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  数々の困難を超え、秘境を無事脱出したけど……");
		System.out.println("");
		System.out.println("                  それが、おにいちゃんにとって幸せだったのかは、わかりません。");
		System.out.println("");
		System.out.println("                  結局、収支はマイナス。");
		System.out.println("");
		System.out.println("                  帰ってきてすぐ、おにいちゃんは、");
		System.out.println("");
		System.out.println("                  怖いお兄さんに連れられて、どこかへ消えていきました。");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		System.out.println("");
		System.out.println("            エンターキーで、次に進む >>");

		String i = scan.nextLine();


		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(1000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  詳しいことは、わかりませんが");
		System.out.println("");
		System.out.println("                  借金返済のために、遠くの海で、漁をするんだとか。");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(4000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  詳しいことは、わかりませんが");
		System.out.println("");
		System.out.println("                  借金返済のために、遠くの海で、漁をするんだとか。");
		System.out.println("");
		System.out.println("                  数年ほど、色々頑張らないといけないみたいです。");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(4000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  詳しいことは、わかりませんが");
		System.out.println("");
		System.out.println("                  借金返済のために、遠くの海で、漁をするんだとか。");
		System.out.println("");
		System.out.println("                  数年ほど、色々頑張らないといけないみたいです。");
		System.out.println("");
		System.out.println("");
		System.out.println("                  ……色々言いたいことはあるんだけど");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(2000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  詳しいことは、わかりませんが");
		System.out.println("");
		System.out.println("                  借金返済のために、遠くの海で、漁をするんだとか。");
		System.out.println("");
		System.out.println("                  数年ほど、色々頑張らないといけないみたいです。");
		System.out.println("");
		System.out.println("");
		System.out.println("                  ……色々言いたいことはあるんだけど");
		System.out.println("");
		System.out.println("                  今はともかく、完済に向けて、頑張れ！");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(2000);

		Tools.Graphic_Creator_ED(bad_back_up);
		System.out.println("");
		System.out.println("");
		System.out.println("                ■リリィの日記：");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                  詳しいことは、わかりませんが");
		System.out.println("");
		System.out.println("                  借金返済のために、遠くの海で、漁をするんだとか。");
		System.out.println("");
		System.out.println("                  数年ほど、色々頑張らないといけないみたいです。");
		System.out.println("");
		System.out.println("");
		System.out.println("                  ……色々言いたいことはあるんだけど");
		System.out.println("");
		System.out.println("                  今はともかく、完済に向けて、頑張れ！おにいちゃん！");
		System.out.println("");
		System.out.println("");
		Tools.Graphic_Creator_ED(bad_back_down);
		Thread.sleep(4000);

	}

	static void GoodEnd() throws Exception {
		//-----------------------------------------------------------------
				String name_01 = "GoodEnd/s_01";
				System.out.println("");
				Tools.Graphic_Creator(name_01);
				System.out.println("");
				System.out.println("");
				Thread.sleep(1000);
				//-----------------------------------------------------------------
				String name_02 = "GoodEnd/s_02";
				System.out.println("");
				Tools.Graphic_Creator(name_02);
				System.out.println("");
				System.out.println("");
				Thread.sleep(2000);

				String good_back_up = "GoodEnd/good_back_01";
				String good_back_down = "GoodEnd/good_back_02";

				Tools.Graphic_Creator_ED(good_back_up);
				for(int i=0;i<18;i++) {
					System.out.println("");
				}
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には「トントン」");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には「トントン」でした。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には「トントン」でした。");
				System.out.println("");
				System.out.println("                  むしろ、あれだけの赤字を1回の冒険で賄えたのが奇跡的！！");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には「トントン」でした。");
				System.out.println("");
				System.out.println("                  むしろ、あれだけの赤字を1回の冒険で賄えたのが奇跡的！！");
				System.out.println("");
				System.out.println("                  こんな冒険の仕方って、ふつうありえないよ？");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には「トントン」でした。");
				System.out.println("");
				System.out.println("                  むしろ、あれだけの赤字を1回の冒険で賄えたのが奇跡的！！");
				System.out.println("");
				System.out.println("                  こんな冒険の仕方って、ふつうありえないよ？");
				System.out.println("");
				System.out.println("                  ……");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には「トントン」でした。");
				System.out.println("");
				System.out.println("                  むしろ、あれだけの赤字を1回の冒険で賄えたのが奇跡的！！");
				System.out.println("");
				System.out.println("                  こんな冒険の仕方って、ふつうありえないよ？");
				System.out.println("");
				System.out.println("                  ……正直、");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には「トントン」でした。");
				System.out.println("");
				System.out.println("                  むしろ、あれだけの赤字を1回の冒険で賄えたのが奇跡的！！");
				System.out.println("");
				System.out.println("                  こんな冒険の仕方って、ふつうありえないよ？");
				System.out.println("");
				System.out.println("                  ……正直、計画性がなさすぎです。");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には「トントン」でした。");
				System.out.println("");
				System.out.println("                  むしろ、あれだけの赤字を1回の冒険で賄えたのが奇跡的！！");
				System.out.println("");
				System.out.println("                  こんな冒険の仕方って、ふつうありえないよ？");
				System.out.println("");
				System.out.println("                  ……正直、計画性がなさすぎです。おにいちゃん、");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  今回の冒険。収支を見ると、結果的には「トントン」でした。");
				System.out.println("");
				System.out.println("                  むしろ、あれだけの赤字を1回の冒険で賄えたのが奇跡的！！");
				System.out.println("");
				System.out.println("                  こんな冒険の仕方って、ふつうありえないよ？");
				System.out.println("");
				System.out.println("                  ……正直、計画性がなさすぎです。おにいちゃん、要反省。");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、");
				System.out.println("");
				System.out.println("                  それでもね。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(4000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  今回の冒険も、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  今回の冒険も、成功です。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  今回の冒険も、成功です。");
				System.out.println("");
				System.out.println("                  絶対、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  今回の冒険も、成功です。");
				System.out.println("");
				System.out.println("                  絶対、絶対、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  今回の冒険も、成功です。");
				System.out.println("");
				System.out.println("                  絶対、絶対、成功なんです。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  今回の冒険も、成功です。");
				System.out.println("");
				System.out.println("                  絶対、絶対、成功なんです。");
				System.out.println("");
				System.out.println("                  だって、");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  今回の冒険も、成功です。");
				System.out.println("");
				System.out.println("                  絶対、絶対、成功なんです。");
				System.out.println("");
				System.out.println("                  だって、ちゃんと ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  今回の冒険も、成功です。");
				System.out.println("");
				System.out.println("                  絶対、絶対、成功なんです。");
				System.out.println("");
				System.out.println("                  だって、ちゃんと 帰ってきてくれたから。");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  前の冒険も、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  前の冒険も、その前の冒険だって、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  前の冒険も、その前の冒険だって、");
				System.out.println("");
				System.out.println("                  いっつも");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1250);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  前の冒険も、その前の冒険だって、");
				System.out.println("");
				System.out.println("                  いっつも 傷ついて、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1250);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  前の冒険も、その前の冒険だって、");
				System.out.println("");
				System.out.println("                  いっつも 傷ついて、ボロボロになって ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  前の冒険も、その前の冒険だって、");
				System.out.println("");
				System.out.println("                  いっつも 傷ついて、ボロボロになって ");
				System.out.println("");
				System.out.println("                  なのに、");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  前の冒険も、その前の冒険だって、");
				System.out.println("");
				System.out.println("                  いっつも 傷ついて、ボロボロになって ");
				System.out.println("");
				System.out.println("                  なのに、……なのに");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  前の冒険も、その前の冒険だって、");
				System.out.println("");
				System.out.println("                  いっつも 傷ついて、ボロボロになって ");
				System.out.println("");
				System.out.println("                  なのに、……なのに「私の足を治すんだ」って、");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  おにいちゃん、おバカだから。");
				System.out.println("");
				System.out.println("                  前の冒険も、その前の冒険だって、");
				System.out.println("");
				System.out.println("                  いっつも 傷ついて、ボロボロになって ");
				System.out.println("");
				System.out.println("                  なのに、……なのに「私の足を治すんだ」って、そればっかで。");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ……それ、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ……それ、答えになってないのに。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ……それ、答えになってないのに。");
				System.out.println("");
				System.out.println("                  帰ってきても、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ……それ、答えになってないのに。");
				System.out.println("");
				System.out.println("                  帰ってきても、「今回も 治してやれなくて ごめんな」って、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ……それ、答えになってないのに。");
				System.out.println("");
				System.out.println("                  帰ってきても、「今回も 治してやれなくて ごめんな」って、開口一番に。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ……それ、答えになってないのに。");
				System.out.println("");
				System.out.println("                  帰ってきても、「今回も 治してやれなくて ごめんな」って、開口一番に。");
				System.out.println("");
				System.out.println("                  ……");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ……それ、答えになってないのに。");
				System.out.println("");
				System.out.println("                  帰ってきても、「今回も 治してやれなくて ごめんな」って、開口一番に。");
				System.out.println("");
				System.out.println("                  ……そこは、");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ……それ、答えになってないのに。");
				System.out.println("");
				System.out.println("                  帰ってきても、「今回も 治してやれなくて ごめんな」って、開口一番に。");
				System.out.println("");
				System.out.println("                  ……そこは、「ただいま」で");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  もういいよって言っても、「俺は おにいちゃんだから」って。");
				System.out.println("");
				System.out.println("                  ……それ、答えになってないのに。");
				System.out.println("");
				System.out.println("                  帰ってきても、「今回も 治してやれなくて ごめんな」って、開口一番に。");
				System.out.println("");
				System.out.println("                  ……そこは、「ただいま」で いいのに。");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、おにいちゃん。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、おにいちゃん。");
				System.out.println("");
				System.out.println("                  私はね、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、おにいちゃん。");
				System.out.println("");
				System.out.println("                  私はね、");
				System.out.println("");
				System.out.println("                  そんな");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、おにいちゃん。");
				System.out.println("");
				System.out.println("                  私はね、");
				System.out.println("");
				System.out.println("                  そんな おバカで ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、おにいちゃん。");
				System.out.println("");
				System.out.println("                  私はね、");
				System.out.println("");
				System.out.println("                  そんな おバカで 優しい");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、おにいちゃん。");
				System.out.println("");
				System.out.println("                  私はね、");
				System.out.println("");
				System.out.println("                  そんな おバカで 優しい おにいちゃんが");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3500);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  でもね、おにいちゃん。");
				System.out.println("");
				System.out.println("                  私はね、");
				System.out.println("");
				System.out.println("                  そんな おバカで 優しい おにいちゃんが 大好き です。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(4000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  …………、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				/*
				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  …………、ちょっぴり恥ずかしいから、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);
				*/

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  …………、ちょっぴり恥ずかしいから、さ。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  …………、ちょっぴり恥ずかしいから、さ。");
				System.out.println("");
				System.out.println("                  だから、");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  …………、ちょっぴり恥ずかしいから、さ。");
				System.out.println("");
				System.out.println("                  だから、今は日記に");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(1000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  …………、ちょっぴり恥ずかしいから、さ。");
				System.out.println("");
				System.out.println("                  だから、今は日記に 気持ちを書き留めるだけ。");
				System.out.println("");
				System.out.println("                  ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(3000);

				/*
				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  …………、ちょっぴり恥ずかしいから、さ。");
				System.out.println("");
				System.out.println("                  だから、今は日記に 気持ちを書き留めるだけ。");
				System.out.println("");
				System.out.println("                  それで、");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(500);
				*/

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  …………、ちょっぴり恥ずかしいから、さ。");
				System.out.println("");
				System.out.println("                  だから、今は日記に 気持ちを書き留めるだけ。");
				System.out.println("");
				System.out.println("                  それで、 ゆるしてね ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(2000);

				Tools.Graphic_Creator_ED(good_back_up);
				System.out.println("");
				System.out.println("");
				System.out.println("                ■リリィの日記：");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("                  直接、面と向かって伝えるのは、");
				System.out.println("");
				System.out.println("                  …………、ちょっぴり恥ずかしいから、さ。");
				System.out.println("");
				System.out.println("                  だから、今は日記に 気持ちを書き留めるだけ。");
				System.out.println("");
				System.out.println("                  それで、 ゆるしてね おにいちゃん。");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				Tools.Graphic_Creator_ED(good_back_down);
				Thread.sleep(4000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				Thread.sleep(3000);

				String name_03 = "GoodEnd/s_03";
				Tools.Graphic_Creator(name_03);
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(1000);

				String name_04 = "GoodEnd/s_04";
				Tools.Graphic_Creator(name_04);
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(2000);

				String name_05 = "GoodEnd/s_05";
				Tools.Graphic_Creator(name_05);
				System.out.println("              ");
				System.out.println("              …………");
				System.out.println("              ");
				Thread.sleep(2000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              …………あのさ、");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(1000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              …………あのさ、おにいちゃん。");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(3000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(6000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              ……");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(1000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              ……ううん、なんでもない。");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(3000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(5000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              いつも。");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(3000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(5000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              いつも。");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(1000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              いつも。ありがとうね、");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(2000);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				System.out.println("              ");
				System.out.println("              いつも。ありがとうね、おにいちゃん。");
				System.out.println("              ");
				System.out.println("              ");
				System.out.println("              ");
				Thread.sleep(4500);

				for(int i=0;i<32;i++) {
					System.out.println("");
				};
				Thread.sleep(3000);
	}

	static void BestEnd_1() throws Exception {
		Thread.sleep(500);
		String name_01 = "BestEnd/s_01";
		System.out.println("");
		Tools.Graphic_Creator(name_01);
		System.out.println("");
		System.out.println("");
		Thread.sleep(2000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		System.out.println("              ");
		System.out.println("              ……え？");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		System.out.println("              ");
		System.out.println("              ……え？ 私の足、治るの？");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		Thread.sleep(3000);

		String name_02 = "BestEnd/s_02";
		System.out.println("");
		Tools.Graphic_Creator(name_02);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);
		String name_03 = "BestEnd/s_03";
		System.out.println("");
		Tools.Graphic_Creator(name_03);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);
		String name_04 = "BestEnd/s_04";
		System.out.println("");
		Tools.Graphic_Creator(name_04);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		Thread.sleep(3000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		System.out.println("              ");
		System.out.println("              …………あのさ、");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              …………あのさ、おにいちゃん。");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);


		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              …………あのさ、おにいちゃん。");
		System.out.println("              もう無理に、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              …………あのさ、おにいちゃん。");
		System.out.println("              もう無理に、私を愛さなくていいよ。");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3500);

		Tools.Graphic_Creator(name_02);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		String name_06 = "BestEnd/s_06";
		System.out.println("");
		Tools.Graphic_Creator(name_06);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		Tools.Graphic_Creator(name_06);
		System.out.println("              ");
		System.out.println("              そんなこと、ないって？");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_06);
		System.out.println("              ");
		System.out.println("              そんなこと、ないって？");
		System.out.println("              嘘つき。");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		Tools.Graphic_Creator(name_06);
		System.out.println("              ");
		System.out.println("              私、ちゃんと わかってるよ。");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2500);

		Tools.Graphic_Creator(name_06);
		System.out.println("              ");
		System.out.println("              私、ちゃんと わかってるよ。");
		System.out.println("              私がね ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		Tools.Graphic_Creator(name_06);
		System.out.println("              ");
		System.out.println("              私、ちゃんと わかってるよ。");
		System.out.println("              私がね おにいちゃんから、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              私、ちゃんと わかってるよ。");
		System.out.println("              私がね おにいちゃんから、");
		System.out.println("              色んなもの 奪ってばっかりだって。");
		System.out.println("              ");
		Thread.sleep(3000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		Thread.sleep(3000);
		//System.out.println("              dMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMF");

		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		System.out.println("                                       この子を生んだ後……");
		System.out.println("              ");
		System.out.println("                                       その、血が止まらなくてね……。");
		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		Thread.sleep(3000);

		String name_07 = "BestEnd/s_07";
		System.out.println("");
		Tools.Graphic_Creator(name_07);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		System.out.println("                             まだ、若いのにねえ。");
		System.out.println("              ");
		System.out.println("                                                 お気の毒に……。");
		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		Thread.sleep(4000);

		String name_13 = "BestEnd/s_13";
		System.out.println("");
		Tools.Graphic_Creator(name_13);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		for(int i=0;i<32;i++) {
			System.out.println("              ");
		}
		Thread.sleep(5000);

		String name_24_2 = "BestEnd/s_24_2";
		Tools.Graphic_Creator(name_24_2);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3500);

		String name_23 = "BestEnd/s_23";
		Tools.Graphic_Creator(name_23);
		System.out.println("              ");
		System.out.println("              私の足のせいで、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		String name_24 = "BestEnd/s_24";
		Tools.Graphic_Creator(name_24);
		System.out.println("              ");
		System.out.println("              私の足のせいで、");
		System.out.println("              おにいちゃん、ずっと危険な目に……。");
		System.out.println("              ");
		Thread.sleep(2500);

		Tools.Graphic_Creator(name_23);
		System.out.println("              ");
		System.out.println("              そ、それに！");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		Tools.Graphic_Creator(name_23);
		System.out.println("              ");
		System.out.println("              そ、それに！");
		System.out.println("              お、お母さんの…こと…");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_24);
		System.out.println("              ");
		System.out.println("              そ、それに！");
		System.out.println("              お、お母さんの…こと…だって……。");
		System.out.println("              ");
		Thread.sleep(3500);

		String name_27 = "BestEnd/s_27";
		Tools.Graphic_Creator(name_27);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(4500);

		String name_27_2 = "BestEnd/s_27_2";
		Tools.Graphic_Creator(name_27_2);
		System.out.println("              ");
		System.out.println("              だ、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		String name_29 = "BestEnd/s_29";
		Tools.Graphic_Creator(name_29);
		System.out.println("              ");
		System.out.println("              だ、だからさ！");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_29);
		System.out.println("              ");
		System.out.println("              だ、だからさ！");
		System.out.println("              もう、私のことなんか忘れちゃって、さ！");
		System.out.println("              ");
		Thread.sleep(2500);

		Tools.Graphic_Creator(name_29);
		System.out.println("              ");
		System.out.println("              もう、私のことなんか忘れちゃって、さ！");
		System.out.println("              今回の稼ぎだって、");
		System.out.println("              ");
		Thread.sleep(1000);

		Tools.Graphic_Creator(name_29);
		System.out.println("              ");
		System.out.println("              もう、私のことなんか忘れちゃって、さ！");
		System.out.println("              今回の稼ぎだって、自分のために");
		System.out.println("              ");
		Thread.sleep(1000);

		String name_30 = "BestEnd/s_30";
		Tools.Graphic_Creator(name_30);
		System.out.println("              ");
		System.out.println("              もう、私のことなんか忘れちゃって、さ！");
		System.out.println("              今回の稼ぎだって、自分のために もうパーッと使っちゃっ………。");
		System.out.println("              ");
		Thread.sleep(1000);


		Tools.Graphic_Creator(name_30);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(200);

		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		System.out.println("                                       ");
		System.out.println("                                       「俺のせいだ」");
		System.out.println("                                       ");
		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		Thread.sleep(2500);

		Tools.Graphic_Creator(name_30);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2500);

		String name_31 = "BestEnd/s_31";
		Tools.Graphic_Creator(name_31);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);


		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		System.out.println("                                       「お前の足も、");
		System.out.println("                                       ");
		System.out.println("                                       ");
		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		Thread.sleep(1500);

		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		System.out.println("                                       「お前の足も、親父が死んだのも、");
		System.out.println("                                       ");
		System.out.println("                                       ");
		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		Thread.sleep(3500);

		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		System.out.println("                                       「お前の足も、親父が死んだのも、");
		System.out.println("                                       ");
		System.out.println("                                         全部、");
		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		Thread.sleep(2000);

		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		System.out.println("                                       「お前の足も、親父が死んだのも、");
		System.out.println("                                       ");
		System.out.println("                                         全部、俺のせいなんだ。」");
		for(int i=0;i<15;i++) {
			System.out.println("              ");
		}
		Thread.sleep(4000);

		/*
		Tools.Graphic_Creator(name_31);
		System.out.println("              ");
		System.out.println("              「お前の足も、");
		System.out.println("               ");
		System.out.println("              ");
		Thread.sleep(1500);

		Tools.Graphic_Creator(name_31);
		System.out.println("              ");
		System.out.println("              「お前の足も、親父が死んだのも、");
		System.out.println("                ");
		System.out.println("              ");
		Thread.sleep(3500);

		Tools.Graphic_Creator(name_31);
		System.out.println("              ");
		System.out.println("              「お前の足も、親父が死んだのも、");
		System.out.println("                全部、");
		System.out.println("              ");
		Thread.sleep(2000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              「お前の足も、親父が死んだのも、");
		System.out.println("                全部、俺のせいなんだ。」");
		System.out.println("              ");
		Thread.sleep(4000);
		*/

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		Thread.sleep(3000);
	}

	static void BestEnd_2() throws Exception {

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		Thread.sleep(3500);

		String name_07 = "BestEnd/s_07";
		System.out.println("");
		Tools.Graphic_Creator(name_07);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3500);

		Tools.Graphic_Creator(name_07);
		System.out.println("              ");
		System.out.println("              （……まだ、上の子も小さいのに。）");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_07);
		System.out.println("              ");
		System.out.println("              （……まだ、上の子も小さいのに。）");
		System.out.println("              ");
		System.out.println("              （お気の毒に、ねぇ……。）");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_08 = "BestEnd/s_08";
		Tools.Graphic_Creator(name_08);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_09 = "BestEnd/s_09";
		Tools.Graphic_Creator(name_09);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_10 = "BestEnd/s_10";
		Tools.Graphic_Creator(name_10);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_11 = "BestEnd/s_11";
		Tools.Graphic_Creator(name_11);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(250);

		String name_12 = "BestEnd/s_12";
		Tools.Graphic_Creator(name_12);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1250);

		String name_13 = "BestEnd/s_13";
		Tools.Graphic_Creator(name_13);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2500);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              ……あ、動いた。");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		String name_14 = "BestEnd/s_14";
		Tools.Graphic_Creator(name_14);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		String name_15 = "BestEnd/s_15";
		Tools.Graphic_Creator(name_15);
		System.out.println("              ");
		System.out.println("              あら、気になる？お兄ちゃん。");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		String name_16 = "BestEnd/s_16";
		Tools.Graphic_Creator(name_16);
		System.out.println("              ");
		System.out.println("              え、なに？");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		Tools.Graphic_Creator(name_16);
		System.out.println("              ");
		System.out.println("              え、なに？");
		System.out.println("              生まれるのは、弟の方がいいって？");
		System.out.println("              ");
		Thread.sleep(3000);

		String name_18 = "BestEnd/s_18";
		Tools.Graphic_Creator(name_18);
		System.out.println("              ");
		System.out.println("              ……「外で、一緒に遊べるから？」");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_17 = "BestEnd/s_17";
		Tools.Graphic_Creator(name_17);
		System.out.println("              ");
		System.out.println("              ……「外で、一緒に遊べるから？」");
		System.out.println("              ふふ、");
		System.out.println("              ");
		Thread.sleep(1000);

		Tools.Graphic_Creator(name_15);
		System.out.println("              ");
		System.out.println("              ……「外で、一緒に遊べるから？」");
		System.out.println("              ふふ、そっか。");
		System.out.println("              ");
		Thread.sleep(3000);

		String name_20 = "BestEnd/s_20";
		Tools.Graphic_Creator(name_20);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_19 = "BestEnd/s_19";
		Tools.Graphic_Creator(name_19);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		Tools.Graphic_Creator(name_20);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_20);
		System.out.println("              ");
		System.out.println("              それじゃあね、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_20);
		System.out.println("              ");
		System.out.println("              それじゃあね、");
		System.out.println("              もし、生まれてくるのが女の子だったら");
		System.out.println("              ");
		Thread.sleep(3000);

		Tools.Graphic_Creator(name_20);
		System.out.println("              ");
		System.out.println("              それじゃあね、");
		System.out.println("              もし、生まれてくるのが女の子だったら");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_14);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_15);
		System.out.println("              ");
		System.out.println("              うんと、優しくしてあげてね");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_21 = "BestEnd/s_21";
		Tools.Graphic_Creator(name_21);
		System.out.println("              ");
		System.out.println("              うんと、優しくしてあげてね");
		System.out.println("              おにい…");
		System.out.println("              ");
		Thread.sleep(500);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		Thread.sleep(4000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              …………ぁ。");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              …………ぁ。");
		System.out.println("              ぁ……");
		System.out.println("              ");
		Thread.sleep(500);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              …………ぁ。");
		System.out.println("              ぁ……ぁぁぁああっ……！！");
		System.out.println("              ");
		Thread.sleep(1000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              父さん、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              父さん、父さんっ！！");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              リリィが、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              リリィが、リリィが、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              リリィが、リリィが、");
		System.out.println("              足が、");
		System.out.println("              ");
		Thread.sleep(500);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              リリィが、リリィが、");
		System.out.println("              足が、り、");
		System.out.println("              ");
		Thread.sleep(1000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              リリィが、リリィが、");
		System.out.println("              足が、り、リリィがっ！！");
		System.out.println("              ");
		Thread.sleep(1000);

		String name_22 = "BestEnd/s_22";
		Tools.Graphic_Creator(name_22);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		Tools.Graphic_Creator(name_22);
		System.out.println("              ");
		System.out.println("              リリィがぁぁぁ……っ！！！");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(4000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(6000);


		String name_32 = "BestEnd/s_32";
		Tools.Graphic_Creator(name_32);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(5000);


		String name_33 = "BestEnd/s_33";
		Tools.Graphic_Creator(name_33);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(4000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		};
		System.out.println("              ");
		System.out.println("              ……家に、帰ったらさ。");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		Tools.Graphic_Creator(name_33);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		String name_34 = "BestEnd/s_34";
		Tools.Graphic_Creator(name_34);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		String name_34_2 = "BestEnd/s_34_2";
		Tools.Graphic_Creator(name_34_2);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		String name_35 = "BestEnd/s_35";
		Tools.Graphic_Creator(name_35);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		String name_36 = "BestEnd/s_36";
		Tools.Graphic_Creator(name_36);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_37 = "BestEnd/s_37";
		Tools.Graphic_Creator(name_37);
		System.out.println("              ");
		System.out.println("              教えてよ、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		String name_38 = "BestEnd/s_38";
		Tools.Graphic_Creator(name_38);
		System.out.println("              ");
		System.out.println("              教えてよ、冒険の仕方。");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_39 = "BestEnd/s_39";
		Tools.Graphic_Creator(name_39);
		System.out.println("              ");
		System.out.println("              教えてよ、冒険の仕方。");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		String name_00 = "BestEnd/s_00";
		Tools.Graphic_Creator(name_00);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_42_2 = "BestEnd/s_42_2";
		String name_42_5 = "BestEnd/s_42_5";
		Tools.Graphic_Creator(name_42_5);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(4000);

		String name_42_6 = "BestEnd/s_42_6";
		String name_42_7 = "BestEnd/s_42_7";
		Tools.Graphic_Creator(name_42_7);
		System.out.println("              ");
		System.out.println("              だってさ、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		Tools.Graphic_Creator(name_42_2);
		System.out.println("              ");
		System.out.println("              だってさ、せっかく無事に帰ってこれたのに");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_42_3 = "BestEnd/s_42_3";
		Tools.Graphic_Creator(name_42_3);
		System.out.println("              ");
		System.out.println("              だってさ、せっかく無事に帰ってこれたのに");
		System.out.println("              いっつも");
		System.out.println("              ");
		Thread.sleep(1000);

		Tools.Graphic_Creator(name_42_2);
		System.out.println("              ");
		System.out.println("              だってさ、せっかく無事に帰ってこれたのに");
		System.out.println("              いっつも「ごめん」");
		System.out.println("              ");
		Thread.sleep(1500);

		Tools.Graphic_Creator(name_42_3);
		System.out.println("              ");
		System.out.println("              だってさ、せっかく無事に帰ってこれたのに");
		System.out.println("              いっつも「ごめん」だとか");
		System.out.println("              ");
		Thread.sleep(1000);

		Tools.Graphic_Creator(name_42_2);
		System.out.println("              ");
		System.out.println("              だってさ、せっかく無事に帰ってこれたのに");
		System.out.println("              いっつも「ごめん」だとか「すまない」");
		System.out.println("              ");
		Thread.sleep(1500);

		String name_42_4 = "BestEnd/s_42_4";
		Tools.Graphic_Creator(name_42_4);
		System.out.println("              ");
		System.out.println("              だってさ、せっかく無事に帰ってこれたのに");
		System.out.println("              いっつも「ごめん」だとか「すまない」だとか、");
		System.out.println("              ");
		Thread.sleep(1000);

		String name_42_8 = "BestEnd/s_42_8";
		Tools.Graphic_Creator(name_42_8);
		System.out.println("              ");
		System.out.println("              だってさ、せっかく無事に帰ってこれたのに");
		System.out.println("              いっつも「ごめん」だとか「すまない」だとか、辛気臭いんだもん。");
		System.out.println("              ");
		Thread.sleep(5000);

		String name_00_2 = "BestEnd/s_00_2";
		Tools.Graphic_Creator(name_00_2);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(3000);

		String name_42 = "BestEnd/s_42";
		Tools.Graphic_Creator(name_42);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(250);

		String name_43 = "BestEnd/s_43";
		Tools.Graphic_Creator(name_43);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_44 = "BestEnd/s_44";
		Tools.Graphic_Creator(name_44);
		System.out.println("              ");
		System.out.println("              だからさ、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		Tools.Graphic_Creator(name_44);
		System.out.println("              ");
		System.out.println("              だからさ、今度は私が冒険に出るの！");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_41 = "BestEnd/s_41";
		Tools.Graphic_Creator(name_41);
		System.out.println("              ");
		System.out.println("              だからさ、今度は私が冒険に出るの！");
		System.out.println("              宝物を求めて、西へ東へ飛び回って、");
		System.out.println("              ");
		Thread.sleep(3000);

		String name_45 = "BestEnd/s_45";
		Tools.Graphic_Creator(name_45);
		System.out.println("              ");
		System.out.println("              だからさ、今度は私が冒険に出るの！");
		System.out.println("              宝物を求めて、西へ東へ飛び回って、もうすっごいスペクタクルで！");
		System.out.println("              ");
		Thread.sleep(3000);

		Tools.Graphic_Creator(name_42_5);
		System.out.println("              ");
		System.out.println("              たくさんの危険に巡り合うかもだけど……");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_42_7);
		System.out.println("              ");
		System.out.println("              たくさんの危険に巡り合うかもだけど……");
		System.out.println("              最後は、絶対「ただいま」って、戻ってくるよ！");
		System.out.println("              ");
		Thread.sleep(3500);

		Tools.Graphic_Creator(name_44);
		System.out.println("              ");
		System.out.println("              そしたらさ、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_44);
		System.out.println("              ");
		System.out.println("              そしたらさ、次からは");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1500);

		Tools.Graphic_Creator(name_44);
		System.out.println("              ");
		System.out.println("              そしたらさ、次からは");
		System.out.println("              「おかえり」って言えるでしょ？");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_00_3 = "BestEnd/s_00_3";
		Tools.Graphic_Creator(name_00_3);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(4000);


		String speech = "それで、リリィは幸せか？";
		char[] speak = speech.toCharArray();
		String speak_now = "";
		for(int i=0;i<speak.length;i++) {
			speak_now += speak[i];
			Tools.Graphic_Creator(name_00_3);
			System.out.println("              ");
			System.out.printf("              %s%n",speak_now);
			System.out.println("              ");
			if(i==3) Thread.sleep(2000);
			else Thread.sleep(50);
		}
		Thread.sleep(2500);

		Tools.Graphic_Creator(name_44);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		String name_46_1 = "BestEnd/s_46_1";
		Tools.Graphic_Creator(name_46_1);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1250);

		String name_46_2_2 = "BestEnd/s_46_2_2";
		Tools.Graphic_Creator(name_46_2_2);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_46_4_2 = "BestEnd/s_46_4_2";
		Tools.Graphic_Creator(name_46_4_2);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		String name_46_4_3 = "BestEnd/s_46_4_3";
		Tools.Graphic_Creator(name_46_4_3);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(125);

		String name_46_4_4 = "BestEnd/s_46_4_4";
		Tools.Graphic_Creator(name_46_4_4);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(125);

		String name_46_4_5 = "BestEnd/s_46_4_5";
		Tools.Graphic_Creator(name_46_4_5);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(125);

		String name_46_4_6 = "BestEnd/s_46_4_6";
		Tools.Graphic_Creator(name_46_4_6);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(125);

		String name_46_4_7 = "BestEnd/s_46_4_7";
		Tools.Graphic_Creator(name_46_4_7);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(125);

		String name_46_4_9 = "BestEnd/s_46_4_9";
		Tools.Graphic_Creator(name_46_4_9);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(125);

		String name_46_4_8 = "BestEnd/s_46_4_8";
		Tools.Graphic_Creator(name_46_4_8);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		//56
		for(int i=1;i<=56;i+=3) {
			String names = "BestEnd/s_47_" + i;
			Tools.Graphic_Creator(names);
			System.out.println("              ");
			System.out.println("              ");
			System.out.println("              ");
			System.out.println("              ");
			Thread.sleep(30);
		}

		String name_47_56 = "BestEnd/s_47_56";
		Tools.Graphic_Creator(name_47_56);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		//49
		for(int i=1;i<=49;i+=4) {
			String names = "BestEnd/s_48_" + i;
			Tools.Graphic_Creator(names);
			System.out.println("              ");
			System.out.println("              ");
			System.out.println("              ");
			System.out.println("              ");
			Thread.sleep(30);
		}

		Thread.sleep(2000);

		String name_49_1 = "BestEnd/s_49_1";
		Tools.Graphic_Creator(name_49_1);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(300);

		String name_49_2 = "BestEnd/s_49_2";
		Tools.Graphic_Creator(name_49_2);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(300);

		String name_50_1 = "BestEnd/s_50_1";
		Tools.Graphic_Creator(name_50_1);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_50_1);
		System.out.println("              ");
		System.out.println("              「ごめんな、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		Tools.Graphic_Creator(name_50_1);
		System.out.println("              ");
		System.out.println("              「ごめんな、ごめんな……。」");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		Tools.Graphic_Creator(name_50_1);
		System.out.println("              ");
		System.out.println("              もう、「ごめん」はダメって");
		System.out.println("              さっきいったばっかじゃん！");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_50_2 = "BestEnd/s_50_2";
		Tools.Graphic_Creator(name_50_2);
		System.out.println("              ");
		System.out.println("              「あ……、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		String name_50_3 = "BestEnd/s_50_3";
		Tools.Graphic_Creator(name_50_3);
		System.out.println("              ");
		System.out.println("              「あ……、すまな……。」");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		String name_50_4 = "BestEnd/s_50_4";
		Tools.Graphic_Creator(name_50_4);
		System.out.println("              ");
		System.out.println("              言ってるそばから！");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(1000);

		String name_50_5 = "BestEnd/s_50_5";
		Tools.Graphic_Creator(name_50_5);
		System.out.println("              ");
		System.out.println("              言ってるそばから！");
		System.out.println("              まったく、しっかりしてよね？");
		System.out.println("              ");
		Thread.sleep(1000);

		Tools.Graphic_Creator(name_50_5);
		System.out.println("              ");
		System.out.println("              言ってるそばから！");
		System.out.println("              まったく、しっかりしてよね？");
		System.out.println("              ");
		Thread.sleep(500);


		for(int i=6;i<=16;i++) {
			String names = "BestEnd/s_50_" + i;
			Tools.Graphic_Creator(names);
			System.out.println("              ");
			System.out.println("              言ってるそばから！");
			System.out.println("              まったく、しっかりしてよね？");
			System.out.println("              ");
			Thread.sleep(100);
		}
		Thread.sleep(1500);

		String name_51_1 = "BestEnd/s_51_1";
		Tools.Graphic_Creator(name_51_1);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String name_51_2 = "BestEnd/s_51_2";
		Tools.Graphic_Creator(name_51_2);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);
		Tools.Graphic_Creator(name_51_2);
		System.out.println("              ");
		System.out.println("              じゃ、罰として");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		String name_51_3 = "BestEnd/s_51_3";
		Tools.Graphic_Creator(name_51_3);
		System.out.println("              ");
		System.out.println("              じゃ、罰として");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		Tools.Graphic_Creator(name_51_3);
		System.out.println("              ");
		System.out.println("              じゃ、罰として 家に帰るまでに、");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(500);

		Tools.Graphic_Creator(name_51_3);
		System.out.println("              ");
		System.out.println("              じゃ、罰として 家に帰るまでに、");
		System.out.println("              冒険の仕方をちゃんとまとめておくこと！");
		System.out.println("              ");
		Thread.sleep(1500);

		String name_51_4 = "BestEnd/s_51_4";
		Tools.Graphic_Creator(name_51_4);
		System.out.println("              ");
		System.out.println("              じゃ、罰として 家に帰るまでに、");
		System.out.println("              冒険の仕方をちゃんとまとめておくこと！");
		System.out.println("              ");
		Thread.sleep(500);

		Tools.Graphic_Creator(name_51_4);
		System.out.println("              ");
		System.out.println("              じゃ、罰として 家に帰るまでに、");
		System.out.println("              冒険の仕方をちゃんとまとめておくこと！いいね！");
		System.out.println("              ");
		Thread.sleep(1000);

		String name_51_5 = "BestEnd/s_51_5";
		Tools.Graphic_Creator(name_51_5);
		System.out.println("              ");
		System.out.println("              じゃ、罰として 家に帰るまでに、");
		System.out.println("              冒険の仕方をちゃんとまとめておくこと！いいね！");
		System.out.println("              ");
		Thread.sleep(2000);

		/*
		int times = 2000;
		String[] word_s_51_line_1 =  {
				"",
				"じゃ、罰として……",
				"じゃ、罰として……家に帰るまでに、"
				};
		String[] word_s_51_line_2 =  {
				"","","",
				"冒険の仕方をちゃんとまとめておくこと！",
				"冒険の仕方をちゃんとまとめておくこと！いいね！"
				};
		for(int i=1;i<=5;i++) {
			String names = "BestEnd/s_51_" + i;
			Tools.Graphic_Creator(names);
			System.out.println("              ");
			System.out.printf("              %s%n",i <3 ? word_s_51_line_1[i]:word_s_51_line_1[2]);
			System.out.printf("              %s%n",word_s_51_line_2[i]);
			System.out.println("              ");
			if(i!=5) Thread.sleep(times);
			times += 500;
		}
		*/
		Tools.Graphic_Creator(name_51_5);
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		System.out.println("              ");
		Thread.sleep(2000);

		String speech2 = "・・・約束だよ？ お兄ちゃん。";
		char[] speak2 = speech2.toCharArray();
		String speak_now2 = "";
		for(int i=0;i<speak2.length;i++) {
			speak_now2 += speak2[i];
			Tools.Graphic_Creator(name_51_5);
			System.out.println("              ");
			System.out.printf("              %s%n",speak_now2);
			System.out.println("              ");
			System.out.println("              ");
			if(i<2) Thread.sleep(200);
			else if(i==2) Thread.sleep(2000);
			else if(i==8) Thread.sleep(2500);
			else Thread.sleep(50);
		}

		Thread.sleep(3000);

		for(int i=0;i<32;i++) {
			System.out.println();
		}
		Thread.sleep(3000);
	}
}
