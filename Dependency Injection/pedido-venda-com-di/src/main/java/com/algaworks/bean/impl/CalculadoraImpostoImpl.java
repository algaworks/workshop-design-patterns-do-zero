package com.algaworks.bean.impl;

import java.math.BigDecimal;

import com.algaworks.bean.CalculadoraImposto;

public class CalculadoraImpostoImpl implements CalculadoraImposto {

	@Override
    public BigDecimal calcular(BigDecimal valor) {
	    return valor.multiply(new BigDecimal("0.15"));
    }

}
