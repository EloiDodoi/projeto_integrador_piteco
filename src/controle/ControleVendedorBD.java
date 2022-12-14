package controle;

import java.nio.file.attribute.AclEntry;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.PreparableStatement;

import modelo.Produto;
import modelo.Usuario;

public class ControleVendedorBD {
	private ConexaoBD cbd = new ConexaoBD();
	
	public void atualizarLista(JTable jt) {
		jt.setModel(listagemVendedor());
	}
	
	public void atualizarListaFiltrada(JTable jt, String texto, int tipo) {
		jt.setModel(listagemFiltroVendedor(texto, tipo));
 }
	
	public ArrayList<Usuario> listaVendedor() {
		try {
			ArrayList<Usuario> controle_vend = new ArrayList<>();
			PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT * FROM usuario where TipoUser_id_tipo = 2");
			ResultSet rs = ps.executeQuery();
	          while(rs.next()){
	        	  Usuario vendedor = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), null, rs.getDate(5), rs.getString(6), null, rs.getString(8),null, rs.getInt(9));
	        	  controle_vend.add(vendedor);
	          }
	          return controle_vend;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DefaultTableModel listagemVendedor() {
		ArrayList<Usuario> lv = listaVendedor();
		DefaultTableModel modelo_tabela = new DefaultTableModel(
				new Object[][][][][] {
				},
				new String[] {
					"Nome", "CPF", "Data de nascimento", "Telefone", "E-mail"
				}
		);
		for (int i = 0;i<lv.size();i++) {
			Usuario u = lv.get(i);
			modelo_tabela.addRow(new Object[] {u.getUsuario_nome(), u.getUsuario_cpf(), u.getUsuario_datanascimento(), u.getUsuario_telefone(), u.getUsuario_email()});
		}
		return modelo_tabela;	
	}
	public void deletarVendedor (Usuario u, JTable table){
		try {
			PreparedStatement ps = cbd.getConexao().prepareStatement("DELETE FROM usuario WHERE idUsuario = ?");
			ps.setInt(1, u.getUsuario_id());
			ps.executeUpdate();
			atualizarLista(table);
			JOptionPane.showMessageDialog(null, "Usu??rio deletado com ??xito!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar usu??rio!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//-------------------------------------------------------------------------------------------------------------

	public ArrayList<Usuario> filtroVendedor(String texto, int tipo) {
		ArrayList<Usuario> filtro_vend = new ArrayList<>();
		try {
			if (tipo == 1) {
				PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT * FROM usuario where TipoUser_id_tipo = 2 and usuario_nome like ?");
				ps.setString(1, "%"+texto+"%");
				ResultSet rs = ps.executeQuery();
		          while(rs.next()){
		        	  Usuario vendedor = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), null, rs.getDate(5), rs.getString(6), null, rs.getString(8),null, rs.getInt(9));
		        	  filtro_vend.add(vendedor);
		          }
		          return filtro_vend;
			}else if (tipo == 2) {
				PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT * FROM usuario where TipoUser_id_tipo = 2 and   cpf like ?");
				ps.setString(1, "%"+texto+"%");
				ResultSet rs = ps.executeQuery();
		          while(rs.next()){
		        	  Usuario vendedor = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), null, rs.getDate(5), rs.getString(6), null, rs.getString(8),null, rs.getInt(9));
		        	  filtro_vend.add(vendedor);
		          }
		          return filtro_vend;	
		          // --------------- DAta
			}else if (tipo == 3) {
				PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT * FROM usuario where TipoUser_id_tipo = 2 and usuario_datanascimento like ?");
				ps.setString(1,"%"+texto+"%");
				ResultSet rs = ps.executeQuery();
		          while(rs.next()){
		        	  Usuario vendedor = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), null, rs.getDate(5), rs.getString(6), null, rs.getString(8),null, rs.getInt(9));
		        	  filtro_vend.add(vendedor);
		          }
		          return filtro_vend;					
			}else if (tipo == 4) {
				PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT * FROM usuario where TipoUser_id_tipo = 2 and usuario_telefone like ?");
				ps.setString(1, "%"+texto+"%");
				ResultSet rs = ps.executeQuery();
		          while(rs.next()){
		        	  Usuario vendedor = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), null, rs.getDate(5), rs.getString(6), null, rs.getString(8),null, rs.getInt(9));
		        	  filtro_vend.add(vendedor);
		          }
		          return filtro_vend;		
			}else if (tipo == 5) {
				PreparedStatement ps = cbd.getConexao().prepareStatement("SELECT * FROM usuario where TipoUser_id_tipo = 2 and usuario_email like ?");
				ps.setString(1, "%"+texto+"%");
				ResultSet rs = ps.executeQuery();
		          while(rs.next()){
		        	  Usuario vendedor = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), null, rs.getDate(5), rs.getString(6), null, rs.getString(8),null, rs.getInt(9));
		        	  filtro_vend.add(vendedor);
		          }
		          return filtro_vend;		
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public DefaultTableModel listagemFiltroVendedor(String texto, int tipo) {
		ArrayList<Usuario> lv = filtroVendedor(texto, tipo) ;
		DefaultTableModel modelo_tabela = new DefaultTableModel(
				new Object[][][][][] {
				},
				new String[] {
					"Nome", "CPF", "Data de nascimento", "Telefone", "E-mail"
				}
		);
		for (int i = 0;i<lv.size();i++) {
			Usuario u = lv.get(i);
			modelo_tabela.addRow(new Object[] {u.getUsuario_nome(), u.getUsuario_cpf(), u.getUsuario_datanascimento(), u.getUsuario_telefone(), u.getUsuario_email()});
		}
		return modelo_tabela;	
	}
}
