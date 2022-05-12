package run;

public class Swarm_of_Insects extends Enemy{

	Swarm_of_Insects(String name,int win_per,int run_per,int win_money){
		super(name,win_per,run_per,win_money);
	}

	@Override
	public void setGet_Item(Hero h) {
		// TODO 自動生成されたメソッド・スタブ
		if(rdm.nextInt(100)<=29) {
			h.setItem_ointment(h.getItem_ointment()+1);
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}
	}

	@Override
	public int setLost_Lose_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return -25;
		//h.setHp(h.getHp()-10);
	}

	@Override
	public int setLost_RunFail_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return -15;
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
		String[] infos = {"25      ","15      ","傷薬 (30%)    ","1～3(50%"};
		return infos;
	}

}
