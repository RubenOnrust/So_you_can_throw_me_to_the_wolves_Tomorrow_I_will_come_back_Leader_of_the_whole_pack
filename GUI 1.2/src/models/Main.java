package models;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import livingOrganisms.Cattle;
import livingOrganisms.Horse;
import livingOrganisms.Wolve;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputPredationModelPreyGrowth a = new OutputPredationModelPreyGrowth();
		a.calculateObservableListWithCattleResults();
		System.out.println(a.getOutputPredationModel().getClass());
		System.out.println(a.getOutputPredationModel());
		ObservableList<Integer> outputList = FXCollections.observableArrayList();
//		for (int i = 0; i < a.getOutputPredationModel().size(); i++) {
//			outputList.add(a.getOutputPredationModel().get(i));			
//		}
		System.out.println(outputList);
		System.out.println(outputList.getClass());
		Wolve.setPopulationSize(1000);
		System.out.println(a.getOutputListCattle());
		a.calculateObservableListWithHorseResults();
		System.out.println(a.getOutputListHorse().getClass());
		System.out.println(a.getOutputListHorse());
		a.calculateObservableListWithDeerResults();
		System.out.println(a.getOutputListDeer());

	}

}
