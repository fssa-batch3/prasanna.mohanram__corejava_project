package day10.practice;

import java.util.regex.Pattern;

public class CreatingException {

	public static boolean isValidEmail(String emailId) throws Exception {

		String email = emailId;

		if (email == null || "".equals(email.trim())) {

			throw new Exception("Email id cannot be null or empty");
		}

		String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";

		Boolean isMatchMail = Pattern.compile(regexEmail).matcher(emailId).matches();
		;

		if (!isMatchMail) {

			throw new Exception("Email does not match");
		}

		return true;

	}

}