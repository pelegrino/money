package br.com.pelegrino.money.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pelegrino.money.model.Lancamento;
import br.com.pelegrino.money.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
