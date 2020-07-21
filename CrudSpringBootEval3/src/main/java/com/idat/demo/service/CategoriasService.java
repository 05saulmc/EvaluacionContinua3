package com.idat.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.demo.interfaceService.ICategoriasService;
import com.idat.demo.interfaces.ICategorias;
import com.idat.demo.modelo.Categorias;

@Service
public class CategoriasService implements ICategoriasService {
	
	@Autowired
	ICategorias data;

	@Override
	public List<Categorias> listar() {
	
		return (List<Categorias>)data.findAll();
	}

	@Override
	public Optional<Categorias> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Categorias c) {
		int res=0;
		Categorias categorias=data.save(c);
		if(!categorias.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
