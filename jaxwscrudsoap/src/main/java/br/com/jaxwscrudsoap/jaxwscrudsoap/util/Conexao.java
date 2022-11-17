package br.com.jaxwscrudsoap.jaxwscrudsoap.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	private static final Connection connection = construirConexao();
	
	private static String driver = "com.mysql.cj.jdbc.Driver";

	private static String url = "jdbc:mysql://127.0.0.1:3306/jax_ws_crud_soap?useTimezone=true&serverTimezone=UTC&useSSL=false";

	private static String user = "root";
	
	private static String password = "";
	

	private static Connection construirConexao() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user,
					password);

		} catch (Exception ex) {
			System.err.println("Conexão falhou: " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	public static Connection getConnection() {
		return connection;
	}
}
