package run;

public class Poisonous_insect extends Enemy{

	Poisonous_insect(String name,int win_per,int run_per,int win_money){
		super(name,win_per,run_per,win_money);
	}	


	@Override
	public void setGet_Item(Hero h) {
		// TODO 自動生成されたメソッド・スタブ
		if(rdm.nextInt(100)<=24) {
			h.setItem_smoke(h.getItem_smoke()+1);;
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}
	}

	@Override
	public int setLost_Lose_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return 10;
		//h.setHp(h.getHp()-10);
	}

	@Override
	public int setLost_RunFail_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return 5;
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
		String[] infos = {"10      ","5       ","煙幕 (25%)    ","1～3(50%"};
		return infos;
	}


}
