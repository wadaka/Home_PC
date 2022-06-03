package run;

import java.util.Random;
import java.util.Scanner;

public class Directing_Camp {
	final static Random rdm = new Random();
	final static Scanner scan = new Scanner(System.in);

	static void show_Intermediate_Grade(int turn,Hero h,int[] ba) throws InterruptedException{
		for(int i=0;i<32;i++) {
			System.out.println("");
		}
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
		System.out.println("                                  +----------------+");
		System.out.println("                                  | 経  過  報  告 |");
		System.out.println("                                  +----------------+");
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

		Thread.sleep(2000);

		String day = "";
		if(turn<11) {
			day = "1～10歩までの探索結果";
		}else {
			day = "11～20歩までの探索結果";
		}
		System.out.println("");
		System.out.println("");
		System.out.println("      +----------------+");
		System.out.println("      | 経  過  報  告 |");
		System.out.println("      +----------------+");
		System.out.println("");
		System.out.println("");
		System.out.printf("            ◇%s%n",day);
		System.out.println("           -------------------------");
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
		System.out.printf("              HP %3d/100     財産 %3d/100  %n",h.getHp(),h.getMoney());
		System.out.printf("              傷薬 (%d)       銃 (%d)        煙幕 (%d)        ゴミ (%d)%n",h.getItem_ointment(),h.getItem_gun(),h.getItem_smoke(),h.getItem_litter());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	static void showMain() throws InterruptedException{
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
		System.out.println("                                  +----------------+");
		System.out.println("                                  | キ  ャ  ン  プ |");
		System.out.println("                                  +----------------+");
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

		Thread.sleep(2000);

		System.out.println("");
		System.out.println("                          MMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMN.");
		System.out.println("                     (MMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMNa.. ");
		System.out.println("                  .MgMN;          . M&MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM]           MMMe              ");
		System.out.println("                  .MgMN;          .      MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM]           MMMe              ");
		System.out.println("                  .MMMMd       .#`.!7\"S;  MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM'   ,\\     RMMMMM            ");
		System.out.println("                  .MMMMd    ..gMb.. ..,N.   MMMMMM#\"\"\"\"=~~~   ~~~77\"\"\"WMMMMMMMMMMMMMMM]          .#MMMMM       ");
		System.out.println("                  .MMMMF    M#\".T\"HMMY\"M  ,?MMM\"`             `         .77W\"W\"WMMMMMM            (MMMMM        ");
		System.out.println("                  JMMMMF    ?Ma....  .dm.M. ^         `                         .MMMM      .\\    .MMMMM             ");
		System.out.println("                 .#MMMM^     ,MM#MMMMMMP!          `       `     `              ..   ,.    (8     .MMMMM              ");
		System.out.println("                 .MMMMM      ..MNg..JdMN,       `     `                `     .M\"\"=?Ha.TNa,.       dMMMMM.           ");
		System.out.println("                 ,MMMMM     MM\" ,MMN.(@,b                .MM    `  `       .d'      T[  WMM ux    dMMMMM]            ");
		System.out.println("                 ,MMMMM     MMh.  (Tm(b(N,      `  `M M,MH7MHxM.      `    .F       .b...dM| d    dMMMMMN             ");
		System.out.println("                 .MMMMM     ,WMN    JNMJd#     .    MMM\"^ .   MM           gF     ..D'   -NN.     .MMMMMN            ");
		System.out.println("                 .MMMMM     ..MMmMN,  .dMNJTN,      MM ,M M W M M         dYMNb&JY^J`    -M#N,      (MMMM,            ");
		System.out.println("                 dMMMMF    (@(M#TB?HNd5. ?MMHM,.   MM  M.   ,M  NM   `   .M\"~`     b .MMM,MN,F      JMMMM]          ");
		System.out.println("                 MMMMM_   (#MMY\"Y\"4M#TNJ\"WN(d@NJdNm-M  M   ..M. MMM      .]        H M_  #(MP@     .ggJMMN       ");
		System.out.println("                 MMMMM|  dMMM#     ..gMMMMB'      d.QMM MMMMMM]_?M     `  ?Hg,     ,D ?m.Jh(MNa-,   MM#MMHM}        ");
		System.out.println("                 .MMMM@J-..MMMN...+MMMD??`    `    JN..JMNdMg,(Wr?\"\"^    .  ?MMNg+dMMMMTHB\"\"^   .TH\"TMMD`         ");
		System.out.println("                (MMY\"?\"Y#\"\"\".???7!          `       `      _???`   ..mT\"Th&u&..     ???           MMMMW          ");
		System.out.println("               j.....QQJJj,.                    ` `            .d\"`         .dMB{         .. .qe..,MMMMW          ");
		System.out.println("                 (MMNMMMMMMMMMMNa..                        ..(M9`?\"\"\"\"    ..#\"`    ... ..gMMMMMMMWNMM#\"         ");
		System.out.println("                  _?T\"MMMMMMMMMMMMNNggJgggJ..                -?\"\"BN,..g7\"H\"` ...gMMMMMMMMMMMMMMMWT\"`            ");
		System.out.println("                         ?WMMMMMMMMMMMMMMMMMMMMNggJ..................MMMMMMMMMMMMMMMMMMMMMMMMM#9\"?!                   ");
		System.out.println("                            .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		System.out.println("");
		System.out.println("                   ▽なにをしようかな。");
		System.out.println("                   --------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		Thread.sleep(1000);

		System.out.println("");
		System.out.println("                          MMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMN.");
		System.out.println("                     (MMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMNa.. ");
		System.out.println("                  .MgMN;          . M&MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM]           MMMe              ");
		System.out.println("                  .MgMN;          .      MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM]           MMMe              ");
		System.out.println("                  .MMMMd       .#`.!7\"S;  MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM'   ,\\     RMMMMM            ");
		System.out.println("                  .MMMMd    ..gMb.. ..,N.   MMMMMM#\"\"\"\"=~~~   ~~~77\"\"\"WMMMMMMMMMMMMMMM]          .#MMMMM       ");
		System.out.println("                  .MMMMF    M#\".T\"HMMY\"!  ,?MMM\"`             `         .77W\"W\"WMMMMMM            (MMMMM        ");
		System.out.println("                  JMMMMF    ?Ma....  .dm.@`. ^         `                         .MMMM      .\\    .MMMMM             ");
		System.out.println("                 .#MMMM^     ,MM#MMMMMMP!          `       `     `              ..   ,.    (8     .MMMMM              ");
		System.out.println("                 .MMMMM      ..MNg..JdMN,       `     `                `     .M\"\"=?Ha.TNa,.       dMMMMM.           ");
		System.out.println("                 ,MMMMM     MM\" ,MMN.(@,b                .MM    `  `       .d'      T[  WMM ux    dMMMMM]            ");
		System.out.println("                 ,MMMMM     MMh.  (Tm(b(N,      `  `M M,MH7MHxM.      `    .F       .b...dM| d    dMMMMMN             ");
		System.out.println("                 .MMMMM     ,WMN    JNMJd#     .    MMM\"^ .   MM           gF     ..D'   -NN.     .MMMMMN            ");
		System.out.println("                 .MMMMM     ..MMmMN,  .dMNJTN,      MM ,M M W M M         dYMNb&JY^J`    -M#N,      (MMMM,            ");
		System.out.println("                 dMMMMF    (@(M#TB?HNd5. ?MMHM,.   MM  M.   ,M  NM   `   .M\"~`     b .MMM,MN,F      JMMMM]          ");
		System.out.println("                 MMMMM_   (#MMY\"Y\"4M#TNJ\"WN(d@NJdNm-M  M   ..M. MMM      .]        H M_  #(MP@     .ggJMMN       ");
		System.out.println("                 MMMMM|  dMMM#     ..gMMMMB'      d.QMM MMMMMM]_?M     `  ?Hg,     ,D ?m.Jh(MNa-,   MM#MMHM}        ");
		System.out.println("                 .MMMM@J-..MMMN...+MMMD??`    `    JN..JMNdMg,(Wr?\"\"^    .  ?MMNg+dMMMMTHB\"\"^   .TH\"TMMD`         ");
		System.out.println("                (MMY\"?\"Y#\"\"\".???7!          `       `      _???`   ..mT\"Th&u&..     ???           MMMMW          ");
		System.out.println("               j.....QQJJj,.                    ` `            .d\"`         .dMB{         .. .qe..,MMMMW          ");
		System.out.println("                 (MMNMMMMMMMMMMNa..                        ..(M9`?\"\"\"\"    ..#\"`    ... ..gMMMMMMMWNMM#\"         ");
		System.out.println("                  _?T\"MMMMMMMMMMMMNNggJgggJ..                -?\"\"BN,..g7\"H\"` ...gMMMMMMMMMMMMMMMWT\"`            ");
		System.out.println("                         ?WMMMMMMMMMMMMMMMMMMMMNggJ..................MMMMMMMMMMMMMMMMMMMMMMMMM#9\"?!                   ");
		System.out.println("                            .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		System.out.println("");
		System.out.println("                   ▽なにをしようかな。");
		System.out.println("                   --------------------");
		System.out.println("                    【1】アイテム購入   【2】リリーと会話   【3】途中経過確認   【4】寝る (次のターンへ)");
		System.out.println("                     -----------------------------------------------------------------------------------");
		System.out.println("");
	}

	static void connect() throws InterruptedException{
		for(int i=0;i<32;i++) {
			System.out.println("");
		}

		Thread.sleep(1000);

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
		System.out.println("                    Prrrrrrrr...");
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

		Thread.sleep(500);

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
		System.out.println("                    Prrrrrrrr...");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                                                   Prrrrrrrr...");
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

		Thread.sleep(1000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}

		Thread.sleep(500);

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
		System.out.println("                                         -");
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

		Thread.sleep(150);

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
		System.out.println("                                        -n-");
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

		Thread.sleep(100);

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
		System.out.println("                                       -nne-");
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

		Thread.sleep(100);

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
		System.out.println("                                      -onnec-");
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

		Thread.sleep(100);

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
		System.out.println("                                    - connect -");
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

		Thread.sleep(100);

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
		System.out.println("                                  . ! connect ! .");
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

		Thread.sleep(100);

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
		System.out.println("                                 ＼ ! connect ! ／");
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

		Thread.sleep(100);

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
		System.out.println("                                   .           .");
		System.out.println("                               ／＼ ! connect ! ／＼");
		System.out.println("                                   ゜          ゜");
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

		Thread.sleep(100);

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
		System.out.println("                                  ＼           ／");
		System.out.println("                               ／＼ ! connect ! ／＼");
		System.out.println("                                  ／           ＼");
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

		Thread.sleep(100);

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
		System.out.println("                                ＼／           ＼／");
		System.out.println("                                  ＼           ／");
		System.out.println("                            ＼／    ! connect !    ＼／");
		System.out.println("                                  ／           ＼");
		System.out.println("                                ／＼           ／＼ ");
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

		Thread.sleep(100);

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
		System.out.println("                                ／               ＼");
		System.out.println("                                ＼／           ＼／");
		System.out.println("                                                 ");
		System.out.println("                          ／＼      ! connect !      ／＼");
		System.out.println("                                                ");
		System.out.println("                                ／＼           ／＼ ");
		System.out.println("                                ＼               ／");
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

		Thread.sleep(100);

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
		System.out.println("                                ＼               ／");
		System.out.println("                                 ");
		System.out.println("                                 ");
		System.out.println("                                                 ");
		System.out.println("                        ＼                             ／");
		System.out.println("");
		System.out.println("                                  ");
		System.out.println("                                 ");
		System.out.println("                                ／               ＼");
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

		Thread.sleep(100);

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
		System.out.println("                               .                   .");
		System.out.println("                                               ");
		System.out.println("                                 ");
		System.out.println("                                 ");
		System.out.println("                       .                                 .");
		System.out.println("                                                     ");
		System.out.println("");
		System.out.println("                                  ");
		System.out.println("                                 ");
		System.out.println("                                               ");
		System.out.println("                               ゜                  ゜");
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

		Thread.sleep(125);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}

		Thread.sleep(250);
	}

	static void disconnect() throws InterruptedException{

		for(int i=0;i<32;i++) {
			System.out.println("");
		}

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
		System.out.println("                               .                   .");
		System.out.println("                                               ");
		System.out.println("                                 ");
		System.out.println("                                 ");
		System.out.println("                       .                                 .");
		System.out.println("                                                     ");
		System.out.println("");
		System.out.println("                                  ");
		System.out.println("                                 ");
		System.out.println("                                               ");
		System.out.println("                               ゜                  ゜");
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

		Thread.sleep(100);

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
		System.out.println("                                ＼               ／");
		System.out.println("                                 ");
		System.out.println("                                 ");
		System.out.println("                                                 ");
		System.out.println("                        ＼                             ／");
		System.out.println("");
		System.out.println("                                  ");
		System.out.println("                                 ");
		System.out.println("                                ／               ＼");
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

		Thread.sleep(100);

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
		System.out.println("                                ／               ＼");
		System.out.println("                                ＼／           ＼／");
		System.out.println("                                                 ");
		System.out.println("                          ／＼      ! connect !     ／＼");
		System.out.println("                                                ");
		System.out.println("                                ／＼           ／＼ ");
		System.out.println("                                ＼               ／");
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

		Thread.sleep(100);

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
		System.out.println("                                ＼／           ＼／");
		System.out.println("                                  ＼           ／");
		System.out.println("                            ＼／    ! connect !    ＼／");
		System.out.println("                                  ／           ＼");
		System.out.println("                                ／＼           ／＼ ");
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

		Thread.sleep(100);

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
		System.out.println("                                ＼／           ＼／");
		System.out.println("                                  ＼           ／");
		System.out.println("                            ＼／    ! connect !    ＼／");
		System.out.println("                                  ／           ＼");
		System.out.println("                                ／＼           ／＼ ");
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

		Thread.sleep(100);

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
		System.out.println("                                  ＼           ／");
		System.out.println("                               ／＼ ! connect ! ／＼");
		System.out.println("                                  ／           ＼");
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

		Thread.sleep(100);

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
		System.out.println("                                   .           .");
		System.out.println("                               ／＼ ! connect ! ／＼");
		System.out.println("                                   ゜          ゜");
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

		Thread.sleep(100);

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
		System.out.println("                                 ＼ ! connect ! ／");
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

		Thread.sleep(100);

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
		System.out.println("                                  . ! connect ! .");
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

		Thread.sleep(100);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}

		Thread.sleep(500);

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
		System.out.println("                                     disconnect");
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

		Thread.sleep(1000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}

		Thread.sleep(500);

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
		System.out.println("                                     disconnect");
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

		Thread.sleep(1000);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}

		Thread.sleep(500);

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
		System.out.println("                                     disconnect");
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

		Thread.sleep(1000);

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
		System.out.println("                                     -isconnec-");
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

		Thread.sleep(100);

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
		System.out.println("                                     --sconne--");
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

		Thread.sleep(100);

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
		System.out.println("                                     ---conn---");
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

		Thread.sleep(100);

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
		System.out.println("                                     ----on----");
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

		Thread.sleep(100);

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
		System.out.println("                                     ----------");
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

		Thread.sleep(100);

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
		System.out.println("                                      --------");
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

		Thread.sleep(100);

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
		System.out.println("                                       ------");
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

		Thread.sleep(100);

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
		System.out.println("                                        ----");
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

		Thread.sleep(100);

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
		System.out.println("                                         --");
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

		Thread.sleep(100);

		for(int i=0;i<32;i++) {
			System.out.println("");
		}

		Thread.sleep(1000);
	}

	static void pre_supply_first() throws InterruptedException{
		//"                                                             "テキストの長さ

		Directing_Sister_mini.noise1();
		Thread.sleep(250);
		Directing_Sister_mini.noise2();
		Thread.sleep(250);
		String word1_1 = "……                                                         ";

		blank_line_11();
		Directing_Sister_mini.smile_one_line(word1_1);
		blank_line_11();

		Thread.sleep(2000);
		String word1_2 = "……あ、もしもし？                                           ";
		String word1_3 = "                                                             ";
		blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_2,word1_3);
		blank_line_11();

		Thread.sleep(750);
		String word1_4 = "おにいちゃん、聞こえる？                                     ";
		blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_2,word1_4);
		blank_line_11();

		Thread.sleep(2500);

		String word2 = "                                                             ";
		blank_line_11();
		Directing_Sister_mini.smile_one_line(word2);
		blank_line_11();

		Thread.sleep(1500);
		String word3_0 = "                                                             ";
		String word3_1 = "あー、よかった。                                             ";
		String word3_2 = "あー、よかった。ちょっと電波が悪かったから                   ";
		String word3_3 = "上手く連絡がつかないかと思ったよ。                           ";
		blank_line_11();
		Directing_Sister_mini.nonki1_talk_two_line(word3_1,word3_0);
		blank_line_11();

		Thread.sleep(1500);

		blank_line_11();
		Directing_Sister_mini.nonki1_talk_two_line(word3_2,word3_3);
		blank_line_11();

		Thread.sleep(2500);

		String word4_1 = "ごほん。気を取り直して……。                                 ";
		blank_line_11();
		Directing_Sister_mini.gohon_one_line(word4_1);
		blank_line_11();

		Thread.sleep(1500);
		String word5_1 = "さあ、何が必要なのかな？おにいちゃん！                       ";
		blank_line_11();
		Directing_Sister_mini.smile_talk_one_line(word5_1);
		blank_line_11();
		Thread.sleep(1500);
	}

	static void supply_start_sister() throws InterruptedException{
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
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|______________________________________________________________________________________________________|_|");
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

		Thread.sleep(125);

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (-)                     (-)                     (-)                     (-)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  ----    -------  |   |   --     -------  |   |  ----    -------  |   |  ----    -------  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  ------------     |   |  --------------   |   |  --------------   |   |  ----------       |         | |");
		System.out.println("    | |         |  ----             |   |  ----------       |   |  ------------     |   |  --------------   |         | | ");
		System.out.println("    | |_________|_____________________________________________________________________________________________________|_|");
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

		Thread.sleep(125);

		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (-)                     (-)                     (-)                     (-)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  ----    -------  |   |   --     -------  |   |  ----    -------  |   |  ----    -------  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  ------------     |   |  --------------   |   |  --------------   |   |  ----------       |         | |");
		System.out.println("    | |         |  ----             |   |  ----------       |   |  ------------     |   |  --------------   |         | | ");
		System.out.println("    | |         |  ---------------  |   |  ---------------  |   |  ---------------  |   |  ----------       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.println("    | |         |          ---- (-) |   |          ---- (-) |   |          ---- (-) |   |          ---- (-) |         | |");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |          _____________________________________________________________________       |              |         | | ");
		System.out.println("    | |         |                                                                     |      |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |  ----------                                                         |  ☆  |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |  ----------                                                         |    ゜|(ノ。  _ ノノ |         | |");
		System.out.println("    | |         |    --  --/--   ----  --/--    ---- (-) -- (-) ---- (-) ---- (-)     |      | (-  ᴗ        -[]   |         | |");
		System.out.println("    | |         |_____________________________________________________________________|      |   ――〃 ´  |         | | ");
		System.out.println("    | |                                                                                      |____〃_〃ヽ___|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");

		Thread.sleep(1250);

		blank_line_11();
	}

	static void supply_end_sister() throws InterruptedException{

		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (-)                     (-)                     (-)                     (-)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  ----    -------  |   |   --     -------  |   |  ----    -------  |   |  ----    -------  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  ------------     |   |  --------------   |   |  --------------   |   |  ----------       |         | |");
		System.out.println("    | |         |  ----             |   |  ----------       |   |  ------------     |   |  --------------   |         | | ");
		System.out.println("    | |         |  ---------------  |   |  ---------------  |   |  ---------------  |   |  ----------       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.println("    | |         |          ---- (-) |   |          ---- (-) |   |          ---- (-) |   |          ---- (-) |         | |");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |          _____________________________________________________________________       |              |         | | ");
		System.out.println("    | |         |                                                                     |      |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |  ----------                                                         |  ☆  |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |  ----------                                                         |    ゜|(ノ。  _ ノノ |         | |");
		System.out.println("    | |         |    --  --/--   ----  --/--    ---- (-) -- (-) ---- (-) ---- (-)     |      | (-  ᴗ        -[]   |         | |");
		System.out.println("    | |         |_____________________________________________________________________|      |   ――〃 ´  |         | | ");
		System.out.println("    | |                                                                                      |____〃_〃ヽ___|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");

		Thread.sleep(1250);
		blank_line_11();

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (-)                     (-)                     (-)                     (-)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  ----    -------  |   |   --     -------  |   |  ----    -------  |   |  ----    -------  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  ------------     |   |  --------------   |   |  --------------   |   |  ----------       |         | |");
		System.out.println("    | |         |  ----             |   |  ----------       |   |  ------------     |   |  --------------   |         | | ");
		System.out.println("    | |_________|_____________________________________________________________________________________________________|_|");
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

		Thread.sleep(125);

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
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|______________________________________________________________________________________________________|_|");
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

		Thread.sleep(125);

	}

	static void supply_sister(Hero h,int[] supply_stock) throws InterruptedException{
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  ね  。                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (1)                     (2)                     (3)                     (4)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  傷薬    費用:10  |   |   銃     費用: 5  |   |  煙幕    費用: 3  |   |  ゴミ    費用: 2  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  使用すると、     |   |  戦闘時の使用で   |   |  戦闘時の使用で   |   |  イベントで   　　|         | |");
		System.out.println("    | |         |  HPが             |   |  戦闘勝率が       |   |  逃走成功率が     |   |  財宝が減るのを   |         | | ");
		System.out.println("    | |         |  30%回復します。  |   |  25%上昇します。  |   |  25%上昇します。  |   |  防ぎます。       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.printf("    | |         |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |         | |%n",supply_stock[0],supply_stock[1],supply_stock[2],supply_stock[3]);
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |          _____________________________________________________________________       |              |         | | ");
		System.out.println("    | |         |                                                                     |      |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |  現在の状況                                                         |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |  ----------                                                         |      |(ノ。  。 ノノ|         | |");
		System.out.printf("    | |         |    HP %3d/100  財宝 %3d/100   傷薬 (%d) 銃 (%d) 煙幕 (%d) ゴミ (%d)     |      | (-  ᴗ        -[]   |         | |%n",h.getHp(),h.getMoney(),h.getItem_ointment(),h.getItem_gun(),h.getItem_smoke(),h.getItem_litter());
		System.out.println("    | |         |_____________________________________________________________________|      |   ――〃 ´  |         | | ");
		System.out.println("    | |                                                                                      |____〃_〃ヽ___|         | |");
		System.out.println("    | |         ※買い物を終える時は、【5】を入力！                                          |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
	}

	static void supply_no_stock_sister(int[] supply_stock) throws InterruptedException{
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  ね  。                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (1)                     (2)                     (3)                     (4)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  傷薬    費用:10  |   |   銃     費用: 5  |   |  煙幕    費用: 3  |   |  ゴミ    費用: 2  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  使用すると、     |   |  戦闘時の使用で   |   |  戦闘時の使用で   |   |  イベントで       |         | |");
		System.out.println("    | |         |  HPが             |   |  戦闘勝率が       |   |  逃走成功率が     |   |  財宝が減るのを   |         | | ");
		System.out.println("    | |         |  30%回復します。  |   |  25%上昇します。  |   |  25%上昇します。  |   |  防ぎます。       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.printf("    | |         |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |         | |%n",supply_stock[0],supply_stock[1],supply_stock[2],supply_stock[3]);
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |                                                                     |      |(ノ゜  ゜ ノノ|         | |");
		System.out.println("    | |         |    ありゃ、在庫切れみたい……。                                      ＞    | (- 口  -[]   |         | |");
		System.out.println("    | |         |                                                                     |      | /⌒;―〃 ´  |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |〃-〃_〃ヽ____|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
		Thread.sleep(2000);
	}

	static void supply_check_sister(String item,int[] supply_stock) throws InterruptedException{
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  ね  。                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (1)                     (2)                     (3)                     (4)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  傷薬    費用:10  |   |   銃     費用: 5  |   |  煙幕    費用: 3  |   |  ゴミ    費用: 2  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  使用すると、     |   |  戦闘時の使用で   |   |  戦闘時の使用で   |   |  イベントで       |         | |");
		System.out.println("    | |         |  HPが             |   |  戦闘勝率が       |   |  逃走成功率が     |   |  財宝が減るのを   |         | | ");
		System.out.println("    | |         |  30%回復します。  |   |  25%上昇します。  |   |  25%上昇します。  |   |  防ぎます。       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.printf("    | |         |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |         | |%n",supply_stock[0],supply_stock[1],supply_stock[2],supply_stock[3]);
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.printf("    | |         |    %s でいいの？                                                  |      |(ノ。  。 ノノ|         | |%n",item);
		System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
		System.out.println("    | |         |   【1】はい    【2】いいえ                                          |      |   ――〃 ´  |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
	}

	static void supply_check_ok_sister(int[] supply_stock) throws InterruptedException{
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  ね  。                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (1)                     (2)                     (3)                     (4)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  傷薬    費用:10  |   |   銃     費用: 5  |   |  煙幕    費用: 3  |   |  ゴミ    費用: 2  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  使用すると、     |   |  戦闘時の使用で   |   |  戦闘時の使用で   |   |  イベントで   　　|         | |");
		System.out.println("    | |         |  HPが             |   |  戦闘勝率が       |   |  逃走成功率が     |   |  財宝が減るのを   |         | | ");
		System.out.println("    | |         |  30%回復します。  |   |  25%上昇します。  |   |  25%上昇します。  |   |  防ぎます。       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.printf("    | |         |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |         | |%n",supply_stock[0],supply_stock[1],supply_stock[2],supply_stock[3]);
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |    OK！発注したよ！                                                 |      |(ノ。  。 ノノ|         | |");
		System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
		System.out.println("    | |         |    到着を心待ちにしててね、おにいちゃん！                           |      |   ――〃 ´  |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
		Thread.sleep(2000);
	}

	static void supply_check_no_sister(int no_count,int[] supply_stock) throws InterruptedException{
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  ね  。                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (1)                     (2)                     (3)                     (4)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  傷薬    費用:10  |   |   銃     費用: 5  |   |  煙幕    費用: 3  |   |  ゴミ    費用: 2  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  使用すると、     |   |  戦闘時の使用で   |   |  戦闘時の使用で   |   |  イベントで   　　|         | |");
		System.out.println("    | |         |  HPが             |   |  戦闘勝率が       |   |  逃走成功率が     |   |  財宝が減るのを   |         | | ");
		System.out.println("    | |         |  30%回復します。  |   |  25%上昇します。  |   |  25%上昇します。  |   |  防ぎます。       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.printf("    | |         |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |         | |%n",supply_stock[0],supply_stock[1],supply_stock[2],supply_stock[3]);
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");


		switch(no_count) {
		case 1:
			System.out.println("    | |                                                                                       ______________          | |");
			System.out.println("    | |                                                                                      |              |         | | ");
			System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
			System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
			System.out.println("    | |         |    ありゃ、やめちゃうんだね。                                       |      |(ノ。  。 ノノ|         | |");
			System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
			System.out.println("    | |         |    了解、おにいちゃん！                                             |      |   ――〃 ´  |         | | ");
			System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
			System.out.println("    | |                                                                                      |______________|         | |");
			System.out.println("    | |_______________________________________________________________________________________________________________| | ");
			System.out.println("    |___________________________________________________________________________________________________________________|  ");
			Thread.sleep(2000);
			break;
		case 2:
			System.out.println("    | |                                                                                       ______________          | |");
			System.out.println("    | |                                                                                      |              |         | | ");
			System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
			System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
			System.out.println("    | |         |    そっか、やめちゃうんだね。                                       |      |(ノ。  。 ノノ|         | |");
			System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
			System.out.println("    | |         |    OKだよ、おにいちゃん！                                           |      |   ――〃 ´  |         | | ");
			System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
			System.out.println("    | |                                                                                      |______________|         | |");
			System.out.println("    | |_______________________________________________________________________________________________________________| | ");
			System.out.println("    |___________________________________________________________________________________________________________________|  ");
			Thread.sleep(2000);
			break;
		case 3:
			System.out.println("    | |                                                                                       ______________          | |");
			System.out.println("    | |                                                                                      |              |         | | ");
			System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
			System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
			System.out.println("    | |         |    ま、またやめるの……？                                           |      |(ノ。  。 ノノ|         | |");
			System.out.println("    | |         |                                                                      ＞    | (- 口   -[]   |         | |");
			System.out.println("    | |         |    りょ、了解。                                                     |      |   ――〃 ´  |         | | ");
			System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
			System.out.println("    | |                                                                                      |______________|         | |");
			System.out.println("    | |_______________________________________________________________________________________________________________| | ");
			System.out.println("    |___________________________________________________________________________________________________________________|  ");
			Thread.sleep(2000);
			break;
		case 4:
			System.out.println("    | |                                                                                       ______________          | |");
			System.out.println("    | |                                                                                      |              |         | | ");
			System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
			System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
			System.out.println("    | |         |    ……結構、優柔不断だよね。                                       |      |(ノт т  ノノ|         | |");
			System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
			System.out.println("    | |         |    おにいちゃん。                                                   |      |   ――〃 ´  |         | | ");
			System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
			System.out.println("    | |                                                                                      |______________|         | |");
			System.out.println("    | |_______________________________________________________________________________________________________________| | ");
			System.out.println("    |___________________________________________________________________________________________________________________|  ");
			Thread.sleep(2000);
			break;
		default :
			System.out.println("    | |                                                                                       ______________          | |");
			System.out.println("    | |                                                                                      |              |         | | ");
			System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
			System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
			System.out.println("    | |         |    ……まあ、命に関わる事だしね。                                   |      |(ノт т  ノノ|         | |");
			System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
			System.out.println("    | |         |    慎重に選ぶといいよ、おにいちゃん……。                           |      |   ――〃 ´  |         | | ");
			System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
			System.out.println("    | |                                                                                      |______________|         | |");
			System.out.println("    | |_______________________________________________________________________________________________________________| | ");
			System.out.println("    |___________________________________________________________________________________________________________________|  ");
			Thread.sleep(2000);
		}

	}

	static void supply_check_no_money_sister(int[] supply_stock) throws InterruptedException{
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  ね  。                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (1)                     (2)                     (3)                     (4)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  傷薬    費用:10  |   |   銃     費用: 5  |   |  煙幕    費用: 3  |   |  ゴミ    費用: 2  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  使用すると、     |   |  戦闘時の使用で   |   |  戦闘時の使用で   |   |  イベントで   　　|         | |");
		System.out.println("    | |         |  HPが             |   |  戦闘勝率が       |   |  逃走成功率が     |   |  財宝が減るのを   |         | | ");
		System.out.println("    | |         |  30%回復します。  |   |  25%上昇します。  |   |  25%上昇します。  |   |  防ぎます。       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.printf("    | |         |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |         | |%n",supply_stock[0],supply_stock[1],supply_stock[2],supply_stock[3]);
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |                                                                     |      |(ノт  т ノノ|         | |");
		System.out.println("    | |         |    お金足りないよ、おにいちゃん……。                                ＞    | (- ワ  -[]   |         | |");
		System.out.println("    | |         |                                                                     |      |   ――〃 ´  |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
		Thread.sleep(2000);
	}

	static void supply_check_end_shop_sister(int[] supply_stock) throws InterruptedException{
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  ね  。                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (1)                     (2)                     (3)                     (4)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  傷薬    費用:10  |   |   銃     費用: 5  |   |  煙幕    費用: 3  |   |  ゴミ    費用: 2  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  使用すると、     |   |  戦闘時の使用で   |   |  戦闘時の使用で   |   |  イベントで       |         | |");
		System.out.println("    | |         |  HPが             |   |  戦闘勝率が       |   |  逃走成功率が     |   |  財宝が減るのを   |         | | ");
		System.out.println("    | |         |  30%回復します。  |   |  25%上昇します。  |   |  25%上昇します。  |   |  防ぎます。       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.printf("    | |         |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |         | |%n",supply_stock[0],supply_stock[1],supply_stock[2],supply_stock[3]);
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |    うーん、買い忘れはないかな？                                     |      |(ノ゜  ゜ ノノ|         | |");
		System.out.println("    | |         |                                                                      ＞    | (- 口  -[]   |         | |");
		System.out.println("    | |         |   【1】はい    【2】いいえ                                          |      | /⌒;―〃  ´ |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |〃-〃_〃ヽ____|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
	}

	static void supply_check_end_shop_ok_sister(int[] supply_stock) throws InterruptedException{
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  ね  。                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (1)                     (2)                     (3)                     (4)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  傷薬    費用:10  |   |   銃     費用: 5  |   |  煙幕    費用: 3  |   |  ゴミ    費用: 2  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  使用すると、     |   |  戦闘時の使用で   |   |  戦闘時の使用で   |   |  イベントで       |         | |");
		System.out.println("    | |         |  HPが             |   |  戦闘勝率が       |   |  逃走成功率が     |   |  財宝が減るのを   |         | | ");
		System.out.println("    | |         |  30%回復します。  |   |  25%上昇します。  |   |  25%上昇します。  |   |  防ぎます。       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.printf("    | |         |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |         | |%n",supply_stock[0],supply_stock[1],supply_stock[2],supply_stock[3]);
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |    了解～！                                                         |      |(ノ。  。 ノノ|         | |");
		System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
		System.out.println("    | |         |    頑張ってね。おにいちゃん！                                       |      | /⌒;―〃  ´ |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |〃-〃_〃ヽ____|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
		Thread.sleep(2000);
	}

	static void supply_check_end_shop_no_sister(int[] supply_stock) throws InterruptedException{
		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  ね  。                          | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|         (1)                     (2)                     (3)                     (4)                  | |");
		System.out.println("    | |         |===================|   |===================|   |===================|   |===================|         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | |");
		System.out.println("    | |         |  傷薬    費用:10  |   |   銃     費用: 5  |   |  煙幕    費用: 3  |   |  ゴミ    費用: 2  |         | | ");
		System.out.println("    | |         | ================= |   | ================= |   | ================= |   | ================= |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         |  使用すると、     |   |  戦闘時の使用で   |   |  戦闘時の使用で   |   |  イベントで       |         | |");
		System.out.println("    | |         |  HPが             |   |  戦闘勝率が       |   |  逃走成功率が     |   |  財宝が減るのを   |         | | ");
		System.out.println("    | |         |  30%回復します。  |   |  25%上昇します。  |   |  25%上昇します。  |   |  防ぎます。       |         | |");
		System.out.println("    | |         |                   |   |                   |   |                   |   |                   |         | |");
		System.out.println("    | |         | ----------------- |   | ----------------- |   | ----------------- |   | ----------------- |         | | ");
		System.out.printf("    | |         |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |   |          在庫 (%d) |         | |%n",supply_stock[0],supply_stock[1],supply_stock[2],supply_stock[3]);
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |    買い忘れ、あったんだね。                                         |      |(ノ。  。 ノノ|         | |");
		System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
		System.out.println("    | |         |    それじゃ、何が欲しいのかな？                                     |      | /⌒;―〃  ´ |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |〃-〃_〃ヽ____|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
		Thread.sleep(2000);
	}

	static void blank_line_11() {
		for(int i=0;i<11;i++) {
			System.out.println("");
		}
	}

	static void sister_talk_Opening_common() throws InterruptedException{
		Directing_Sister_mini.noise1();
		Thread.sleep(250);
		Directing_Sister_mini.noise2();
		Thread.sleep(250);
		String word1_1 = "……                                                         ";

		blank_line_11();
		Directing_Sister_mini.smile_one_line(word1_1);
		blank_line_11();
	}

	static void sister_talk_Opening_pattern_1() throws InterruptedException{
		String word0_0 = "                                                             ";

		String word1_1 = "……ヤッホー、おにいちゃん！                                 ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
		String word1_2 = "どうしたの？ 何か要り様？                                    ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think2_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
		String word2_1 = "さては、私の声が恋しくなっちゃった？                         ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki2_talk_two_line(word2_1,word0_0);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
		String word2_2 = "……。                                                       ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki2_talk_two_line(word2_1,word2_2);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
		String word2_3 = "……。なんちゃって。                                         ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_talk_two_line(word2_1,word2_3);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
	}

	static void sister_talk_Opening_pattern_2() throws InterruptedException{
		String word0_0 = "                                                             ";

		String word1_1 = "……ん。どうしたの、おにいちゃん。                           ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_talk_one_line(word1_1);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
		String word2_1 = "……？                                                       ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think1_one_line(word2_1);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
		String word2_2 = "……？ なんとなく、声が聞きたくなったって？                  ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think2_one_line(word2_2);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
		String word3_1 = "……。                                                       ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire2_one_line(word3_1);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
		String word3_2 = "……。さびしんぼ！                                           ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_talk_one_line(word3_2);
		Directing_Camp.blank_line_11();

		Thread.sleep(2000);
	}

	static void sister_talk_idle() throws InterruptedException{
		String word1_1 = "                                                             ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_one_line(word1_1);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                ▽なにをしようかな。");
		System.out.println("                --------------------");
		System.out.println("                 【1】雑談する   【2】旅の評価を聞く   【3】会話をやめる");
		System.out.println("                  -----------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	static void sister_talk_no_word() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "？                                                           ";
		String word1_2 = "ごめんね。なんて言ったか、良く聞き取れなかったよ。           ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think1_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think2_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_grade_judge(Hero h,int turn) throws InterruptedException{
		int moneyJudge = 0;
		int itemPoint = 0;
		/*ここまでの成績を評価するにあたり、事前準備としてアイテム所持数を点数で評価する。
		  点数計算は、傷薬or銃が3点、煙幕が2点、ゴミが1点
		*/
		itemPoint += h.getItem_ointment()*3;
		itemPoint += h.getItem_gun()*3;
		itemPoint += h.getItem_smoke()*2;
		itemPoint += h.getItem_litter()*1;

		if(turn==9) {
			moneyJudge = 33;
		}else {
			moneyJudge = 66;
		}

		for(int i=0;i<31;i++) {
			System.out.println("");
		}

		if(h.getMoney()>=moneyJudge) {
			if(h.getHp()>=40) {
				sister_talk_grade_A();
			}else {
				sister_talk_grade_B();
			}
		}else if(h.getMoney()>=moneyJudge-10) {
			if(h.getHp()>=40) {
				if(itemPoint>=5) {
					sister_talk_grade_C();
				}else {
					sister_talk_grade_D();
				}
			}else {
					sister_talk_grade_E();
			}
		}else {
			if(h.getHp()>=40) {
				if(rdm.nextInt(2)>0) {
					sister_talk_grade_F();
				}else {
					sister_talk_grade_G();
				}
			}else {
				sister_talk_grade_H();
			}
		}
	}

	static void sister_talk_limit() throws InterruptedException{
		System.out.println("打ち止め会話：現在、実装中");
	}

	static void sister_talk_sp(Sister s,int turn) throws InterruptedException{
		if(turn==9) {
			sister_talk_sp_1();
			s.isCamp_1 = true;
		}else {
			sister_talk_sp_2();
			s.isCamp_2 = true;
		}
	}

	static void sister_talk_judge(Sister s,int turn) throws InterruptedException{
		System.out.println("現在、実装中");
		if(s.Conversation.size()>0){
			int num = rdm.nextInt(s.Conversation.size());

			if(rdm.nextInt(2)>0) {
				sister_talk_pre_1();
			}else {
				sister_talk_pre_2();
			}

			switch(s.Conversation.get(num)) {
			case 0:
				sister_talk_pattern_1();
				break;
			case 1:
				sister_talk_pattern_2();
				break;
			case 2:
				sister_talk_pattern_3();
				break;
			case 3:
				sister_talk_pattern_4();
				break;
			case 4:
				sister_talk_pattern_5();
				break;
			case 5:
				sister_talk_pattern_6();
				break;
				default :
			}
			s.Conversation.remove(num);
		}
	}

	static void sister_talk_pre_1() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "雑談？                                                       ";
		String word1_2 = "うーん、そうだねえ。                                         ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think4_two_line(word0_0,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_pre_2() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "おはなし？                                                   ";
		String word1_2 = "何かあるかなぁ。                                             ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think4_two_line(word0_0,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_sp_1() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "そういえばさ。                                               ";
		String word1_2 = "おにいちゃん、どうしてさっき笑ってたの？                     ";
		String word2_1 = "ほら、今朝「赤字だ！」って、私が言ってた時……。             ";
		String word3_1 = "……お父さんと、お母さんが                                   ";
		String word3_2 = "昔よく似た会話をしてたから、                                 ";
		String word3_3 = "昔よく似た会話をしてたから、懐かしくなったって？             ";
		String word4_1 = "へえ、そうなんだ。                                           ";
		String word4_2 = "お父さんと、……お母さんが。                                 ";
		String word5_1 = "……え、                                                     ";
		String word5_2 = "……え、特に怒った時は、お母さんそっくりだって？             ";
		String word6_1 = "……こら、おにいちゃん！！                                   ";
		String word6_2 = "……あはは。                                                 ";
		String word6_3 = "……あはは。どう、似てたかな？                               ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_talk_one_line(word2_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_one_line(word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word3_1,word3_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word4_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word4_1,word4_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_one_line(word5_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_talk_one_line(word5_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think4_two_line(word0_0,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.angry1_talk_two_line(word6_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.komari1_talk_two_line(word6_1,word6_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.komari1_talk_two_line(word6_1,word6_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);
	}

	static void sister_talk_sp_2() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "それにしてもさ、                                             ";
		String word1_2 = "お父さん今頃どこほっついてるんだろうね？                     ";
		String word2_1 = "まったく、月に一度の手紙だけ寄越せば                         ";
		String word2_2 = "何年も放ったらかせると思ったら大間違いだよ。                 ";
		String word3_1 = "よーし。こうなったら、おにいちゃん！                         ";
		String word3_2 = "色んなとこ冒険して、お父さん見つけだしちゃお！               ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.angry1_talk_two_line(word2_1,word2_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(4000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.play_the_fool2_two_line(word3_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word3_1,word3_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);
	}

	static void sister_talk_pattern_1() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "それじゃ、おにいちゃんに質問！                               ";
		String word1_2 = "今回みたいなサバイバル中って、お風呂はどうするの？           ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1500);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_two_line(word1_1,word1_2);
		for(int i=0;i<4;i++) {
			System.out.println("");
		}
		System.out.println("                  【1】折を見て水浴びしている     【2】 基本、入らない");
		for(int i=0;i<6;i++) {
			System.out.println("");
		}
		System.out.print("                   >>");
		int input_1 = scan.nextInt();

		if(input_1==1) {
			String word2_1_1 = "へえ。                                                       ";
			String word2_1_2 = "へえ。でもさ、それって色々危なくないの？                     ";
			String word2_1_3 = "河や湖の生き物とか、置きっぱなしの荷物とか。                 ";
			String word2_1_4 = "え？                                                         ";
			String word2_1_5 = "え？ 気を付けてるから、大丈夫だって？                        ";
			String word2_1_6 = "ほんとかな～。                                               ";
			Directing_Camp.blank_line_11();
			Directing_Sister_mini.smlie_talk_two_line(word2_1_1,word0_0);
			Directing_Camp.blank_line_11();
			Thread.sleep(1000);

			Directing_Camp.blank_line_11();
			Directing_Sister_mini.think3_two_line(word2_1_2,word0_0);
			Directing_Camp.blank_line_11();
			Thread.sleep(2000);

			Directing_Camp.blank_line_11();
			Directing_Sister_mini.smlie_talk_two_line(word2_1_2,word2_1_3);
			Directing_Camp.blank_line_11();
			Thread.sleep(2000);

			Directing_Camp.blank_line_11();
			Directing_Sister_mini.smile_two_line(word0_0,word0_0);
			Directing_Camp.blank_line_11();
			Thread.sleep(1500);


			Directing_Camp.blank_line_11();
			Directing_Sister_mini.think3_two_line(word2_1_5,word0_0);
			Directing_Camp.blank_line_11();
			Thread.sleep(2500);

			Directing_Camp.blank_line_11();
			Directing_Sister_mini.akire1_talk_two_line(word2_1_5,word2_1_6);
			Directing_Camp.blank_line_11();
			Thread.sleep(2000);
		}else {
			String word2_2_1 = "まあ、そりゃそっか。                                         ";
			String word2_2_2 = "沸かす湯も風呂桶も、こんな密林にないわけだしね。             ";
			String word2_2_3 = "それじゃ、歯はどうしてるの？                                 ";

			Directing_Camp.blank_line_11();
			Directing_Sister_mini.smlie_talk_two_line(word2_2_1,word0_0);
			Directing_Camp.blank_line_11();
			Thread.sleep(1500);

			Directing_Camp.blank_line_11();
			Directing_Sister_mini.smlie_talk_two_line(word2_2_1,word2_2_2);
			Directing_Camp.blank_line_11();
			Thread.sleep(2500);

			Directing_Camp.blank_line_11();
			Directing_Sister_mini.think4_two_line(word0_0,word0_0);
			Directing_Camp.blank_line_11();
			Thread.sleep(2000);

			Directing_Camp.blank_line_11();
			Directing_Sister_mini.smile_talk_one_line(word2_2_3);
			Directing_Camp.blank_line_11();
			Thread.sleep(2000);

			Directing_Camp.blank_line_11();
			Directing_Sister_mini.smile_one_line(word2_2_3);
			for(int i=0;i<4;i++) {
				System.out.println("");
			}
			System.out.println("                  【1】携帯歯磨きを持ってきてる     【2】 磨かない！");
			for(int i=0;i<6;i++) {
				System.out.println("");
			}
			System.out.print("                   >>");

			int input_2 = scan.nextInt();

			if(input_2 == 1) {
				String word3_1_1 = "そっちは用意周到だね。                                       ";
				String word3_1_2 = "やっぱり、口の中が綺麗じゃないと気持ち悪いもんね。           ";
				String word3_1_3 = "……え、違う？                                               ";
				String word3_1_4 = "白い歯じゃないと、女の子にモテないからって？                 ";
				String word3_1_5 = "……スケベ。                                                 ";

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.smlie_talk_two_line(word3_1_1,word0_0);
				Directing_Camp.blank_line_11();
				Thread.sleep(1500);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.smlie_talk_two_line(word3_1_1,word3_1_2);
				Directing_Camp.blank_line_11();
				Thread.sleep(2500);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.smile_two_line(word0_0,word0_0);
				Directing_Camp.blank_line_11();
				Thread.sleep(1500);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.think2_two_line(word3_1_3,word0_0);
				Directing_Camp.blank_line_11();
				Thread.sleep(2000);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.think3_two_line(word3_1_3,word3_1_4);
				Directing_Camp.blank_line_11();
				Thread.sleep(2500);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.akire2_two_line(word0_0,word0_0);
				Directing_Camp.blank_line_11();
				Thread.sleep(2000);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.akire1_talk_one_line(word3_1_5);
				Directing_Camp.blank_line_11();
				Thread.sleep(2000);

			}else {
				String word3_2_1 = "え！？                                                       ";
				String word3_2_2 = "じゃ、                                                       ";
				String word3_2_3 = "じゃ、じゃあ、                                               ";
				String word3_2_4 = "じゃ、じゃあ、着替えは……。                                 ";

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.surprise1_talk_two_line(word3_2_1,word0_0);
				Directing_Camp.blank_line_11();
				Thread.sleep(2000);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.surprise1_talk_two_line(word3_2_1,word3_2_2);
				Directing_Camp.blank_line_11();
				Thread.sleep(1000);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.surprise1_talk_two_line(word3_2_1,word3_2_3);
				Directing_Camp.blank_line_11();
				Thread.sleep(1500);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.surprise1_talk_two_line(word3_2_1,word3_2_4);
				Directing_Camp.blank_line_11();
				Thread.sleep(1500);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.surprise1_talk_two_line(word3_2_1,word3_2_4);
				for(int i=0;i<4;i++) {
					System.out.println("");
				}
				System.out.println("                  【1】しない！");
				for(int i=0;i<6;i++) {
					System.out.println("");
				}
				System.out.print("                   >>");

				int input_3 = scan.nextInt();

				String word4_1 = "…………。                                                   ";
				String word4_2 = "体キレイにするまで、私に近づかないでね。                     ";

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.surprise2_talk_two_line(word0_0,word0_0);
				Directing_Camp.blank_line_11();
				Thread.sleep(3500);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.akire2_two_line(word4_1,word0_0);
				Directing_Camp.blank_line_11();
				Thread.sleep(2000);

				Directing_Camp.blank_line_11();
				Directing_Sister_mini.akire1_talk_two_line(word4_1,word4_2);
				Directing_Camp.blank_line_11();
				Thread.sleep(2500);
			}
		}
	}

	static void sister_talk_pattern_2() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "……ん、なに？私が不自由してないか心配？                     ";
		String word1_2 = "あはは、それなら安心してよ。                                 ";
		String word2_1 = "ここのキャンプ地、冒険者目当ての                             ";
		String word2_2 = "お店がたくさんあるから衣食住には困らないし、                 ";
		String word3_1 = "荒くれが多い分、自治意識が高くて                             ";
		String word3_2 = "狼藉を働こう物ならすぐに追い出されちゃうんだ。               ";
		String word4_1 = "だから、かなり安全。                                         ";
		String word4_2 = "……                                                         ";
		String word4_3 = "……まあ、お金が続くうちは、なんだけどね。                   ";
		String word5_1 = "だから、早く戻ってくること！                                 ";
		String word5_2 = "いいね、おにいちゃん！                                       ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_talk_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word2_1,word2_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(4000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word3_1,word3_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_talk_one_line(word4_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_one_line(word4_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_one_line(word4_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(3500);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word5_1,word5_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

	}

	static void sister_talk_pattern_3() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "そういえばさ、おにいちゃんって                               ";
		String word1_2 = "チームを組んだりはしないの？                                 ";
		String word2_1 = "ほら、大概、こんな場所を探検するときって                     ";
		String word2_2 = "みんなチームを組んで行動するじゃん。                         ";
		String word3_1 = "……人付き合いが煩わしいって？                               ";
		String word3_2 = "おにいちゃん、無口だもんねぇ。                               ";
		String word4_1 = "……ん、                                                     ";
		String word4_2 = "……ん、それに？                                             ";
		String word4_3 = "何より、人を雇うお金持ってないって？                         ";
		String word5_1 = "ははは、そりゃそうだ。                                       ";
		String word5_2 = "…………                                                     ";
		String word5_3 = "…………はあ～。                                             ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word2_1,word2_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think4_two_line(word0_0,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word3_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki2_talk_two_line(word3_1,word3_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_two_line(word4_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word4_2,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word4_2,word4_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_talk_two_line(word5_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_two_line(word5_1,word5_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3500);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_two_line(word5_1,word5_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_pattern_4() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "……え、私に質問？                                           ";
		String word1_2 = "将来、何したいかって？                                       ";
		String word2_1 = "んーと、                                                     ";
		String word2_2 = "んーと、……女優さんかなぁ。                                 ";
		String word2_3 = "ほら、私って映画とか好きじゃん？                             ";
		String word3_1 = "だから、銀幕の上を自由に駆け回る日々……                     ";
		String word3_2 = "なんてのは、憧れちゃうなぁ。                                 ";
		String word4_1 = "ある時は麗しい姫君として粛々と                               ";
		String word4_2 = "また、ある時は凄腕のガンマンになってバンバンと……。         ";
		String word5_1 = "……はは、なんつって。冗談冗談！。                           ";
		String word6_1 = "…………あの、本気にしないで。おにいちゃん……。             ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think1_two_line(word2_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word2_2,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word2_2,word2_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word3_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_talk_two_line(word3_1,word3_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.play_the_fool1_two_line(word4_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.play_the_fool2_two_line(word4_1,word4_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_talk_one_line(word5_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_talk_one_line(word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_one_line(word6_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);
	}

	static void sister_talk_pattern_5() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "そう言えばさ、ここって電波が悪いよね                         ";
		String word1_2 = "なんでか知ってる？                                           ";
		String word2_1 = "ふっふっふ、それはね                                         ";
		String word2_2 = "ここが、「出るから」なんだって。                             ";
		String word3_1 = "秘境って元々、一大国家の首都だったんだけど、                 ";
		String word3_2 = "同盟国から一斉に侵攻されて滅びたの。                         ";
		String word3_3 = "同盟国から一斉に侵攻されて滅びたの。……最後は酷いもんでね。 ";
		String word4_1 = "そんなもんで、成仏できない魂がその場に留まってて、           ";
		String word4_2 = "電波に干渉してるんだとか。                                   ";
		String word5_1 = "怖い話だよねえ。                                             ";
		String word5_2 = "怖い話だよねえ。お兄ちゃんの隣りには                         ";
		String word5_3 = "それはもう、強い怨みを持った亡霊がうじゃうじゃと……。       ";
		String word6_1 = "……え、                                                     ";
		String word6_2 = "……え、それならよく見るって？                               ";
		String word7_1 = "な、                                                         ";
		String word7_2 = "な、なんなら、                                               ";
		String word7_3 = "な、なんなら、今も近くを漂って……？                         ";
		String word8_1 = "ぁ、ぁわわ……。                                             ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_two_line(word2_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire2_two_line(word0_0,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_one_line(word2_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word3_1,word3_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word3_1,word3_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word4_1,word4_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_two_line(word5_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_two_line(word5_2,word5_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_talk_two_line(word6_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki1_talk_two_line(word6_1,word6_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.nonki2_talk_one_line(word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_one_line(word7_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_one_line(word7_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_one_line(word7_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise2_talk_one_line(word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(3000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise2_talk_one_line(word8_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(2500);
	}

	static void sister_talk_pattern_6() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "じゃ、おにいちゃんに質問！                                   ";
		String word1_2 = "今みたいなサバイバル中って、ご飯どうしてるの？               ";
		String word2_0_1 = "……                                                         ";
		String word2_0_2 = "……ふむふむ。                                               ";
		String word2_1 = "……ふむふむ。やっぱ基本は、携帯食料かぁ。                   ";
		String word2_2 = "じゃあ、携帯食料がなくなった時は？                           ";
		String word3_0 = "……                                                         ";
		String word3_1 = "……へえ、その場で調達するんだ。                             ";
		String word3_2 = "キノコや山菜、                                               ";
		String word3_3 = "キノコや山菜、果物に、                                       ";
		String word3_4 = "キノコや山菜、果物に、虫。                                   ";
		String word4_1_1 = "…                                                           ";
		String word4_1_2 = "……                                                         ";
		String word4_1_3 = "………                                                       ";
		String word4_1 = "…………虫？                                                 ";
		String word5_1 = "お、                                                         ";
		String word5_2 = "お、おにいちゃん、                                           ";
		String word5_3 = "お、おにいちゃん、虫なんて食べてる…の？                     ";
		String word6_1 = "イケる虫は、結構イケる……？                                 ";
		String word6_2 = "おみやげに、何匹か取って…帰……。                           ";
		String word7_1 = "……い、                                                     ";
		String word7_2 = "……い、いらない！                                           ";
		String word7_3 = "……い、いらない！いらない！！                               ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think4_two_line(word2_0_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think4_two_line(word2_0_2,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word2_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word2_1,word2_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_two_line(word3_0,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word3_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word3_1,word3_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word3_1,word3_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_two_line(word3_1,word3_4);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smile_one_line(word4_1_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.normal_one_line(word4_1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think4_one_line(word4_1_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(1500);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_one_line(word4_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_one_line(word5_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_one_line(word5_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_one_line(word5_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_two_line(word6_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_two_line(word6_1,word6_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise2_talk_one_line(word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise2_talk_one_line(word7_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(500);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise2_talk_one_line(word7_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(500);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise2_talk_one_line(word7_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_grade_A() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "…………                                                     ";
		String word1_2 = "…………ん？                                                 ";
		String word1_3 = "……んん！？                                                 ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_two_line(word1_2,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look2_sheet_two_line(word1_2,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look2_sheet_two_line(word1_2,word1_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_one_line(word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(500);

		String word2_1 = "し、                                                         ";
		String word2_2 = "し、信じられない。                                           ";
		String word2_3 = "し、信じられない。 順調も順調だよ！                          ";
		String word2_4 = "どうしちゃったの、おにいちゃん！？                           ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_two_line(word0_0,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1500);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_two_line(word2_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise1_talk_two_line(word2_2,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise2_talk_two_line(word2_3,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(1000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.surprise2_talk_two_line(word2_3,word2_4);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_grade_B() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "珍しく、黒字のペースではあるけど、                           ";
		String word1_2 = "……ちょっと、ボロボロだね。                                 ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		String word2_1 = "予算はかかるかもだけど、                                     ";
		String word2_2 = "ここはアイテムを上手く使って、打開しよう！                   ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word2_1,word2_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_grade_C() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "結構、いいペースだね。                                       ";
		String word1_2 = "アイテムも潤沢だし、もっと攻めていいかも！                   ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

	}

	static void sister_talk_grade_D() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "うん、中々いい感じなんじゃないかな？                         ";
		String word1_2 = "今のペースを維持しよう！                                     ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_grade_E() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "うーん、お金の集まりは悪くないけど                           ";
		String word1_2 = "だいぶ傷ついてるみたいだね……。                             ";
		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		String word2_1 = "ここはひとつ、安全な道で                                     ";
		String word2_2 = "体調を整えてみるのがいいかも。                               ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word2_1,word2_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_grade_F() throws InterruptedException{
		String word1_1 = "むむ、あんまり稼げてないみたいだね。                         ";
		String word2_1 = "幸い、体調は万全みたいだから                                 ";
		String word2_2 = "少し難しいルートを進んでみていいんじゃないかな。             ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_one_line(word1_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word2_1,word2_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_grade_G() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "うーん、ちょっと進捗芳しくないねぇ。                         ";
		String word1_2 = "……このままじゃ、借金のカタに身柄取られちゃうよ？           ";
		String word2_1 = "ちょっと攻めたルート取りでもいいんじゃないかな？             ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_two_line(word1_1,word0_0);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_two_line(word1_1,word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.think3_one_line(word2_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);
	}

	static void sister_talk_grade_H() throws InterruptedException{
		String word0_0 = "                                                             ";
		String word1_1 = "……                                                         ";
		String word1_2 = "……い、                                                     ";
		String word1_3 = "……い、色々とボロボロだね……。                             ";
		String word2_1 = "とはいえ、命あっての物種なんだから                           ";
		String word2_2 = "まずは、安全な道で体調を整えよう！                           ";

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look1_sheet_one_line(word1_1);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.look2_sheet_one_line(word1_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2000);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.akire1_talk_one_line(word1_3);
		Directing_Camp.blank_line_11();
		Thread.sleep(2500);

		Directing_Camp.blank_line_11();
		Directing_Sister_mini.smlie_talk_two_line(word2_1,word2_2);
		Directing_Camp.blank_line_11();
		Thread.sleep(2500);
	}

	static void sn() throws InterruptedException{

		System.out.println("                                                                                              ______________    ");
		System.out.println("                                                                                             |              |   ");
		System.out.println("                 _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|");
		System.out.println("                |                                                                     |      |,\" ノノ乀 ,ヽ |  ");
		System.out.println("                |                                                                     |      |(ノ。  。ノノ |   ");
		System.out.println("                |    おにいちゃん、詐欺師でもやってる方が儲かるんじゃないの？         |      | (-  _  -[]   |   ");
		System.out.println("                |                                                                      ＞    |   ――〃 ´  |   ");
		System.out.println("                |_____________________________________________________________________|      |____〃_〃ヽ___|   ");
		System.out.println("                                                                                             |______________|   ");


		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | 補       |                                                                                                      | |");
		System.out.println("    |   給     |  購  入  し  た  い  ア  イ  テ  ム  の  番  号  を  入  力  し  て  く  だ  さ  い  。              | | ");
		System.out.println("    |     物   |______________________________________________________________________________________________________| |");
		System.out.println("    |       資 |                                                                                                      | |");
		System.out.println("    |__________|                                                                                                      | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                       ______________          | | ");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                       ______________          | | ");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                       ______________          | | ");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                       ______________          | |  ");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |                                                                                      |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |                                                                                      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |                                                                                      |(ノ。  。ノノ |         | |");
		System.out.println("    | |                                                                                      | (-  _  -[]   |         | |");
		System.out.println("    | |                                                                                      |   ――〃 ´  |         | | ");
		System.out.println("    | |                                                                                      |____〃_〃ヽ___|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");

		System.out.println("     ___________________________________________________________________________________________________________________");
		System.out.println("    |          |______________________________________________________________________________________________________  | ");
		System.out.println("    | キ       |                                                                                                      | |");
		System.out.println("    |   ャ     |  実  行  し  た  い  行  動  の  番  号  を  入  力  し  て  く  だ  さ  い  。                      | |");
		System.out.println("    |     ン   |______________________________________________________________________________________________________| |");
		System.out.println("    |       プ |  .MgMN;          .MM&MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM]           MMMe              | |");
		System.out.println("    |__________|  .MgMN;          .MM&MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM]           MMMe              | |");
		System.out.println("    | |           .MMMMd       .#`.!7\"S; ?MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM'   ,\\     RMMMMM              | |");
		System.out.println("    | |           .MMMMd    ..gMb.. ..,N. .MMMMMMM#\"\"\"\"=~~~   ~~~77\"\"\"WMMMMMMMMMMMMMMM]          .#MMMMM              | |");
		System.out.println("    | |           .MMMMF    M#\".T\"HMMY\"!.M,?MMM\"`             `         .77W\"W\"WMMMMMM            (MMMMM              | |");
		System.out.println("    | |           JMMMMF    ?Ma....  .dm.@`.#^         `                         .MMMM      .\\    .MMMMM              | |");
		System.out.println("    | |          .#MMMM^     ,MM#MMMMMMP!          `       `     `              ..NMN,.    (8     .MMMMM              | |");
		System.out.println("    | |          .MMMMM      ..MNg..JdMN,       `     `                `     .M\"\"=?Ha.TNa,.       dMMMMM.             | |");
		System.out.println("    | |          ,MMMMM     MM\" ,MMN.(@,b                .MM    `  `       .d'      T[  WMM ux    dMMMMM]             | |");
		System.out.println("    | |          ,MMMMM     MMh.  (Tm(b(N,      `  `M M,MH7MHxM.      `    .F       .b...dM| d    dMMMMMN             | |");
		System.out.println("    | |          .MMMMM     ,WMN    JNMJd#     .    MMM\"^ .   MM           gF     ..D'   -NN.     .MMMMMN             | |");
		System.out.println("    | |          .MMMMM     ..MMmMN,  .dMNJTN,      MM ,M M W M M         dYMNb&JY^J`    -M#N,      (MMMM,            | |");
		System.out.println("    | |          dMMMMF    (@(M#TB?HNd5. ?MMHM,.   MM  M.   ,M  NM   `   .M\"~`     b .MMM,MN,F       JMMMM]           | |");
		System.out.println("    | |          MMMMM_   (#MMY\"Y\"4M#TNJ\"WN(d@NJdNm-M  M   ..M. MMM      .]        H M_  #(MP@       .ggJMMN          | |");
		System.out.println("    | |          MMMMM|  dMMM#     ..gMMMMB'      d.QMM MMMMMM]_?M     `  ?Hg,     ,D ?m.Jh(MNMMMa-,..MM#MMHM}        | |");
		System.out.println("    | |          .MMMM@J-..MMMN...+MMMD??`    `    JN..JMNdMg,(Wr?\"\"^    .  ?MMNg+dMMMMTHB\"\"^  .TH\"TMMD`              | |");
		System.out.println("    | |         (MMY\"?\"Y#\"\"\".???7!          `       `      _???`   ..mT\"Th&u&..     ???             `                 | |");
		System.out.println("    | |         j.....QQJJj,.                    ` `            .d\"`         .dMB{         .. .,..qe..,               | |");
		System.out.println("    | |          (MMNMMMMMMMMMMNa..                        ..(M9`?\"\"\"\"    ..#\"`    ... ..gMMMMMMMWNMM#\"               | |");
		System.out.println("    | |           _?T\"MMMMMMMMMMMMNNggJgggJ..                -?\"\"BN,..g7\"H\"` ...gMMMMMMMMMMMMMMMWT\"`                  | |");
		System.out.println("    | |                  ?WMMMMMMMMMMMMMMMMMMMMMMMMMMNggJ..........++++gMMMMMMMMMMMMMMMMMM#9\"?!                       | |");
		System.out.println("    | |---------------------------------------------------------------------------------------------------------------| |");
		System.out.println("    | |             【1】アイテム購入   【2】リリーと会話   【3】途中経過確認   【4】寝る (次のターンへ)              | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| |");
		System.out.println("    |___________________________________________________________________________________________________________________|");
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
		System.out.println("                                         _______________________________________");
		System.out.println("                                        |          |__________________________  | ");
		System.out.println("                                        | 補       |                          | |");
		System.out.println("                                        |   給     |__________________________| | ");
		System.out.println("                                        |     物   |                          | |");
		System.out.println("                                        |       資 |__________________________| |");
		System.out.println("                                        |__________|____________________________|");
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
}
