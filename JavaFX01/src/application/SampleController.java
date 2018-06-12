package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {
	
	@FXML
	private Button myButton;
	
	@FXML
	private void initialize() {
		// Handle Button event.
		myButton.setOnAction((event) -> {
			System.out.println("Button Action");
			//Platform.exit();
		});
	}
}
