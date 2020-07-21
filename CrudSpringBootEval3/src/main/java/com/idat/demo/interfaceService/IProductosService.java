package com.idat.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.idat.demo.modelo.Productos;



public interface IProductosService {
	
	public List<Productos>listar();
	public Optional<Productos>listarId(int p);
	public int save(Productos p);
	public void delete(int id);

}
