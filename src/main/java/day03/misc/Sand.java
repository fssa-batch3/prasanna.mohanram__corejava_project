package day03.misc;

public class Sand {
	// Declaring a integer variable numShovels as static and the access modifier as
	// private
	private static int numShovels;
//	private int numRakes;

	// Creating a method getNumShovels as static and the access modifier as public
	public static int getNumShovels() {
		return numShovels;
	}

//	public static int getNumRakes() {
//		return numRakes;
//	}

	// Creating a constructor Sand
	public Sand() {
		System.out.println("a");
	}

	// Creating the method Sand
	public void Sand() {
		System.out.println("b");
	}

	// Creating the method run
	public void run() {
		new Sand();
		Sand();
	}

	public static void main(String[] args) {
		// Calling the Sand constructor and run method
		new Sand().run();
	}
}