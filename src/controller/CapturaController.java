package controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CapturaController extends Application {
	@FXML
	private Button btnCapturar;
	@FXML
	private Button btnBuscar;
	@FXML
	private Button btnAtrasCaptura;

	@Override
	public void start(Stage primaryStage) {

	}

	public void btnAtrasCaptura(ActionEvent event) {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Menu.fxml"));
			Parent root = Loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			Stage stage6 = (Stage) this.btnAtrasCaptura.getScene().getWindow();
			stage.setResizable(false);
			stage.setTitle("Pokemon");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage6.close();
			stage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void btnCapturar(ActionEvent event) {

	}

	public void btnBuscar(ActionEvent event) {
	}

}
