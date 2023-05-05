package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

	@FXML
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../vista/InicioSesion.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Pokemon");
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void btnlogin(ActionEvent event) throws IOException {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Menu.fxml"));
			Parent root = Loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			Stage stage2 = (Stage) this.btnLogin.getScene().getWindow();
			stage.setResizable(false);
			stage.setTitle("Pokemon");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage2.close();
			stage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
