package day04.practice;

abstract class Polygon {
	protected int numberOfSides;

	public Polygon(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public abstract double calculateArea();

	public abstract double circumference();
}

class RightAngledTriangle extends Polygon {
	protected double base;
	protected double height;
	protected double hypotenuse;

	public RightAngledTriangle(double base, double height, double hypotenuse) throws Exception {
		super(3);
		if (base <= 0 || height <= 0 || hypotenuse <= 0) {
			throw new Exception("Invalid dimensions for a right-angled triangle");
		}
		this.base = base;
		this.height = height;
		this.hypotenuse = hypotenuse;
	}

	@Override
	public double calculateArea() {
		return 0.5 * this.base * this.height;
	}

	@Override
	public double circumference() {
		double sideC = Math.sqrt(this.base * this.base + this.height * this.height);
		return this.base + this.height + sideC;
	}
}

public class RightAngledTriangle2 {
	public static void main(String[] args) {
		try {
			RightAngledTriangle triangle = new RightAngledTriangle(3.0, 4.0, 5.0);
			System.out.println("Area: " + triangle.calculateArea());
			System.out.println("Circumference: " + triangle.circumference());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
