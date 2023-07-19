package day10.practice;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;

class User {
	private int id;
	private String name;
	private String emailId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.emailId = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		User user = (User) o;
		return id == user.id && name.equals(user.name) && emailId.equals(user.emailId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, emailId);
	}
}

class UserAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserAlreadyExistsException(String message) {
		super(message);
	}
}

public class UserExistException {
	public static ArrayList<User> user = new ArrayList<User>();

	public static boolean register(User user) throws UserAlreadyExistsException {
		if (UserExistException.user.contains(user)) {
			throw new UserAlreadyExistsException("User already exist");
		}
		validateId(user.getId());
		validateEmail(user.getEmailId());
		UserExistException.user.add(user);

		return true;
	}

	public static boolean validateId(int id) throws IllegalArgumentException {
		if (id < 0) {
			throw new IllegalArgumentException("id number cannot be negative");
		}
		return true;
	}

	public static boolean validateEmail(String email) throws IllegalArgumentException {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		boolean matches = Pattern.compile(regex).matcher(email).matches();
		if (matches) {
			return true;
		} else {
			throw new IllegalArgumentException("mail is invalid");
		}
	}

	public static void main(String[] args) throws UserAlreadyExistsException {
		User user1 = new User(1, "prasanna", "prasanna@fssa.fresworks.com");
		User user2 = new User(1, "prasanna", "prasanna@fssa.fresworks.com");
		try {
			register(user1);
			register(user2);
		} catch (UserAlreadyExistsException e) {
			throw new UserAlreadyExistsException(e.getMessage());
		}
	}
}
