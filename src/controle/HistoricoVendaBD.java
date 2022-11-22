package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
	
	public ArrayList<Object> listaVendas() {
		try {
			ArrayList<Object> historico = new ArrayList<>();
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT idVenda,venda_data,venda_valor,Tipo_Pagamento FROM venda inner join tipo_pagamento on Tipo_Pagamento_idTipo_Pagamento = idTipo_Pagamento");
			ResultSet rs = ps.executeQuery();
	          while(rs.next()){
	        	  int  i = 0;
	        	  String tipo_a;
	        	  Venda v = new Venda();
	        	  v.setIdVenda(rs.getInt(1));
	        	  v.setVenda_data(rs.getDate(2));
	        	  v.setVenda_valor(rs.getFloat(3));
	        	  tipo_a = rs.getString(4);
	        	  historico.add(i, v);
	        	  historico.add(i, tipo_a);
	        	  i++;
	            }
	          return historico;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DefaultTableModel listagemVenda() {
		ArrayList<Object> lp = listaVendas();
		DefaultTableModel modelo_tabela = new DefaultTableModel(
				new Object[][][][][]{
					
				},
				new String[] {
					"N°", "Data", "Valor", "Tipo de Pagamento", "Produtos"
				}	
		);
		for (int i = 0;i<lp.size();i++) {
			Object v = lp.get(i);
			////--- nao 
			modelo_tabela.addRow(new Object[] {});
		}
		return modelo_tabela;	
		}	

}
