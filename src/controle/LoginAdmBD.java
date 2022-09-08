package controle;
import modelo.Usuario;
import java.sql.*;


public class LoginAdmBD {
	
	
	
	
	Connection conexao;
	public LoginAdmBD() throws SQLException {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/piteco", "root", "aluno");
	}
	
	
	public boolean autenticar(Usuario usuario) {
		try {
			PreparedStatement ps = conexao.prepareStatement("select email,senha from usuario where email = '?' and senha = '?'");
			ps.setString(1, usuario.getUsuario_email());
			ps.setString(2, usuario.getUsuario_senha());
		} catch (Exception e) {

		}
		return false;
	}
	
}
