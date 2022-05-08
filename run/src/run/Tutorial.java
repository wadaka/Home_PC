package run;

import java.util.Scanner;

public class Tutorial {
	public static void showTutorial() {
		System.out.println("============================================================================");
		System.out.println();
		System.out.println("▽ゲーム説明");
		System.out.println();
		System.out.println("============================================================================");
		System.out.println();
		System.out.println(" ■概要");
		System.out.println();
		System.out.println("    あなたは、トレジャーハンターとして");
		System.out.println("    沢山の宝物が眠る、「秘境」の地へと足を運びました。");
		System.out.println("    ここは、まさしく無法地帯！");
		System.out.println("    宝を狙う荒くれや、獰猛な原生生物が、あなたの命を狙っています。");
		System.out.println("    死なないように、でも、なるべく多くお宝を集めて、この危険地帯から脱出しましょう！");
		System.out.println();
		System.out.println(" ■ゲームの目標");
		System.out.println();
		System.out.println("    このゲームの目標は「秘境からの生還」と「借金完済」のふたつです。");
		System.out.println();
		System.out.println("    ・「秘境からの生還」は、全30ターンの間、「HPを0にしない」こと。");
		System.out.println("    ・「借金完済」は、全30ターン終了時、「財宝が分母以上」存在すること。");
		System.out.println();
		System.out.println("    以上を満たすことで、それぞれの目標を達成することができます。ファイト！");
		System.out.println();
		System.out.println(" ■ゲームの流れ");
		System.out.println();
		System.out.println("    このゲームはターンベースのシミュレーションゲームです。");
		System.out.println("    プレイヤーは毎ターン、進むべき道を選択することになります。");
		System.out.println("    道は、「安全」なほどHPが減りづらく、「危険」なほど財宝が手に入りやすい性質を持ちます。");
		System.out.println("    全30ターン終了時に、目標財産を稼げればゲームクリアです！。");
		System.out.println("    ただし、途中でHPが0になるとゲームオーバーとなるため、");
		System.out.println("    HPと財宝のバランスを考えつつ、進むべき道を選択していってください！");
		System.out.println();
		System.out.println("============================================================================");
		System.out.print("  適当な文字を入力し、エンターキーを押すと、ゲーム本編が始まります。>>");
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
	}

}
