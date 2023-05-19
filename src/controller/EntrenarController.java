package controller;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Objects;
import java.util.ResourceBundle;

import crud.PokemonCrud;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import pokemon.Entrenador;
import pokemon.Pokemon;

public class EntrenarController {
	@FXML
	private TableView tablaEntrenar;
	@FXML
	private TableColumn idEntrenar;
	@FXML
	private TableColumn nombreEntrenar;
	@FXML
	private TableColumn nivelEntrenar;
	@FXML
	private TableColumn ataqueEntrenar;
	@FXML
	private TableColumn defensaEntrenar;
	@FXML
	private TableColumn ataEspeEntrenar;
	@FXML
	private TableColumn defEspeEntrenar;
	@FXML
	private TableColumn velocidadEntrenar;
	@FXML
	private TableColumn estaminaEntrenar;
	@FXML
	private TableColumn fertilidadEntrenar;
	@FXML
	private TableColumn vidaEntrenar;
	@FXML
	private Button entrenamientoPesado;
	@FXML
	private Button entrenamientoFuncional;
	@FXML
	private Button entrenamientoFurioso;
	@FXML
	private Button entrenamientoOnirico;
	@FXML
	private Button btnAtrasEntrenar;
	private Parent root;
	private Scene scene;
	private Stage stage;

	private Entrenador e;
	
	static LinkedList<Pokemon> coleccion;

	/**
	 * este metodo se utiliza para cargar los datos de los Pokémon en la tabla de entrenamiento.
	 * @return
	 */
	
	public ObservableList<Pokemon> metodo() {

		ObservableList<Pokemon> lista = FXCollections.observableArrayList();

		for (int i = 0; i < coleccion.size(); i++) {

			Pokemon p = coleccion.get(i);

			lista.add(p);
		}
		return lista;
	}

	/**
	 * Crea una instancia de la clase Entrenador y asigna la lista de Pokémon obtenida de PokemonCrud.getTodoPokemonEquipo() a la tabla.
	 * establece las propiedades de cada columna de la tabla para que se muestren los atributos
	 */
	
	public void initialize() {
		// TODO Auto-generated method stub
		e = new Entrenador();// Aqui teneis que pasarle el entranador logueado
		coleccion = PokemonCrud.getTodoPokemonEquipo();
		tablaEntrenar.setItems(metodo());
		idEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("idPokemon"));
		nombreEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nombre"));
		nivelEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("nivel"));
		vidaEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("vitalidad"));
		ataqueEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("ataque"));
		defensaEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defensa"));
		ataEspeEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("ataqueEspecial"));
		defEspeEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("defensaEspecial"));
		fertilidadEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("fertilidad"));
		estaminaEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("estamina"));
		velocidadEntrenar.setCellValueFactory(new PropertyValueFactory<Pokemon, String>("velocidad"));
	}

	/**
	 * Los métodos accionPesado(), accionFurioso(), accionFuncional(), accionOnirico()
	 *  se ejecutan cuando se hace clic en los botones correspondientes de entrenamiento.
	 *  Obtienen el Pokémon seleccionado de la tabla y realizan el entrenamiento correspondiente llamando a los métodos
	 *  entrenamientoPesado(), entrenamientoFurioso(), entrenamientoFuncional(), entrenamientoOnirico() de la clase Entrenador
	 * @param event
	 */
	
	public void accionPesado(ActionEvent event) {
		ObservableList<Pokemon> pokemonSeleccionado = tablaEntrenar.getSelectionModel().getSelectedItems();

		Pokemon p = pokemonSeleccionado.get(0);

		Entrenador.entrenamientoPesado(p);
		tablaEntrenar.refresh();
		System.out.println("El pokemon ha realizado un entrenamiento Pesado");
	}

	
	
	public void accionFurioso(ActionEvent event) {
		ObservableList<Pokemon> pokemonSeleccionado = tablaEntrenar.getSelectionModel().getSelectedItems();

		Pokemon p = pokemonSeleccionado.get(0);

		Entrenador.entrenamientoFurioso(p);

		tablaEntrenar.refresh();
		System.out.println("El pokemon ha realizado un entrenamiento Furioso");
	}

	
	
	public void accionFuncional(ActionEvent event) {
		ObservableList<Pokemon> pokemonSeleccionado = tablaEntrenar.getSelectionModel().getSelectedItems();

		Pokemon p = pokemonSeleccionado.get(0);

		Entrenador.entrenamientoFuncional(p);
		tablaEntrenar.refresh();
		System.out.println("El pokemon ha realizado un entrenamiento Funcional");
	}

	
	
	public void accionOnirico(ActionEvent event) {
		ObservableList<Pokemon> pokemonSeleccionado = tablaEntrenar.getSelectionModel().getSelectedItems();

		Pokemon p = pokemonSeleccionado.get(0);

		Entrenador.entrenamientoOnirico(p);
		tablaEntrenar.refresh();
		System.out.println("El pokemon ha realizado un entrenamiento Onirico");
	}

	/**
	 * este metodo carga la interfaz de usuario del menú principal desde un archivo FXML y muestra esa escena en la ventana del juego.
	 * @param event
	 */
	
	public void accionAtrasEntrenar(ActionEvent event) {
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
