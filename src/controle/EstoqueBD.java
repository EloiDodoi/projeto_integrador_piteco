package controle;
import modelo.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Produto;

public class EstoqueBD {

	private ConexaoBD cbd = new ConexaoBD();
	
	public void atualizarEstoque(JTable jt) {
		jt.setModel(listagemProduto());
	}
	
	public void deletar(Produto p, JTable jt) {
		PreparedStatement ps;
		try {
			ps = cbd.getConexao().prepareStatement("DELETE FROM produto WHERE idproduto = ?");
			ps.setInt(1, p.getIdProduto());
			ps.executeUpdate();
			atualizarEstoque(jt);
			JOptionPane.showMessageDialog(null, "Produto deletado com êxito!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar o produto!");
		}
	
	}

	public ArrayList<Produto> listaProdutos() {
		try {
			ArrayList<Produto> estoque = new ArrayList<>();
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT * FROM produto");
			ResultSet rs = ps.executeQuery();
	          while(rs.next()){
	        	  Produto p = new Produto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getFloat(5), rs.getInt(6));
	        	  estoque.add(p);
	            }
	          for (Produto p: estoque) {
	        	  System.out.println(p.getIdProduto());
	        	  System.out.println(p.getProduto_nomeveg());
	        	  System.out.println(p.getProduto_especieveg());
	        	  System.out.println(p.getProduto_preco());
	        	  System.out.println(p.getProduto_quantidade());
	        	  System.out.println(p.getUnidade_quantidade_idUnidade_quantidade());
	          }
	          return estoque;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DefaultTableModel listagemProduto() {
		ArrayList<Produto> lp = listaProdutos();
		DefaultTableModel modelo_tabela = new DefaultTableModel(
				new Object[][][][][][] {
					
				},
				new String[] {
					"C\u00F3digo", "Nome", "Esp\u00E9cie", "Pre\u00E7o", "Quantidade"
				}	
		);
		for (int i = 0;i<lp.size();i++) {
			Produto p = lp.get(i);
			modelo_tabela.addRow(new Object[] {p.getIdProduto(),p.getProduto_nomeveg(),p.getProduto_especieveg(),p.getProduto_preco(), p.getProduto_quantidade()});
		}
		return modelo_tabela;	
	}
}
