package models;

public class ConstantD {
	private double constantD;

	public ConstantD(double constantD) {
		super();
		this.constantD = constantD;
	}

	public double getConstantD() {
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
		double resultOfCalculation = 1/(Alpha.getCattleAlpha()*Wolve.getH());
		this.constantD = resultOfCalculation;
		
	}
}
