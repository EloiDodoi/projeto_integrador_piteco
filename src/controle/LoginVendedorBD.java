package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Usuario;
import controle.ConexaoBD;
import modelo.Usuario;
import java.sql.*;

public class LoginVendedorBD {
	
	ConexaoBD cbd = new ConexaoBD();
	
	public Usuario autenticar(Usuario usuario) {
		try {
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT * FROM usuario where usuario_email = ? and usuario_senha = ? and tipouser_id_tipo = ?");
			ps.setString(1, usuario.getUsuario_email());
			ps.setString(2, usuario.getUsuario_senha());
			ps.setInt(3, 2);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Usuario vend = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7),rs.getString(8), rs.getInt(9));
				
				return vend;
			}
			
		} catch (SQLException e) {
			System.out.println("Erro no Login");
			System.out.println(e);
			return null;
		}
		return null;
	}
}
