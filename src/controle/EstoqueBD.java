package controle;

import modelo.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

public class EstoqueBD {

	private static final String JTable = null;
	private ConexaoBD cbd = new ConexaoBD();
	
	public void atualizarEstoque(JTable jt) {
		jt.setModel(listagemProduto());
	}
	
	
	public void atualizarPesquisa(JTable jt, String texto, int tipo) {
		jt.setModel(produtoFiltradoTabela(texto, tipo));
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
			System.out.println(e);
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
//	        	  System.out.println(p.getIdProduto());
//	        	  System.out.println(p.getProduto_nomeveg());
//	        	  System.out.println(p.getProduto_especieveg());
//	        	  System.out.println(p.getProduto_preco());
//	        	  System.out.println(p.getProduto_quantidade());
//	        	  System.out.println(p.getUnidade_quantidade_idUnidade_quantidade());
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
	
	
	public ArrayList<Produto> filtro(String texto, int tipo) {
		System.out.println(tipo);
		try {
			ArrayList<Produto> listaFiltrada = new ArrayList<>();
			if (tipo == 1) {
				PreparedStatement ps;
				ps = cbd.getConexao().prepareStatement("SELECT * FROM produto WHERE produto_nomeveg like ?");
				ps.setString(1,"%"+ texto+"%");
				System.out.println(ps);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
			      	Produto p = new Produto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getFloat(5), rs.getInt(6));
		        	  listaFiltrada.add(p);
	            }
	          	return listaFiltrada;
	          }else if (tipo == 2){
	        	  int cod = Integer.parseInt(texto);
	        	  PreparedStatement ps;
					ps = cbd.getConexao().prepareStatement("SELECT * FROM produto WHERE IdProduto = ?");
					ps.setInt(1, cod);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
				      	Produto p = new Produto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getFloat(5), rs.getInt(6));
			        	  listaFiltrada.add(p);
		            }
		          	return listaFiltrada;
	          } else if (tipo == 3) {
	        	  Float preco_maior = Float.parseFloat(texto);
	        	  PreparedStatement ps;
					ps = cbd.getConexao().prepareStatement("SELECT * FROM produto WHERE Produto_preco <= ?");
					ps.setFloat(1, preco_maior);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
				      	Produto p = new Produto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getFloat(5), rs.getInt(6));
			        	  listaFiltrada.add(p);
		            }
		          	return listaFiltrada;
			}else if (tipo==4) {
	        	  Float preco_menor = Float.parseFloat(texto);
	        	  PreparedStatement ps;
					ps = cbd.getConexao().prepareStatement("SELECT * FROM produto WHERE Produto_preco >= ?");
					ps.setFloat(1, preco_menor);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
				      	Produto p = new Produto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getFloat(5), rs.getInt(6));
			        	  listaFiltrada.add(p);
		            }
		          return listaFiltrada;
			}
			
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao filtrar ou n�o existente. Tenha certeza de que digitou um produto válido");
		}
		
		return null;
	}
	
	public DefaultTableModel produtoFiltradoTabela(String texto, int tipo) {
		ArrayList<Produto> listaFiltrada = filtro(texto, tipo);
		
		DefaultTableModel modelo_tabela = new DefaultTableModel(
				new Object[][][][][][] {
					
				},
				new String[] {
					"C\u00F3digo", "Nome", "Esp\u00E9cie", "Pre\u00E7o", "Quantidade"
				}	
		);
		for (int i = 0;i<listaFiltrada.size();i++) {
			Produto p = listaFiltrada.get(i);
			modelo_tabela.addRow(new Object[] {p.getIdProduto(),p.getProduto_nomeveg(),p.getProduto_especieveg(),p.getProduto_preco(), p.getProduto_quantidade()});
		}
		return modelo_tabela;
	}
	public void notificacaoEstoque () {
		ArrayList<Produto> lista_quant = new ArrayList<>();
		try {
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT  idProduto,produto_nomeveg,produto_quantidade FROM produto where produto_quantidade < 5");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produto p = new Produto(rs.getInt(1), (rs.getString(2)), null, 0, rs.getFloat(3), 0);
				lista_quant.add(p);
			}
			JTable tabelaNot = null;
			DefaultTableModel modelo_tabela = new DefaultTableModel(
					new Object[][][] {
						
					},
					new String[] {
						"Código", "Nome", "Quantidade"
						}
					);
					for (int i = 0;i<lista_quant.size();i++) {
						Produto p = lista_quant.get(i);
						modelo_tabela.addRow(new Object[] {p.getIdProduto(),p.getProduto_nomeveg(),p.getProduto_quantidade()});
					} 
					tabelaNot.setModel(modelo_tabela);
					JOptionPane.showMessageDialog(null, tabelaNot);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
