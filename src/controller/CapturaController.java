package controller;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pokemon.Logger;
import pokemon.Pokemon;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import crud.CapturaCrud;
import javafx.event.ActionEvent;

public class CapturaController {
	@FXML
	private ImageView imgPokemonEncontrado;
	@FXML
	private ImageView pokeball;
	@FXML
	private Button btnBuscar;
	@FXML
	private Button btnCapturar;
	@FXML
	private Button btnAtrasCaptura;
	@FXML
	private Text PreguntaMote;
	@FXML
	private Button btnSiMote;
	@FXML
	private Button btnNoMote;
	@FXML
	private TextField txtParaMote;
	@FXML
	private Text txtAccion;
	@FXML
	private Button btnAceptar;
	@FXML
	private Label pokemonCapturado;

	private Stage stage;
	private Scene scene;
	private Parent root;

	// Event Listener on Button[#btnBuscar].onAction
	/**
	 * Metodo que inicializa cuando te metes a la ventana de captura
	 */
	@FXML
	public void initialize() {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");

		Logger.write("Has entrado en captura " + simpleDateFormat);

		btnSiMote.setVisible(false);
		btnNoMote.setVisible(false);
		txtParaMote.setVisible(false);
		PreguntaMote.setVisible(false);
		pokeball.setVisible(false);
		btnAceptar.setVisible(false);
	}

	/**
	 * Metodo que busca al pokemon
	 * 
	 * @param event
	 */
	@FXML
	public void btnBuscar(ActionEvent event) {

		System.out.println("Buscando un nuevo pokemon ...");

		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");
		// Llama al metodo buscar pokemon de la clase CapturaCrud
		Pokemon p = CapturaCrud.buscarPokemon();

		// Te carga la imagen del pokemon en la interfaz
		File file = new File(p.getImagen());
		Image image = new Image(file.toURI().toString());

		imgPokemonEncontrado.setImage(image);
		imgPokemonEncontrado.setVisible(true);
		pokemonCapturado.setText(null);
		btnSiMote.setVisible(false);
		btnNoMote.setVisible(false);
		txtParaMote.setVisible(false);
		PreguntaMote.setVisible(false);
		pokeball.setVisible(false);
		txtAccion.setVisible(true);

		txtAccion.setText("HAS ENCONTRADO UN " + CapturaCrud.nombrePokemon + " SALVAJE ");

		Logger.write(
				"Has encontrado un " + CapturaCrud.nombrePokemon + " salvaje " + simpleDateFormat.format(d) + ".log");

	}

	/**
	 * Metodo para captura pokemon
	 * 
	 * @param event
	 */
	@FXML
	public void btnAccionCapturar(ActionEvent event) {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");

		Pokemon p = new Pokemon();
		int idEntrenador;
		int idPokemon;
		int numPokedex;
		String mote;
		char sexo;
		int nivel;
		int vitalidad;
		int ataque;
		int defensa;
		int ataEspecial;
		int defEspecial;
		int velocidad;
		int estamina;
		int fertilidad;
		int equipo;
		int pokeballs = 20;
		int ratioCaptura = (int) (Math.random() * 3 + 1);

		if (pokeballs > 0) {
			System.out.println("Has lanzado una pokeball");
			txtAccion.setText("Has lanzado una pokeball");
			Logger.write("Has lanzado una pokeball " + simpleDateFormat.format(d) + ".log");
			pokeballs--;
			if (ratioCaptura == 1 || ratioCaptura == 2) {
				System.out.println("¡POKEMON CAPTURADO!");

				PreguntaMote.setVisible(true);
				btnSiMote.setVisible(true);
				btnNoMote.setVisible(true);
				pokemonCapturado.setText("¡POKEMON CAPTURADO!");
				imgPokemonEncontrado.setVisible(false);
				pokeball.setVisible(true);
				txtAccion.setVisible(false);

				Logger.write("Has capturado un " + CapturaCrud.nombrePokemon + " salvaje " + simpleDateFormat.format(d)
						+ ".log");

//				p = CapturaCrud.InsertarPokemon(1, numPokedex = CapturaCrud.numPokedex, null, sexo = 'H', 1,
//						vitalidad = (int) (Math.random() * ((20 - 1) + 1)) + 1,
//						ataque = (int) (Math.random() * ((20 - 1) + 1)),
//						defensa = (int) (Math.random() * ((20 - 1) + 1)),
//						ataEspecial = (int) (Math.random() * ((20 - 1) + 1)),
//						defEspecial = (int) (Math.random() * ((20 - 1) + 1)),
//						velocidad = (int) (Math.random() * ((20 - 1) + 1)),
//						estamina = (int) (Math.random() * ((20 - 1) + 1)),
//						fertilidad = (int) (Math.random() * ((20 - 1) + 1)), equipo = 2);

			} else {
				System.out.println("El pokemon se ha escapado");
				txtAccion.setText("El pokemon se ha escapado");
				Logger.write("El pokemon se ha escapado " + simpleDateFormat.format(d) + ".log");
			}

		} else {
			System.out.println("No te quedan pokeballs");
			System.out.println(simpleDateFormat.format(d) + ".log");

			Logger.write("No te quedan pokeballs " + simpleDateFormat.format(d) + ".log");
		}
	}

	// Event Listener on Button[#btnAtrasCaptura].onAction
	@FXML
	public void btnAtrasCaptura(ActionEvent event) {

		try {
			root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/Menu.fxml")));
			scene = new Scene(root, 910, 504);
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.show();

			Date d = new Date();

			System.out.println("Has salido de la pantalla de captura ");
			System.out.println(d);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
			System.out.println(simpleDateFormat.format(d) + ".log");

			Logger.write("Has salido de la ventana captura " + simpleDateFormat.format(d) + ".log");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void ponerImgPokemon(ActionEvent event) {
	}

	public void btnAccionSiMote(ActionEvent event) {
		txtParaMote.setVisible(true);
		btnAceptar.setVisible(true);

	}

	/**
	 * 
	 * este metodo se activa cuando se hace clic en el boton y captura un nuevo pokemon
	 * sin asignarle un 'mote'
	 * Se generan valores aleatorios para las diferentes estadísticas del Pokémon
	 *  y se utiliza el método InsertarPokemon de la clase CapturaCrud para insertar el Pokémon en la base de datos.
	 * @param event
	 */
	
	
	public void btnAccionNoMote(ActionEvent event) {
		Pokemon p = new Pokemon();
		int idEntrenador;
		int idPokemon;
		int numPokedex;
		String mote;
		char sexo;
		int nivel;
		int vitalidad;
		int ataque;
		int defensa;
		int ataEspecial;
		int defEspecial;
		int velocidad;
		int estamina;
		int fertilidad;
		int equipo;
		p = CapturaCrud.InsertarPokemon(1, numPokedex = CapturaCrud.numPokedex, txtParaMote.getText(), sexo = 'H', 1,
				vitalidad = (int) (Math.random() * ((20 - 1) + 1)) + 1, ataque = (int) (Math.random() * ((20 - 1) + 1)),
				defensa = (int) (Math.random() * ((20 - 1) + 1)), ataEspecial = (int) (Math.random() * ((20 - 1) + 1)),
				defEspecial = (int) (Math.random() * ((20 - 1) + 1)),
				velocidad = (int) (Math.random() * ((20 - 1) + 1)), estamina = (int) (Math.random() * ((20 - 1) + 1)),
				fertilidad = (int) (Math.random() * ((20 - 1) + 1)), equipo = 2);

		PreguntaMote.setVisible(false);
		btnSiMote.setVisible(false);
		btnNoMote.setVisible(false);
		pokeball.setVisible(false);
		txtParaMote.setVisible(false);
		btnAceptar.setVisible(false);
		pokemonCapturado.setVisible(false);

	}

	/**
	 * este metodo  también se activa al hacer clic en un botón y realiza una acción similar a btnAccionNoMote
	 * pero esta vez se captura un nuevo Pokémon después de ingresar un "mote" a través de un campo de texto.
	 * @param event
	 */
	
	public void accionAceptar(ActionEvent event) {
		Pokemon p = new Pokemon();
		int idEntrenador;
		int idPokemon;
		int numPokedex;
		String mote;
		char sexo;
		int nivel;
		int vitalidad;
		int ataque;
		int defensa;
		int ataEspecial;
		int defEspecial;
		int velocidad;
		int estamina;
		int fertilidad;
		int equipo;
		p = CapturaCrud.InsertarPokemon(1, numPokedex = CapturaCrud.numPokedex, txtParaMote.getText(), sexo = 'H', 1,
				vitalidad = (int) (Math.random() * ((20 - 1) + 1)) + 1, ataque = (int) (Math.random() * ((20 - 1) + 1)),
				defensa = (int) (Math.random() * ((20 - 1) + 1)), ataEspecial = (int) (Math.random() * ((20 - 1) + 1)),
				defEspecial = (int) (Math.random() * ((20 - 1) + 1)),
				velocidad = (int) (Math.random() * ((20 - 1) + 1)), estamina = (int) (Math.random() * ((20 - 1) + 1)),
				fertilidad = (int) (Math.random() * ((20 - 1) + 1)), equipo = 2);

		PreguntaMote.setVisible(false);
		btnSiMote.setVisible(false);
		btnNoMote.setVisible(false);
		pokeball.setVisible(false);
		txtParaMote.setVisible(false);
		btnAceptar.setVisible(false);
		pokemonCapturado.setVisible(false);

	}

}