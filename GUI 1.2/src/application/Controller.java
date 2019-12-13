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
import models.ExponentialPopulationGrowth;




public class Controller implements Initializable{
	Cattle cattle=new Cattle();
	ExponentialPopulationGrowth growth=new ExponentialPopulationGrowth(cattle);
	//button calculate
	@FXML private Button buttonCalculate;
	@FXML private StackedAreaChart<Number,Number> chart;
	public void calculate(ActionEvent event) {
		System.out.println("work bitch");
		growth.updateModel();
		XYChart.Series<Number,Number> seriesApril= new XYChart.Series<Number,Number>();
		seriesApril.getData().add(new XYChart.Data<Number,Number>(1,10));
		seriesApril.getData().add(new XYChart.Data<Number,Number>(2,20));
		seriesApril.getData().add(new XYChart.Data<Number,Number>(3,30));
		seriesApril.getData().add(new XYChart.Data<Number,Number>(4,40));
		seriesApril.getData().add(new XYChart.Data<Number,Number>(5,50));
		
		XYChart.Series<Number,Number> series2= new XYChart.Series<Number,Number>();
		series2.getData().add(new XYChart.Data<Number,Number>(2,20));
		series2.getData().add(new XYChart.Data<Number,Number>(3,30));
		series2.getData().add(new XYChart.Data<Number,Number>(4,40));
		series2.getData().add(new XYChart.Data<Number,Number>(5,50));
		series2.getData().add(new XYChart.Data<Number,Number>(5,50));
		
		chart.getData().add(seriesApril);
		chart.getData().add(series2);
	}

	//chart 
	
   
   
    
 

   
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
