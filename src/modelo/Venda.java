package modelo;

import java.sql.Date;

public class Venda {

	private int idVenda;
	private float venda_valor;
	private Date venda_data;
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public float getVenda_valor() {
		return venda_valor;
	}

	public void setVenda_valor(float venda_valor) {
		this.venda_valor = venda_valor;
	}

	public Date getVenda_data() {
		return venda_data;
	}

	public void setVenda_data(Date venda_data) {
		this.venda_data = venda_data;
	}

}
