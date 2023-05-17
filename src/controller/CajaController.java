package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;

import crud.PokemonCrud;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import pokemon.Pokemon;

public class CajaController implements Initializable {
	@FXML
	private TableView TablaCaja;
	@FXML
	private TableView TablaEquipo;
	@FXML
	private Button btnAtrasCaja;
	@FXML
	private TableColumn nombreCaja;
	@FXML
	private TableColumn nivelCaja;
	@FXML
	private TableColumn moteCaja;
	@FXML
	private TableColumn tipo1Caja;
	@FXML
	private TableColumn tipo2Caja;
	@FXML
	private TableColumn sexoCaja;
	@FXML
	private TableColumn vidaCaja;
	@FXML
	private TableColumn ataCaja;
	@FXML
	private TableColumn defCaja;
	@FXML
	private TableColumn ataEspeCaja;
	@FXML
	private TableColumn defEspeCaja;
	@FXML
	private TableColumn veloCja;
	@FXML
	private TableColumn estamCaja;
	@FXML
	private TableColumn fertCaja;
	@FXML
	private TableColumn nombreEquipo;
	@FXML
	private TableColumn nivelEquipo;
	@FXML
	private TableColumn moteEquipo;
	@FXML
	private TableColumn tipo1Equipo;
	@FXML
	private TableColumn tipo2Equipo;
	@FXML
	private TableColumn sexoEquipo;
	@FXML
	private TableColumn vidaEquipo;
	@FXML
	private TableColumn ataEquipo;
	@FXML
	private TableColumn defEquipo;
	@FXML
	private TableColumn ataEspeEquipo;
	@FXML
	private TableColumn defEspeEquipo;
	@FXML
	private TableColumn veloEquipo;
	@FXML
	private TableColumn estaEquipo;
	@FXML
	private TableColumn fertEquipo;
	@FXML
	private TableColumn idPokemonCaja;
	@FXML
	private TableColumn idPokemonEquipo;
	@FXML
	private Button transferirToCaja;
	@FXML
	private Button transferirToEquipo;

	private Stage stage;
	private Scene scene;
	private Parent root;

	static LinkedList<Pokemon> coleccion;
	static LinkedList<Pokemon> equipo;
	

	public ObservableList<Pokemon> metodo() {

		ObservableList<Pokemon> lista = FXCollections.observableArrayList();

		for (int i = 0; i < coleccion.size(); i++) {

			Pokemon p = coleccion.get(i);

			lista.add(p);
		}
		return lista;
	}

	public ObservableList<Pokemon> metodoEquipo() {

		ObservableList<Pokemon> lista = FXCollections.observableArrayList();

		for (int i = 0; i < equipo.size(); i++) {

			Pokemon p = equipo.get(i);

			lista.add(p);
		}
		return lista;
	}
	
	@FXML
	public void btnAccionAtrasCaja(ActionEvent event) {
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		coleccion = PokemonCrud.getTodoPokemon();

		TablaCaja.setItems(metodo());
		idPokemonCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("idPokemon"));
		nombreCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nombre"));
		nivelCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nivel"));
		moteCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("mote"));
		tipo1Caja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo1"));
		tipo2Caja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo2"));
		sexoCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("sexo"));
		vidaCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("vitalidad"));
		ataCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("ataque"));
		defCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defensa"));
		ataEspeCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("ataqueEspecial"));
		defEspeCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defensaEspecial"));
		fertCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("fertilidad"));
		estamCaja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("estamina"));
		veloCja.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("velocidad"));

		equipo = PokemonCrud.getTodoPokemonEquipo();
		TablaEquipo.setItems(metodoEquipo());
		idPokemonEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("idPokemon"));
		nombreEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nombre"));
		nivelEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nivel"));
		moteEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("mote"));
		tipo1Equipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo1"));
		tipo2Equipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("tipo2"));
		sexoEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("sexo"));
		vidaEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("vitalidad"));
		ataEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("ataque"));
		defEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defensa"));
		ataEspeEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("ataqueEspecial"));
		defEspeEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defensaEspecial"));
		fertEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("fertilidad"));
		estaEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("estamina"));
		veloEquipo.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("velocidad"));

	}

	// Event Listener on Button[#transferirToCaja].onAction
	@FXML
	public void transferirAccionToEquipo(ActionEvent event) {
		
		ObservableList<Pokemon>pokemonSeleccionado=TablaCaja.getSelectionModel().getSelectedItems();
		
		Pokemon p=pokemonSeleccionado.get(0);
		
		
		
		equipo.add(p);
		
		coleccion.remove(p);
		
		PokemonCrud.transferirPokemonEquipo(p.getIdPokemon());
		
		TablaEquipo.setItems(metodoEquipo());
		TablaCaja.setItems(metodo());
		
		System.out.println("El pokemon fue traspado a tu Equipo");
	}

	// Event Listener on Button[#transferirToEquipo].onAction
	@FXML
	public void transferirAccionToCaja(ActionEvent event) {
		ObservableList<Pokemon>pokemonSeleccionadoEquipo=TablaEquipo.getSelectionModel().getSelectedItems();
		Pokemon p=pokemonSeleccionadoEquipo.get(0);
		coleccion.add(p);
		equipo.remove(p);
		
		PokemonCrud.transferirPokemonCaja(p.getIdPokemon());
		TablaCaja.setItems(metodo());
		TablaEquipo.setItems(metodoEquipo());
		
		System.out.println("El pokemon fue traspado a la Caja");
	}
}
