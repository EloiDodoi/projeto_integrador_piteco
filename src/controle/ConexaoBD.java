package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	private Connection conexao;

	public Connection getConexao() throws SQLException {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/piteco", "root", "Artcev.01");
		return conexao;
	}
	public static Connection fecharConexao(Connection conexao) throws SQLException {
		conexao.close();
		return null;
	}
}
