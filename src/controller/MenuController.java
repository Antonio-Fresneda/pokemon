package controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuController extends Application {
	@FXML
	private Button btnCombate;
	@FXML
	private Button btnCaptura;
	
	private Stage stage;
	public void start(Stage primaryStage) {
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void btnCombate(ActionEvent event) {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Combate.fxml"));
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

	

	public void btnCaptura(ActionEvent event) {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Captura.fxml"));
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

