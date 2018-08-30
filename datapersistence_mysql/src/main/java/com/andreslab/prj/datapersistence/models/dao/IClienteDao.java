package com.andreslab.prj.datapersistence.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.andreslab.prj.datapersistence.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

	//el CrudRepository simplifica todo las acciones
	
	
}
