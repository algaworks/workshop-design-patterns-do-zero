package com.algaworks.transportadora.service;

public class Frete {

	private TipoFrete tipo;
	
	public Frete(TipoFrete tipo) {
		this.tipo = tipo;
	}

	public double calcularPreco(int distancia) {
		double preco = 0;
		if (TipoFrete.NORMAL.equals(tipo)) {
			preco = distancia * 1.25 + 10;
		} else if (TipoFrete.SEDEX.equals(tipo)) {
			preco = distancia * 1.45 + 12;
		}
		
		return preco;
	}
	
}
