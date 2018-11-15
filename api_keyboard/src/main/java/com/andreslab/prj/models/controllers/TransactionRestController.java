package com.andreslab.prj.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andreslab.prj.models.entity.Transaction;
import com.andreslab.prj.models.services.ITransactionService;


@CrossOrigin(origins="http://localhost:8000")
@RestController
@RequestMapping("/api/transaction")
public class TransactionRestController {

	@Autowired //inyectamos el componente
	private ITransactionService transactionService;
	
	@GetMapping("/client")
	public List<Transaction>index(){
		return transactionService.findAll();
	}
}