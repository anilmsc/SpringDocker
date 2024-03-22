package com.example.spring.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.mongo.dao.AccountsRepo;
import com.example.spring.mongo.model.Account;

@RestController
public class AccountsOperationsController {
	
	@Autowired
	AccountsRepo repo;
	
	@PostMapping("/saveAccounts")
	public Account savAccounts(@RequestBody Account acct)
	{
		return repo.save(acct);
	}
	
	@GetMapping("/getAccounts")
	public List<Account> getAllAccounts()
	{
		return repo.findAll();
	}

}
