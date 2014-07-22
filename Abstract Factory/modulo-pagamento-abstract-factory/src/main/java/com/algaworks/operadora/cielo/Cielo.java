package com.algaworks.operadora.cielo;

import java.math.BigDecimal;

import com.algaworks.operadora.CapturaNaoAutorizadaException;
import com.algaworks.operadora.Operadora;

public class Cielo implements Operadora {

	private Long codigoConfirmacao = -1L;

	@Override
	public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {
		if (cartao.startsWith("5555")) {
			throw new CapturaNaoAutorizadaException("Número de cartão inválido!");
		}
		
		this.codigoConfirmacao = (long) Math.random() * 1000;
	}
	
	@Override
	public Long confirmar() {
		System.out.println("Fazendo o débito na conta do cliente via Cielo");
		return this.codigoConfirmacao;
	}
	
}
