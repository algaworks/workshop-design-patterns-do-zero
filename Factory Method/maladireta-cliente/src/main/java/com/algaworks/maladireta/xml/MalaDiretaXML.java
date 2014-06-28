package com.algaworks.maladireta.xml;

import com.algaworks.contato.Contatos;
import com.algaworks.maladireta.MalaDireta;

public class MalaDiretaXML extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaXML(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    protected Contatos criarContatos() {
	    return new ContatosXML(nomeArquivo);
    }

}
