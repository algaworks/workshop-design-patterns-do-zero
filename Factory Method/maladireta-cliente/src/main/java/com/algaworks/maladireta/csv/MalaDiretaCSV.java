package com.algaworks.maladireta.csv;

import com.algaworks.contato.Contatos;
import com.algaworks.maladireta.MalaDireta;

public class MalaDiretaCSV extends MalaDireta {

	private String nomeArquivo;
	
	public MalaDiretaCSV(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    protected Contatos criarContatos() {
	    return new ContatosCSV(nomeArquivo);
    }

}
