package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Produto;

public class VendaBD {
	private ConexaoBD cbd = new ConexaoBD();
	
	public float precoUnitario(Produto produto, float quantidade) {
		float preco = 0;
		try {
			
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT produto_preco FROM PRODUTO WHERE idProduto = ?");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				preco = rs.getFloat(1);
			}
			return preco * quantidade;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro em adicionar item à compra!");
			e.printStackTrace();
		}
		return 0;
	}
}
