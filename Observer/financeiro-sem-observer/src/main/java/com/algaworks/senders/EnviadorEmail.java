package com.algaworks.senders;

import java.util.List;

import com.algaworks.model.Lancamento;

public class EnviadorEmail {
	
    public void enviar(List<Lancamento> lancamentosVencidos) {
		for (Lancamento lancamento : lancamentosVencidos) {
			System.out.println("Enviando e-mail para " + lancamento.getPessoa().getEmail());
		}
    }

}
