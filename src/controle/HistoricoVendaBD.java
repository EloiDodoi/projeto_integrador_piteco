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

import modelo.ItemVenda;
import modelo.ItemVendido;
import modelo.Produto;
import modelo.Venda;

public class HistoricoVendaBD {
	
	private ConexaoBD cbd = new ConexaoBD();

	public void atualizarHistoricoVenda(JTable jt) {
		jt.setModel(listagemVenda());
	}
	
	public ArrayList<Venda> listaVendas() {
		try {
			ArrayList<Venda> historico = new ArrayList<>();
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT idVenda,venda_data,venda_valor,Tipo_Pagamento_idTipo_Pagamento FROM venda");
			ResultSet rs = ps.executeQuery();
	          while(rs.next()){
	        	  Venda v = new Venda();
	        	  v.setIdVenda(rs.getInt(1));
	        	  v.setVenda_data(rs.getDate(2));
	        	  v.setVenda_valor(rs.getFloat(3));
	        	  v.setTipo_pagamento(rs.getInt(4));
	        	  historico.add(v);

	            }
	          return historico;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DefaultTableModel listagemVenda() {
		ArrayList<Venda> lp = listaVendas();
		DefaultTableModel modelo_tabela = new DefaultTableModel(
				new Object[][][][]{
					
				},
				new String[] {
					"N�", "Data", "Valor", "Tipo de Pagamento"
				}	
		);
		for (int i = 0;i<lp.size();i++) {
			Venda v = lp.get(i);
			////--- nao 
			modelo_tabela.addRow(new Object[]{v.getIdVenda(), v.getVenda_data(), v.getVenda_valor(),TipoPagemento(v.getTipo_pagamento())});
			System.out.println(TipoPagemento(v.getTipo_pagamento())+"   "+v.getTipo_pagamento());
		}
		return modelo_tabela;	
	}	
	
	public String TipoPagemento (int id){
		String tipo = null;
		switch (id) {
			case 1:	
				tipo = "Dinheiro";
			case 2:
				tipo = "Cartão de Débito";
			case 3:
				tipo = "Cartão de Crédito";
		}
		return tipo;
	}
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	public DefaultTableModel listagemItemVenda() {
		ArrayList<ItemVendido> lp = listaItensVenda();
		DefaultTableModel modelo_tabela = new DefaultTableModel(
				new Object[][][][]{
					
				},
				new String[] {
					"ID", "Nome", "Quantidade", "Preço"
				}	
		);
		for (int i = 0;i<lp.size();i++) {
			ItemVendido iv = lp.get(i);
			////--- nao 
			modelo_tabela.addRow(new Object[]{iv.getCodigoItem(),iv.getNomIetem(),iv.getQuantidadeItem(),iv.getPrecoTotalItem()});
		}
		return modelo_tabela;	
	}	
	
	public ArrayList<ItemVendido> listaItensVenda(){
		try {
			ArrayList<ItemVendido> itensVenda = new ArrayList<>();
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT Produto_idProduto,produto_nomeveg,vp_quantidade,vp_valor "
					+ "from produto inner join venda_produto on Produto_idProduto = idProduto inner join venda on Venda_idVenda = idVenda "
					+ "where idVenda = ?");
			ResultSet rs = ps.executeQuery();
	          while(rs.next()){
	        	  ItemVendido iv = new ItemVendido();
	        	  Produto p = new Produto(0, null, null, 0, 0, 0);
	        	  iv.setCodigoItem(rs.getInt(1));
	        	  iv.setNomIetem(rs.getString(2));
	        	  iv.setQuantidadeItem(3);
	        	  iv.setPrecoTotalItem(4);
	        	  itensVenda.add(iv);

	            }
	          return itensVenda;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DefaultTableModel listagemItensVenda() {
		return null;
	}
	
}
