package models;

import livingOrganisms.Animal;

import javafx.scene.chart.*;


public class ExponentialPopulationGrowth extends Model{
	//parameters passed from an animal
	private Animal animal;
	private static int initialPopSize;
	private static int rate;
	
	//parameters used by the model
	private static int currentPopSize;
	private static int timelimit=10;
	private static int time=0;
	private static final int  e=3;
	XYChart.Series<Number,Number> expPopGrowthSeries= new XYChart.Series<Number,Number>();
	
	
	//method which calculates the growth until it reaches timelimit
	public void updateModel() {
		while (time!=timelimit) {
			currentPopSize=initialPopSize*e^(rate*time);
			expPopGrowthSeries.getData().add(new XYChart.Data<Number,Number>(time,currentPopSize));
			time++;
			initialPopSize=currentPopSize;
			System.out.println(initialPopSize);
			System.out.println("Currensize:"+currentPopSize);
	}
	}
	
	//constructor and parameters given by species
	public ExponentialPopulationGrowth(Animal animal) {
		this.initialPopSize=animal.getInitialPopulationSize();
		this.rate=animal.getR();
		// TODO Auto-generated constructor stub
	}

	public static int getCurrentPopSize() {
		return currentPopSize;
	}

	public static void setCurrentPopSize(int currentPopSize) {
		ExponentialPopulationGrowth.currentPopSize = currentPopSize;
	}

	public XYChart.Series<Number, Number> getExpPopGrowthSeries() {
		return expPopGrowthSeries;
	}

	public void setExpPopGrowthSeries(XYChart.Series<Number, Number> expPopGrowthSeries) {
		this.expPopGrowthSeries = expPopGrowthSeries;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public static int getInitialPopSize() {
		return initialPopSize;
	}

	public static void setInitialPopSize(int initialPopSize) {
		ExponentialPopulationGrowth.initialPopSize = initialPopSize;
	}

	public static int getRate() {
		return rate;
	}

	public static void setRate(int rate) {
		ExponentialPopulationGrowth.rate = rate;
	}

	public static int getTimelimit() {
		return timelimit;
	}

	public static void setTimelimit(int timelimit) {
		ExponentialPopulationGrowth.timelimit = timelimit;
	}

	public static int getTime() {
		return time;
	}

	public static void setTime(int time) {
		ExponentialPopulationGrowth.time = time;
	}

	public static int getE() {
		return e;
	}
}