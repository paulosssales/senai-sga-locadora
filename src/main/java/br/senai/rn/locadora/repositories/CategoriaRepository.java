package br.senai.rn.locadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.rn.locadora.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
