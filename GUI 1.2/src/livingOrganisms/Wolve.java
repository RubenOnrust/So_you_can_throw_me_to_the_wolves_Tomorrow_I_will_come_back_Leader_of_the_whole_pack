package livingOrganisms;

public class Wolve {
	private static int populationSize = 2;
	private static double hCattle = 0.42;
	private static double hHorse = 0.58;
	private static double hDeer = 0.33;
	private static double lambda = 1.05;
	
	public Wolve() {
		// TODO Auto-generated constructor stub
	}

	public static int getPopulationSize() {
		return populationSize;
	}

	public static void setPopulationSize(int populationSize) {
		Wolve.populationSize = populationSize;
	}

	public static double gethCattle() {
		return hCattle;
	}

	public static void sethCattle(double hCattle) {
		Wolve.hCattle = hCattle;
	}

	public static double gethHorse() {
		return hHorse;
	}

	public static void sethHorse(double hHorse) {
		Wolve.hHorse = hHorse;
	}

	public static double gethDeer() {
		return hDeer;
	}

	public static void sethDeer(double hDeer) {
		Wolve.hDeer = hDeer;
	}

	public static double getLambda() {
		return lambda;
	}

	public static void setLambda(double lambda) {
		Wolve.lambda = lambda;
	}
	
}
