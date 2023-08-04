package br.com.pelegrino.money.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.pelegrino.money.model.Pessoa;
import br.com.pelegrino.money.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
	    Optional<Pessoa> pessoaOptional = pessoaRepository.findById(codigo);

	    if (pessoaOptional.isPresent()) {
	        Pessoa pessoaSalva = pessoaOptional.get();
	        BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
	        
	        return pessoaRepository.save(pessoaSalva);
	    } else {
	        throw new EmptyResultDataAccessException(1);
	    }
	}
	
}
