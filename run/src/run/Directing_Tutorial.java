package run;

import java.util.Scanner;

public class Directing_Tutorial {
	public static void showTutorial() {
		System.out.println("============================================================================");
		System.out.println("▽ゲーム説明");
		System.out.println("============================================================================");
		System.out.println();
		System.out.println(" ■概要");
		System.out.println();
		System.out.println();
		System.out.println("    あなたは、トレジャーハンターとして");
		System.out.println("    沢山の宝物が眠る、「秘境」の地へと足を運びました。");
		System.out.println();
		System.out.println("    ここは、まさしく無法地帯！");
		System.out.println("    宝を狙う荒くれや、獰猛な原生生物が、あなたの命を狙っています。");
		System.out.println("    で・す・が、「秘境」の外では、借金取りがあなたの身柄を狙っています。");
		System.out.println("    う～ん、進むも地獄、戻るも地獄！ ");
		System.out.println();
		System.out.println("    この状況を打開する方法は、ただひとつ！ ");
		System.out.println("    「宝を集めて、生き残る！」 ");
		System.out.println("    死なないように、でも、なるべく多くお宝を集めて、この危険地帯から脱出しましょう！");
		System.out.println();
		System.out.println();
		System.out.println(" ■ゲームの目標");
		System.out.println();
		System.out.println();
		System.out.println("    このゲームの目標は「秘境からの生還」と「借金完済」のふたつです。");
		System.out.println();
		System.out.println("    ・「秘境からの生還」は、全30ターンの間、「HP」を「0にしない」こと。");
		System.out.println("    ・「借金完済」は、全30ターン終了時、「財宝」が「分母以上」存在すること。");
		System.out.println();
		System.out.println("    以上を満たすことで、それぞれの目標を達成することができます。  ファイト！");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("============================================================================");
		System.out.print("  エンターキーを押すと、次へ進みます。>>");
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		System.out.println("============================================================================");
		System.out.println("▽ゲーム説明");
		System.out.println("============================================================================");
		System.out.println();
		System.out.println(" ■ゲームの流れ");
		System.out.println();
		System.out.println("    このゲームは、「全30ターン構成」の");
		System.out.println("    コマンド選択式・シミュレーションゲームです！");
		System.out.println();
		System.out.println("    あなたは毎ターン、以下「３つの道」からどこを進むか、選択することになります。");
		System.out.println();
		System.out.println("           「安全な道」  「普通の道」  「危険な道」  ");
		System.out.println();
		System.out.println("    進んだ先では、色々なこと(イベント)が起こりますが");
		System.out.println("    基本的に、");
		System.out.println();
		System.out.println("    「安全な道」ほど、HPが減りづらく、かつ回復しやすく、");
		System.out.println("    「危険な道」ほど、財宝が手に入りやすい、といった特色があります。");
		System.out.println();
		System.out.println("    裏を返せば、「安全な道」は、財宝が手に入りづらく、");
		System.out.println("                「危険な道」は、HPが減りやすく、文字通り危険なため、注意が必要です。");
		System.out.println();
		System.out.println("    イベントが終わると、次のターンとなり、また進むべき道を選択することになります。");
		System.out.println("    これを「30ターン」行い、30ターン目終了時に、目標財産を稼げればゲームクリアです！。");
		System.out.println();
		System.out.println("    ただし！");
		System.out.println("    途中でHPが0になると、その時点でゲームオーバー！！");
		System.out.println("    HPと財宝のバランスを考えつつ、進むべき道を選択していってください！");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("============================================================================");
		System.out.print("  エンターキーを押すと、次へ進みます。>>");
		String in2 = scan.nextLine();
	}

}
