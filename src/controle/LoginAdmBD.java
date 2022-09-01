package controle;

import java.sql.*;

public class LoginAdmBD {
	
	
	
	
	Connection conexao;
	public LoginAdmBD() throws SQLException {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/piteco", "root", "aluno");
	}
	
	
	public boolean autenticar() {
		
		
		
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		try {
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/piteco", "root", "aluno");
			System.out.println("Conectado!");
		}catch (SQLException e) {
			System.out.println("Erro na conexão!");
		}
	}
}
