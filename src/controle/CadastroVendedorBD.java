package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

import java.sql.Date;
import modelo.Usuario;

public class CadastroVendedorBD {
	private ConexaoBD cbd = new ConexaoBD();
	public void cadastrarVendedor(Usuario usuario) {
		try {
			PreparedStatement ps = cbd.getConexao().prepareStatement("INSERT INTO usuario (usuario_nome,"
					+ "usuario_cpf, usuario_datanascimento, "
					+ "usuario_telefone, usuario_senha, "
					+ "usuario_email, TipoUser_id_tipo) "
					+ "values (?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, usuario.getUsuario_nome());
			ps.setString(2, usuario.getUsuario_cpf());
			ps.setDate(3, (Date) usuario.getUsuario_datanascimento());
			ps.setString(4, usuario.getUsuario_telefone());
			ps.setString(5, usuario.getUsuario_senha());
			ps.setString(6, usuario.getUsuario_email());
			ps.setInt(7, 2);
			ps.execute();
			JOptionPane.showMessageDialog(null, "Vendedor cadastrado com êxito!");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Há campos obrigatórios não preenchidos!");
		}
	}
}
