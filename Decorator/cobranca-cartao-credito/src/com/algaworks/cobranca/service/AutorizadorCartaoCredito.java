package com.algaworks.cobranca.service;

import com.algaworks.cobranca.model.CartaoCredito;
import com.algaworks.cobranca.model.Cliente;

public interface AutorizadorCartaoCredito {

	public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor);

}