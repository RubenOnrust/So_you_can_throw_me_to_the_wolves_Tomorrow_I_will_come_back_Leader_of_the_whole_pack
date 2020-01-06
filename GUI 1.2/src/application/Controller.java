package application;


import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import livingOrganisms.Cattle;
import livingOrganisms.Deer;
import livingOrganisms.Horse;
import livingOrganisms.Wolve;
import models.ExponentialPopulationGrowth;
import models.OutputPredationModelPreyGrowth;




public class Controller implements Initializable{
	
	//scene items
	@FXML private Button buttonCalculate;
	@FXML private StackedAreaChart<Number,Number> chart;
	@FXML private TableView<TableResult> table;
	@FXML private TableColumn yearColumn;
	@FXML private TableColumn cattleColumn;
	@FXML private TableColumn horseColumn;
	@FXML private TableColumn deerColumn;
	@FXML private TableColumn wolfColumn;	
	@FXML private TextField cattleInput;
	@FXML private TextField horseInput; 
	@FXML private TextField deerInput;
	@FXML private TextField wolfInput;
	@FXML private TextField yearsInput;
	
	
	
	//adding data into the chart, table
	public void calculate(ActionEvent event) {
		//deletes previous data for the chart in case there was some 
		chart.getData().removeAll(chart.getData());
		
		//here you get input, checks whether it is an integer, then sets IntialPopulationSizes
		 if ((cattleInput.getText() != null && !cattleInput.getText().isEmpty())) {
			 try {
				 if (Integer.parseInt(cattleInput.getText())>0 && Integer.parseInt(cattleInput.getText())<100){
					 Cattle.setInitialPopulationSize(Integer.parseInt(cattleInput.getText()));}
			 }catch (NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");}
			 }
		 if ((horseInput.getText() != null && !horseInput.getText().isEmpty())) {
			 try {
				 if (Integer.parseInt(horseInput.getText())>0 && Integer.parseInt(horseInput.getText())<100){
					 Horse.setInitialPopulationSize(Integer.parseInt(horseInput.getText()));}
			 }catch (NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");}
			 }
		 if ((deerInput.getText() != null && !deerInput.getText().isEmpty())) {
			 try {
				 if (Integer.parseInt(deerInput.getText())>0 && Integer.parseInt(deerInput.getText())<100){
					 Deer.setInitialPopulationSize(Integer.parseInt(deerInput.getText()));}
			 }catch (NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");}
			 }
		 if ((wolfInput.getText() != null && !wolfInput.getText().isEmpty())) {
			 try {
				 if (Integer.parseInt(wolfInput.getText())>0 && Integer.parseInt(wolfInput.getText())<100){
					 Wolve.setPopulationSize(Integer.parseInt(wolfInput.getText()));}
			 }catch (NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");}
			 }
		 if ((yearsInput.getText() != null && !yearsInput.getText().isEmpty())) {
			 try {
				 if (Integer.parseInt(yearsInput.getText())>0 && Integer.parseInt(yearsInput.getText())<100){
					 // don't know where to put this now(Integer.parseInt(yearsInput.getText()));
					 }
			 }catch (NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");}
			 }
			 
		
		
		//cattle observablelist
		OutputPredationModelPreyGrowth a = new OutputPredationModelPreyGrowth();
		a.calculateObservableListWithCattleResults();
		a.getOutputListCattle();
		a.calculateObservableListWithDeerResults();
		a.getOutputListDeer();
		a.calculateObservableListWithHorseResults();
		a.getOutputListHorse();
		a.calculateObservableListWithWolveResults();
		a.getOutputListWolve();
		 
		//chart

		//Table
		
		
		
		
		
		//empties text fields
		cattleInput.clear();
		wolfInput.clear();
		deerInput.clear();
		yearsInput.clear();
		horseInput.clear();		
		
	}

	
	
   
   
    
 

   
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
