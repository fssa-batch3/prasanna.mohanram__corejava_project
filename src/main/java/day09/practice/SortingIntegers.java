package day09.practice;

import java.util.*;

public class SortingIntegers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		String input = scanner.nextLine();

		ArrayList<Integer> numbersList = new ArrayList<>();
		String[] numbersArr = input.split("\\s+");

		for (String num : numbersArr) {
			numbersList.add(Integer.parseInt(num));
		}

		Collections.sort(numbersList);

		for (Integer num : numbersList) {
			System.out.print(num + " ");
		}
	}
}
