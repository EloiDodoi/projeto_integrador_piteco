package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Produto;
import modelo.Venda;

public class HistoricoVendaBD {
	
	private ConexaoBD cbd = new ConexaoBD();

	public void atualizarHistoricoVenda(JTable jt) {
		jt.setModel(listagemVenda());
	}
	
	public ArrayList<Produto> listaProdutos() {
		try {
			ArrayList<Venda> venda = new ArrayList<>();
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT idVenda,venda_data,venda_valor,Tipo_Pagamento FROM venda inner join tipo_pagamento on Tipo_Pagamento_idTipo_Pagamento = idTipo_Pagamento");
			ResultSet rs = ps.executeQuery();
	          while(rs.next()){
	        	  Venda v = new Venda();
	        	  v.setIdVenda(0);
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
	
	public DefaultTableModel listagemVenda() {
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
}
