package run;

public class GiantSnake extends Enemy{

	String name;
	int win_per;
	int run_per;
	int win_money;

	GiantSnake(){
		this.name="大蛇";
		this.win_per=50;
		this.run_per=50;
		this.win_money=5;
	}

	@Override
	public void setGet_Item(Hero h) {
		// TODO 自動生成されたメソッド・スタブ

		if(rdm.nextInt(100)<=24){
			h.setItem_litter(h.getItem_litter()+1);
		}
	}

	@Override
	public int setLost_Lose_Hp() {
		// TODO 自動生成されたメソッド・スタブ
		return -30;
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
		if(rdm.nextInt(100)<=49) {
			return 3;
			//h.setMoney(h.getMoney()-(rdm.nextInt(3)+1));
		}
		return 0;
	}

	@Override
	public String[] getBattleInfo() {
		// TODO 自動生成されたメソッド・スタブ
		String[] infos = {"30      ","15      ","ゴミ     (25%)","3(50%)  "};
		return infos;
	}

}
