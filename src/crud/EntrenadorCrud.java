package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EntrenadorCrud {
	
	public static void insertarDatos(String nombre, String contraseña,int pokedolar) {

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
	                            + contraseña + "','"+pokedolar+"')";
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
	}

