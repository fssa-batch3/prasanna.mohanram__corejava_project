package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day10.practice.*;

public class TestCreatingException {

	@Test
	public void TestisValidEmail() throws Exception {

		Assertions.assertTrue(CreatingException.isValidEmail("gokul@gmail.com"));
	}

	@Test
	public void TestInvalidEmail() {

		try {
			boolean result = CreatingException.isValidEmail("gokulgamil");

			Assertions.fail("Test Failed");

		} catch (Exception e) {
			Assertions.assertEquals("Email does not match", e.getMessage());

		}
	}

}