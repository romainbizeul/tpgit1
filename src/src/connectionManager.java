package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionManager {

	private static final String URL = "jdbc:mysql://localhost:3306/tpgit1";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static Connection connection;
	
	public static Connection getConnection() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
				connection.setAutoCommit(false);
			} catch (SQLException e) {
				throw new RuntimeException("Unable to create connection with database (url: " + URL + ", "
						+ " user: " + USER + ", password: " + PASSWORD + ")", e);
			}
		}
		return connection;
	}
	
	public static void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException("Unable to close connection", e);
		}
	}
	
}
