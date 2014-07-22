package com.algaworks.notifier;

import java.util.List;

import com.algaworks.listeners.Listener;
import com.algaworks.model.Lancamento;

public interface Notificador {

	public void registrarListener(Listener listener);
	public void removerListener(Listener listener);
	public void notificarListeners();
	
	public void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos);
	public List<Lancamento> getLancamentosVencidos();
	
}
