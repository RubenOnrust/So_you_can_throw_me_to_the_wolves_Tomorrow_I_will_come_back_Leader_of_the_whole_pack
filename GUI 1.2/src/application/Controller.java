package application;

import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import livingOrganisms.AlphaConstants;
import livingOrganisms.Cattle;
import livingOrganisms.Deer;
import livingOrganisms.Horse;
import livingOrganisms.Wolve;
import models.OutputPredationModelPreyGrowth;
public class Controller implements Initializable {
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
	private NumberAxis xAxis;
	
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

	//function for the button
	public void calculate(ActionEvent event) {
		// IntialPopulationSizes
		if(checkInput(cattleInput)) {
			Cattle.setInitialPopulationSize(Integer.parseInt(cattleInput.getText()));
		}
		if(checkInput(horseInput)) {
			Horse.setInitialPopulationSize(Integer.parseInt(horseInput.getText()));
		}
		if(checkInput(deerInput)) {
			Deer.setInitialPopulationSize(Integer.parseInt(deerInput.getText()));
		}
		if(checkInput(wolfInput)) {
			Wolve.setPopulationSize(Integer.parseInt(wolfInput.getText()));
		}
		if(checkInput(yearsInput)) {
			AlphaConstants.setYears(Integer.parseInt(yearsInput.getText())+1);
		}
		OutputPredationModelPreyGrowth a = new OutputPredationModelPreyGrowth();			   	
	 	
	 	calculateData(a);
	    fillTable(a);
	    fillChart(a);
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
		}
	
	
	//clears the chart, creates XYSeries, fills the series,draws it
	public void fillChart(OutputPredationModelPreyGrowth output) {
		chart.getData().removeAll(chart.getData());
		
		XYChart.Series<Number,Number> cattleSeries=new XYChart.Series<Number,Number>();
	    cattleSeries.setName("Cattle");
	    XYChart.Series<Number,Number> deerSeries=new XYChart.Series<Number,Number>();
	    deerSeries.setName("Deer");
	    XYChart.Series<Number,Number> wolfSeries=new XYChart.Series<Number,Number>();
	    wolfSeries.setName("Wolves");
	    XYChart.Series<Number,Number> horseSeries=new XYChart.Series<Number,Number>();
	    horseSeries.setName("Horses");
		int c=0;
	    while ( (output.getOutputPredationModel().size())>c) {
	    	cattleSeries.getData().add(new Data<Number, Number> (c,output.getOutputListCattle().get(c)));
	    	deerSeries.getData().add(new Data<Number, Number> (c,output.getOutputListDeer().get(c)));
	    	wolfSeries.getData().add(new Data<Number, Number> (c,output.getOutputListWolve().get(c)));
	    	horseSeries.getData().add(new Data<Number, Number> (c,output.getOutputListHorse().get(c)));
	    	c++;}
		
		chart.getData().addAll(cattleSeries,deerSeries,horseSeries,wolfSeries);
		}
	
	//checks whether the input is proper input
	public boolean checkInput(TextField input) {
		if ((input.getText() != null && !input.getText().isEmpty())) {
			try {
				if (Integer.parseInt(input.getText()) >=0) {
					return true;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "You need to enter a number equal or bigger than 0.");
				
			}}
		return false;
	}
	
	//fills in the table
	public void fillTable(OutputPredationModelPreyGrowth output) {
		tableView.getItems().clear();
		int i=0;
		while ( (output.getOutputPredationModel().size())>i) {
		 	TableResult test = new TableResult(i,output.getOutputListCattle().get(i),output.getOutputListDeer().get(i),output.getOutputListHorse().get(i),output.getOutputListWolve().get(i));
			System.out.println(test.toString());
	    	tableView.getItems().add(test);
	    	i++;	
		}}
	//calculates Data
	public void calculateData(OutputPredationModelPreyGrowth output) {
		output.getOutputListCattle().clear();
		output.getOutputListDeer().clear();
		output.getOutputListHorse().clear();
		output.getOutputListWolve().clear();
	    output.calculateObservableListWithCattleResults();
	   	output.getOutputListCattle();
	   	output.calculateObservableListWithDeerResults();
	   	output.getOutputListDeer();
	   	output.calculateObservableListWithHorseResults();
    	output.getOutputListHorse();
    	output.calculateObservableListWithWolveResults();
	   	output.getOutputListWolve();	
	    }
}
