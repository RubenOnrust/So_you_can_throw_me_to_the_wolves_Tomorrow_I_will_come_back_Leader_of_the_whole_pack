package livingOrganisms;

import javafx.collections.ObservableList;

public class Cattle {
	// parameters exact numbers
	public static int initialPopulationSize = 450;
	public static int r = 2;
	public static double lambda = 1.03;
	public static ObservableList<Integer> caclculatedPopulationSizes;

	public static ObservableList<Integer> getCaclculatedPopulationSizes() {
		return caclculatedPopulationSizes;
	}

	public static void setCaclculatedPopulationSizes(ObservableList<Integer> caclculatedPopulationSizes) {
		Cattle.caclculatedPopulationSizes = caclculatedPopulationSizes;
	}

	public Cattle() {
		// TODO Auto-generated constructor stub
	}

	public static int getInitialPopulationSize() {
		return initialPopulationSize;
	}

	public static void setInitialPopulationSize(int initialPopulationSize) {
		Cattle.initialPopulationSize = initialPopulationSize;
	}

	public static int getR() {
		return r;
	}

	public static void setR(int r) {
		Cattle.r = r;
	}

	public static double getLambda() {
		return lambda;
	}

	public static void setLambda(double lambda) {
		Cattle.lambda = lambda;
	}

}