package com.algaworks.maladireta.xml;

import java.net.URL;
import java.util.List;

import com.algaworks.contato.Contato;
import com.algaworks.contato.Contatos;
import com.thoughtworks.xstream.XStream;

public class ContatosXML implements Contatos {

	private String nomeArquivo;
	
	public ContatosXML(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@SuppressWarnings("unchecked")
    @Override
    public List<Contato> todos() {
		XStream xstream = new XStream();
	    xstream.alias("contatos", List.class);
	    xstream.alias("contato", Contato.class);
	    
	    URL arquivo = this.getClass().getResource("/" + nomeArquivo);
	    return (List<Contato>) xstream.fromXML(arquivo);
    }

}
