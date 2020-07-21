package com.idat.demo.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.idat.demo.interfaces.IProductos;
import com.idat.demo.modelo.Productos;

@RestController
@RequestMapping("/restProductos")
public class RestProductos {
	
	@Autowired
	private IProductos data;

	@GetMapping
	public List<Productos> listar() {
		return (List<Productos>) data.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody Productos productos) {
		data.save(productos);
	}

	
	@PutMapping
    public void modificar(@RequestBody Productos productos) {
        data.save(productos);
    }
    
    @DeleteMapping(value ="/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        data.deleteById(id);
    } 

}
