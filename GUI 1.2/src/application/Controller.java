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
import livingOrganisms.Cattle;
import livingOrganisms.Horse;
import models.ExponentialPopulationGrowth;




public class Controller implements Initializable{
	
	//button calculate
	@FXML private Button buttonCalculate;
	
	//stacked chart
	@FXML private StackedAreaChart<Number,Number> chart;
	//adding data into the chart, 
	public void calculate(ActionEvent event) {
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
	}

	//chart 
	
   
   
    
 

   
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
