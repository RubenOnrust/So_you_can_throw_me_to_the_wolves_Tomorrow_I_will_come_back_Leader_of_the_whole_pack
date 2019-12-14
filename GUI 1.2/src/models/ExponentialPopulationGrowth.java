package models;

import livingOrganisms.Animal;

import javafx.scene.chart.*;


public class ExponentialPopulationGrowth extends Model{
	//parameters passed from an animal
	private Animal animal;
	private int initialPopSize;
	private int rate;
	
	//parameters used by the model
	private static final int  e=3;
	//this give the chart the values
	XYChart.Series<Number,Number> expPopGrowthSeries= new XYChart.Series<Number,Number>();
	
	
	//method which calculates the growth until it reaches timelimit
	public void updateModel() {
		int timelimit=10;
		int time=0;
		int currentPopSize;
		int initialPopSizeM=initialPopSize;
		while (time!=timelimit) {
			currentPopSize=initialPopSizeM*e^(rate*time);
			expPopGrowthSeries.getData().add(new XYChart.Data<Number,Number>(time,currentPopSize));
			time++;
			System.out.println(initialPopSizeM);
			initialPopSizeM=currentPopSize;
			System.out.println("Currensize:"+currentPopSize);
	}
	}
	
	//constructor and parameters given by species
	public ExponentialPopulationGrowth(Animal animal) {
		this.initialPopSize=animal.getInitialPopulationSize();
		this.rate=animal.getR();
		// TODO Auto-generated constructor stub
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

	public int getInitialPopSize() {
		return initialPopSize;
	}

	

	public int getRate() {
		return rate;
	}

	

	

	public void setInitialPopSize(int initialPopSize) {
		this.initialPopSize = initialPopSize;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public static int getE() {
		return e;
	}
}