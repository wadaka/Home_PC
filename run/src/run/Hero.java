package run;

public class Hero {
	private int hp=100;
	private int money=0;
	private int item_ointment=1;
	private int item_gun=1;
	private int item_smoke=1;
	private int item_litter=0;
	private String event = "";

	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if(hp>100) hp=100;
		if(hp<0) hp=0;
		this.hp = hp;
	}

	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		if(money<0) money=0;
		this.money = money;
	}

	public void setMoney_judge(int litter,int money,boolean isBattle) {
		if(litter>0) {
			setItem_litter(getItem_litter()-1);
			if(isBattle == false) {
				System.out.println("    だが、ゴミを身代わりにして、財宝の喪失を防いだ！");
			}
		}else {
			setMoney(getMoney()-money);
		}
	}

	public int getItem_ointment() {
		return this.item_ointment;
	}
	public void setItem_ointment(int item_ointment) {
		this.item_ointment = item_ointment;
	}

	public int getItem_gun() {
		return this.item_gun;
	}
	public void setItem_gun(int item_gun) {
		this.item_gun = item_gun;
	}

	public int getItem_smoke() {
		return this.item_smoke;
	}
	public void setItem_smoke(int item_smoke) {
		this.item_smoke = item_smoke;
	}

	public int getItem_litter() {
		return this.item_litter;
	}
	public void setItem_litter(int item_litter) {
		this.item_litter = item_litter;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}
}
