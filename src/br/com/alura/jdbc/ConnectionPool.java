package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.hsqldb.jdbc.JDBCPool;

public class ConnectionPool {
	
	static JDBCPool pool = new JDBCPool();
	public ConnectionPool(){
        pool.setUrl("jdbc:hsqldb:hsql://localhost/loja-virtual");
        pool.setUser("SA");
        pool.setPassword("");
	}

	public static Connection getConnection() throws SQLException{
		Connection connection = pool.getConnection();
		//DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		return connection; 
	}
}
