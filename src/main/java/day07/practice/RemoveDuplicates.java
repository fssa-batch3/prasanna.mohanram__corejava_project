package day07.practice;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		numberList.add(4);
		numberList.add(3);
		numberList.add(2);
		numberList.add(3);
		numberList.add(1);

		HashSet<Integer> uniqueNumbersSet = new HashSet<>(numberList);

		for (Integer number : uniqueNumbersSet) {
			System.out.println(number);
		}
	}
}