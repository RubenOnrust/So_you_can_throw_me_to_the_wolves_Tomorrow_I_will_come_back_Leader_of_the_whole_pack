package livingOrganisms;

import javafx.collections.ObservableList;

public class Deer {
	public static int initialPopulationSize = 1000;
	public static int r;
	public static double lambda = 1.35;
	public static ObservableList<Integer> caclculatedPopulationSizes;

	public Deer() {
		// TODO Auto-generated constructor stub
	}

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

	public static int getR() {
		return r;
	}

	public static void setR(int r) {
		Deer.r = r;
	}

	public static ObservableList<Integer> getCaclculatedPopulationSizes() {
		return caclculatedPopulationSizes;
	}

	public static void setCaclculatedPopulationSizes(ObservableList<Integer> caclculatedPopulationSizes) {
		Deer.caclculatedPopulationSizes = caclculatedPopulationSizes;
	}

}
