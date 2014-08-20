package com.algaworks.bean.impl;

import java.math.BigDecimal;
import java.util.Date;

import javax.inject.Inject;

import com.algaworks.bean.CalculadoraImposto;
import com.algaworks.bean.PedidoVendaService;
import com.algaworks.model.PedidoVenda;
import com.algaworks.repository.PedidosVendas;

public class PedidoVendaServiceImpl implements PedidoVendaService {

	@Inject
	private PedidosVendas pedidosVendas;
	
	@Inject
	private CalculadoraImposto calculadoraImposto;

	@Override
    public void salvar(PedidoVenda pedidoVenda) {
		pedidoVenda.setData(new Date());
		
		BigDecimal imposto = calculadoraImposto.calcular(pedidoVenda.getValor());
		pedidoVenda.setImposto(imposto);
		
		pedidosVendas.salvar(pedidoVenda);
	}

}
