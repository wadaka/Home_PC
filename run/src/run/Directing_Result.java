package run;

public class Directing_Result {
	public static void showResult(int turn,int score,Hero h) throws InterruptedException {

		String player_name = h.getName();
		int num = player_name.length();

		for(int i=0;i<6-num;i++) {
			player_name += "  ";
		}

		result_one();
		Thread.sleep(2000);
		line_32();
		result_two(turn,score,h,player_name);
		System.out.println("");
		Thread.sleep(4000);
		line_32();
		result_two(turn,score,h,player_name);

	}

	public static void line_32() {
		for(int i=0;i<32;i++) {
			System.out.println("");
		}
	}

	public static void result_one() {
		result_up_banner();
		for(int i=0;i<28;i++) {
			System.out.println("");
		}
		result_down_banner();
		System.out.println("");
	}

	public static void result_two(int turn,int score,Hero h,String name) {
		result_up_banner();
		result_player_data(turn,score,h,name);
		for(int i=0;i<14;i++) {
			System.out.println("");
		}
		result_down_banner();
	}

	public static void result_up_banner() {
		System.out.println("");
		System.out.println("                                 今回の30歩 ");
		System.out.println("----------------------------------------------------------------------------");
	}

	public static void result_down_banner() {
		System.out.println("----------------------------------------------------------------------------");
	}

	public static void result_player_data(int turn,int score,Hero h,String name) {
		System.out.println("");
		System.out.println("      ________________________________________________________________");
		System.out.println("     |                                                                |");
		System.out.printf("     |  %s    スコア: %4d                                  |\n",name,score);
		System.out.println("     |________________________________________________________________|");
		System.out.println("     |                                                                |");
		System.out.println("     |  冒険の結果                                                    |");
		System.out.println("     |  ----------                                                    |");
		System.out.printf("     |    %s    |\n",Data_Result_Text.result_text_creator(turn,h.getEvent()));
		System.out.println("     |                                                                |");
		System.out.println("     |  最終ステータス                                                |");
		System.out.println("     |  --------------                                                |");
		System.out.printf("     |    HP:%3d/100  財宝:%3d/100    傷薬:%d  銃:%d  煙幕:%d  ゴミ:%d    |\n",h.getHp(),h.getMoney(),h.getItem_ointment(),h.getItem_gun(),h.getItem_smoke(),h.getItem_litter());
		System.out.println("     |                                                                |");
		System.out.println("     |________________________________________________________________|");
	}
}
