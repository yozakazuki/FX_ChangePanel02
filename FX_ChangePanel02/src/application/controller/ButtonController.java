package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ButtonController implements Initializable {
	@FXML Button button;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.button.setStyle("-fx-color: green;");
	}

}
