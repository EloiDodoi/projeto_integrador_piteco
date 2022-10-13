package controle;

import modelo.Produto;
import modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controle.ConexaoBD;

import com.mysql.cj.xdevapi.PreparableStatement;

public class CadastroProdutoBD {

	private ConexaoBD cbd = new ConexaoBD();
	
	public void cadastrar(Produto produto) {
		try {
			PreparedStatement ps = cbd.getConexao()
					.prepareStatement("insert into produto (produto_nomeveg, produto_especieveg, "
							+ "produto_preco, produto_quantidade, Unidade_quantidade_idUnidade_quantidade) "
							+ "values (?, ?, ?, ?, ?)");
			ps.setString(1, produto.getProduto_nomeveg());
			ps.setString(2, produto.getProduto_especieveg());
			ps.setFloat(3, produto.getProduto_preco());
			ps.setFloat(4, produto.getProduto_quantidade());
			ps.setInt(5, produto.getUnidade_quantidade_idUnidade_quantidade());
			ps.execute();
			JOptionPane.showMessageDialog(null, "Cadastro do Produto realizado com êxito!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro no cadastro!");
			e.printStackTrace();
			System.out.println(e);
		}
		;
	}
}
