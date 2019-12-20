package livingOrganisms;

public class Wolve {
	private int populationSize;
	private static double hCattle;
	private static double hHorse;
	private static double hDeer;
	
	public Wolve(int populationSize, double hCattle, double hHorse, double hDeer) {
		super();
		this.populationSize = populationSize;
		Wolve.hCattle = hCattle;
		Wolve.hHorse = hHorse;
		Wolve.hDeer = hDeer;
	}

	public int getPopulationSize() {
		return populationSize;
	}

	public void setPopulationSize(int populationSize) {
		this.populationSize = populationSize;
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
