
package models;

public class PredationModelPreyGrowth extends Model {
	private int victem;
	private int predator;
	private float growthRateVictems;
	private float constantK;
	private float constantD;
	private int populationRise;
	
	public PredationModelPreyGrowth(int victem, int predator, float growthRateVictems, float constantK, float constantD,
			int populationRise) {
		super();
		this.victem = victem;
		this.predator = predator;
		this.growthRateVictems = growthRateVictems;
		this.constantK = constantK;
		this.constantD = constantD;
		this.populationRise = populationRise;
		
	
	}
	public int getPopulationRise() {
		return populationRise;
	}
	public void setPopulationRise(int populationRise) {
		this.populationRise = populationRise;
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
	public void calculatingFormula(int victem, int predator, float growthRateVictems, float constantK, float constantD) {
		int V = victem;
		int P = predator;
		float r = growthRateVictems;
		float k = constantK;
		float D = constantD;
		
		float victemPopulationGrowth = k*V;
		victemPopulationGrowth = victemPopulationGrowth/(V+D);
		victemPopulationGrowth = victemPopulationGrowth*P;
		victemPopulationGrowth = (r*V)-victemPopulationGrowth;
		this.populationRise = Math.round(victemPopulationGrowth);
	}
	
	
	
	
}
