package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Model {
	
	public float calculate(long num1, long num2, String operator) 
	{
		
		switch(operator)
		{
			case "mod":
				return num1 % num2; //modular division
			case "pow":
				return (float)Math.pow(num1, num2); //Math.pow(num1, num2)
			case "+":
				return num1 + num2;
			case "-":
				return num1 - num2;
			case "*":
				return num1 * num2;
			case "/":
				if(num2 == 0)
					return 0;
				else
				return num1 / num2;
			default:
				return 0;
		}
	}
			
	public float calculateOneNum(long num1, String operator) 
	{
		switch(operator)
		{
		case "sqrt":
			return (float)Math.sqrt(num1);
		case "p2":
			return (float)Math.pow(num1,2); //Math.pow(num1,2)
		default:
			return 0;
		}
	
	}
	
	
} //end of class Model