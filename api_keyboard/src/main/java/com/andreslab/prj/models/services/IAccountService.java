package com.andreslab.prj.models.services;

import java.util.List;

import com.andreslab.prj.models.entity.Account;

public interface IAccountService {
	public List<Account> findAll();
}
