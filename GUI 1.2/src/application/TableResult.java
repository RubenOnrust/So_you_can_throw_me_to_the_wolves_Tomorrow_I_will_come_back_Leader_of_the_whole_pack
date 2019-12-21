package application;

public class TableResult {
	//this class exists only so we are able to add the results to the table
	//duh
	
	
	
	private String animal;
	private int popSize;
	
	//constructor
	public TableResult(String animal, int popSize) {
		
		this.animal = animal;
		this.popSize = popSize;
	}
	public TableResult(String year) {
		this.animal=year;
	}


	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getPopSize() {
		return popSize;
	}

	public void setPopSize(int popSize) {
		this.popSize = popSize;
	}
	
	}



