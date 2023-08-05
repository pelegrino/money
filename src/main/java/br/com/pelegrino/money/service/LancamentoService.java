package br.com.pelegrino.money.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pelegrino.money.model.Lancamento;
import br.com.pelegrino.money.model.Pessoa;
import br.com.pelegrino.money.repository.LancamentoRepository;
import br.com.pelegrino.money.repository.PessoaRepository;
import br.com.pelegrino.money.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
	    Optional<Pessoa> pessoaOptional = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
	    
	    if (!pessoaOptional.isPresent() || pessoaOptional.get().isInativo()) {
	        throw new PessoaInexistenteOuInativaException();
	    }
	    
	    return lancamentoRepository.save(lancamento);
	}


}
