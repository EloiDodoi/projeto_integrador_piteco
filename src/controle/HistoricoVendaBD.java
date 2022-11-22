package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
			ArrayList<String> tipo =  new ArrayList<>();
			ArrayList<Object> historico = new ArrayList<>();
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT idVenda,venda_data,venda_valor,Tipo_Pagamento FROM venda inner join tipo_pagamento on Tipo_Pagamento_idTipo_Pagamento = idTipo_Pagamento");
			ResultSet rs = ps.executeQuery();
	          while(rs.next()){
	        	  String tipo_a;
	        	  Venda v = new Venda();
	        	  v.setIdVenda(rs.getInt(1));
	        	  v.setVenda_data(rs.getDate(2));
	        	  v.setVenda_valor(rs.getFloat(3));
	        	  venda.add(v);
	        	  tipo_a = rs.getString(4);
	        	  tipo.add(tipo_a);
	            }
	          for (Venda v: venda) {
	        	  
	          }
	          return historico;
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
