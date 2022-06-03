package run;

import java.util.Random;
import java.util.Scanner;

public class Camp {
	final static Scanner sc = new Scanner(System.in);
	final static Random rdm = new Random();
	static void start_Camp(int turn,Hero h,Sister s,int[] ba) throws InterruptedException{

		//ショップの在庫を抽選する
		int[] supply_stock_lot = {1,1,1,1} ;
		int[] supply_stock_per = {30,30,50,50};
		for(int i=0;i<supply_stock_lot.length;i++) {
			while(rdm.nextInt(100)<supply_stock_per[i]) {
				supply_stock_lot[i]+=1;
				supply_stock_per[i]-=20;
			}
		}

		int sisiter_talk_count = 0;

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
					supplyShop(h,supply_stock_lot);
					break;
				case 2:
					sister_talk(h,s,turn,sisiter_talk_count);
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
	static void supplyShop(Hero h,int[] supply_stock) throws InterruptedException{

		int no_count = 1;
		sc.nextLine();
		Directing_Camp.connect();

		Directing_Camp.pre_supply_first();
		Directing_Camp.supply_start_sister();
		Directing_Camp.supply_sister(h,supply_stock);
		Directing_Camp.blank_line_11();
		while(true) {
			Directing_Camp.supply_sister(h,supply_stock);
			System.out.print("       >>");
			String input_shop = sc.nextLine();
			if(input_shop.equals("1")) {
				if(supply_stock[0]>0) {
					String item = "傷薬";
					Directing_Camp.supply_check_sister(item,supply_stock);
					System.out.print("       >>");
					int input = sc.nextInt();
					sc.nextLine();
					if(input==1) {
						if(h.getMoney()>=10) {
							Directing_Camp.supply_check_ok_sister(supply_stock);
							h.setItem_ointment(h.getItem_ointment()+1);
							h.setMoney(h.getMoney()-10);
							supply_stock[0]-=1;
						}else {
							Directing_Camp.supply_check_no_money_sister(supply_stock);
						}
					}else {
						Directing_Camp.supply_check_no_sister(no_count,supply_stock);
						no_count++;
					}
				}else {
					Directing_Camp.supply_no_stock_sister(supply_stock);
				}

			}else if(input_shop.equals("2")) {
				if(supply_stock[1]>0) {
					String item = "銃  ";
					Directing_Camp.supply_check_sister(item,supply_stock);
					System.out.print("       >>");
					int input = sc.nextInt();
					sc.nextLine();
					if(input==1) {
						if(h.getMoney()>=5) {
							Directing_Camp.supply_check_ok_sister(supply_stock);
							h.setItem_gun(h.getItem_gun()+1);
							h.setMoney(h.getMoney()-5);
							supply_stock[1]-=1;
						}else {
							Directing_Camp.supply_check_no_money_sister(supply_stock);
						}
					}else {
						Directing_Camp.supply_check_no_sister(no_count,supply_stock);
						no_count++;
					}
				}else {
					Directing_Camp.supply_no_stock_sister(supply_stock);
				}
			}else if(input_shop.equals("3")) {
				if(supply_stock[2]>0) {
					String item = "煙幕";
					Directing_Camp.supply_check_sister(item,supply_stock);
					System.out.print("       >>");
					int input = sc.nextInt();
					sc.nextLine();
					if(input==1) {
						if(h.getMoney()>=3) {
							Directing_Camp.supply_check_ok_sister(supply_stock);
							h.setItem_smoke(h.getItem_smoke()+1);
							h.setMoney(h.getMoney()-3);
							supply_stock[2]-=1;
						}else {
							Directing_Camp.supply_check_no_money_sister(supply_stock);
						}
					}else {
						Directing_Camp.supply_check_no_sister(no_count,supply_stock);
						no_count++;
					}
				}else {
					Directing_Camp.supply_no_stock_sister(supply_stock);
				}
			}else if(input_shop.equals("4")) {
				if(supply_stock[3]>0) {
					String item = "ゴミ";
					Directing_Camp.supply_check_sister(item,supply_stock);
					System.out.print("       >>");
					int input = sc.nextInt();
					sc.nextLine();
					if(input==1) {
						if(h.getMoney()>=2) {
							Directing_Camp.supply_check_ok_sister(supply_stock);
							h.setItem_litter(h.getItem_litter()+1);
							h.setMoney(h.getMoney()-2);
							supply_stock[3]-=1;
						}else {
							Directing_Camp.supply_check_no_money_sister(supply_stock);
						}
					}else {
						Directing_Camp.supply_check_no_sister(no_count,supply_stock);
						no_count++;
					}
				}else {
					Directing_Camp.supply_no_stock_sister(supply_stock);
				}
			}else if(input_shop.equals("5")) {
				Directing_Camp.supply_check_end_shop_sister(supply_stock);
				System.out.print("       >>");
				int input = sc.nextInt();
				sc.nextLine();
				if(input==1) {
					Directing_Camp.supply_check_end_shop_ok_sister(supply_stock);
					Directing_Camp.supply_end_sister();
					Directing_Camp.disconnect();
				}else {
					Directing_Camp.supply_check_end_shop_no_sister(supply_stock);
					input_shop = "0";
				}
			}else {

			}

			if(input_shop.equals("5")) break;
		}
	}
	static void sister_talk(Hero h,Sister s,int turn,int sister_talk_count) throws InterruptedException{
		sc.nextLine();
		Directing_Camp.connect();
		Directing_Camp.sister_talk_Opening_common();
		Thread.sleep(2000);
		int op = rdm.nextInt(2);
		if(op>0) {
			Directing_Camp.sister_talk_Opening_pattern_1();
		}else {
			Directing_Camp.sister_talk_Opening_pattern_2();
		}

		while(true) {
			Directing_Camp.sister_talk_idle();
			System.out.print("                  >>");
			String input = sc.nextLine();

			if(input.equals("1")){
				//妹ちゃんとの会話は、１キャンプ、３回まで
				if(sister_talk_count>6) {
					Directing_Camp.sister_talk_limit();
				}
				else if(sister_talk_count==1) {
					Directing_Camp.sister_talk_sp(s,turn);
				}else {
					Directing_Camp.sister_talk_judge(s,turn);
				}
				sister_talk_count++;
			}else if(input.equals("2")) {
				Directing_Camp.sister_talk_grade_judge(h,turn);
			}else if(input.equals("3")) {
				break;
			}else {
				Directing_Camp.sister_talk_no_word();
			}
		}

	}
}
