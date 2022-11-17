package modelo;

import java.sql.Date;
import java.util.ArrayList;


public class Venda {

	private int idVenda;
	private float venda_valor;
	private Date venda_data;
	private Usuario usuario;
	private int tipo_pagamento;
	
	public int getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(int tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	ItemVenda iv = new ItemVenda();
	ArrayList<ItemVenda> arrayItensVenda = new ArrayList<ItemVenda>();
	

	public ArrayList<ItemVenda> getArrayItensVenda() {
		return arrayItensVenda;
	}
	
	public ItemVenda itemVendaEspecifico(int i) {
		return arrayItensVenda.get(i);
	}

	public void adicionarItem(ItemVenda item) {
		arrayItensVenda.add(item);
	}
	
	
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
