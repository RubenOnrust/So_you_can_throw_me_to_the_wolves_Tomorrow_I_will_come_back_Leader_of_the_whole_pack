package application;

public class TableResult {
	//this class exists only so we are able to add the results to the table
	//duh
	
	
	private int year;
	private String animal;
	private int popSize;
	
	//constructor
	public TableResult(int year, String animal, int popSize) {
		this.year = year;
		this.animal = animal;
		this.popSize = popSize;
	}
	public TableResult(int year) {
		this.year=year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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



