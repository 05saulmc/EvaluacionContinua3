package com.idat.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.idat.demo.modelo.Productos;

@Repository
public interface IProductos extends CrudRepository<Productos, Integer>{

}
