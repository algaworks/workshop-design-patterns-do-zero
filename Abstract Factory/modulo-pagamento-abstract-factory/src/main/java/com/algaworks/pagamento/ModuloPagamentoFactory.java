package com.algaworks.pagamento;

import com.algaworks.gestorderisco.GestorDeRisco;
import com.algaworks.operadora.Operadora;

public interface ModuloPagamentoFactory {

	public Operadora criarOperadora();
	public GestorDeRisco criarGestorDeRisco();
	
}
