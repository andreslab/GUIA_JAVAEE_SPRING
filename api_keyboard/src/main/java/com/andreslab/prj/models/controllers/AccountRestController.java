package com.andreslab.prj.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andreslab.prj.models.services.IAccountService;
import com.andreslab.prj.models.entity.Account;

@CrossOrigin(origins="http://localhost:8000")
@RestController
@RequestMapping("/api/account")
public class AccountRestController {
	@Autowired //inyectamos el componente
	private IAccountService accountService;
	
	@GetMapping("/client")
	public List<Account> index(){
		return accountService.findAll();
	}
}
