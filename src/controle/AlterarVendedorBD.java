package controle;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Usuario;

public class AlterarVendedorBD {
	ConexaoBD cbd = new ConexaoBD();

	public void alteraVendedor(Usuario u) {
		try {
			PreparedStatement ps = cbd.getConexao()
					.prepareStatement("UPDATE produto SET usuario_nome = ?, " + "usuario_cpf = ?,"
							+ "usuario_datanascimento = ?, " + "usuario_telefone =?,"
							+ "usuario_senha = ?, usuario_email = ?" + " WHERE usuario_email = ?");
			ps.setString(1, u.getUsuario_nome());
			ps.setString(2, u.getUsuario_cpf());
			ps.setDate(3, (Date) u.getUsuario_datanascimento());
			ps.setString(4, u.getUsuario_telefone());
			ps.setString(5, u.getUsuario_senha());
			ps.setString(6, u.getUsuario_email());
			ps.setString(7, u.getUsuario_email());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Alteração de Vendedor realizada com êxito!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro na alteração! "+ e);
		}
	}
}
