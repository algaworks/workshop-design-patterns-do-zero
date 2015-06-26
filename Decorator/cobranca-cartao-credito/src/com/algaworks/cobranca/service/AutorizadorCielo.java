package com.algaworks.cobranca.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import com.algaworks.cobranca.model.CartaoCredito;
import com.algaworks.cobranca.model.Cliente;

public class AutorizadorCielo implements AutorizadorCartaoCredito {
	
	@Override
	public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor) {
		try (PrintStream writer = new PrintStream(new FileOutputStream("debitos.txt", true))) {
			writer.println(cliente + " | " + cartaoCredito + " | R$" + valor);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Impossível salvar arquivo", e);
		}
	}

}
