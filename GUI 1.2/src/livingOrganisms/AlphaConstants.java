package livingOrganisms;

public class AlphaConstants {
	private static double alphaCattle = 0.023;
	private static double alphaHorse = 0.015;
	private static double alphaDeer = 0.15;
	private static int years = 10;

	public static double getAlphaCattle() {
		return alphaCattle;
	}

	public static void setAlphaCattle(double alphaCattle) {
		AlphaConstants.alphaCattle = alphaCattle;
	}

	public static double getAlphaHorse() {
		return alphaHorse;
	}

	public static void setAlphaHorse(double alphaHorse) {
		AlphaConstants.alphaHorse = alphaHorse;
	}

	public static double getAlphaDeer() {
		return alphaDeer;
	}

	public static void setAlphaDeer(double alphaDeer) {
		AlphaConstants.alphaDeer = alphaDeer;
	}

	public static int getYears() {
		return years;
	}

	public static void setYears(int years) {
		AlphaConstants.years = years;
	}
	

}
