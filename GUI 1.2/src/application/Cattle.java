package application;

public class Cattle extends Animal{
	//paramers exact numbers
	private static int initialPopulationSize=5;
	private static int r=2;
	
	
	
	public Cattle() {		
		// TODO Auto-generated constructor stub
	}

	public int getInitialPopulationSize() {
		return initialPopulationSize;
	}

	public void setInitialPopulationSize(int initialPopulationSize) {
		Cattle.initialPopulationSize = initialPopulationSize;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		Cattle.r = r;
	}

	
}