package run;

public class ManEater extends Enemy{

	String name;
	int win_per;
	int run_per;
	int win_money;

	ManEater(){
		this.name="食人植物";
		this.win_per=80;
		this.run_per=50;
		this.win_money=5;
	}

	@Override
	public void setGet_Item(Hero h) {
		// TODO 自動生成されたメソッド・スタブ
		int num = rdm.nextInt(4);

		if(num>3) {
			h.setItem_ointment(h.getItem_ointment()+1);
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}else if(num>2) {
			h.setItem_gun(h.getItem_gun()+1);
		}else if(num>1) {
			h.setItem_smoke(h.getItem_smoke()+1);
		}else {
			h.setItem_litter(h.getItem_litter()+1);
		}
	}

	@Override
	public int setLost_Lose_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return -100;
		//h.setHp(h.getHp()-10);
	}

	@Override
	public int setLost_RunFail_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return -10;
		//h.setHp(h.getHp()-5);
	}

	@Override
	public int setLost_RunFail_Money() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public String[] getBattleInfo() {
		// TODO 自動生成されたメソッド・スタブ
		String[] infos = {"100     ","10      ","傷薬,煙幕(40%)","なし          "};
		return infos;
	}

}

