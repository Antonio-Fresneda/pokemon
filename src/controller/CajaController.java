package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class CajaController {
	@FXML
	private TableView TablaCaja;
	@FXML
	private TableView TablaEquipo;
	@FXML
	private Button btnAtrasCaja;
	
	private Stage stage;
	// Event Listener on Button[#btnAtrasCaja].onAction
	@FXML
	public void btnAccionAtrasCaja(ActionEvent event) {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Menu.fxml"));
			Parent root = Loader.load();
			Scene scene = new Scene(root);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setResizable(false);
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
