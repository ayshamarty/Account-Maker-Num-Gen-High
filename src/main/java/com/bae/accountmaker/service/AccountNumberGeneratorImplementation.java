package com.bae.accountmaker.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class AccountNumberGeneratorImplementation implements AccountNumberGenerator {

	@Override
	public Long generateNumber() {
		Long number = (long) (Math.random() * 100000000);
		number = number * 100;
		return number;
	}

	@Override
	public Character generateCharacter() {
		Random rnd = new Random();
		char character = (char) (rnd.nextInt(3) + 'a');
		return character;
	}

	@Override
	public String generateAccount() {
		String combination = generateCharacter().toString() + generateNumber().toString();
		return combination;
	}

}
