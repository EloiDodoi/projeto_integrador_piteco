package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Usuario;

public class PermissoesBD {
	private ConexaoBD cbd = new ConexaoBD();
	
	public void adicionarPermissao(int id_p, Usuario u) {
		try {
			PreparedStatement ps =  cbd.getConexao().prepareStatement("Insert into Usuario_has_Permissoes values (?,?)");
			ps.setInt(1, u.getUsuario_id());
			ps.setInt(2, id_p);
			ps.executeQuery();
			PreparedStatement ps2 =  cbd.getConexao().prepareStatement("Select permissao where Codigo_permissao = ?");
			ps2.setInt(1, id_p);
			ResultSet rs = ps2.executeQuery();
			String p = null;
			while (rs.next()) {
				p = rs.getString(1);
			}
			JOptionPane.showMessageDialog(null,"Permiss�o de "+p+" dado com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Erro ao dar permiss�o ao usu�rio!");
			e.printStackTrace();
		}
	}
	public boolean verificarPermissao(Usuario usuario, int i){
		try {
			PreparedStatement ps =  cbd.getConexao().prepareStatement("Select * from Usuario_has_Permissoes where Codigo_permissao = ? and Usuario_idUsuario = ?");
			ps.execute();
			return true;
		} catch (SQLException e) {
				e.printStackTrace();
			return false;
		}
	}
	public boolean menuPermissao(Usuario user) {
		try {
			PreparedStatement ps = cbd.getConexao().prepareStatement("Select TipoUser_id_tipo from usuario where idUsuario = ?");
			ps.setInt(1, user.getUsuario_id());
			ResultSet rs = ps.executeQuery();
			int id = 0;
			while (rs.next()) {
				id = rs.getInt(1);
			}
			if (id == 1 ) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
