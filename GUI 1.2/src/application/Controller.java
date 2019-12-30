package application;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import livingOrganisms.Cattle;
import livingOrganisms.Horse;
import models.ExponentialPopulationGrowth;




public class Controller implements Initializable{
	
	//scene items
	@FXML private Button buttonCalculate;
	@FXML private StackedAreaChart<Number,Number> chart;
	@FXML private TreeTableView<TableResult> table;
	@FXML private TreeTableColumn<TableResult,String> animalColumn;
	@FXML private TreeTableColumn<TableResult,Number> popSizeColumn;
	@FXML private TextField cattleInput;
	@FXML private TextField horseInput; 
	@FXML private TextField deerInput;
	@FXML private TextField wolfInput;
	@FXML private TextField yearsInput;
	
	
	
	//adding data into the chart, table
	public void calculate(ActionEvent event) {
		//deletes previous data for the chart in case there was some 
		chart.getData().removeAll(chart.getData());
		table.setRoot(null);
		
		//here you get input from buttons
		 if ((cattleInput.getText() != null && !cattleInput.getText().isEmpty())) {
			 	System.out.println(cattleInput.getText());
		        } else {
		        	System.out.println();
		        }
		     
		
		//instances
		Cattle cattle=new Cattle();
		ExponentialPopulationGrowth growthC=new ExponentialPopulationGrowth(cattle);
		Horse horse=new Horse();
		ExponentialPopulationGrowth growthH=new ExponentialPopulationGrowth(horse);
		
		//model calculates data and puts it into a series
		growthC.updateModel();
		XYChart.Series<Number,Number> cattleSeries= new XYChart.Series<Number,Number>();
		cattleSeries=growthC.getExpPopGrowthSeries();
		growthH.updateModel();
		XYChart.Series<Number,Number> horseSeries= new XYChart.Series<Number,Number>();
		horseSeries=growthH.getExpPopGrowthSeries();
		
		
		//draws data into the chart
		chart.getData().add(cattleSeries);
		chart.getData().add(horseSeries);
		
		//Table
		//defines what will be displayed in which column
		animalColumn.setCellValueFactory(new TreeItemPropertyValueFactory<TableResult,String>("animal"));
		popSizeColumn.setCellValueFactory(new TreeItemPropertyValueFactory<TableResult,Number>("popSize"));
		
		//fake data just so it shows something
		TreeItem<TableResult> year11=new TreeItem<TableResult>(new TableResult("cattle",30));
		TreeItem<TableResult> year12=new TreeItem<TableResult>(new TableResult("horse",100));
		TreeItem<TableResult> year13=new TreeItem<TableResult>(new TableResult("wolf",100));
		TreeItem<TableResult> year1=new TreeItem<TableResult>(new TableResult("Year 1"));
		year1.getChildren().add(year11);
		year1.getChildren().add(year12);
		year1.getChildren().add(year13);
		TreeItem<TableResult> year21=new TreeItem<TableResult>(new TableResult("cattle",200));
		TreeItem<TableResult> year22=new TreeItem<TableResult>(new TableResult("horse",420));
		TreeItem<TableResult> year23=new TreeItem<TableResult>(new TableResult("wolf",123));
		TreeItem<TableResult> year2=new TreeItem<TableResult>(new TableResult("Year 2"));
		year2.getChildren().setAll(year21,year22,year23);
		
		//hierarchy of the table
		TreeItem<TableResult> root= new TreeItem<>(new TableResult(""));
		root.getChildren().setAll(year1,year2);
		table.setRoot(root);
		table.setShowRoot(false);
		
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
