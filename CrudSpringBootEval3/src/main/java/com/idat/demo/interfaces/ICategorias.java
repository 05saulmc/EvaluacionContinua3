package com.idat.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.demo.modelo.Categorias;

@Repository
public interface ICategorias extends CrudRepository<Categorias, Integer> {

}
