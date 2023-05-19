package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EntrenadorCrud {

	public static boolean cambioDeVentana;
	
	/**
	 * este metodo inserta nuevos datos de un entrenador en la base de datos
	 * @param nombre
	 * @param contraseña
	 * @param pokedolar
	 */

	public static void insertarDatos(String nombre, String contraseña, int pokedolar) {

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();

			String sql = "INSERT INTO entrenador (nom_entrenador, PASSWORD, POKEDOLAR)" + " VALUES ('" + nombre + "', '"
					+ contraseña + "','" + pokedolar + "')";
			statement.executeUpdate(sql);

			System.out.println("Datos insertados correctamente.");

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

	/**
	 * este metodo verifica los datos de inicio de sesión de un entrenador
	 * Establece una conexión con la base de datos, crea una declaración SQL para buscar el nombre del entrenador proporcionado en la tabla "entrenador"
	 * 
	 * @param nombre
	 * @param contraseña
	 */
	
	public static void comprobarDatos(String nombre, String contraseña) {
		Connection connection = null;
		PreparedStatement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon";
		String login = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);

			String sql = "SELECT nom_entrenador, PASSWORD FROM entrenador WHERE nom_entrenador = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, nombre);

			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				String contraseñaAlmacenada = resultSet.getString("PASSWORD");

				if (contraseña.equals(contraseñaAlmacenada)) {
					System.out.println("El usuario y la contraseña son correctos");
					// Realizar el cambio de ventana aquí
					cambioDeVentana = true;

				} else {
					System.out.println("La contraseña es incorrecta.");
					cambioDeVentana = false;
					// Mostrar un mensaje de error
				}

			} else {
				System.out.println("El usuario no existe.");
				cambioDeVentana = false;
				// Mostrar un mensaje de error
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * este metodo devuelve el valor actual de la variable de cambio de ventana.
	 * @return
	 */
	public static boolean obtenerCambioDeVentana() {

		return cambioDeVentana;
	}

	/**
	 * este metodo establece la variable de cambio de ventana en verdadero.
	 */
	
	public static void ValorCambioDeVentana() {

		cambioDeVentana = true;
	}

	/**
	 * este metodo recupera los datos de un entrenador de la base de datos. 
	 * Establece una conexión con la base de datos, crea una declaración SQL para buscar el nombre del entrenador en la tabla "entrenador" y ejecuta la declaración
	 */
	
	public static void getEntrenador() {
		Connection connection = null;
		PreparedStatement statement = null;
		String url = "jdbc:mysql://localhost:3306/pokemon";
		String login = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);

			String sql = "SELECT id_entrenador nom_entrenador, PASSWORD FROM entrenador WHERE nom_entrenador = ?";
			statement = connection.prepareStatement(sql);
//			statement.setString(1, nombre);

			ResultSet resultSet = statement.executeQuery();
			

			
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
