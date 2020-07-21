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
import com.idat.demo.interfaceService.IProductosService;
import com.idat.demo.modelo.Productos;


@Controller
@RequestMapping
public class ControladorProductos {
	
	@Autowired
	private IProductosService service;

	
	
	@GetMapping("/listaProductos")
	public String listar(Model model) {
		List<Productos>productos=service.listar();
		model.addAttribute("productos",productos);
		return "indexProductos";
	}

	
	@GetMapping("/newProductos")
	public String agregar(Model model) {		
		model.addAttribute("productos",new Productos());
		return "formProductos";
	}
	
	@PostMapping("/saveProductos")
	public String save( Productos p,Model model) {		
		service.save(p);
		return "redirect:/listaProductos";
	}
	
	@GetMapping("/editarProductos/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Productos>productos=service.listarId(id);
		model.addAttribute("productos",productos);
		return "formProductos";
	}	
	
	@GetMapping("/eliminarProductos/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listaProductos";
	}

}
