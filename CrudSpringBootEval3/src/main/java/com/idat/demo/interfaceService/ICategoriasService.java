package com.idat.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.idat.demo.modelo.Categorias;

public interface ICategoriasService {
	
	public List<Categorias>listar();
	public Optional<Categorias>listarId(int c);
	public int save(Categorias c);
	public void delete(int id);

}
