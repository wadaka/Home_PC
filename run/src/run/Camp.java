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

		int no_count = 1;
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
				System.out.print("       >>");
				int input = sc.nextInt();
				if(input==1) {
					if(h.getMoney()>=10) {
						Directing_Camp.supply_check_ok_sister();
						h.setItem_ointment(h.getItem_ointment()+1);
						h.setMoney(h.getMoney()-10);
					}else {
						Directing_Camp.supply_check_no_money_sister();
					}
				}else {
					Directing_Camp.supply_check_no_sister(no_count);
					no_count++;
				}

			}else if(input_shop.equals("2")) {
				String item = "銃  ";
				Directing_Camp.supply_check_sister(item);
				System.out.print("       >>");
				int input = sc.nextInt();
				if(input==1) {
					if(h.getMoney()>=5) {
						Directing_Camp.supply_check_ok_sister();
						h.setItem_gun(h.getItem_gun()+1);
						h.setMoney(h.getMoney()-5);
					}else {
						Directing_Camp.supply_check_no_money_sister();
					}
				}else {
					Directing_Camp.supply_check_no_sister(no_count);
					no_count++;
				}
			}else if(input_shop.equals("3")) {
				String item = "煙幕";
				Directing_Camp.supply_check_sister(item);
				System.out.print("       >>");
				int input = sc.nextInt();
				if(input==1) {
					if(h.getMoney()>=3) {
						Directing_Camp.supply_check_ok_sister();
						h.setItem_smoke(h.getItem_smoke()+1);
						h.setMoney(h.getMoney()-3);
					}else {
						Directing_Camp.supply_check_no_money_sister();
					}
				}else {
					Directing_Camp.supply_check_no_sister(no_count);
					no_count++;
				}
			}else if(input_shop.equals("4")) {
				String item = "ゴミ";
				Directing_Camp.supply_check_sister(item);
				System.out.print("       >>");
				int input = sc.nextInt();
				if(input==1) {
					if(h.getMoney()>=2) {
						Directing_Camp.supply_check_ok_sister();
						h.setItem_litter(h.getItem_litter()+1);
						h.setMoney(h.getMoney()-2);
					}else {
						Directing_Camp.supply_check_no_money_sister();
					}
				}else {
					Directing_Camp.supply_check_no_sister(no_count);
					no_count++;
				}
			}else if(input_shop.equals("5")) {
				Directing_Camp.supply_check_end_shop_sister();
				System.out.print("       >>");
				int input = sc.nextInt();
				if(input==1) {
					Directing_Camp.supply_check_end_shop_ok_sister();
					Directing_Camp.supply_end_sister();
					Directing_Camp.disconnect();
				}else {
					Directing_Camp.supply_check_end_shop_no_sister();
					input_shop = "0";
				}
			}else {

			}

			if(input_shop.equals("5")) break;
		}
	}
	static void sister_talk() throws InterruptedException{
		Directing_Camp.connect();

	}
}
