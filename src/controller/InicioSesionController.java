package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;

public class InicioSesionController extends Application {
	@FXML
	private Button btnLogin;
	private Stage stage;
	@FXML
	@Override
	public void start(Stage primaryStage) throws Exception {
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void btnlogin(ActionEvent event) throws IOException {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Menu.fxml"));
			Parent root = Loader.load();
			Scene scene = new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setResizable(false);
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
