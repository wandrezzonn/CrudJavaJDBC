package main.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
	
	private String url = "jdbc:mysql://localhost:3306/usuarios?userTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password ="";
	public ConexaoBD() {
		
	}
	
	public Connection conectar() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

}
