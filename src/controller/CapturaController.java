package controller;

import java.io.IOException;

import crud.CapturaCrud;
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

public class CapturaController extends Application {
	@FXML
	private Button btnCapturar;
	@FXML
	private Button btnBuscar;
	@FXML
	private Button btnAtrasCaptura;
	
	private Stage stage;

	@Override
	public void start(Stage primaryStage) {

	}

	public void btnAtrasCaptura(ActionEvent event) {
		try {
			FXMLLoader Loader = new FXMLLoader(getClass().getResource("../vista/Menu.fxml"));
			Parent root = Loader.load();
			Scene scene = new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setResizable(false);
			stage.setTitle("Pokemon");
			stage.setScene(scene);
			stage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void btnCapturar(ActionEvent event,int pokeballs) {
			
		int ratioCaptura= (int) (Math.random()*3+1);;
			if(pokeballs>0) {
				System.out.println("Has lanzado una pokeball");
				pokeballs--;
					if(ratioCaptura==1||ratioCaptura==2) {
						System.out.println("¡POKEMON CAPTURADO!");
					}else {
						System.out.println("El pokemon se ha escapado");
					}
				
			}else {
				System.out.println("No te quedan pokeballs");
			}
			
		
	}

	public void btnBuscar(ActionEvent event) {
		CapturaCrud.buscarPokemon();
	}

}
