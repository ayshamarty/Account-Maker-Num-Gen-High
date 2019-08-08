package com.bae.accountmaker.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NumGenServiceMockitoTests {
	@InjectMocks
	AccountNumberGeneratorImplementation numGen;

	private String regEx = "([abc])([0-9]{10})";

	@Test
	public void numGenTest() {
		assertTrue(numGen.generateNumber() instanceof Integer);
	}

	@Test
	public void charGenTest() {
		assertTrue(numGen.generateCharacter() instanceof Character);
	}

	@Test
	public void accountGenTest() {
		assertTrue(numGen.generateAccount() instanceof String);
	}

	@Test
	public void accountGenRegExTest() {
		assertTrue(numGen.generateAccount().matches(regEx));
	}

}
