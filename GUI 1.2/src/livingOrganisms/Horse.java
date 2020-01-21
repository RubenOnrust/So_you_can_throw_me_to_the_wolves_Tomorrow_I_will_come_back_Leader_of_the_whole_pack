package livingOrganisms;

public class Horse {
	// parameters exact numbers
	public static int initialPopulationSize = 350;
	public static int r = 3;
	public static double lambda = 1.2;
	
	public Horse() {

		// TODO Auto-generated constructor stub
	}

	public static int getInitialPopulationSize() {
		return initialPopulationSize;
	}

	public static void setInitialPopulationSize(int initialPopulationSize) {
		Horse.initialPopulationSize = initialPopulationSize;
	}

	public static int getR() {
		return r;
	}

	public static void setR(int r) {
		Horse.r = r;
	}

	public static double getLambda() {
		return lambda;
	}

	public static void setLambda(double lambda) {
		Horse.lambda = lambda;
	}

}
