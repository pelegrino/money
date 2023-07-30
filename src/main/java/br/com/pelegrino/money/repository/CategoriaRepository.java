package br.com.pelegrino.money.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pelegrino.money.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}