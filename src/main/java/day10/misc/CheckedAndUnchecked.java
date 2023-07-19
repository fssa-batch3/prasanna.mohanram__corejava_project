package day10.misc;

import java.util.*;

class Divider {
	public static int divide(int a, int b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("Input cannot be zero");
		} else {
			return a / b;
		}
	}
}

public class CheckedAndUnchecked {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value for a:");
		int a = sc.nextInt();
		System.out.println("Enter a value for b:");
		int b = sc.nextInt();

		System.out.println(Divider.divide(a, b));
	}

}
