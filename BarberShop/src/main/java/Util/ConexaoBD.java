
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {

	public static final String driver = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/barbershop";
	public static final String user = "root";
	public static final String password = "";
	public static final Connection conexao = null;

	public static Connection conectaBD() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException ex) {
			throw new RuntimeException("Erro na conexão com o banco de dados", ex);
		}

	}

	public static void fechaConexao(Connection connection) {

		try {
			if (connection != null) {
				connection.close();
			}

		} catch (Exception ex) {
			throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
		}
	}

	public static void fechaConexao(Connection connection, PreparedStatement preparedstatement) {

		try {
			if (connection != null) {
				connection.close();
			}
			if(preparedstatement != null){
				preparedstatement.close();
	        }
        

		} catch (Exception ex) {
			throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
		}
	}

	public static void fechaConexao(Connection connection, 
			PreparedStatement preparedstatement, ResultSet resultset) {

		try {
			if (connection != null) {
				connection.close();
			}
			if(preparedstatement != null){
				preparedstatement.close();
	        }
	        if(resultset != null){
	        	resultset.close();
	        }

		} catch (Exception ex) {
			throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
		}
	}
}
