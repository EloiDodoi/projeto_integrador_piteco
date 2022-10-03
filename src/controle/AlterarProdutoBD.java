package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import controle.ConexaoBD;
import modelo.Produto;

public class AlterarProdutoBD {
	ConexaoBD cbd = new ConexaoBD();

	public void alterarProduto(Produto p) {
		try {
			PreparedStatement ps = cbd.getConexao()
					.prepareStatement("UPDATE produto SET produto_nomeveg = ?, " + "produto_especieveg = ?,"
							+ "produto_preco = ?, " + "produto_quantidade=?,"
							+ "Unidade_quantidade_idUnidade_quantidade = ?" + " WHERE idProduto = ?");
			ps.setString(1, p.getProduto_nomeveg());
			ps.setString(2, p.getProduto_especieveg());
			ps.setFloat(3, p.getProduto_preco());
			ps.setFloat(4, p.getProduto_quantidade());
			ps.setInt(5, p.getUnidade_quantidade_idUnidade_quantidade());
			ps.setInt(6, p.getIdProduto());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro Banco de Dados: " + e);
		}

	}

	public Produto passarAlterar(Produto p) {
		return p;
	}
}
