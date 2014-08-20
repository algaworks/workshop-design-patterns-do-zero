package com.algaworks;

import java.math.BigDecimal;

import com.algaworks.bean.PedidoVendaService;
import com.algaworks.model.PedidoVenda;
import com.algaworks.util.cdi.WeldContext;

public class Principal {

	public static void main(String[] args) {
		PedidoVendaService service = WeldContext.INSTANCE.getBean(PedidoVendaService.class);
		PedidoVenda pedidoVenda = new PedidoVenda("sabonete", new BigDecimal("3.00"));
		
		service.salvar(pedidoVenda);
    }
	
}
