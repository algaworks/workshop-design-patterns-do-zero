package com.algaworks.pagamento;

import java.math.BigDecimal;

import com.algaworks.gestorderisco.AlertaDeRiscoException;
import com.algaworks.gestorderisco.GestorDeRisco;
import com.algaworks.operadora.CapturaNaoAutorizadaException;
import com.algaworks.operadora.Operadora;

public class Pagamento {
	
	private Operadora operadora;
	private GestorDeRisco gestorDeRisco;

	public Pagamento(ModuloPagamentoFactory moduloPagamentoFactory) {
	    this.operadora = moduloPagamentoFactory.criarOperadora();
	    this.gestorDeRisco = moduloPagamentoFactory.criarGestorDeRisco();
    }

	public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		this.operadora.capturar(cartao, valor);
		this.gestorDeRisco.avaliarRisco(cartao, valor);
		return this.operadora.confirmar();
    }

}
