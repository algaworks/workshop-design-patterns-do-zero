package com.algaworks.pagamento.paypal;

import com.algaworks.gestorderisco.GestorDeRisco;
import com.algaworks.gestorderisco.clearsale.ClearSale;
import com.algaworks.operadora.Operadora;
import com.algaworks.operadora.redecard.Redecard;
import com.algaworks.pagamento.ModuloPagamentoFactory;

public class PayPalModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
    public Operadora criarOperadora() {
	    return new Redecard();
    }

	@Override
    public GestorDeRisco criarGestorDeRisco() {
	    return new ClearSale();
    }

}
