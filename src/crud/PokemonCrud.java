package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import pokemon.Pokemon;

public class PokemonCrud {

	/**
	 *  este metodo devuelve una lista enlazada (LinkedList) de todos los Pokémon.
	 *  Realiza una consulta a una base de datos MySQL para obtener los detalles de los Pokémon
	 *  crea instancias de la clase Pokemon y los agrega a la lista enlazada. Luego, devuelve la lista con todos los Pokémon.
	 * @return
	 */
	
	public static LinkedList<Pokemon> getTodoPokemon() {

		LinkedList<Pokemon> coleccion = new LinkedList<Pokemon>();

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		String query = "SELECT c.ID_POKEMON,p.nom_pokemon,p.tipo1,p.tipo2,c.nivel,c.mote,c.sexo,c.vitalidad,c.ataque,c.defensa,c.ata_especial,c.def_especial,c.velocidad,c.estamina,c.fertilidad FROM pokedex p, pokemon c WHERE p.num_pokedex = c.num_pokedex AND c.equipo=2;";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				Pokemon pokemon = new Pokemon();
				pokemon.setIdPokemon(rs.getInt("ID_POKEMON"));
				pokemon.setNombre(rs.getString("p.nom_pokemon"));
				pokemon.setNivel(rs.getInt("c.nivel"));
				pokemon.setMote(rs.getString("c.mote"));
				pokemon.setTipo1(rs.getString("p.tipo1"));
				pokemon.setTipo2(rs.getString("p.tipo2"));
				pokemon.setSexo(rs.getString("c.sexo"));
				pokemon.setVitalidad(rs.getInt("c.vitalidad"));
				pokemon.setAtaque(rs.getInt("c.ataque"));
				pokemon.setDefensa(rs.getInt("c.defensa"));
				pokemon.setAtaqueEspecial(rs.getInt("c.ata_especial"));
				pokemon.setDefensaEspecial(rs.getInt("c.def_especial"));
				pokemon.setVelocidad(rs.getInt("c.velocidad"));
				pokemon.setFertilidad(rs.getInt("c.fertilidad"));
				pokemon.setEstamina(rs.getInt("c.estamina"));

				coleccion.add(pokemon);

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
		return coleccion;

	}

	/**
	 * este metodo es similar al anterior, pero devuelve una lista enlazada de los Pokémon que están en el equipo.
	 * También realiza una consulta a la base de datos y agrega los Pokémon correspondientes a la lista enlazada
	 * Luego, devuelve la lista de Pokémon en el equipo.
	 * @return
	 */
	
	public static LinkedList<Pokemon> getTodoPokemonEquipo() {

		LinkedList<Pokemon> coleccionEquipo = new LinkedList<Pokemon>();

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		String query = "SELECT c.ID_POKEMON,p.nom_pokemon,p.tipo1,p.tipo2,c.nivel,c.mote,c.sexo,c.vitalidad,c.ataque,c.defensa,c.ata_especial,c.def_especial,c.estamina,c.velocidad,c.fertilidad FROM pokedex p, pokemon c WHERE p.num_pokedex = c.num_pokedex AND c.equipo=1;";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				Pokemon pokemon = new Pokemon();
				pokemon.setIdPokemon(rs.getInt("c.ID_POKEMON"));
				pokemon.setNombre(rs.getString("p.nom_pokemon"));
				pokemon.setNivel(rs.getInt("c.nivel"));
				pokemon.setMote(rs.getString("c.mote"));
				pokemon.setTipo1(rs.getString("p.tipo1"));
				pokemon.setTipo2(rs.getString("p.tipo2"));
				pokemon.setSexo(rs.getString("c.sexo"));
				pokemon.setVitalidad(rs.getInt("c.vitalidad"));
				pokemon.setAtaque(rs.getInt("c.ataque"));
				pokemon.setDefensa(rs.getInt("c.defensa"));
				pokemon.setAtaqueEspecial(rs.getInt("c.ata_especial"));
				pokemon.setDefensaEspecial(rs.getInt("c.def_especial"));
				pokemon.setVelocidad(rs.getInt("c.velocidad"));
				pokemon.setFertilidad(rs.getInt("c.fertilidad"));
				pokemon.setEstamina(rs.getInt("c.estamina"));

				coleccionEquipo.add(pokemon);

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
		return coleccionEquipo;

	}

	/**
	 * Los métodos transferirPokemonEquipo() y transferirPokemonCaja() actualizan el estado de un Pokémon en la base de datos
	 * Estos métodos cambian el valor del atributo "equipo" del Pokémon seleccionado a 1 o 2,
	 * indicando si el Pokémon debe estar en el equipo o en la caja. 
	 * Ambos métodos devuelven una instancia de la clase Pokemon, pero parece que no se utiliza
	 * @param idPokemon
	 * @return
	 */
	
	public static Pokemon transferirPokemonEquipo(int idPokemon) {
		Pokemon pokemon = new Pokemon();

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		String query = "UPDATE pokemon SET equipo=1 WHERE id_pokemon =" + idPokemon + ";";
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

	public static Pokemon transferirPokemonCaja(int idPokemon) {
		Pokemon pokemon = new Pokemon();

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		String query = "UPDATE pokemon SET equipo=2 WHERE id_pokemon =" + idPokemon + ";";
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

	/**
	 *  este metodo devuelve una lista enlazada de los Pokémon en la Pokédex.
	 *  Realiza una consulta a la base de datos para obtener el número de Pokédex, el nombre y los tipos de cada Pokémon
	 *  crea instancias de la clase Pokemon y las agrega a la lista enlazada.
	 *  Finalmente, devuelve la lista de Pokémon en la Pokédex
	 * @return
	 */
	
	public static LinkedList<Pokemon> mostrarPokedex() {

		LinkedList<Pokemon> coleccionPokedex = new LinkedList<Pokemon>();

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		String query = "SELECT NUM_POKEDEX ,nom_pokemon,tipo1,tipo2 FROM pokedex ORDER BY NUM_POKEDEX;";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				Pokemon pokemon = new Pokemon();
				pokemon.setNumPokedex(rs.getInt("NUM_POKEDEX"));
				pokemon.setNombre(rs.getString("nom_pokemon"));
				pokemon.setTipo1(rs.getString("tipo1"));
				pokemon.setTipo2(rs.getString("tipo2"));

				coleccionPokedex.add(pokemon);

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
		return coleccionPokedex;

	}

}
