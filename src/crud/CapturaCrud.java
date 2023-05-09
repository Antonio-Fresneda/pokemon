package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CapturaCrud {

	public static void buscarPokemon() {
		Connection connection = null;
		java.sql.Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String query = "SELECT NUM_POKEDEX, nom_pokemon, sprite FROM pokedex ORDER BY RAND() LIMIT 1;";

			statement.executeUpdate(query);
			System.out.println("Has encontrado un pokemon");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void InsertarPokemon() {
		
		
	}
}
