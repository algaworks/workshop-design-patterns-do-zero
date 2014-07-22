package com.algaworks.pagamento.pagseguro;

import com.algaworks.gestorderisco.GestorDeRisco;
import com.algaworks.gestorderisco.fcontrol.FControl;
import com.algaworks.operadora.Operadora;
import com.algaworks.operadora.cielo.Cielo;
import com.algaworks.pagamento.ModuloPagamentoFactory;

public class PagSeguroModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
    public Operadora criarOperadora() {
	    return new Cielo();
    }

	@Override
    public GestorDeRisco criarGestorDeRisco() {
	    return new FControl();
    }

}
