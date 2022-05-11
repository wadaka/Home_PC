package run;

public class Rogue extends Enemy{

	String name;
	int win_per;
	int run_per;
	int win_money;

	Rogue(){
		this.name="ならず者";
		this.win_per=70;
		this.run_per=90;
		this.win_money=2;
	}

	@Override
	public void setGet_Item(Hero h) {
		// TODO 自動生成されたメソッド・スタブ
		if(rdm.nextInt(100)<=9) {
			h.setItem_gun(h.getItem_gun()+1);;
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}
	}

	@Override
	public int setLost_Lose_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return -15;
		//h.setHp(h.getHp()-10);
	}

	@Override
	public int setLost_RunFail_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return -5;
		//h.setHp(h.getHp()-5);
	}

	@Override
	public int setLost_RunFail_Money() {
		// TODO 自動生成されたメソッド・スタブ
		int num = 0;
		if(rdm.nextInt(100)<=49) {
			num =rdm.nextInt(3)+1;
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}
		return num;
	}

	@Override
	public String[] getBattleInfo() {
		// TODO 自動生成されたメソッド・スタブ
		String[] infos = {"15      ","5       ","銃       (10%)","1～3(50%"};
		return infos;
	}

}
