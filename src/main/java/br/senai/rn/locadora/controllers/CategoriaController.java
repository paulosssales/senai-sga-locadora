package br.senai.rn.locadora.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.locadora.models.Categoria;
import br.senai.rn.locadora.services.ServiceCategoria;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private ServiceCategoria service;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("categoria", new Categoria());
		model.addAttribute("categorias", service.findAll());
		return "index";
	}
	
	@PostMapping
	public String save(Categoria categoria) {
		service.save(categoria);
		return "redirect:/categoria";
	}
	
	@GetMapping("/remover/{id}")
	public String delete(@PathVariable Long id, Model model) {
		service.delete(service.findById(id));
		return "redirect:/categorias";
	}
	
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		model.addAttribute("categoria", service.findById(id));
		model.addAttribute("categorias", service.findAll());
		return "index";
	}

	@PostMapping("/editar/{id}")
	public String save(@PathVariable Long id, Categoria categoria) {
		service.save(categoria);
		return "redirect:/categoria";
	}

}
