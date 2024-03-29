package controller;

import java.io.IOException;
import java.util.EventObject;
import java.util.Objects;

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
	private Button btnEntrenar;
	@FXML
	private Button btnPonerCaja;
	@FXML
	private Button btnPokedex;
	@FXML
	private Button bottonCriar;

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	

	/**
	 * Este metodo Carga la interfaz de usuario de combate desde un archivo FXML y muestra esa escena en la ventana del juego.
	 * 
	 * @param event
	 */
	
	
	// Event Listener on Button[#btnCombate].onAction
	@FXML
	public void btnPonerCombate(ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/Combate.fxml")));
			scene = new Scene(root, 993, 588);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo Carga la interfaz de usuario de captura desde un archivo FXML y muestra esa escena en la ventana del juego.
	 * 
	 * @param event
	 */
	
	// Event Listener on Button[#btnCaptura].onAction
	@FXML
	public void btnPonerCaptura(ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/Captura.fxml")));
			scene = new Scene(root, 843, 478);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ESte metodo se ejecuta cuando se hace clic en un botón para acceder a la tienda del juego.
	 * Carga la interfaz de usuario de la tienda desde un archivo FXML y muestra esa escena en la ventana del juego.
	 * 
	 * @param event
	 */
	
	// Event Listener on Button[#btnTienda].onAction
	@FXML
	public void btnPonerTienda(ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/Tienda.fxml")));
			scene = new Scene(root, 761, 446);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo se ejecuta cuando se hace clic en un botón para acceder a la caja de almacenamiento de Pokémon. 
	 * Carga la interfaz de usuario de la caja desde un archivo FXML y muestra esa escena en la ventana del juego.
	 * @param event
	 */
	
	public void btnAccionPonerCaja(ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/Caja.fxml")));
			scene = new Scene(root, 1124, 776);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo se ejecuta cuando se hace clic en un botón para acceder a la opción de entrenamiento en el juego. 
	 * Carga la interfaz de usuario de entrenamiento desde un archivo FXML y muestra esa escena en la ventana del juego.
	 * @param event
	 */
	
	public void btnPonerEntrenar(ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/Entrenar.fxml")));
			scene = new Scene(root, 737, 613);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * este metuodo se ejecuta cuando se hace clic en un botón para acceder a la Pokédex en el juego.
	 * Carga la interfaz de usuario de la Pokédex desde un archivo FXML y muestra esa escena en la ventana del juego.
	 * @param event
	 */
	
	public void btnPonerPokedex(ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/Pokedex.fxml")));
			scene = new Scene(root, 1046, 522);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void bottonActionCriar (ActionEvent event) {
		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/Criar.fxml")));
			scene = new Scene(root, 1161, 750);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
