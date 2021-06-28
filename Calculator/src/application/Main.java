/*
Assignment due Monday, May 10, 2021
After viewing the JavaFX videos from the Week 15 / 16 Panopto Session Announcement, expand the calculator to include:
•	function for modular division (%) 
•	function for square roots (sqrt)
•	function for raising a number to the second power (x2)
Then upload your completed code as a JAR file to this link by the due date.
**/
package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("JavaFX Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
