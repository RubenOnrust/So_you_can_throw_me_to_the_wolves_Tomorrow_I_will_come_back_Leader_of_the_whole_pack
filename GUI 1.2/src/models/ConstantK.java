package models;

import livingOrganisms.Wolve;

public class ConstantK {
	private double constantK;

	public ConstantK(double constantK) {
		super();
		this.constantK = constantK;
	}

	public double getConstantK() {
		return constantK;
	}

	public void setConstantK(double constantK) {
		this.constantK = constantK;
	}

	@Override
	public String toString() {
		return "CalculatingConstantK [constantK=" + constantK + "]";
	}
	// calculates the constant K
	public void calculateKCattle() {
		double resultOfCalculation = 1/Wolve.gethCattle();
		this.constantK = resultOfCalculation;
	}
	public void calculateKHorse() {
		double resultOfCalculation = 1/Wolve.gethHorse();
		this.constantK = resultOfCalculation;
	}
	public void calculateKDeer() {
		double resultOfCalculation = 1/Wolve.gethDeer();
		this.constantK = resultOfCalculation;
	}
}
