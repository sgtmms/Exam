package org.example.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	String driverClassName = "com.mysql.cj.jdbc.Driver'";
	String connectionUrl = "jdbc:mysql://localhost:3306/Company";
	String dbUser = "username";
	String dbPwd = "password";

	private static ConnectionFactory connectionFactory = null;

	private ConnectionFactory() {

	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		return conn;
	}

	public static ConnectionFactory getInstance() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory;
	}
}


