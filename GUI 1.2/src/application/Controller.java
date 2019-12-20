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
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableView;
import livingOrganisms.Cattle;
import livingOrganisms.Horse;
import models.ExponentialPopulationGrowth;




public class Controller implements Initializable{
	
	//scene items
	@FXML private Button buttonCalculate;
	@FXML private StackedAreaChart<Number,Number> chart;
	@FXML private TreeTableView<TableResult> table;
	
	//adding data into the chart, table
	public void calculate(ActionEvent event) {
		//deletes previous data in case there was some 
		chart.getData().removeAll(chart.getData());
		
		//instances
		Cattle cattle=new Cattle();
		ExponentialPopulationGrowth growthC=new ExponentialPopulationGrowth(cattle);
		Horse horse=new Horse();
		ExponentialPopulationGrowth growthH=new ExponentialPopulationGrowth(horse);
		
		//model calculates data and puts it into a series, for some reason it calculates with the same numbers
		//which are the the second call of constructor
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
		TreeItem<TableResult> year11=new TreeItem<TableResult>(new TableResult(1,"cattle",100));
		TreeItem<TableResult> year12=new TreeItem<TableResult>(new TableResult(1,"horse",100));
		TreeItem<TableResult> year13=new TreeItem<TableResult>(new TableResult(1,"wolf",100));
		TreeItem<TableResult> year1=new TreeItem<TableResult>(new TableResult(1));
		year1.getChildren().add(year11);
		year1.getChildren().add(year12);
		year1.getChildren().add(year13);
		
		TreeItem<TableResult> year21=new TreeItem<TableResult>(new TableResult(2,"cattle",200));
		TreeItem<TableResult> year22=new TreeItem<TableResult>(new TableResult(2,"horse",420));
		TreeItem<TableResult> year23=new TreeItem<TableResult>(new TableResult(2,"wolf",123));
		TreeItem<TableResult> year2=new TreeItem<TableResult>(new TableResult(2));
		year2.getChildren().setAll(year21,year22,year23);
		
		

		table.setRoot(year1);
		table.setShowRoot(true);
		table.setRoot(year2);
		
	}

	
	
   
   
    
 

   
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
