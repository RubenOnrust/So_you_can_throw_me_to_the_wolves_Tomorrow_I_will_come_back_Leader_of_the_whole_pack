package models;

import livingOrganisms.Animal;

public class ExponentialPopulationGrowth extends Model{
	//parameters passed from an animal
	private Animal animal;
	private static int initialPopSize;
	private static int rate;
	
	//parameters used by the model
	private static int currentPopSize;
	private static int timelimit=10;
	private static int time=2;
	private static final int  e=3;
	
	//method which calculates the growth until the time reaches timelimit
	public void updateModel() {
		while (time!=timelimit) {
			currentPopSize=initialPopSize*e^(rate*time);
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
}