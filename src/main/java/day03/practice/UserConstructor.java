package day03.practice;

// Creating a class User
class User {

	// Declaring the variables name, password and email as private
	private String name;
	private String password;
	private String email;

	// Creating getter and setters for name, password and email
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Creating the constructor User
	public User(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}
}

public class UserConstructor {
	public static void main(String[] args) {

		// Calling the constructor from the class User and passing the parameters
		User user1 = new User("Broken", "Broken@7", "broken@gmail.com");
		User user2 = new User("Prasanna", "Prasanna@7", "prasanna@gmail.com");

		// Printing the name, password and email using the getName, getPassword and
		// getEmail methods
		System.out.println(user1.getName() + " " + user1.getPassword() + " " + user1.getEmail());
		System.out.println(user2.getName() + " " + user2.getPassword() + " " + user2.getEmail());
	}
}
