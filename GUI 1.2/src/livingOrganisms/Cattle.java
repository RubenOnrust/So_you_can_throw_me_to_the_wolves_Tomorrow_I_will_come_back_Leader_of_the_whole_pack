package livingOrganisms;

public class Cattle extends Animal{
	//parameters exact numbers
	private static int initialPopulationSize=5;
	private static int r=2;
	private static double lambda;
	
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

	public static double getLambda() {
		return lambda;
	}

	public static void setLambda(double lambda) {
		Cattle.lambda = lambda;
	}

	
	
}