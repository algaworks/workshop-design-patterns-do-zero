package com.algaworks.gestorderisco;

import java.math.BigDecimal;

public interface GestorDeRisco {

	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException;
	
}
