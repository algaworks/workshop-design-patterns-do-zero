package com.algaworks.pagamento;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.algaworks.gestorderisco.AlertaDeRiscoException;
import com.algaworks.operadora.CapturaNaoAutorizadaException;
import com.algaworks.pagamento.paypal.PayPalModuloPagamentoFactory;

public class PagamentoViaPayPalTest {

	private Pagamento pagamento;

	@Before
	public void init() {
		ModuloPagamentoFactory moduloPagamentoFactory = new PayPalModuloPagamentoFactory();
		pagamento = new Pagamento(moduloPagamentoFactory);
	}

	@Test
	public void deveAutorizarVenda() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		Long codigoAutorizacao = pagamento.autorizar("2222.2222", new BigDecimal("200"));
		assertNotNull(codigoAutorizacao);
	}

	@Test(expected = CapturaNaoAutorizadaException.class)
	public void deveNegarCaptura_valorAcimaDoLimiteParaCartao() throws CapturaNaoAutorizadaException,
	        AlertaDeRiscoException {
		pagamento.autorizar("2222.2222", new BigDecimal("2000"));
	}

	@Test
	public void deveAutorizarVenda_valorAltoComCartaoValido() throws CapturaNaoAutorizadaException,
	        AlertaDeRiscoException {
		Long codigoAutorizacao = pagamento.autorizar("3333.2222", new BigDecimal("2000"));
		assertNotNull(codigoAutorizacao);
	}

	@Test(expected = AlertaDeRiscoException.class)
	public void deveGerarAlertaDeRisco() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		pagamento.autorizar("1111.2222", new BigDecimal("5500"));
	}

}
