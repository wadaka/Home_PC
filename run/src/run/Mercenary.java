package run;

public class Mercenary extends Enemy{

	String name;
	int win_per;
	int run_per;
	int win_money;

	Mercenary(){
		this.name="傭兵";
		this.win_per=40;
		this.run_per=50;
		this.win_money=7;
	}

	@Override
	public void setGet_Item(Hero h) {
		// TODO 自動生成されたメソッド・スタブ
		if(rdm.nextInt(100)<=39) {
			h.setItem_gun(h.getItem_gun()+1);;
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}
	}

	@Override
	public int setLost_Lose_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return rdm.nextInt(11)+30;
		//h.setHp(h.getHp()-10);
	}

	@Override
	public int setLost_RunFail_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return rdm.nextInt(16)+5;
		//h.setHp(h.getHp()-5);
	}

	@Override
	public int setLost_RunFail_Money() {
		// TODO 自動生成されたメソッド・スタブ
		if(rdm.nextInt(100)<=49) {
			return 5;
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}
		return 0;
	}

	@Override
	public String[] getBattleInfo() {
		// TODO 自動生成されたメソッド・スタブ
		String[] infos = {"30～40  ","15～20  ","銃       (40%)","5(50%)  "};
		return infos;
	}


}