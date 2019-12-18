package models;

public class PredationModelPreyGrowth extends Model {
	private int victem;
	private int predator;
	private float growthRateVictems;
	private float constantK;
	private float constantD;
	public PredationModelPreyGrowth(int victem, int predator, float growthRateVictems, float constantK,
			float constantD) {
		this.victem = victem;
		this.predator = predator;
		this.growthRateVictems = growthRateVictems;
		this.constantK = constantK;
		this.constantD = constantD;
	}
	public int getVictem() {
		return victem;
	}
	public void setVictem(int victem) {
		this.victem = victem;
	}
	public int getPredator() {
		return predator;
	}
	public void setPredator(int predator) {
		this.predator = predator;
	}
	public float getGrowthRateVictems() {
		return growthRateVictems;
	}
	public void setGrowthRateVictems(float growthRateVictems) {
		this.growthRateVictems = growthRateVictems;
	}
	public float getConstantK() {
		return constantK;
	}
	public void setConstantK(float constantK) {
		this.constantK = constantK;
	}
	public float getConstantD() {
		return constantD;
	}
	public void setConstantD(float constantD) {
		this.constantD = constantD;
	}
	@Override
	public String toString() {
		return "PredationModelPreyGrowth [victem=" + victem + ", predator=" + predator + ", growthRateVictems="
				+ growthRateVictems + ", constantK=" + constantK + ", constantD=" + constantD + "]";
	}
	
	
	
	
}
