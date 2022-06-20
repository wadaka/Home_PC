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
					System.out.println("  エンターキーで、タイトルへ戻る");
					Thread.sleep(2000);
					System.out.print("  >>");
				}else if(ending==2){
					BadEnd();
					System.out.println("");
					System.out.print("            エンターキーで、次に進む >>");
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
		System.out.println("      ?b  `         .$           dF   `  `  `  ` (!  `      ~ ,   H        .W,  BT9^  d` `");
		System.out.println("       Jc           \"     . .  .JD                      `     TaJNd   `      .#      .t   ");
		System.out.println("       .F    `  `.@ ?MNWMMNMnV\"^                                 M7T\"=(g?T5  ,\\     4;    ");
		System.out.println("       .b        .]                                `       `     -g,    7    H      .b    ");
		System.out.println("   ` .#j,        .]                  `  `  `  `       `            ?]        H       W.   ");
		System.out.println("  .sd#^,[   `    .]                     .gdMNMMMMNgNg..             E        q.      ,F  ");
		System.out.println(" (\"\"`   @        .b            `  .  ..MM#\"  ???=?! ?MMNJ.`   `     N,       ,@   `   W,. ");
		System.out.println("        #         d     `   `  .,\"dgM\"\"  .........     TMMN,        ,5        ,b        ^");
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
		System.out.println("      ?b  `         .$           dF   `  `  `  ` (!  `      ~ ,   H        .W,  BT9^  d` `");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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
		System.out.println("                ■リリーの日記：");
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

	static void GoodEnd() {
		System.out.println("");
		System.out.println("");
		System.out.println("  ここに、グッドエンド用のテキストが入ります。");
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
	}

	static void BestEnd() {

	}
}
