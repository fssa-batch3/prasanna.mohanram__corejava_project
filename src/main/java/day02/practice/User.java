package day02.practice;

class UserDetails {

	private int id;
	private String name;
	private String password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}

public class User {
	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setId(7);
		user.setName("Prasanna");
		user.setPassword("Smartprasanna7");
		user.setEmailId("prasannabalajikm@gmail.com");

		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		System.out.println(user.getEmailId());
	}
}
