package models;

import java.util.ArrayList;

import livingOrganisms.Cattle;
import livingOrganisms.Wolve;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> test = new ArrayList<Integer>();
		OutputPredationModelPreyGrowth a = new OutputPredationModelPreyGrowth(test);
		a.calculateArraylistWithResults();
		System.out.println(a);
	}

}
