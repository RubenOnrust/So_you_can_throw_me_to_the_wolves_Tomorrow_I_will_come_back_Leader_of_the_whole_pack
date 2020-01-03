package livingOrganisms;

import javafx.collections.ObservableList;

public class Cattle extends Animal{
	//parameters exact numbers
	public static int initialPopulationSize= 1000;
	public static int r=2;
	public static double lambda = 1.1;
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