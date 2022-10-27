package controle;
import modelo.Usuario;
import java.sql.*;
import java.util.Date;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;


public class LoginAdmBD {
	
	
	
	
	Connection conexao;
	
	public LoginAdmBD() throws SQLException {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/piteco", "root", "aluno");
	}
	
	
	public Usuario autenticar(Usuario usuario) {
		try {
			PreparedStatement ps = conexao.prepareStatement("SELECT email,senha FROM usuario where usuario_email = '?' and usuario_senha = '?'and tipouser_id_tipo = 1;");
			ps.setString(1, usuario.getUsuario_email());
			ps.setString(2, usuario.getUsuario_senha());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				usuario.setTipouser_id_tipo(rs.getInt(1));
				usuario.setUsuario_nome(rs.getString(2));
				usuario.setUsuario_cpf(rs.getString(4));
				usuario.setUsuario_datanascimento(rs.getDate(5));
				return null;
			}
			
		} catch (SQLException e) {
			System.out.println("Erro no Login");
			return null;
		}
		return null;
	}

	
}
