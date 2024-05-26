package com.projects.digitalLibrary.configuration;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfiguration {


	//Old method of DB connection:

//	@Value("${mysql-uri}")
//	String uri;
//	@Value("${mysql-username}")
//	String username;
//	@Value("${mysql-password}")
//	String password;
//	@Bean("Database")
//	@Primary
//	public Connection mysqlConnection() {
//		System.out.println("I am being called from configuration");
//		Connection connection = null;
//		try {
//			connection = DriverManager.getConnection(uri, username, password);
//		} catch (SQLException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		return connection;
//	}
//
//	@Bean
//	public Connection oracleConnection() {
//		System.out.println("I am being called from configuration");
//		Connection connection = null;
//		try {
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_library", "libMember", "QzWxEc45*");
//		} catch (SQLException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		return connection;
//	}
}
