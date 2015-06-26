package com.algaworks.transportadora.service.frete;

import com.algaworks.transportadora.service.Frete;

public class Sedex implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.45 + 12;
	}
	
}
