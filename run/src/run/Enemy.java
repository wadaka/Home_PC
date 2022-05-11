package run;

import java.util.Random;

public abstract class Enemy {
	Random rdm = new Random();
	String name;
	int win_per;
	int run_per;
	int win_money;

	public abstract String[] getBattleInfo();

	public abstract void setGet_Item(Hero h);

	public abstract int setLost_Lose_Hp();

	public abstract int setLost_RunFail_Hp();

	public abstract int setLost_RunFail_Money();

}
