package day01.practice;

public class Cat {
	// Attributes
	private int age;
	private String color;

	// Constructor
	public Cat(int age, String color) {
		this.age = age;
		this.color = color;
	}

	// Getters and setters
	public int age() {
		return age;
	}

	public void age(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void speak() {
		System.out.println("Meow!");
	}

	// Main method to create Dog objects
	public static void main(String[] args) {
		// Create two Cat objects
		Cat cat1 = new Cat(4, "White");
		Cat cat2 = new Cat(3, "Black");

		// Print the attributes of each Dog
		System.out.println("Cat 1:");
		System.out.println("Age: " + cat1.age());
		System.out.println("Color: " + cat1.getColor());
		System.out.print("Speaks: ");
		cat1.speak();

		System.out.println("Cat 2:");
		System.out.println("Age: " + cat2.age());
		System.out.println("Color: " + cat2.getColor());
		System.out.print("Speaks: ");
		cat2.speak();
	}
}
