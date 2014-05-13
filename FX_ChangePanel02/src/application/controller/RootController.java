package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import application.action.ButtonAction;

public class RootController implements Initializable {
	@FXML AnchorPane root;
	URL url = RootController.class.getResource("../view/fxml/ButtonLayout.fxml");

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		GridPane grid       = new GridPane();
		ArrayList<Button> buttonList = new ArrayList<Button>();

		for (int i = 0; i < 5; i++) {
			GridPane buttonGrid = new GridPane();

			for (int j = 0; j < 30; j++) {
				Button button = null;
				try {
					button = FXMLLoader.load(url);
				} catch (IOException e) {
					e.printStackTrace();
				}

				int k  = j / 10;
				int l  = j % 10;
				String num = String.valueOf(j);
				button.setText(num);
				buttonList.add(button);

				buttonGrid.add(button, k, l);

				ButtonAction action = new ButtonAction(buttonList);
				button.setOnAction(action);
				System.out.println(buttonGrid);
			}

			grid.add(buttonGrid, i, 0);
			buttonGrid = new GridPane();
		}

		//		AnchorPane.setTopAnchor(grid, 0.0)
		//		AnchorPane.setBottomAnchor(grid, 0.0);
		//		AnchorPane.setLeftAnchor(grid, 0.0);
		//		AnchorPane.setRightAnchor(grid, 0.0);
		this.root.getChildren().add(grid);
	}

}