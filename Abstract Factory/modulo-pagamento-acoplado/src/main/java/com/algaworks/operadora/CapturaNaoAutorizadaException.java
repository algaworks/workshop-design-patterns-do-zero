package com.algaworks.operadora;

public class CapturaNaoAutorizadaException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public CapturaNaoAutorizadaException(String msg) {
    	super(msg);
    }

}
