package models;

import java.util.ArrayList;
import java.util.List;

import livingOrganisms.Cattle;
import livingOrganisms.Wolve;

public class OutputPredationModelPreyGrowth {
	private ArrayList<Integer> outputPredationModel = new ArrayList<Integer>();

	public OutputPredationModelPreyGrowth(ArrayList<Integer> outputPredationModel) {
		super();
		this.outputPredationModel = outputPredationModel;
	}

	public List<Integer> getOutputPredationModel() {
		return outputPredationModel;
	}

	public void setOutputPredationModel(ArrayList<Integer> outputPredationModel) {
		this.outputPredationModel = outputPredationModel;
	}
	
	public void calculateArraylistWithResults() {
		int i = 0;
		int p = Wolve.getPopulationSize();
    	IntrinsicRateOfIncrease r = new IntrinsicRateOfIncrease(0.1);
    	r.calculateRCattle();
    	ConstantK k = new ConstantK(0);
    	k.calculateKCattle();
    	ConstantD d = new ConstantD(0);
    	d.calculateDCattle();
    	int v = Cattle.initialPopulationSize;
        PredationModelPreyGrowth model = new PredationModelPreyGrowth(v, p, r, k, d);
        model.calculatingFormula();
        ArrayList<Integer> listPopulationSizes = new ArrayList<Integer>();
        while (i<10) {
        	i++;
        	listPopulationSizes.add(model.getVictem());
        	model.setVictem(model.getVictem()+model.getPopulationRise());
        	model.calculatingFormula();
//			if(i == 10) {
//				System.out.println(listPopulationSizes);
//				
//			}
        }
        this.outputPredationModel = listPopulationSizes;
	}
	@Override
	public String toString() {
		return "OutputPredationModelPreyGrowth [Populationsize=" + outputPredationModel + "]";
	}
}
