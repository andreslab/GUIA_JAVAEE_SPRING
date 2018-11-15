package com.andreslab.prj.models.services;

import java.util.List;

import com.andreslab.prj.models.entity.Transaction;

public interface ITransactionService {
	public List<Transaction> findAll();
}
