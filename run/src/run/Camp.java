package run;

import java.util.Random;
import java.util.Scanner;

public class Camp {
	final static Scanner sc = new Scanner(System.in);
	final static Random rdm = new Random();
	static void start_Camp(int turn,Hero h,int[] ba) throws InterruptedException{
		try {
			Directing_Camp.show_Intermediate_Grade(turn,h,ba);
			System.out.println();
			System.out.println("      ※エンターキー入力で次へ進みます。");
			System.out.println();
			sc.nextLine();
			String Click = sc.nextLine();
			while(true) {
				Directing_Camp.showMain();
				System.out.print("                      >>");
				int input = sc.nextInt();
				if(input<1 || input>4) {
					System.out.println("                     正しい番号を入力してください！");
					continue;
				}
				
				switch(input) {
				case 1:
					supplyShop(h);
					break;
				case 2:
					System.out.println("      ");
					break;
				case 3:
					Directing_Camp.show_Intermediate_Grade(turn,h,ba);
					System.out.println();
					System.out.println("      ※エンターキー入力で、キャンプに戻ります。");
					System.out.println();
					sc.nextLine();
					String nextClick = sc.nextLine();
					break;
				default:
				}
				if(input ==4) break;
			}
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	static void supplyShop(Hero h) throws InterruptedException{
		
		Directing_Camp.connect();
		
		Directing_Camp.pre_supply_first();
		Directing_Camp.supply_start_sister();
		Directing_Camp.supply_sister(h);
		Directing_Camp.blank_line_11();
		while(true) {
			Directing_Camp.supply_sister(h);
			System.out.print("       >>");
			sc.nextLine();
			String input_shop = sc.nextLine();
			if(input_shop.equals("1")) {
				String item = "傷薬";
				Directing_Camp.supply_check_sister(item);
				int input = sc.nextInt();
				if(input==1) {
					
				}else {
					
				}
				
			}else if(input_shop.equals("2")) {
				String item = "銃  ";
			}else if(input_shop.equals("3")) {
				String item = "煙幕";
			}else if(input_shop.equals("4")) {
				String item = "ガラクタ";
			}else if(input_shop.equals("5")) {
				
			}else {
				
			}
			
			if(input_shop.equals("5")) break;
		}
	}
}
