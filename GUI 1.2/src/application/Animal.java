package application;


public abstract class Animal {
	//characteristicts for all species
	private int initialPopulationSize;
	private int r;
	
	
	
	public int getInitialPopulationSize() {
		return initialPopulationSize;
	}
	public void setInitialPopulationSize(int initialPopulationSize) {
		this.initialPopulationSize = initialPopulationSize;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
	
}

