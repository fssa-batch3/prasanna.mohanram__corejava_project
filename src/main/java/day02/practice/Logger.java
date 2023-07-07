package day02.practice;

// Created a new class logger
public class Logger {
	// Created a method called debug 
	public static void debug(String msg) {
		System.out.println("DEBUG: " + msg);
	}

	public static void info(String msg) {
		// TODO complete this code using the above template
		System.out.println("INFO: " + msg);
	}

	public static void error(String msg) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + msg);
	}

	public static void debug(int num) {
		// TODO Complete this code
		System.out.println("DEBUG: " + num);
	}

	public static void info(int num) {
		// TODO Complete this code
		System.out.println("INFO: " + num);
	}

	public static void error(int num) {
		// TODO Complete this code
		System.out.println("ERROR: " + num);
	}

	// Similarly write overloaded methods for error and info.

	public static void main(String[] args) {

		debug("Who");
		info("are");
		error("you");
		debug(0);
		info(1);
		error(2);
	}
}
