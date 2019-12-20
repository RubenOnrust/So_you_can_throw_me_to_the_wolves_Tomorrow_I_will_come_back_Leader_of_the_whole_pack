package models;

public class CalculatingConstantK {
	private float constantK;

	public CalculatingConstantK(float constantK) {
		super();
		this.constantK = constantK;
	}

	public float getConstantK() {
		return constantK;
	}

	public void setConstantK(float constantK) {
		this.constantK = constantK;
	}

	@Override
	public String toString() {
		return "CalculatingConstantK [constantK=" + constantK + "]";
	}
	// calculates the constant K
	public void calculateK() {
		float resultOfCalculation = 1/Cattle.getH();
		this.constantK = resultOfCalculation;
		
	}
}
