package com.bae.accountmaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.accountmaker.service.AccountNumberGenerator;

@RestController
public class AccountNumberController {

	public AccountNumberGenerator service;

	@Autowired
	public AccountNumberController(AccountNumberGenerator service) {
		this.service = service;
	}

	@GetMapping("/getAccountNumber")
	public String getAccountNumber() {
		return service.generateAccount();
	}

}
