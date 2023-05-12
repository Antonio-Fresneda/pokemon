package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pokemon.Pokemon;

public class CapturaCrud {

	public static Pokemon buscarPokemon() {
		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		Pokemon p=null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String query = "SELECT NUM_POKEDEX, nom_pokemon, sprite FROM pokedex ORDER BY RAND() LIMIT 1;";

			ResultSet rs = statement.executeQuery(query);
			
			while (rs.next()) {
				String sprite = rs.getString("sprite");
//				String numPokedex = rs.getString("numPokedex");
//				String nombrePokemon = rs.getString("nomPokemon");
				
				
				p = new Pokemon();
				p.setImagen(sprite);
				
					
			}

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
		return p;
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
			System.out.println("El pokemon ha sido traspasado a la caja");

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
