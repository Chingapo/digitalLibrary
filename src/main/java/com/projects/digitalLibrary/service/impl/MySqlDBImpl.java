package com.projects.digitalLibrary.service.impl;

import com.projects.digitalLibrary.service.DBService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;


@Service
public class MySqlDBImpl implements DBService {

	private Connection connection;

	@Override
	public Connection getDatabase() {
		if(Objects.isNull(connection)){
			createConnection();
		}
		return connection;
	}

	private void createConnection() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_library", "libMember", "QzWxEc45*")) {
			this.connection = connection;
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
