package com.algaworks.model;

import java.math.BigDecimal;
import java.util.Date;

public class PedidoVenda {

	private String descricao;
	private BigDecimal valor;
	private BigDecimal imposto;
	private Date data;
	
	public PedidoVenda(String descricao, BigDecimal valor) {
	    this.descricao = descricao;
	    this.valor = valor;
    }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getImposto() {
		return imposto;
	}

	public void setImposto(BigDecimal imposto) {
		this.imposto = imposto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
