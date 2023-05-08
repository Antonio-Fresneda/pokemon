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

public class CombateController extends Application {
	@FXML
	private Button btnHuir;
	private Stage stage;
	@Override
	public void start(Stage primaryStage) {

	}

	public void btnHuir(ActionEvent event) {
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