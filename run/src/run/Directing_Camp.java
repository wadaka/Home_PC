package run;

public class Directing_Camp {
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
	
	static void supply_sister(Hero h) throws InterruptedException{
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
		System.out.println("    | |         |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |         | |");
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
	
	static void supply_no_stock_sister() throws InterruptedException{
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
		System.out.println("    | |         |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |         | |");
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
	}
	
	static void supply_check_sister(String item) throws InterruptedException{
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
		System.out.println("    | |         |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |         | |");
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
	
	static void supply_check_ok_sister() throws InterruptedException{
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
		System.out.println("    | |         |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |         | |");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |    OK！発注したよ！                                                 |      |(ノ。  。 ノノ|         | |%n");
		System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
		System.out.println("    | |         |    到着を心待ちにしててね、おにいちゃん！                           |      |   ――〃 ´  |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
	}
	
	static void supply_check_no_sister(int no_count) throws InterruptedException{
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
		System.out.println("    | |         |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |         | |");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		
		
		switch(no_count) {
		case 1:
			System.out.println("    | |                                                                                       ______________          | |");
			System.out.println("    | |                                                                                      |              |         | | ");
			System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
			System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
			System.out.println("    | |         |    ありゃ、やめちゃうんだね。                                       |      |(ノ。  。 ノノ|         | |%n");
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
			System.out.println("    | |         |    そっか、やめちゃうんだね。                                       |      |(ノ。  。 ノノ|         | |%n");
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
			System.out.println("    | |         |    ま、またやめるの……？                                           |      |(ノ。  。 ノノ|         | |%n");
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
			System.out.println("    | |         |    ……結構、優柔不断だよね。                                       |      |(ノт т  ノノ|         | |%n");
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
			System.out.println("    | |         |    ……まあ、命に関わる事だしね。                                   |      |(ノт т  ノノ|         | |%n");
			System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
			System.out.println("    | |         |    慎重に選ぶといいよ、おにいちゃん……。                           |      |   ――〃 ´  |         | | ");
			System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
			System.out.println("    | |                                                                                      |______________|         | |");
			System.out.println("    | |_______________________________________________________________________________________________________________| | ");
			System.out.println("    |___________________________________________________________________________________________________________________|  ");
			Thread.sleep(2000);
		}
		
	}
	
	static void supply_check_no_money_sister() throws InterruptedException{
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
		System.out.println("    | |         |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |         | |");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |                                                                     |      |(ノт  т ノノ|         | |%n");
		System.out.println("    | |         |    お金足りないよ、おにいちゃん……。                                ＞    | (- ワ  -[]   |         | |");
		System.out.println("    | |         |                                                                     |      |   ――〃 ´  |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
		Thread.sleep(2000);
	}
	
	static void supply_check_no_3_sister(String item) throws InterruptedException{
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
		System.out.println("    | |         |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |   |          在庫 ( ) |         | |");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |  ");
		System.out.println("    | |         |___________________|   |___________________|   |___________________|   |___________________|         | |");
		System.out.println("    | |                                                                                       ______________          | |");
		System.out.println("    | |                                                                                      |              |         | | ");
		System.out.println("    | |          _____________________________________________________________________       |  〃\"\"\"-＝ヽ⌒|         | |");
		System.out.println("    | |         |                                                                     |      |,\" ノノ乀 ,ヽ |         | |");
		System.out.println("    | |         |    ま、またやめるの……？                                           |      |(ノ。  。 ノノ|         | |%n");
		System.out.println("    | |         |                                                                      ＞    | (- ワ  -[]   |         | |");
		System.out.println("    | |         |    了解、おにいちゃん！                                             |      |   ――〃 ´  |         | | ");
		System.out.println("    | |         |_____________________________________________________________________|      |____〃_〃ヽ___|         | |");
		System.out.println("    | |                                                                                      |______________|         | |");
		System.out.println("    | |_______________________________________________________________________________________________________________| | ");
		System.out.println("    |___________________________________________________________________________________________________________________|  ");
	}
	
	static void blank_line_11() {
		for(int i=0;i<11;i++) {
			System.out.println("");
		}
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