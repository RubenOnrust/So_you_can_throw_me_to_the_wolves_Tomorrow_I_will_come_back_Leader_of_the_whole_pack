package models;

public class CalculatingConstantD {
	private float constantD;

	public CalculatingConstantD(float constantD) {
		super();
		this.constantD = constantD;
	}

	public float getConstantK() {
		return constantD;
	}

	public void setConstantD(float constantD) {
		this.constantD = constantD;
	}

	@Override
	public String toString() {
		return "CalculatingConstantK [constantK=" + constantD + "]";
	}
	// calculates constant d
	public void calculateD() {
		float resultOfCalculation = 1/(Alpha.getCattleAlpha*Cattle.getH());
		this.constantD = resultOfCalculation;
		
	}
}
