package com.bae.accountmaker.service;

import org.springframework.stereotype.Service;

@Service
public interface AccountNumberGenerator {

	Long generateNumber();

	Character generateCharacter();

	String generateAccount();

}
