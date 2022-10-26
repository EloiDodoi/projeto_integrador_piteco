package modelo;

import java.sql.Date;

public class Venda {
	private int idVenda;
	private float venda_valor;
	private Date venda_data;
	private int Usuario_idUsuario;
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
	public int getUsuario_idUsuario() {
		return Usuario_idUsuario;
	}
	public void setUsuario_idUsuario(int usuario_idUsuario) {
		Usuario_idUsuario = usuario_idUsuario;
	}
	
	
}
