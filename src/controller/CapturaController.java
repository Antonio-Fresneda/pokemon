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
	
	
	// Event Listener on Button[#btnBuscar].onAction
	
	@FXML
	 public void initialize() {
		btnSiMote.setVisible(false);
		btnNoMote.setVisible(false);
		txtParaMote.setVisible(false);
		PreguntaMote.setVisible(false);
		pokeball.setVisible(false);
	}
	
	@FXML
	public void btnBuscar(ActionEvent event) {
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
		
		int pokeballs = 10;
		int ratioCaptura= (int) (Math.random()*3+1);;
		if(pokeballs>0) {
			System.out.println("Has lanzado una pokeball");
			pokeballs--;
				if(ratioCaptura==1||ratioCaptura==2) {
					System.out.println("¡POKEMON CAPTURADO!");
					PreguntaMote.setVisible(true);
					btnSiMote.setVisible(true);
					btnNoMote.setVisible(true);
					pokemonCapturado.setText("¡POKEMON CAPTURADO!");
					imgPokemonEncontrado.setVisible(false);
					pokeball.setVisible(true);
					
					//CapturaCrud.InsertarPokemon();
				}else {
					System.out.println("El pokemon se ha escapado");
				}
			
		}else {
			System.out.println("No te quedan pokeballs");
		}
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
	
	public void btnAccionSiMote(ActionEvent event) {
		txtParaMote.setVisible(true);
		
	}
	public void btnAccionNoMote(ActionEvent event) {
		txtParaMote.setVisible(false);
}
}