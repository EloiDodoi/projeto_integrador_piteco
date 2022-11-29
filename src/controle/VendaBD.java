package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.protocol.Resultset;

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
	
	public Produto retornarProduto(int codProduto) {
		Produto p = null;
		try {
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT * FROM PRODUTO WHERE idProduto = ?");
			ps.setInt(1, codProduto);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				p = new Produto(codProduto, rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4), rs.getInt(5));
			}
			
			return p;
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro em adicionar item à compra!");
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void executarVenda(Venda venda) {
		try {
			PreparedStatement ps = cbd.getConexao().prepareStatement("Insert into venda values (Null,?,?,?,?)");
			ps.setFloat(1, venda.getVenda_valor());
			ps.setDate(2,venda.getVenda_data());
			ps.setInt(3, venda.getUsuario().getUsuario_id());
			ps.setInt(4, venda.getTipo_pagamento());
			System.out.println(ps);
			ps.execute();
			PreparedStatement ps1 = cbd.getConexao().prepareStatement("select idVenda from venda ORDER BY idVenda DESC LIMIT 1");
			ResultSet rs = ps1.executeQuery();
			while(rs.next()) {
				venda.setIdVenda(rs.getInt(1));
			}
			for (ItemVenda iv : venda.getArrayItensVenda()) {
				Produto produto = new Produto(iv.getCodigoItem(), null, null, 0, 0, 0);
				
				PreparedStatement ps_quant = cbd.getConexao().prepareStatement("Select Unidade_quantidade_idUnidade_quantidade from produto where idProduto = ?");
				ps_quant.setInt(1, produto.getIdProduto());
				ResultSet rs1 = ps_quant.executeQuery();
				while(rs1.next()) {
					produto.setUnidade_quantidade_idUnidade_quantidade(rs1.getInt(1));
				}
				
				PreparedStatement ps2 = cbd.getConexao().prepareStatement("Insert into venda_produto values (?,?,?,?,?)");
				ps2.setInt(1, venda.getIdVenda());
				ps2.setInt(2, iv.getCodigoItem());
				ps2.setFloat(3, produto.getUnidade_quantidade_idUnidade_quantidade());
				ps2.setFloat(4, iv.getQuantidadeItem());
				ps2.setFloat(5, iv.getPrecoTotalItem());
				ps2.execute();
				
				PreparedStatement ps3 = cbd.getConexao().prepareStatement("UPDATE produto SET produto_quantidade = produto_quantidade - ? WHERE idProduto = ?");
				ps3.setFloat(1, iv.getQuantidadeItem());
				ps3.setInt(2, produto.getIdProduto());
				ps3.execute();
			}
			
			JOptionPane.showMessageDialog(null, "Venda executada com êxito!");
		} catch (SQLException e) {
				System.out.println(e);
			e.printStackTrace();
		}
		
	}
	public boolean verificarItem(Produto item, Float quant_item){
		try {
			float quant = 0;
			PreparedStatement ps = cbd.getConexao().prepareStatement("Select produto_quantidade from produto where idproduto = ?");
			ps.setInt(1, item.getIdProduto());
			ResultSet rs =  ps.executeQuery();
			while (rs.next()) {
				quant = rs.getFloat(1);
			}
			if(quant > quant_item) {
				return true;
			}
			else {	
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return false;
	}
	public void messagemEstoque (Venda venda){
		for (ItemVenda iv : venda.getArrayItensVenda()) {
			
		
		} 
	}
}
