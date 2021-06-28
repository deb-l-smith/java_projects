package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label result;
	private long num1 = 0, num2;
	private String operator = "";
	private boolean start = true;
	private Model model = new Model();
		
	//method to process the AC button
	@FXML
	public void clearButton(ActionEvent event) {
			result.setText("");
			num1 = 0;
			num2 = 0;
			start = true;
	}
		
	//method to process numbers
	@FXML
	public void processNumbers(ActionEvent event) {
		
		if(start) {
			result.setText("");
			start = false;
		}
		
		//gets the number for the button and transfers it to value
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText() + value);
	}
	
	//method to process operators using two numbers
	@FXML
	public void processOperators(ActionEvent event) {
		
		//gets the number for the button and transfers it to value
		String value = ((Button)event.getSource()).getText();
		
		if (!value.equals("=")) {
			if (!operator.isEmpty()) //checking if operator is not empty
				return;
			
			operator = value;
			num1 = Long.parseLong(result.getText());
			result.setText(""); //set back to blank
			
		} else {
			if (operator.isEmpty()) //checking if operator is empty
				return;
			num2 = Long.parseLong(result.getText());
			float output = model.calculate(num1, num2, operator); //assign result to output
			result.setText(String.valueOf(output));
			operator = ""; //set operator to blank
			start = true; //set start to true
		}
		
	}	
		
	//method to process operators using one number
	@FXML
	public void processOperatorsOneNum(ActionEvent event) {
		
		//gets the number for the button and transfers it to value
		String value = ((Button)event.getSource()).getText();
				
		if (!value.equals("=")) {
			if (!operator.isEmpty()) //checking if operator is not empty
				return;
			
			operator = value;
			num1 = Long.parseLong(result.getText());
			result.setText(""); //set back to blank
		
			float output = model.calculateOneNum(num1, operator); //assign result to output
			result.setText(String.valueOf(output));
			operator = ""; //set operator to blank
			start = true; //set start to true
		}
	}

} //end of class MainController
