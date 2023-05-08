package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pokemon.Entrenador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import crud.EntrenadorCrud;
import javafx.application.Application;
import javafx.event.ActionEvent;

public class InicioSesionController extends Application {
	@FXML
	private Button btnLogin;
	@FXML
	private Stage stage;
	@FXML
	private Button btnNuevo;
	@FXML
	private TextField textoUsuario;
	@FXML
	private TextField textoContraseña;
	@FXML
	private static Text txtRight;
	
	private static boolean cambioDeVentana;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// prueba
		//		txtRight.setVisible(false);
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void btnLogin(ActionEvent event) throws IOException {
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

	public void btnRegistrarse(ActionEvent event) throws SQLException {

		EntrenadorCrud.insertarDatos(textoUsuario.getText(), textoContraseña.getText());
		if((textoUsuario.getText().length()!=0)&&(textoContraseña.getText().length()!=0)) {
			txtRight.setVisible(true);
		}
	}
	
// prueba
//	public static boolean obtenerCambioDeVentana() {
//		return cambioDeVentana;
//
//	}
//
//	public static void valorCambioDeVentana() {
//
//		cambioDeVentana = true;
//	}
//	public Text comprobacion() {
//		return txtRight;
//	}
//	public static void comprobacion2() {
//		txtRight.setVisible(false);
//	}
}