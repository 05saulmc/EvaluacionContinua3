package com.idat.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.idat.demo.interfaceService.ICategoriasService;
import com.idat.demo.modelo.Categorias;


@Controller
@RequestMapping
public class ControladorCategorias {
	@Autowired
	private ICategoriasService service;

	
	
	@GetMapping("/listaCategorias")
	public String listar(Model model) {
		List<Categorias>categorias=service.listar();
		model.addAttribute("categorias",categorias);
		return "indexCategorias";
	}

	
	@GetMapping("/newCategorias")
	public String agregar(Model model) {		
		model.addAttribute("categorias",new Categorias());
		return "formCategorias";
	}
	
	@PostMapping("/saveCategorias")
	public String save( Categorias c,Model model) {		
		service.save(c);
		return "redirect:/listaCategorias";
	}
	
	@GetMapping("/editarCategorias/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Categorias>categorias=service.listarId(id);
		model.addAttribute("categorias",categorias);
		return "formCategorias";
	}	
	
	@GetMapping("/eliminarCategorias/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listaCategorias";
	}
}
