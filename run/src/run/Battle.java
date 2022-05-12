package run;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	static Random rdm = new Random();
	static Scanner sc = new Scanner(System.in);

	//まずは、登場するエネミーの抽選。道と経過ターン数で、選択される敵の内訳が変化。

	//1番簡単なパターン、ローリスクな敵がほとんど。
	public static void lottery_easy(Hero h) {
		int num = rdm.nextInt(100);
		if(num<40) {
			Enemy enemy = new Poisonous_insect("毒虫",80,90,1);
			battle_start(enemy,h);
		}else if(num<70) {
			Enemy enemy = new Rogue("ならず者",70,90,2);
			battle_start(enemy,h);
		}else if(num<80) {
			Enemy enemy = new ManEater("食人植物",80,50,5);
			battle_start(enemy,h);
		}else {
			Enemy enemy = new Barbarian("蛮族",60,60,3);
			battle_start(enemy,h);
		}
	}

	//2番目に簡単なパターン、まだまだローリスク。
	public static void lottery_a_bit_easy(Hero h) {
		int num = rdm.nextInt(100);
		if(num<30) {
			Enemy enemy = new Poisonous_insect("毒虫",80,90,1);
			battle_start(enemy,h);
		}else if(num<50) {
			Enemy enemy = new Rogue("ならず者",70,90,2);
			battle_start(enemy,h);
		}else if(num<55) {
			Enemy enemy = new ManEater("食人植物",80,50,5);
			battle_start(enemy,h);
		}else if(num<75) {
			Enemy enemy = new Barbarian("蛮族",60,60,3);
			battle_start(enemy,h);
		}else if(num<95) {
			Enemy enemy = new Swarm_of_Insects("毒虫の大群",50,60,3);
			battle_start(enemy,h);
		}else {
			Enemy enemy = new GiantSnake("大蛇",50,50,5);
			battle_start(enemy,h);
		}
	}

	//3番目に簡単なパターン。この辺りから、負けが死に直結しだす。
	public static void lottery_normal(Hero h) {
		int num = rdm.nextInt(100);
		if(num<10) {
			Enemy enemy = new Poisonous_insect("毒虫",80,90,1);
			battle_start(enemy,h);
		}else if(num<20) {
			Enemy enemy = new Rogue("ならず者",70,90,2);
			battle_start(enemy,h);
		}else if(num<30) {
			Enemy enemy = new ManEater("食人植物",80,50,5);
			battle_start(enemy,h);
		}else if(num<55) {
			Enemy enemy = new Barbarian("蛮族",60,60,3);
			battle_start(enemy,h);
		}else if(num<80) {
			Enemy enemy = new Swarm_of_Insects("毒虫の大群",50,60,3);
			battle_start(enemy,h);
		}else {
			Enemy enemy = new GiantSnake("大蛇",50,50,5);
			battle_start(enemy,h);
		}
	}

	//4番目に簡単なパターン。中～強の敵が中心。もう簡単じゃない。
	public static void lottery_a_bit_difficult(Hero h) {
		int num = rdm.nextInt(100);
		if(num<20) {
			Enemy enemy = new Barbarian("蛮族",60,60,3);
			battle_start(enemy,h);
		}else if(num<40) {
			Enemy enemy = new Swarm_of_Insects("毒虫の大群",50,60,3);
			battle_start(enemy,h);
		}else if(num<60){
			Enemy enemy = new GiantSnake("大蛇",50,50,5);
			battle_start(enemy,h);
		}else if(num<85){
			Enemy enemy = new Mercenary("傭兵",40,50,7);
			battle_start(enemy,h);
		}else{
			Enemy enemy = new Tiger("タイガー",25,50,10);
			battle_start(enemy,h);
		}
	}
	//5番目に簡単…、一番難しいパターン。本作最強の敵タイガーと30%の確率で遭遇する危険地帯
	public static void lottery_difficult(Hero h) {
		int num = rdm.nextInt(100);
		if(num<10) {
			Enemy enemy = new Barbarian("蛮族",60,60,3);
			battle_start(enemy,h);
		}else if(num<20) {
			Enemy enemy = new Swarm_of_Insects("毒虫の大群",50,60,3);
			battle_start(enemy,h);
		}else if(num<40){
			Enemy enemy = new GiantSnake("大蛇",50,50,5);
			battle_start(enemy,h);
		}else if(num<70){
			Enemy enemy = new Mercenary("傭兵",40,50,7);
			battle_start(enemy,h);
		}else{
			Enemy enemy = new Tiger("タイガー",25,50,10);

			battle_start(enemy,h);
		}
	}

	//エネミーの抽選終了後、戦闘パートが開始
	static void battle_start(Enemy enemy,Hero h) {
		try {
			Directing_Battle.showEncount(enemy, h);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		int item_use = 0;
		while(true) {
			int input_1 = sc.nextInt();
			if(input_1==1) {
				if(h.getItem_gun()>0) {
					
					System.out.printf("     銃を使用しますか？（現在の 銃所持数 : %s",h.getItem_gun());
					System.out.println();
					System.out.println("    【1】使用する  【2】 使用しない");
					System.out.println();
					System.out.println("     >>");
					int input_2 = sc.nextInt();

					if(input_2==1) {
						item_use = 25;
						h.setItem_gun(h.getItem_gun()-1);
						int win_per_plus = enemy.win_per+item_use;
						if(win_per_plus>100); win_per_plus = 100;
						System.out.println("");
						System.out.printf("     銃の使用により、戦闘勝率が25%%上昇！(勝率【】",enemy.win_per,win_per_plus);
						System.out.println("     エンターキーで戦闘へ進みます。");
						sc.nextLine();
						String Click = sc.nextLine();
					}
				}
				
				//戦闘でアイテムを獲得した場合、その結果を表示するために必要な変数を事前に保存しておく。
				int[] itemGetChecker = {
						h.getItem_ointment(), h.getItem_gun(),h.getItem_smoke(),h.getItem_litter()
				};

				
				try {
					Directing_Battle.battleStart();
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

				if(rdm.nextInt(100)<=(enemy.win_per+item_use)) {
					int lostHp = enemy.setLost_Lose_Hp();
					h.setHp(h.getHp()-lostHp);
					Directing_Battle.showResult(h,2,lostHp,0,itemGetChecker);
				}else {
					//勝ち
					int getMoney = enemy.win_money;
					h.setMoney(h.getMoney()+getMoney);
					enemy.setGet_Item(h);
					Directing_Battle.showResult(h,1,0,getMoney,itemGetChecker);
				}

				System.out.println("      >>エンターキー入力で次へ進む");
				sc.nextLine();
				String Click = sc.nextLine();
				//whileを抜けて、GameAppの処理へ戻る。
				break;

			}else if(input_1==2) {

			}
		}
	}
}
