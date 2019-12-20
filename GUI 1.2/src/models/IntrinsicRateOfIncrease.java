package models;

import livingOrganisms.Cattle;
import livingOrganisms.Deer;
import livingOrganisms.Horse;

public class IntrinsicRateOfIncrease {
	private double r;

	public IntrinsicRateOfIncrease(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "IntrinsicRateOfIncrease [r=" + r + "]";
	}
	
	public void calculateRCattle() {
		double intrinsicRateOfIncrease = Math.log(Cattle.getLambda());
		this.r = intrinsicRateOfIncrease;
	}
	
	public void calculateRHorse() {
		double intrinsicRateOfIncrease = Math.log(Horse.getLambda());
		this.r = intrinsicRateOfIncrease;		
	}
	
	public void calculateRDeer() {
		double intrinsicRateOfIncrease = Math.log(Deer.getLambda());
		this.r = intrinsicRateOfIncrease;		
	}

}
