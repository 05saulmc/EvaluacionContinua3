package com.idat.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.idat.demo.modelo.Usuario;


@Repository
public interface IUsuario  extends CrudRepository<Usuario,Integer>{

	Usuario findBynombre(String username);


}