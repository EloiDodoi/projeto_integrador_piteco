package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.ItemVenda;
import modelo.Produto;
import modelo.Venda;

public class VendaBD {
	private ConexaoBD cbd = new ConexaoBD();
	
	public float precoUnitario(int codProduto, float quantidade) {
		float preco = 0;
		try {
			
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT produto_preco FROM PRODUTO WHERE idProduto = ?");
			
			ps.setInt(1, codProduto);
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
	
	public String nomeProduto(int codProduto) {
		String nomeProduto = null;
		try {
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT produto_nomeveg FROM PRODUTO WHERE idProduto = ?");
			ps.setInt(1, codProduto);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				nomeProduto = rs.getString(1);
			}
			return nomeProduto;
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro em adicionar item à compra!");
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
