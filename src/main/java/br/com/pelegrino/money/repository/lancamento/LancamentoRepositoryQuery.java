package br.com.pelegrino.money.repository.lancamento;

import java.util.List;

import br.com.pelegrino.money.model.Lancamento;
import br.com.pelegrino.money.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
