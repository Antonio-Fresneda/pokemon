package controller;

import java.io.IOException;
import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class CriarController {
	@FXML
	private TableView TablaCriar1;
	@FXML
	private TableView TablaCriar2;
	@FXML
	private TableView TablaCriar3;
	 @FXML
	private Button bottonAtras;
	 @FXML
	private Parent root;
	 @FXML
	private Scene scene;
	 @FXML
	private Stage stage;
	 
	 
	 
	 
	 public void BottonAccionAtras(ActionEvent event) {
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
