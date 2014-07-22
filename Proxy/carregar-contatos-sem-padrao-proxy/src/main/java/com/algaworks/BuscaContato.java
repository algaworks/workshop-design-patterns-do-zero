package com.algaworks;

import com.algaworks.contatos.ContatosXML;
import com.algaworks.repository.Contatos;

public class BuscaContato {

	public static void main(String[] args) {
	    Contatos contatos = new ContatosXML("contatos1.xml", "contatos2.xml");
	    String nome = contatos.buscarPor("jose@email.com");
	    
	    System.out.println(nome);
    }
	
}
