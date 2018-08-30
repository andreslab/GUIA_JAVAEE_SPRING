package com.andreslab.prj.datapersistence.service;

import java.util.List;

import com.andreslab.prj.datapersistence.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);
}
