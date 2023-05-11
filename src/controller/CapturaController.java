package controller;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import pokemon.Pokemon;

import java.io.File;
import java.io.IOException;

import crud.CapturaCrud;
import javafx.event.ActionEvent;

public class CapturaController {
	@FXML
	private ImageView imgPokemonEncontrado;
	@FXML
	private Button btnBuscar;
	@FXML
	private Button btnCapturar;
	@FXML
	private Button btnAtrasCaptura;

	private Stage stage;

	// Event Listener on Button[#btnBuscar].onAction
	@FXML
	public void btnBuscar(ActionEvent event) {
		Pokemon p = CapturaCrud.buscarPokemon();

		File file = new File(p.getImagen());

		Image image = new Image(file.toURI().toString());

		imgPokemonEncontrado.setImage(image);
	}

	// Event Listener on Button[#btnCapturar].onAction
	@FXML
	public void btnAccionCapturar(ActionEvent event) {

	}

	// Event Listener on Button[#btnAtrasCaptura].onAction
	@FXML
	public void btnAtrasCaptura(ActionEvent event) {
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

	@FXML
	public void ponerImgPokemon(ActionEvent event) {

	}
}
