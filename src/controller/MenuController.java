package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {
	@FXML
	private Button btnCombate;
	@FXML
	private Button btnCaptura;
	@FXML
	private Button btnTienda;
	@FXML
	private Button btnPonerCaja;
	@FXML
	private Stage stage;
	// Event Listener on Button[#btnCombate].onAction
	@FXML
	public void btnPonerCombate(ActionEvent event) {
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
	// Event Listener on Button[#btnCaptura].onAction
	@FXML
	public void btnPonerCaptura(ActionEvent event) {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Captura.fxml"));
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
	// Event Listener on Button[#btnTienda].onAction
	@FXML
	public void btnPonerTienda(ActionEvent event) {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Tienda.fxml"));
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
	public void btnAccionPonerCaja(ActionEvent event) {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Caja.fxml"));
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
