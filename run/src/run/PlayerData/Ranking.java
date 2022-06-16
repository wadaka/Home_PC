package run.PlayerData;

public class Ranking {
	private String name;
	private String score;
	private int turn;
	private String summry;
	private int play_count;

	public Ranking(String name,String score,int turn,String summry,int play_count) {
		this.name=name;
		this.score=score;
		this.turn=turn;
		this.summry=summry;
		this.play_count=play_count;
	}

	public String getName() {
		return name;
	}

	public String getScore() {
		return score;
	}

	public int getTurn() {
		return turn;
	}

	public String getSummry() {
		return summry;
	}

	public int getPlay_count() {
		return play_count;
	}

}
