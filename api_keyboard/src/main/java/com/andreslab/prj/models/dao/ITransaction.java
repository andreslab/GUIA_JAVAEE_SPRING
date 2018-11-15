package com.andreslab.prj.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreslab.prj.models.entity.Transaction;

public interface ITransaction extends CrudRepository<Transaction, Long> {

}
