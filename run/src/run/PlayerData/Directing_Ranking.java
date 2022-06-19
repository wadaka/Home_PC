package run.PlayerData;

import java.util.List;

import run.Data_Result_Text;
import run.Tools;

public class Directing_Ranking {
	public static void show_Ranking(List<Ranking> ranking_data) throws Exception {

		show_Ranking_before();

		char rank = '１';

		System.out.println("");
		System.out.println("                                               ________________");
		System.out.println("■■■■                                   ■□                □■                                   ■■■■");
		System.out.println("■□□■ ■■■■■■■■■■■■■■■■  ■□   ランキング   □■  ■■■■■■■■■■■■■■■■ ■□□■");
		System.out.println("■□■■ □□□□□□□□□□□□□□□□  ■□________________□■  □□□□□□□□□□□□□□□□ ■■□■");
		System.out.println("■□■                                                                                                  ■□■");
		System.out.println("■□■   +------------------------------------------------------------------------------------------+   ■□■");
		System.out.println("■□■   | 順位 | 名前         | スコア | 冒険の結果                                                |   ■□■");
		System.out.println("■□■   +------------------------------------------------------------------------------------------+   ■□■");

		for(int i=0;i<10;i++) {
			System.out.printf("■□■   |  %s  | ",i==9 ? "10":rank);
			if(ranking_data.get(i).getPlay_count()==0) {
				System.out.println("------------ |  ----  | --------------------------------------------------------  |   ■□■");
			}else {
				String player_name = ranking_data.get(i).getName();
				int num = player_name.length();
				for(int j=0;j<6-num;j++) {
					player_name += "  ";
				}
				String message = Data_Result_Text.result_text_creator(ranking_data.get(i).getTurn(), ranking_data.get(i).getSummry());
				System.out.printf("%s |  %4d  | %s  |   ■□■%n",
						player_name,Integer.parseInt(ranking_data.get(i).getScore()),message);
			}
			System.out.println("■□■   +------------------------------------------------------------------------------------------+   ■□■");
			rank++;
		}

		System.out.println("■□■                              ______________________________________                              ■□■");
		System.out.println("■□■■ ■■■■■■■■■■■■■                                        ■■■■■■■■■■■■■ ■■□■");
		System.out.println("■□□■ □□□□□□□□□□□□   --エンターキー入力で、タイトルへ戻る--   □□□□□□□□□□□□ ■□□■");
		System.out.println("■■■■ ■■■■■■■■■■■■■ ______________________________________ ■■■■■■■■■■■■■ ■■■■");
	}

	public static void show_Ranking_before() throws Exception {
		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		Thread.sleep(1500);
		/*
		String name_00_1 = "Ranking/s_00_1";
		Tools.Graphic_Creator(name_00_1);
		Thread.sleep(125);
		String name_00_2 = "Ranking/s_00_2";
		Tools.Graphic_Creator(name_00_2);
		Thread.sleep(125);
		String name_00_3 = "Ranking/s_00_3";
		Tools.Graphic_Creator(name_00_3);
		Thread.sleep(125);
		String name_00_4 = "Ranking/s_00_4";
		Tools.Graphic_Creator(name_00_4);
		Thread.sleep(125);
		String name_00_5 = "Ranking/s_00_5";
		Tools.Graphic_Creator(name_00_5);
		Thread.sleep(125);
		String name_00_6 = "Ranking/s_00_6";
		Tools.Graphic_Creator(name_00_6);
		Thread.sleep(125);
		String name_00_7 = "Ranking/s_00_7";
		Tools.Graphic_Creator(name_00_7);
		Thread.sleep(125);
		String name_00_8 = "Ranking/s_00_8";
		Tools.Graphic_Creator(name_00_8);
		Thread.sleep(125);
		String name_00_9 = "Ranking/s_00_9";
		Tools.Graphic_Creator(name_00_9);
		Thread.sleep(75);
		*/

		/*String name_01 = "Ranking/s_01";
		Tools.Graphic_Creator(name_01);
		Thread.sleep(500);
		String name_02 = "Ranking/s_02";
		Tools.Graphic_Creator(name_02);
		Thread.sleep(125);
		String name_03 = "Ranking/s_03";
		Tools.Graphic_Creator(name_03);
		Thread.sleep(75);
		String name_04 = "Ranking/s_04";
		Tools.Graphic_Creator(name_04);
		Thread.sleep(75);
		String name_05 = "Ranking/s_05";
		Tools.Graphic_Creator(name_05);
		Thread.sleep(75);
		String name_06 = "Ranking/s_06";
		Tools.Graphic_Creator(name_06);
		Thread.sleep(573);*/

		String name_05_1 = "Ranking/s_05_1";
		Tools.Graphic_Creator(name_05_1);
		Thread.sleep(75);

		String name_05_2 = "Ranking/s_05_2";
		Tools.Graphic_Creator(name_05_2);
		Thread.sleep(75);

		String name_05_3 = "Ranking/s_05_3";
		Tools.Graphic_Creator(name_05_3);
		Thread.sleep(75);

		String name_05_4 = "Ranking/s_05_4";
		Tools.Graphic_Creator(name_05_4);
		Thread.sleep(75);

		String name_05_5 = "Ranking/s_05_5";
		Tools.Graphic_Creator(name_05_5);
		Thread.sleep(250);

		String name_06_1 = "Ranking/s_06_1";
		Tools.Graphic_Creator(name_06_1);
		Thread.sleep(75);

		String name_06_2 = "Ranking/s_06_2";
		Tools.Graphic_Creator(name_06_2);
		Thread.sleep(75);

		String name_06_3 = "Ranking/s_06_3";
		Tools.Graphic_Creator(name_06_3);
		Thread.sleep(75);

		String name_06_4 = "Ranking/s_06_4";
		Tools.Graphic_Creator(name_06_4);
		Thread.sleep(75);

		String name_06_5 = "Ranking/s_06_5";
		Tools.Graphic_Creator(name_06_5);
		Thread.sleep(75);

		String name_07 = "Ranking/s_07";
		Tools.Graphic_Creator(name_07);
		Thread.sleep(75);
		String name_08 = "Ranking/s_08";
		Tools.Graphic_Creator(name_08);
		Thread.sleep(75);
		String name_09 = "Ranking/s_09";
		Tools.Graphic_Creator(name_09);
		Thread.sleep(75);
		String name_10 = "Ranking/s_10";
		Tools.Graphic_Creator(name_10);
		Thread.sleep(1250);
	}

	public static void show_Ranking_after() throws Exception {
		String name_10 = "Ranking/s_10";
		Tools.Graphic_Creator(name_10);
		Thread.sleep(1250);
		String name_09 = "Ranking/s_09";
		Tools.Graphic_Creator(name_09);
		Thread.sleep(75);
		String name_08 = "Ranking/s_08";
		Tools.Graphic_Creator(name_08);
		Thread.sleep(75);
		String name_07 = "Ranking/s_07";
		Tools.Graphic_Creator(name_07);
		Thread.sleep(75);
		String name_06 = "Ranking/s_06";
		Tools.Graphic_Creator(name_06);
		Thread.sleep(573);
		String name_05 = "Ranking/s_05";
		Tools.Graphic_Creator(name_05);
		Thread.sleep(75);
		String name_04 = "Ranking/s_04";
		Tools.Graphic_Creator(name_04);
		Thread.sleep(75);
		String name_03 = "Ranking/s_03";
		Tools.Graphic_Creator(name_03);
		Thread.sleep(75);
		String name_01 = "Ranking/s_01";
		Tools.Graphic_Creator(name_01);
		Thread.sleep(500);

		String name_00_9 = "Ranking/s_00_9";
		Tools.Graphic_Creator(name_00_9);
		Thread.sleep(125);
		String name_00_8 = "Ranking/s_00_8";
		Tools.Graphic_Creator(name_00_8);
		Thread.sleep(125);
		String name_00_7 = "Ranking/s_00_7";
		Tools.Graphic_Creator(name_00_7);
		Thread.sleep(125);
		String name_00_6 = "Ranking/s_00_6";
		Tools.Graphic_Creator(name_00_6);
		Thread.sleep(125);
		String name_00_5 = "Ranking/s_00_5";
		Tools.Graphic_Creator(name_00_5);
		Thread.sleep(125);
		String name_00_4 = "Ranking/s_00_4";
		Tools.Graphic_Creator(name_00_4);
		Thread.sleep(125);
		String name_00_3 = "Ranking/s_00_3";
		Tools.Graphic_Creator(name_00_3);
		Thread.sleep(125);
		String name_00_2 = "Ranking/s_00_2";
		Tools.Graphic_Creator(name_00_2);
		Thread.sleep(125);
		String name_00_1 = "Ranking/s_00_1";
		Tools.Graphic_Creator(name_00_1);
		Thread.sleep(125);
		for(int i=0;i<32;i++) {
			System.out.println("");
		}
		Thread.sleep(1500);
	}
}
