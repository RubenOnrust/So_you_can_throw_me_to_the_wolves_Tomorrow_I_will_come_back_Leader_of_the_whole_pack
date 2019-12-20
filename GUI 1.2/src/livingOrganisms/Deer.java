package livingOrganisms;

public class Deer {
	private static int initialPopulationSize=5;
	private static double lambda;
	
	public static int getInitialPopulationSize() {
		return initialPopulationSize;
	}
	public static void setInitialPopulationSize(int initialPopulationSize) {
		Deer.initialPopulationSize = initialPopulationSize;
	}
	public static double getLambda() {
		return lambda;
	}
	public static void setLambda(double lambda) {
		Deer.lambda = lambda;
	}
	
	

}
