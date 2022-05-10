package run;

public class Directing_Ending {
	static void showEnding(int ending) throws InterruptedException{
		for(int i=0;i<33;i++) {
			System.out.println();
		}
		
		if(ending==0) {
			System.out.println();
			System.out.println();
			System.out.println("ゲームオーバー！");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("  「無念……っ！」");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println("  志半ば、その体は歩みをやめ、");
			Thread.sleep(2000);
			System.out.print("  あなたは地に伏した……。");
			Thread.sleep(2000);
			System.out.println("もう二度と目覚めることはない……。");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			Thread.sleep(3000);
			System.out.println("  文字入力&エンターキーで、タイトルへ戻る");
			Thread.sleep(2000);
			System.out.print("  >>");
		}else if(ending==1) {
			System.out.println();
			System.out.println();
			System.out.println("ゲームクリア！");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("  「あっぱれ…っ！」");
			Thread.sleep(2000);
			System.out.println("  あなたは「秘境」に打ち勝ち、借金までもチャラにした！");
			Thread.sleep(2000);
			System.out.println("  もう「駆け出し」じゃないぞ、一流のトレジャーハンターだ！");
			Thread.sleep(4000);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("  文字入力&エンターキーで、タイトルへ戻る");
			Thread.sleep(2000);
			System.out.print("  >>");
			
		}else {
			System.out.println();
			System.out.println();
			System.out.println("ゲームオーバー！");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("  「よくがんばった…っ！」");
			Thread.sleep(2000);
			System.out.println("  ……と、言いたいところだけど、");
			Thread.sleep(2000);
			System.out.println("  残念ながら、借金を返済できなかった……。");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println("  生きて「秘境」を脱出できた。");
			Thread.sleep(2000);
			System.out.println("  命があるだけラッキーだ。");
			Thread.sleep(2000);
			System.out.println();
			System.out.println();
			System.out.println("  ……そうやって、自分を慰めるあなたを尻目に、");
			Thread.sleep(2000);
			System.out.println("  ガラの悪そうなアンちゃんの手は、その両肩へとゆっくり伸びていく……。");
			Thread.sleep(4000);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("  文字入力&エンターキーで、タイトルへ戻る");
			Thread.sleep(2000);
			System.out.print("  >>");
			
		}
	}

}
