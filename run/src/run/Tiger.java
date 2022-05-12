package run;

public class Tiger extends Enemy{

	String name;
	int win_per;
	int run_per;
	int win_money;

	Tiger(String name,int win_per,int run_per,int win_money){
		super(name,win_per,run_per,win_money);
	}

	@Override
	public void setGet_Item(Hero h) {
		// TODO 自動生成されたメソッド・スタブ
		if(rdm.nextInt(100)<=39) {
			h.setItem_ointment(h.getItem_ointment()+1);;
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}
		if(rdm.nextInt(100)<=39) {
			h.setItem_smoke(h.getItem_smoke()+1);;
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}
	}

	@Override
	public int setLost_Lose_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return rdm.nextInt(21)+40;
		//h.setHp(h.getHp()-10);
	}

	@Override
	public int setLost_RunFail_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return rdm.nextInt(11)+20;
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
		String[] infos = {"40～60  ","20～30  ","傷薬,煙幕(40%)","5(50%)  "};
		return infos;
	}

}
