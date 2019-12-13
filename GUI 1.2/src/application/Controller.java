package application;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;



public class Controller implements Initializable{
	@FXML
	private Button buttonCalculate;
	
	public void calculate(ActionEvent event) {
		System.out.println("work bitch");
	
	
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
