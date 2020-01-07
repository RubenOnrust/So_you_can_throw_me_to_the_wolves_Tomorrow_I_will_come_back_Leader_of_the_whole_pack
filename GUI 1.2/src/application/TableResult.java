package application;

public class TableResult {
	// this class exists only so we are able to add the results to the table
	// duh

	private int year;
	private int cattle;
	private int deer;
	private int horse;
	private int wolve;
	
	public TableResult(int year, int cattle, int deer, int horse, int wolve) {
		this.year = year;
		this.cattle = cattle;
		this.deer = deer;
		this.horse = horse;
		this.wolve = wolve;
	}

	public TableResult() {

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCattle() {
		return cattle;
	}

	public void setCattle(int cattle) {
		this.cattle = cattle;
	}

	public int getDeer() {
		return deer;
	}

	public void setDeer(int deer) {
		this.deer = deer;
	}

	public int getHorse() {
		return horse;
	}

	public void setHorse(int horse) {
		this.horse = horse;
	}

	public int getWolve() {
		return wolve;
	}

	public void setWolve(int wolve) {
		this.wolve = wolve;
	}

	@Override
	public String toString() {
		return "TableResult [year=" + year + ", cattle=" + cattle + ", deer=" + deer + ", horse=" + horse + ", wolve="
				+ wolve + "]";
	}
	
	
	
}
