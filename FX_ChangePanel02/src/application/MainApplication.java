package application;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		URL url = this.getClass().getResource("view/fxml/RootLayout.fxml");
		System.out.println(url);
		GridPane root = FXMLLoader.load(url);
		Scene scene = new Scene(root);

		primaryStage.setTitle("くるりんぱ");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
