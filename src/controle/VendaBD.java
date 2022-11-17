package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.ItemVenda;
import modelo.Produto;
import modelo.Usuario;
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
	public void executarVenda(Venda venda) {
		try {
			PreparedStatement ps = cbd.getConexao().prepareStatement("Insert into venda values (Null,?,?,?)");
			ps.setFloat(1, venda.getVenda_valor());
			ps.setDate(2,venda.getVenda_data());
			ps.setInt(3, venda.getUsuario().getUsuario_id());
			ps.execute();
			PreparedStatement ps1 = cbd.getConexao().prepareStatement("select Venda_idVenda from venda ORDER BY id DESC LIMIT 1");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				venda.setIdVenda(rs.getInt(1));
			}
			for (ItemVenda iv : venda.getArrayItensVenda()) {
				Produto produto = new Produto(iv.getCodigoItem(), null, null, 0, 0, 0);
				
				PreparedStatement ps_quant = cbd.getConexao().prepareStatement("Select Unidade_quantidade_idUnidade_quantidade from produto where id = ?");
				ps_quant.setInt(1, produto.getIdProduto());
				ResultSet rs1 = ps_quant.executeQuery();
				produto.setUnidade_quantidade_idUnidade_quantidade(rs1.getInt(1));
				
				PreparedStatement ps2 = cbd.getConexao().prepareStatement("Insert venda_produto values (?,?,?,?,?)");
				ps2.setInt(1, venda.getIdVenda());
				ps2.setInt(2, iv.getCodigoItem());
				ps2.setFloat(3, produto.getUnidade_quantidade_idUnidade_quantidade());
				ps2.setFloat(4, iv.getQuantidadeItem());
				ps2.setFloat(5, iv.getPrecoTotalItem());
				
				PreparedStatement ps3 = cbd.getConexao().prepareStatement("UPDATE produto SET produto_quantidade = produto_quantidade - ? WHERE idProduto = ?");
				ps3.setFloat(1, iv.getQuantidadeItem());
				ps3.setInt(2, produto.getIdProduto());
			}

		} catch (SQLException e) {
				System.out.println(e);
			e.printStackTrace();
		}
	}
	
}
