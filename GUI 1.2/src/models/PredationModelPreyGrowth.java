
package models;

public class PredationModelPreyGrowth extends Model {
	// parameters for the model
	private int victem;
	private int predator;
	private double growthRateVictems;
	private ConstantK constantK;
	private ConstantD constantD;
	private int populationRise;
	
	// The constructer to make an object what is going to be used to calculate population growth
	public PredationModelPreyGrowth(int victem, int predator, double growthRateVictems, ConstantK constantK, ConstantD constantD) {
		super();
		this.victem = victem;
		this.predator = predator;
		this.growthRateVictems = growthRateVictems;
		this.constantK = constantK;
		this.constantD = constantD;		
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
	public double getGrowthRateVictems() {
		return growthRateVictems;
	}
	public void setGrowthRateVictems(double growthRateVictems) {
		this.growthRateVictems = growthRateVictems;
	}
	public ConstantK getConstantK() {
		return constantK;
	}
	public void setConstantK(ConstantK constantK) {
		this.constantK = constantK;
	}
	public ConstantD getConstantD() {
		return constantD;
	}
	public void setConstantD(ConstantD constantD) {
		this.constantD = constantD;
	}

	@Override
	public String toString() {
		return "PredationModelPreyGrowth [victem=" + victem + ", predator=" + predator + ", growthRateVictems="
				+ growthRateVictems + ", constantK=" + constantK.getConstantK() + ", constantD=" + constantD.getConstantD() + ", populationRise="
				+ populationRise + "]";
	}
	// the method to calculate the population growth
	public void calculatingFormula() {
		int V = this.victem;
		int P = this.predator;
		double r = this.growthRateVictems;
		double k = this.constantK.getConstantK();
		double D = this.constantD.getConstantD();
		
		double victemPopulationGrowth = k*V;
		victemPopulationGrowth = victemPopulationGrowth/(V+D);
		victemPopulationGrowth = victemPopulationGrowth*P;
		victemPopulationGrowth = (r*V)-victemPopulationGrowth;
		this.populationRise = (int) Math.round(victemPopulationGrowth);
	}
    public static void main(String[] args) {
    	ConstantK k = new ConstantK(6);
    	ConstantD d = new ConstantD(2);
        PredationModelPreyGrowth model = new PredationModelPreyGrowth(100, 2, 0.1, k, d);
        model.calculatingFormula();
        System.out.println(model);
    }
	
	
	
}
