package day10.practice;

import java.util.*;

class InvalidEmailException extends Exception {
	public InvalidEmailException(String message) {
		super(message);
	}
}

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		if (emailId.contains("@")) {
			return true;
		} else {
			throw new InvalidEmailException("Invalid email format!");
		}
	}
}

public class CreatingException {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email :");
		String email = sc.nextLine();
		try {
			if (EmailValidator.isValidEmail(email)) {
				System.out.println("Valid email: " + email);
			}
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
