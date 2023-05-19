package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pokemon.Pokemon;

public class CapturaCrud {

	public static int numPokedex;
	public static int idPokemon;
	public static String nombrePokemon;

	/**
	 * este metodo busca un Pokémon en la base de datos.
	 * crea una declaración SQL para seleccionar aleatoriamente un Pokémon de la tabla "pokedex" y ejecuta la declaración
	 * recorre el resultado y crea un objeto Pokemon con los datos obtenidos
	 * @return
	 */
	
	public static Pokemon buscarPokemon() {

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		Pokemon p = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String query = "SELECT NUM_POKEDEX, nom_pokemon,tipo1,tipo2, sprite FROM pokedex ORDER BY RAND() LIMIT 1;";

			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				String sprite = rs.getString("sprite");
				nombrePokemon = rs.getString("nom_Pokemon");
				String tipo1 = rs.getString("tipo1");
				String tipo2 = rs.getString("tipo2");
				numPokedex = rs.getInt("NUM_POKEDEX");

				p = new Pokemon();
				p.setImagen(sprite);

				System.out.println("Has encontrado un " + nombrePokemon + " salvaje");
				System.out.println("Es tipo " + tipo1 + " y " + tipo2 + " ¡ATRAPALO!");
				System.out.println("Su numero en la pokedex es " + numPokedex);
			}

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

	/**
	 * este metodo inserta un nuevo Pokémon en la base de datos
	 * crea una declaración SQL para insertar los valores proporcionados en la tabla "pokemon" y ejecuta la declaración
	 * Muestra un mensaje de éxito después de insertar el Pokémon y devuelve un objeto Pokemon.
	 * @param idEntrenador
	 * @param numPokedex
	 * @param mote
	 * @param sexo
	 * @param nivel
	 * @param vitalidad
	 * @param ataque
	 * @param defensa
	 * @param ataEspecial
	 * @param defEspecial
	 * @param velocidad
	 * @param estamina
	 * @param fertilidad
	 * @param equipo
	 * @return
	 */
	
	public static Pokemon InsertarPokemon(int idEntrenador, int numPokedex, String mote, char sexo, int nivel,
			int vitalidad, int ataque, int defensa, int ataEspecial, int defEspecial, int velocidad, int estamina,
			int fertilidad, int equipo) {
		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";
		Pokemon p = new Pokemon();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String query = "INSERT INTO pokemon (ID_ENTRENADOR,NUM_POKEDEX,MOTE,SEXO,NIVEL,VITALIDAD,ATAQUE,DEFENSA,"
					+ "ATA_ESPECIAL,DEF_ESPECIAL,VELOCIDAD,ESTAMINA,FERTILIDAD,EQUIPO)" + " VALUES ('" + idEntrenador
					+ "', '" + numPokedex + "', '" + mote + "', '" + sexo + "', '" + nivel + "', '" + vitalidad + "', '"
					+ ataque + "', '" + defensa + "', '" + ataEspecial + "', '" + defEspecial + "', '" + velocidad
					+ "', '" + estamina + "', '" + fertilidad + "', '" + equipo + "')";

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
		return p;

	}

	/**
	 * este metodo asigna un mote a un Pokémon existente en la base de datos
	 * crea una declaración SQL para actualizar el campo "mote" del Pokémon con el mote proporcionado y ejecuta la declaración
	 * 
	 * @param mote
	 * @param idPokemon
	 * @return
	 */
	
	public static Pokemon ponerMote(String mote, int idPokemon) {

		Pokemon pokemon = new Pokemon();

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		String query = "UPDATE pokemon SET mote=" + mote + " WHERE id_pokemon =" + idPokemon + ";";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			int rowsAffected = statement.executeUpdate(query);

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
		return pokemon;
	}

}
