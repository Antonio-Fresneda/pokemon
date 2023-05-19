package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Objects;
import java.util.ResourceBundle;

import crud.PokemonCrud;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import pokemon.Pokemon;
import javafx.scene.control.TableColumn;

public class PokedexController {
	@FXML
	private TableView tablaPokedex;
	@FXML
	private TableColumn numeroPokedex;
	@FXML
	private TableColumn nombrePokedex;
	@FXML
	private TableColumn tipo1Pokedex;
	@FXML
	private TableColumn tipo2Pokedex;
	@FXML
	private Button btnAtrasPokedex;

	private Stage stage;
	private Scene scene;
	private Parent root;

	static LinkedList<Pokemon> coleccionPokedex;
	// Event Listener on Button[#btnAtrasPokedex].onAction

	public ObservableList<Pokemon> metodo() {

		ObservableList<Pokemon> lista = FXCollections.observableArrayList();

		for (int i = 0; i < coleccionPokedex.size(); i++) {

			Pokemon p = coleccionPokedex.get(i);

			lista.add(p);
		}
		return lista;
	}

	public void initialize() {
		coleccionPokedex = PokemonCrud.mostrarPokedex();
		tablaPokedex.setItems(metodo());
		numeroPokedex.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("numPokedex"));
		nombrePokedex.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nombre"));
		tipo1Pokedex.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo1"));
		tipo2Pokedex.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo2"));

	}

	@FXML
	public void btnAccionAtrasPokedex(ActionEvent event) {
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
