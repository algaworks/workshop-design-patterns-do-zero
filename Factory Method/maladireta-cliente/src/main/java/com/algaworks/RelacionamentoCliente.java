package com.algaworks;

import javax.swing.JOptionPane;

import com.algaworks.maladireta.MalaDireta;
import com.algaworks.maladireta.csv.MalaDiretaCSV;

public class RelacionamentoCliente {

	public static void main(String[] args) {
	    MalaDireta malaDireta = new MalaDiretaCSV("contatos.csv");
	    String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
	    
	    boolean status = malaDireta.enviarEmail(mensagem);
	    
	    JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
    }
	
}
