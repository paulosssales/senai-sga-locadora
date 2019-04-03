package br.senai.rn.locadora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senai.rn.locadora.models.Categoria;
import br.senai.rn.locadora.repositories.CategoriaRepository;

@Service
public class ServiceCategoria {
	
	@Autowired
	private CategoriaRepository repository;

	public void save(Categoria categoria) {
		repository.save(categoria);
	}

	public List<Categoria> findAll() {
		return repository.findAll();
	}

	public Categoria findById(Long id) {
		 return repository.findById(id).get();
	}

	public void delete(Categoria categoria) {
		repository.delete(categoria);
	}
	
	
	
}
