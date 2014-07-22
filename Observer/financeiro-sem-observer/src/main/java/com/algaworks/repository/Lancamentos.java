package com.algaworks.repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.algaworks.model.Lancamento;
import com.algaworks.model.TipoLancamento;
import com.algaworks.model.builder.LancamentoBuilder;

public class Lancamentos {

	public List<Lancamento> todosVencidos() {
		// Faz consulta no banco buscando lançamentos vencidos
		Lancamento lancamento1 = LancamentoBuilder.crairLancamento()
									.comPessoa("João Silva", "joao@email.com", "(11)9999-8888")
									.comDescricao("Mesa tabaco MDF")
									.comValor(new BigDecimal("1225.45"))
									.comDataVencimento(new Date())
									.doTipo(TipoLancamento.DESPESA)
									.criar();
		
		Lancamento lancamento2 = LancamentoBuilder.crairLancamento()
									.comPessoa("Renato Santos", "renato@email.com", "(21)8888-9999")
									.comDescricao("Armário MDF 3.00 x 2x40")
									.comValor(new BigDecimal("3200.00"))
									.comDataVencimento(new Date())
									.doTipo(TipoLancamento.DESPESA)
									.criar();
		
		return Arrays.asList(lancamento1, lancamento2);
	}
	
}
