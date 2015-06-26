package com.algaworks.cobranca.service;

import java.time.YearMonth;

import com.algaworks.cobranca.exception.RiscoCreditoException;
import com.algaworks.cobranca.model.CartaoCredito;
import com.algaworks.cobranca.model.Cliente;

public class AnalisadorDeRiscoClearSale implements AutorizadorCartaoCredito {

	private AutorizadorCartaoCredito autorizador;
	
	public AnalisadorDeRiscoClearSale(AutorizadorCartaoCredito autorizador) {
		this.autorizador = autorizador;
	}

	@Override
	public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor) {
		if (cliente.getCpf().startsWith("111") || cartaoCredito.getVencimento().isBefore(YearMonth.now())
				|| valor > 500) {
			throw new RiscoCreditoException("Possível fraude, negando pagamento!");
		}
		
		autorizador.autorizar(cliente, cartaoCredito, valor);
	}

}
