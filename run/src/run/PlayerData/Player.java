package run.PlayerData;

public class Player {

	private String name = "";
	private boolean isSkipEvent_Already_Read = false;
	private boolean isSkipEvent_All = false;
	private boolean isCampEvent_1 = false;
	private boolean isCampEvent_2 = false;
	private boolean isEnding_Bad = false;
	private boolean isEnding_Good = false;
	private boolean isEnding_Best = false;
	private int play_count = 0;

	public Player(String name) {
		this.name=name;
	}

	public boolean isSkipEvent_Already_Read() {
		return isSkipEvent_Already_Read;
	}

	public void setSkipEvent_Already_Read(boolean isSkipEvent_Already_Read) {
		this.isSkipEvent_Already_Read = isSkipEvent_Already_Read;
	}

	public boolean isSkipEvent_All() {
		return isSkipEvent_All;
	}

	public void setSkipEvent_All(boolean isSkipEvent_All) {
		this.isSkipEvent_All = isSkipEvent_All;
	}

	public boolean isCampEvent_1() {
		return isCampEvent_1;
	}

	public void setCampEvent_1(boolean isCampEvent_1) {
		this.isCampEvent_1 = isCampEvent_1;
	}

	public boolean isCampEvent_2() {
		return isCampEvent_2;
	}

	public void setCampEvent_2(boolean isCampEvent_2) {
		this.isCampEvent_2 = isCampEvent_2;
	}

	public boolean isEnding_Bad() {
		return isEnding_Bad;
	}

	public void setEnding_Bad(boolean isEnding_Bad) {
		this.isEnding_Bad = isEnding_Bad;
	}

	public boolean isEnding_Good() {
		return isEnding_Good;
	}

	public void setEnding_Good(boolean isEnding_Good) {
		this.isEnding_Good = isEnding_Good;
	}

	public boolean isEnding_Best() {
		return isEnding_Best;
	}

	public void setEnding_Best(boolean isEnding_Best) {
		this.isEnding_Best = isEnding_Best;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getPlay_count() {
		return play_count;
	}

	public void setPlay_count(int play_count) {
		this.play_count = play_count;
	}

}