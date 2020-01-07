package application;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import datamodel.FoodChain;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import livingOrganisms.Cattle;
import livingOrganisms.Deer;
import livingOrganisms.Horse;
import livingOrganisms.Wolve;
import models.OutputPredationModelPreyGrowth;
import models.PredationModelPreyGrowth;

public class Controller implements Initializable {
	// bliepbuyoyoyoo
	// scene items
	@FXML
	private Button buttonCalculate;
	@FXML
	private Button testButton;
	@FXML
	private AreaChart<Number, Number> chart;
	@FXML
	private NumberAxis yAxis;
	
	@FXML
	private TableView<TableResult> tableView;
	
	@FXML
	private TableColumn <TableResult,Integer>cattleColumn;
	@FXML
	private TableColumn <TableResult,Integer>deerColumn;
	@FXML
	private TableColumn <TableResult,Integer>horseColumn;
	@FXML
	private TableColumn <TableResult,Integer>wolfColumn;
	@FXML
	private TableColumn <TableResult,Integer>yearColumn;

	
	@FXML
	private TextField cattleInput;
	@FXML
	private TextField horseInput;
	@FXML
	private TextField deerInput;
	@FXML
	private TextField wolfInput;
	@FXML
	private TextField yearsInput;

	// adding data into the chart, table
	public void calculate(ActionEvent event) {
		// deletes previous data for the chart in case there was some
		chart.getData().removeAll(chart.getData());
		
		// here you get input, checks whether it is an integer, then sets
		// IntialPopulationSizes
		if ((cattleInput.getText() != null && !cattleInput.getText().isEmpty())) {
			try {
				if (Integer.parseInt(cattleInput.getText()) > 0 && Integer.parseInt(cattleInput.getText()) < 100) {
					Cattle.setInitialPopulationSize(Integer.parseInt(cattleInput.getText()));
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");
			}
		}
		if ((horseInput.getText() != null && !horseInput.getText().isEmpty())) {
			try {
				if (Integer.parseInt(horseInput.getText()) > 0 && Integer.parseInt(horseInput.getText()) < 100) {
					Horse.setInitialPopulationSize(Integer.parseInt(horseInput.getText()));
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");
			}
		}
		if ((deerInput.getText() != null && !deerInput.getText().isEmpty())) {
			try {
				if (Integer.parseInt(deerInput.getText()) > 0 && Integer.parseInt(deerInput.getText()) < 100) {
					Deer.setInitialPopulationSize(Integer.parseInt(deerInput.getText()));
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");
			}
		}
		if ((wolfInput.getText() != null && !wolfInput.getText().isEmpty())) {
			try {
				if (Integer.parseInt(wolfInput.getText()) > 0 && Integer.parseInt(wolfInput.getText()) < 100) {
					Wolve.setPopulationSize(Integer.parseInt(wolfInput.getText()));
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");
			}
		}
		if ((yearsInput.getText() != null && !yearsInput.getText().isEmpty())) {
			try {
				if (Integer.parseInt(yearsInput.getText()) > 0 && Integer.parseInt(yearsInput.getText()) < 100) {
					// don't know where to put this now(Integer.parseInt(yearsInput.getText()));
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "You need to enter a number between 0 and 100");
			}
		}



		//table
		OutputPredationModelPreyGrowth a = new OutputPredationModelPreyGrowth();
	 	int i = 0;
//	    TableResult a1 =  new TableResult();
	   	
	 	//creates series
	    XYChart.Series<Number,Number> cattleSeries=new XYChart.Series<Number,Number>();
	    cattleSeries.setName("Cattle");
	    XYChart.Series<Number,Number> deerSeries=new XYChart.Series<Number,Number>();
	    deerSeries.setName("Deer");
	    XYChart.Series<Number,Number> wolfSeries=new XYChart.Series<Number,Number>();
	    wolfSeries.setName("Wolves");
	    XYChart.Series<Number,Number> horseSeries=new XYChart.Series<Number,Number>();
	    horseSeries.setName("Horses");
	    //loop to add data
	    while ( 10>i) {
		 	TableResult test = new TableResult();
			a.calculateObservableListWithCattleResults();
			a.getOutputListCattle();
			a.calculateObservableListWithDeerResults();
			a.getOutputListDeer();
			a.calculateObservableListWithHorseResults();
			a.getOutputListHorse();
			a.calculateObservableListWithWolveResults();
			a.getOutputListWolve();
	    	test.setYear(i);
	    	test.setCattle((a.getOutputListCattle().get(i)));
	    	test.setDeer((a.getOutputListDeer().get(i)));
	    	test.setHorse((a.getOutputListHorse().get(i)));
	    	test.setWolve((a.getOutputListWolve().get(i)));
	    	System.out.println(test.toString());
	    	tableView.getItems().add(test);
	    	
	    	//populates chart series
	    	//cattleSeries.getData().add(new Data<Number, Number> (i,a.getOutputListCattle().get(i)));
	    	//deerSeries.getData().add(new Data<Number, Number> (i,a.getOutputListDeer().get(i)));
	    	//wolfSeries.getData().add(new Data<Number, Number> (i,a.getOutputListWolve().get(i)));
	    	//horseSeries.getData().add(new Data<Number, Number> (i,a.getOutputListHorse().get(i)));
	    	
	    	
	    	i++;	
		}
	    //??
	    
	    
	    for(int c =0; c<a.getOutputPredationModel().size() ;c++) {
	    	cattleSeries.getData().add(new Data<Number, Number> (c,a.getOutputListCattle().get(c)));
	    	deerSeries.getData().add(new Data<Number, Number> (c,a.getOutputListDeer().get(c)));
	    	wolfSeries.getData().add(new Data<Number, Number> (c,a.getOutputListWolve().get(c)));
	    	horseSeries.getData().add(new Data<Number, Number> (c,a.getOutputListHorse().get(c)));
	    	c++;
	    	
	    }
	    //adds series into the graph
	    chart.getData().add(cattleSeries);
	    chart.getData().add(deerSeries);
	    chart.getData().add(horseSeries);
	    chart.getData().add(wolfSeries);

		
	    

		// empties text fields
		cattleInput.clear();
		wolfInput.clear();
		deerInput.clear();
		yearsInput.clear();
		horseInput.clear();
		

	}
	ObservableList<TableResult> observableList= FXCollections.observableArrayList();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));
		
		cattleColumn.setCellValueFactory(new PropertyValueFactory<>("cattle"));
		deerColumn.setCellValueFactory(new PropertyValueFactory<>("deer"));
		horseColumn.setCellValueFactory(new PropertyValueFactory<>("horse"));
		wolfColumn.setCellValueFactory(new PropertyValueFactory<>("wolve"));
		
		
		
		//load data
		//tableView.setItems(observableList);
		
		
		

	}
	
	 public void addData() {
			OutputPredationModelPreyGrowth a = new OutputPredationModelPreyGrowth();
		 	int i = 0;
//		    TableResult a1 =  new TableResult();
		    Cattle.setInitialPopulationSize(Integer.parseInt(cattleInput.getText()));
		    Deer.setInitialPopulationSize(Integer.parseInt(deerInput.getText()));
		    Horse.setInitialPopulationSize(Integer.parseInt(horseInput.getText()));
		    Wolve.setPopulationSize(Integer.parseInt(wolfInput.getText()));
		 
		    while ( 10>i) {
			 	TableResult test = new TableResult();
				a.calculateObservableListWithCattleResults();
				a.getOutputListCattle();
				a.calculateObservableListWithDeerResults();
				a.getOutputListDeer();
				a.calculateObservableListWithHorseResults();
				a.getOutputListHorse();
				a.calculateObservableListWithWolveResults();
				a.getOutputListWolve();
		    	test.setYear(i);
		    	test.setCattle((a.getOutputListCattle().get(i)));
		    	test.setDeer((a.getOutputListDeer().get(i)));
		    	test.setHorse((a.getOutputListHorse().get(i)));
		    	test.setWolve((a.getOutputListWolve().get(i)));
		    	System.out.println(test.toString());
		    	tableView.getItems().add(test);
		    	
		 
		    	
		    	
		    	i++;	
			}

		    
		    cattleInput.clear();
		    deerInput.clear();
		    horseInput.clear();
		    wolfInput.clear();
		    yearsInput.clear();
		    
		    
		   
		   
		   
	   }

	   
	
	
}
