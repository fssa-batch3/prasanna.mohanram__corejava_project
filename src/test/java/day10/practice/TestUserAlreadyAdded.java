package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserAlreadyAdded {

	User user1 = new User(1, "prasanna", "prasanna@gmail.com");
	User user2 = new User(1, "prasanna", "prasanna@gmail.com");
	User user3 = new User(1, "prasanna", "prasannabalaji@gmail.com");

	@Test

	public void testRegisterUser() {

		Assertions.assertTrue(UserValidator.register(user1));
	}

	@Test
	public void testAlreadyRegisterUser() {
		try {
			UserValidator.register(null);

			Assertions.fail("User Already added failed");

		} catch (UserAlreadyExistsException e) {
			Assertions.assertEquals("object cannot null", e.getMessage());
		}

		try {
			UserValidator.register(user1);
			UserValidator.register(user2);
			UserValidator.register(user3);

			Assertions.fail("User Already added failed");

		} catch (UserAlreadyExistsException e) {
			Assertions.assertEquals("User Already added", e.getMessage());
		}
	}

}
