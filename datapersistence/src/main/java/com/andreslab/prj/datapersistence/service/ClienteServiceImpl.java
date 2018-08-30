package com.andreslab.prj.datapersistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andreslab.prj.datapersistence.models.dao.IClienteDao;
import com.andreslab.prj.datapersistence.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	
	@Autowired
	//@Qualifier("clienteDaoJPA") //se usa solo si la implementacion IClienteDao esta ligada a mas de una clase, de ahi en la clase en @repository se especifica el nombre
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly=true) //solo lectura a la base de datos, si es tamb escritura, no no lleva
	public List<Cliente> findAll() {
		
		return clienteDao.findAll();
	}

	@Override
	@Transactional//ya que es de escritura no agrego readOnlyl
	public void save(Cliente cliente) {
		
		clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findOne(Long id) {
		
		return clienteDao.findOne(id);
	}

	@Override
	@Transactional //read and write
	public void delete(Long id) {
		
		clienteDao.delete(id);
		
	}

}
