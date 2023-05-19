package controller;

import java.io.IOException;
import java.util.Objects;

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
	private Parent root;
	private Scene scene;

	@Override
	public void start(Stage primaryStage) {

	}

	/**
	 * , este método permite al jugador abandonar la situación actual y regresar al menú principal del juego.
	 * si se produjera alguna excepcion durante el proceso se imprime la traza de la excepción en la consola,
	 *  utilizando el método printStackTrace() de la clase IOException.
	 * @param event
	 */
	
	
	public void btnHuir(ActionEvent event) {
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
	}
}