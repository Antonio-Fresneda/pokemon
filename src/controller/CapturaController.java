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
import javafx.stage.Stage;
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
	private TextField PreguntaMote;
	@FXML
	private Button btnSiMote;
	@FXML
	private Button btnNoMote;
	@FXML
	private TextField txtParaMote;
	@FXML
	private Label pokemonCapturado;
	private Stage stage;
	private Scene scene;
	private Parent root;

	// Event Listener on Button[#btnBuscar].onAction

	@FXML
	public void initialize() {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");

		btnSiMote.setVisible(false);
		btnNoMote.setVisible(false);
		txtParaMote.setVisible(false);
		PreguntaMote.setVisible(false);
		pokeball.setVisible(false);
	}

	@FXML
	public void btnBuscar(ActionEvent event) {

		System.out.println("Buscando un nuevo pokemon ...");

		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
		System.out.println(simpleDateFormat.format(d) + ".log");

		Pokemon p = CapturaCrud.buscarPokemon();

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

	}

	@FXML
	public void btnAccionCapturar(ActionEvent event) {

//		Pokemon p = CapturaCrud.buscarPokemon();ç
		Pokemon p=new Pokemon();
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
		int pokeballs = 10;
		int ratioCaptura = (int) (Math.random() * 3 + 1);
		;
		if (pokeballs > 0) {
			System.out.println("Has lanzado una pokeball");
			pokeballs--;
			if (ratioCaptura == 1 || ratioCaptura == 2) {
				System.out.println("¡POKEMON CAPTURADO!");
				Date d = new Date();
				System.out.println(d);
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmssyyyy");
				System.out.println(simpleDateFormat.format(d) + ".log");

				PreguntaMote.setVisible(true);
				btnSiMote.setVisible(true);
				btnNoMote.setVisible(true);
				pokemonCapturado.setText("¡POKEMON CAPTURADO!");
				imgPokemonEncontrado.setVisible(false);
				pokeball.setVisible(true);

				p = CapturaCrud.InsertarPokemon(1,	numPokedex=CapturaCrud.numPokedex, p.getMote(), sexo='H', 1,
						vitalidad = (int) (Math.random() * ((20 - 1) + 1)) + 1,
						ataque = (int) (Math.random() * ((20 - 1) + 1)),
						defensa = (int) (Math.random() * ((20 - 1) + 1)),
						ataEspecial = (int) (Math.random() * ((20 - 1) + 1)),
						defEspecial = (int) (Math.random() * ((20 - 1) + 1)),
						velocidad = (int) (Math.random() * ((20 - 1) + 1)),
						estamina = (int) (Math.random() * ((20 - 1) + 1)),
						fertilidad = (int) (Math.random() * ((20 - 1) + 1)), equipo = 2);

			} else {
				System.out.println("El pokemon se ha escapado");
			}

		} else {
			System.out.println("No te quedan pokeballs");
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

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void ponerImgPokemon(ActionEvent event) {
	}

	public void btnAccionSiMote(ActionEvent event) {
		txtParaMote.setVisible(true);

	}

	public void btnAccionNoMote(ActionEvent event) {
		txtParaMote.setVisible(false);
	}
}