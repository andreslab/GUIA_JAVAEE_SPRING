package com.andreslab.prj.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreslab.prj.models.entity.Account;

public interface IAccount extends CrudRepository<Account, Long>{

}
