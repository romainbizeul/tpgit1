package fr.imie.tpgit1.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import src.Poney;
import src.connectionManager;

public class PoneyJdbc {
	
	public long createPlace(Poney poney) {
		long id;
		try (PreparedStatement statement = connectionManager.getConnection().prepareStatement("INSERT INTO place (name) VALUES (?);", Statement.RETURN_GENERATED_KEYS)){	
			statement.setString(1, p.getName());
			statement.executeUpdate();
			ResultSet resultSet = statement.getGeneratedKeys();
			resultSet.next();
			id = resultSet.getLong(1);
			connectionManager.getConnection().commit();
		} catch (SQLException e) {
			throw new RuntimeException("Unable to execute that query");
		}	
		return id;
	}
	
}
