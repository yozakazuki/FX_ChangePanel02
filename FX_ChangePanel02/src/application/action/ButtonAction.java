package application.action;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonAction implements EventHandler<ActionEvent> {
	private ArrayList<Button> buttonList;

	public ButtonAction(ArrayList<Button> _buttonList) {
		this.buttonList = _buttonList;
	}

	@Override
	public void handle(ActionEvent arg0) {
		for (int i = 0; i < buttonList.size(); i++) {
			Button button = buttonList.get(i);
			String text = button.getText();
			button.setText("?");	
			if (text == "?") {
				String num = String.valueOf(i);
				button.setText(num);
			}
		}

	}
}