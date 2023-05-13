package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import crud.EntrenadorCrud;
import javafx.event.ActionEvent;

import javafx.scene.control.PasswordField;

public class InicioSesionController {
	@FXML
	private PasswordField textoContraseña;
	@FXML
	private TextField textoUsuario;
	@FXML
	private Button btnLogin;
	@FXML
	private Button btnNuevo;
	@FXML
	private Label labMensajeCorrecto;
	@FXML
	private Label labMensajePokeDolar;
	@FXML
	private Label labMensajeInCorrecto;

	@FXML
	private Stage stage;
	

	// Event Listener on Button[#btnLogin].onAction
	@FXML
	public void btnLogin(ActionEvent event) {

		if ((textoUsuario.getText().length() != 0) && (textoContraseña.getText().length() != 0)) {

			EntrenadorCrud.comprobarDatos(textoUsuario.getText(), textoContraseña.getText());
			if (EntrenadorCrud.cambioDeVentana == true) {
				try {
					FXMLLoader Loader = new FXMLLoader(getClass().getResource("/vista/Menu.fxml"));
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
			} else if (EntrenadorCrud.obtenerCambioDeVentana() == false) {
				labMensajeInCorrecto.setText("USUARIO O CONTRASEÑA INCORRECTO");
			}
		} else {
			
		}

	}

	// Event Listener on Button[#btnNuevo].onAction
	@FXML
	public void btnRegistrarse(ActionEvent event) {
		int pokedolar;
		if ((textoUsuario.getText().length() != 0) && (textoContraseña.getText().length() != 0)) {
			EntrenadorCrud.insertarDatos(textoUsuario.getText(), textoContraseña.getText(),
					pokedolar = (int) (Math.random() * 201) + 800);
			System.out.println("Se le han otorgado" + pokedolar + " pokedolar");
			labMensajePokeDolar.setText("Se le han otorgado " + pokedolar + " pokedolar");
			labMensajeCorrecto.setText("ENTRENADOR REGISTRADO CORRECTAMENTE");

		} else {
			System.out.println("CAMPOS VACIO");
		}
	}
}
