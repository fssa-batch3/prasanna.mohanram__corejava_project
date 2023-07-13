package day05.misc;

// Creating a abstract class Shape
abstract class Shape {
	// Creating a abstract method draw
	public abstract void draw();
}

// Creating a class Rectangle2 extends with the class Shape
class Rectangle2 extends Shape {

	// Creating a method draw
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

// Creating a class Square extends with the class Shape
class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
}

public class ShapeMultipleInhDemo {
	public static void main(String[] args) {
		// Creating a new object rec using Rectangle2 class and taking reference from
		// Shape class
		Shape rec = new Rectangle2();
		// Creating a new object square using Square class and taking reference from
		// Shape class
		Shape square = new Square();
		// Calling the draw method from the object rec
		rec.draw();
		// Calling the draw method from the object square
		square.draw();
	}
}
