package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class RootController implements Initializable {

	@FXML
	GridPane grid;

	public RootController() {

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Button button = new Button("i");
				this.grid.add(button, i, j);
			}
		}
	}
}
