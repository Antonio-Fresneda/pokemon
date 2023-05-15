package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import javafx.event.ActionEvent;

public class TiendaController {
	@FXML
	private Button btnAtrasTienda;
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;

	// Event Listener on Button[#btnAtrasTienda].onAction
	@FXML
	public void btnAccionAtrasTienda(ActionEvent event) throws IOException {
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
