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
			JOptionPane.showMessageDialog(null,"Permissão de "+p+" dado com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Erro ao dar permissão ao usuário!");
			e.printStackTrace();
		}
	}
}
