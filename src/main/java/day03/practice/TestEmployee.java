package day03.practice;

// Created a class Employee
class Employee {

	// Declaring the variables id and name as private
	private int id;
	private String name;

	// Creating the constructor Employee
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Creating a method to print the id and name
	public void print() {
		System.out.print("id=" + id + ", ");
		System.out.println("name=" + name);
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		// Calling the constructor from the class Employee
		Employee e1 = new Employee(1, "naresh");
		Employee e2 = new Employee(2, "suresh");

		// Calling the method print to print the id and name
		e1.print();
		e2.print();
	}
}
