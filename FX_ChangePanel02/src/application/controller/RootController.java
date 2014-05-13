package application.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import application.action.ButtonAction;

public class RootController implements Initializable {
	@FXML AnchorPane root;

	public RootController() {

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		GridPane grid = new GridPane();
		ArrayList<Button> buttonList = new ArrayList<Button>();

		for (int i = 0; i < 100; i++) {
			String num = String.valueOf(i);			
			int j = i / 10;
			int k = i % 10;
			Button button = new Button(num);
			buttonList.add(button);
			grid.add(button, j, k);

			ButtonAction action = new ButtonAction(buttonList);
			button.setOnAction(action);
		}

		AnchorPane.setTopAnchor(grid, 0.0);
		AnchorPane.setBottomAnchor(grid, 0.0);
		AnchorPane.setLeftAnchor(grid, 0.0);
		AnchorPane.setRightAnchor(grid, 0.0);
		this.root.getChildren().add(grid);
	}

}