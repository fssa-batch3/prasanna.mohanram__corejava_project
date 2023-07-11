package day04.solved;

public abstract class Polygon {
	protected int numberOfSides;

	public Polygon(int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		} else {
			this.numberOfSides = numberOfSides;
		}
	}

	public abstract double calculateArea();

	public abstract double circumference();
}

class Rectangle extends Polygon {

	protected double length;
	protected double breadth;

	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if (length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double circumference() {

		return 2 * (this.length + this.breadth);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.breadth;
	}

	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}

class Square extends Rectangle {

	public Square(double side_length) throws Exception {
		super(side_length, side_length);
	}

}

//class AnotherClass extends Square { // This line will give compiler error
//
//}
