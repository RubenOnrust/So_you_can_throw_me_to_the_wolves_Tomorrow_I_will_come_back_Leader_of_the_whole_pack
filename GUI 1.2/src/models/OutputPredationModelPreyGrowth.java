package models;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import livingOrganisms.AlphaConstants;
import livingOrganisms.Cattle;
import livingOrganisms.Deer;
import livingOrganisms.Horse;
import livingOrganisms.Wolve;

public class OutputPredationModelPreyGrowth {
	private ArrayList<Integer> outputPredationModel = new ArrayList<Integer>();
	private ObservableList<Integer> outputListCattle = FXCollections.observableArrayList();
	private ObservableList<Integer> outputListHorse = FXCollections.observableArrayList();
	private ObservableList<Integer> outputListDeer = FXCollections.observableArrayList();
	private ObservableList<Integer> outputListWolve = FXCollections.observableArrayList();

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

	public ObservableList<Integer> getOutputListWolve() {
		return outputListWolve;
	}

	public void setOutputListWolve(ObservableList<Integer> outputListWolve) {
		this.outputListWolve = outputListWolve;
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
		while (i < AlphaConstants.getYears()) {
			i++;
			listPopulationSizes.add(model.getVictem());
			model.setVictem(model.getVictem() + model.getPopulationRise());
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
		while (i < AlphaConstants.getYears()) {
			i++;
			listPopulationSizes.add(model.getVictem());
			model.setVictem(model.getVictem() + model.getPopulationRise());
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
		while (i < AlphaConstants.getYears()) {
			i++;
			listPopulationSizes.add(model.getVictem());
			model.setVictem(model.getVictem() + model.getPopulationRise());
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

	public void calculateObservableListWithWolveResults() {
		int i = 0;
		double populationSize = Wolve.getPopulationSize();
		while (i < AlphaConstants.getYears()) {
			i++;
			IntrinsicRateOfIncrease r = new IntrinsicRateOfIncrease(0.1);
			double populationRise = populationSize * r.getR();
			populationSize = populationRise + populationSize;
			this.outputListWolve.add((int) Math.round(populationSize));
		}
	}

	@Override
	public String toString() {
		return "OutputPredationModelPreyGrowth [Populationsize=" + outputPredationModel + "]";
	}
}
