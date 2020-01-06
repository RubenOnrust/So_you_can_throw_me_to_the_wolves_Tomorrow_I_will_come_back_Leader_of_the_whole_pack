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
import livingOrganisms.Horse;
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
		
		//here you get input from buttons
		 if ((cattleInput.getText() != null && !cattleInput.getText().isEmpty())) {
			// if (int cattleInput.getText()>0 &&
					 JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");
			 	System.out.println(cattleInput.getText());
		        } else {
		        	JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");
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
		 
		//instances
		Cattle cattle=new Cattle();
		//ExponentialPopulationGrowth growthC=new ExponentialPopulationGrowth(cattle);
		Horse horse=new Horse();
		//ExponentialPopulationGrowth growthH=new ExponentialPopulationGrowth(horse);
		
		//model calculates data and puts it into a series
		//growthC.updateModel();
		XYChart.Series<Number,Number> cattleSeries= new XYChart.Series<Number,Number>();
		
		//cattleSeries=growthC.getExpPopGrowthSeries();
		//growthH.updateModel();
		XYChart.Series<Number,Number> horseSeries= new XYChart.Series<Number,Number>();
		//horseSeries=growthH.getExpPopGrowthSeries();
		
		
		//draws data into the chart
		chart.getData().add(cattleSeries);
		chart.getData().add(horseSeries);
		
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
