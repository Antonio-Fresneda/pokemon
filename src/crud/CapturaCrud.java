package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CapturaCrud {

	public static void buscarPokemon() {
		Connection connection = null;
		Statement statement = null;
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

	public static void InsertarPokemon(int idEntrenador, int idPokemon, int numPokedex, String mote, char sexo,
			int nivel, int vitalidad, int ataque, int defensa, int ataEspecial, int defEspecial, int velocidad,
			int estamina, int fertilidad, int equipo) {
		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String query = "INSERT INTO pokemon (ID_ENTRENADOR,ID_POKEMON,NUM_POKEDEX,MOTE,SEXO,NIVEL,VITALIDAD,ATAQUE,DEFENSA,"
					+ "ATA_ESPECIAL,DEF_ESPECIAL,VELOCIDAD,ESTAMINA,FERTILIDAD,EQUIPO)" + " VALUES ('" + idEntrenador
					+ "', '" + idPokemon + "','" + numPokedex + "', '" + mote + "', '" + sexo + "', '" + nivel + "', '"
					+ vitalidad + "', '" + ataque + "', '" + defensa + "', '" + ataEspecial + "', '" + defEspecial
					+ "', '" + velocidad + "', '" + estamina + "', '" + fertilidad + "', '" + equipo + "')";

			statement.executeUpdate(query);
			System.out.println("Has sido traspasado a la caja");

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
}
