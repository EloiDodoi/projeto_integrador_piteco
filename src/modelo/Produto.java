package modelo;

public class Produto {

	private int idProduto;
	private String produto_nomeveg;
	private String produto_especieveg;
	private float produto_preco;
	private float produto_quantidade;
	private int Unidade_quantidade_idUnidade_quantidade;
	
	

	public Produto(int idProduto, String produto_nomeveg, String produto_especieveg, float produto_preco,
			float produto_quantidade, int unidade_quantidade_idUnidade_quantidade) {
		super();
		this.idProduto = idProduto;
		this.produto_nomeveg = produto_nomeveg;
		this.produto_especieveg = produto_especieveg;
		this.produto_preco = produto_preco;
		this.produto_quantidade = produto_quantidade;
		Unidade_quantidade_idUnidade_quantidade = unidade_quantidade_idUnidade_quantidade;
	}

	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getProduto_nomeveg() {
		return produto_nomeveg;
	}
	public void setProduto_nomeveg(String produto_nomeveg) {
		this.produto_nomeveg = produto_nomeveg;
	}
	
	public String getProduto_especieveg() {
		return produto_especieveg;
	}
	public void setProduto_especieveg(String produto_especieveg) {
		this.produto_especieveg = produto_especieveg;
	}
	
	public float getProduto_preco() {
		return produto_preco;
	}
	public void setProduto_preco(float produto_preco) {
		this.produto_preco = produto_preco;
	}
	
	public float getProduto_quantidade() {
		return produto_quantidade;
	}
	public void setProduto_quantidade(float produto_quantidade) {
		this.produto_quantidade = produto_quantidade;
	}
	
	public int getUnidade_quantidade_idUnidade_quantidade() {
		return Unidade_quantidade_idUnidade_quantidade;
	}
	public void setUnidade_quantidade_idUnidade_quantidade(int unidade_quantidade_idUnidade_quantidade) {
		Unidade_quantidade_idUnidade_quantidade = unidade_quantidade_idUnidade_quantidade;
	}
	
	
	
}
