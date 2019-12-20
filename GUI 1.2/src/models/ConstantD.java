package models;

import livingOrganisms.AlphaConstants;
import livingOrganisms.Wolve;

public class ConstantD {
	private double constantD;

	public ConstantD(double constantD) {
		super();
		this.constantD = constantD;
	}

	public double getConstantD() {
		return constantD;
	}

	public void setConstantD(double constantD) {
		this.constantD = constantD;
	}

	@Override
	public String toString() {
		return "CalculatingConstantK [constantK=" + constantD + "]";
	}
	// calculates constant d
	public void calculateDCattle() {
		double resultOfCalculation = 1/(AlphaConstants.getAlphaCattle()*Wolve.gethCattle());
		this.constantD = resultOfCalculation;
	}
	
	public void calculateDHorse() {
		double resultOfCalculation = 1/(AlphaConstants.getAlphaHorse()*Wolve.gethHorse());
		this.constantD = resultOfCalculation;
	}
	
	public void calculateDDeer() {
		double resultOfCalculation = 1/(AlphaConstants.getAlphaDeer()*Wolve.gethDeer());
		this.constantD = resultOfCalculation;
	}
}
