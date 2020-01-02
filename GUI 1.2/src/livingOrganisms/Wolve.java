package livingOrganisms;

public class Wolve {
	private static int populationSize = 2;
	private static double hCattle = 0.42;
	private static double hHorse;
	private static double hDeer;
	
	public Wolve(int populationSize, double hCattle, double hHorse, double hDeer) {
		super();
		Wolve.populationSize = populationSize;
		Wolve.hCattle = hCattle;
		Wolve.hHorse = hHorse;
		Wolve.hDeer = hDeer;
	}

	public static int getPopulationSize() {
		return populationSize;
	}

	public void setPopulationSize(int populationSize) {
		Wolve.populationSize = populationSize;
	}

	public static double gethCattle() {
		return hCattle;
	}

	public void sethCattle(double hCattle) {
		Wolve.hCattle = hCattle;
	}

	public static double gethHorse() {
		return hHorse;
	}

	public void sethHorse(double hHorse) {
		Wolve.hHorse = hHorse;
	}

	public static double gethDeer() {
		return hDeer;
	}

	public void sethDeer(double hDeer) {
		Wolve.hDeer = hDeer;
	}

	@Override
	public String toString() {
		return "Wolve [populationSize=" + populationSize + ", hCattle=" + hCattle + ", hHorse=" + hHorse + ", hDeer="
				+ hDeer + "]";
	}
	
	
}
