package modelo;

public class ItemVendido {
	private int codigoItem;
	private String nomIetem;
	private float precoTotalItem;
	private float quantidadeItem;
	
	public int getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}
	public String getNomIetem() {
		return nomIetem;
	}
	public void setNomIetem(String nomIetem) {
		this.nomIetem = nomIetem;
	}
	public float getPrecoTotalItem() {
		return precoTotalItem;
	}
	public void setPrecoTotalItem(float precoTotalItem) {
		this.precoTotalItem = precoTotalItem;
	}
	public float getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(float quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
}
