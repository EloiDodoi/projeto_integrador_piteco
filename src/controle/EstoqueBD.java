package controle;

import modelo.Produto;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import modelo.Produto;

public class EstoqueBD {

	private static final String JTable = null;
	private ConexaoBD cbd = new ConexaoBD();
	private JTable tabelaNot;
	
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
			JOptionPane.showMessageDialog(null, "Erro ao filtrar ou não existente. Tenha certeza de que digitou um produto válido");
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
			tabelaNot = null;
			
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

//			setContentPane(contentPane);
			GridBagLayout gbl_contentPane = new GridBagLayout();
			gbl_contentPane.columnWidths = new int[]{0, 0};
			gbl_contentPane.rowHeights = new int[]{0, 0, 0};
			gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			contentPane.setLayout(gbl_contentPane);
			
			JLabel label = new JLabel("Produtos em baixa quantidade!");
			
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			contentPane.add(label, gbc_lblNewLabel);
			
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
					JTable table = new JTable(modelo_tabela, null);
					
					JTableHeader tHeader = table.getTableHeader();
					tHeader.setBackground(new Color(150, 191, 120));
					tHeader.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
					tHeader.setForeground(Color.WHITE);
					
					JScrollPane scrollPane = new JScrollPane();
					GridBagConstraints gbc_scrollPane = new GridBagConstraints();
					gbc_scrollPane.fill = GridBagConstraints.BOTH;
					gbc_scrollPane.gridx = 0;
					gbc_scrollPane.gridy = 1;
					contentPane.add(scrollPane, gbc_scrollPane);
					
					scrollPane.setColumnHeaderView(table);
					
					JOptionPane.showMessageDialog(null, contentPane);
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
