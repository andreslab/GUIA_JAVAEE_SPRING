package com.andreslab.prj.datapersistence.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.andreslab.prj.datapersistence.models.entity.Cliente;

@Repository("clienteDaoJPA") //traduce las exception de acceso a base de datos, lleva nombre solo su se va a usar Qualify en dla clase donde se lo llama
public class ClienteDaoImpl implements IClienteDao {

	@PersistenceContext
	private EntityManager entity;//todas las operaciones a la base de datos por medio de objetos
	
	@SuppressWarnings("unchecked") //omite los warning
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return entity.createQuery("from  Cliente").getResultList();
	}

	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		if(cliente.getId() != null && cliente.getId() > 0) {
			entity.merge(cliente); //edita un usuario existente
		}else {
			entity.persist(cliente);
		}
		
	}

	@Override
	public Cliente findOne(Long id) {
		return entity.find(Cliente.class, id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Cliente cliente = findOne(id);
		entity.remove(cliente);
		
	}

}
