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
import java.util.Objects;

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
	private Scene scene;
	private Parent root;

	/**
	 * ESte metodo verifica si se han ingresado un nombre de usuario y una contraseña válidos. 
	 * Luego, verifica los datos proporcionados llamando al método comprobarDatos() de la clase EntrenadorCrud
	 * Si los datos son válidos y se puede realizar el inicio de sesión, carga la interfaz de usuario del menú principal desde un archivo FXML y muestra esa escena en la ventana del juego.
	 * Si los datos son incorrectos, muestra un mensaje de error en el campo de texto labMensajeInCorrecto 
	 * @param event
	 */
	
	// Event Listener on Button[#btnLogin].onAction
	@FXML
	public void btnLogin(ActionEvent event) {

		if ((textoUsuario.getText().length() != 0) && (textoContraseña.getText().length() != 0)) {

			EntrenadorCrud.comprobarDatos(textoUsuario.getText(), textoContraseña.getText());
			if (EntrenadorCrud.cambioDeVentana == true) {
				try {
					root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/Menu.fxml")));
					scene = new Scene(root, 910, 504);
					stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					stage.setTitle("Pokemon");
					stage.setScene(scene);
					stage.show();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (EntrenadorCrud.obtenerCambioDeVentana() == false) {
				labMensajeInCorrecto.setText("USUARIO O CONTRASEÑA INCORRECTO");
			}
		} else {

		}

	}

	/**
	 * eSte metodo verifica si se han ingresado un nombre de usuario y una contraseña válidos. 
	 * Luego, inserta los datos del nuevo entrenador llamando al método insertarDatos() de la clase EntrenadorCrud
	 * Se genera un valor aleatorio para los pokedólares del entrenador y se muestra un mensaje indicando la cantidad otorgada en el campo de texto labMensajePokeDolar
	 * 
	 * @param event
	 */
	
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
