package models;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import livingOrganisms.Cattle;
import livingOrganisms.Deer;
import livingOrganisms.Horse;
import livingOrganisms.Wolve;

public class OutputPredationModelPreyGrowth {
	private ArrayList<Integer> outputPredationModel = new ArrayList<Integer>();
	private ObservableList<Integer> outputListCattle = FXCollections.observableArrayList();
	private ObservableList<Integer> outputListHorse = FXCollections.observableArrayList();
	private ObservableList<Integer> outputListDeer = FXCollections.observableArrayList();

	public OutputPredationModelPreyGrowth() {
		
	}

	public List<Integer> getOutputPredationModel() {
		return outputPredationModel;
	}

	public void setOutputPredationModel(ArrayList<Integer> outputPredationModel) {
		this.outputPredationModel = outputPredationModel;
	}
	
	public ObservableList<Integer> getOutputListCattle() {
		return outputListCattle;
	}

	public void setOutputListCattle(ObservableList<Integer> outputList) {
		this.outputListCattle = outputList;
	}
	
	public ObservableList<Integer> getOutputListHorse() {
		return outputListHorse;
	}

	public void setOutputListHorse(ObservableList<Integer> outputListHorse) {
		this.outputListHorse = outputListHorse;
	}

	public ObservableList<Integer> getOutputListDeer() {
		return outputListDeer;
	}

	public void setOutputListDeer(ObservableList<Integer> outputListDeer) {
		this.outputListDeer = outputListDeer;
	}

	public void calculateObservableListWithCattleResults() {
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
		for (int j = 0; j < listPopulationSizes.size(); j++) {
			this.outputListCattle.add(listPopulationSizes.get(j));
			
		}
        this.outputPredationModel = listPopulationSizes;
	}
	
	public void calculateObservableListWithHorseResults() {
		int i = 0;
		int p = Wolve.getPopulationSize();
    	IntrinsicRateOfIncrease r = new IntrinsicRateOfIncrease(0.1);
    	r.calculateRHorse();
    	ConstantK k = new ConstantK(0);
    	k.calculateKHorse();
    	ConstantD d = new ConstantD(0);
    	d.calculateDHorse();
    	int v = Horse.initialPopulationSize;
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
		for (int j = 0; j < listPopulationSizes.size(); j++) {
			this.outputListHorse.add(listPopulationSizes.get(j));
			
		}
        this.outputPredationModel = listPopulationSizes;
	}
	
	public void calculateObservableListWithDeerResults() {
		int i = 0;
		int p = Wolve.getPopulationSize();
    	IntrinsicRateOfIncrease r = new IntrinsicRateOfIncrease(0.1);
    	r.calculateRDeer();
    	ConstantK k = new ConstantK(0);
    	k.calculateKDeer();
    	ConstantD d = new ConstantD(0);
    	d.calculateDDeer();
    	int v = Deer.initialPopulationSize;
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
		for (int j = 0; j < listPopulationSizes.size(); j++) {
			this.outputListDeer.add(listPopulationSizes.get(j));
			
		}
        this.outputPredationModel = listPopulationSizes;
	}
	
	@Override
	public String toString() {
		return "OutputPredationModelPreyGrowth [Populationsize=" + outputPredationModel + "]";
	}
}
