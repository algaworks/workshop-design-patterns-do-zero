package com.algaworks.cobranca.model;

import java.time.YearMonth;

public class CartaoCredito {

	private String numero;
	private String nome;
	private YearMonth vencimento;
	private int codigoSeguranca;

	public CartaoCredito(String numero, String nome, YearMonth vencimento,
			int codigoSeguranca) {
		this.numero = numero;
		this.nome = nome;
		this.vencimento = vencimento;
		this.codigoSeguranca = codigoSeguranca;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public YearMonth getVencimento() {
		return vencimento;
	}

	public void setVencimento(YearMonth vencimento) {
		this.vencimento = vencimento;
	}

	public int getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(int codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	@Override
	public String toString() {
		return "CartaoCredito [numero=" + numero + ", nome=" + nome
				+ ", vencimento=" + vencimento + ", codigoSeguranca="
				+ codigoSeguranca + "]";
	}

}
