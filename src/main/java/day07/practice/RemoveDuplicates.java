package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

//public class RemoveDuplicates {
//	public static void main(String[] args) {
//		List<Integer> numberList = new ArrayList<Integer>();
//		numberList.add(5);
//		numberList.add(4);
//		numberList.add(3);
//		numberList.add(2);
//		numberList.add(3);
//		numberList.add(1);
//
//		HashSet<Integer> uniqueNumbersSet = new HashSet<>(numberList);
//
//		for (Integer number : uniqueNumbersSet) {
//			System.out.println(number);
//		}
//	}
//}

public class RemoveDuplicates {
	
	public static boolean addnumtoarraylist(ArrayList<Integer> arrList) throws IllegalArgumentException {
		
		// if the arraylist are null it will throw the exception otherwise it will execute the below conditions
		if(arrList == null) {
			throw new IllegalArgumentException("ArrayList is Cann't be Null");
		}
		
		arrList.add(0);
		arrList.add(0);
		arrList.add(1);
		arrList.add(1);
		arrList.add(2);
		arrList.add(2);
		arrList.add(5);
		
		System.out.println(arrList);
		
		// created the hashset Integer it will remove the duplicates
		HashSet<Integer> setOfNum = new HashSet<Integer>(arrList);
		
		System.out.println(setOfNum);
		
		return true;
		
	}

	
	public static void main(String[] args) {
		
		// Created a empty Array List  to passing the array to the addnumtoarraylist method/
		ArrayList<Integer> arrList = new ArrayList<>();
		
		addnumtoarraylist(arrList);
		
	}

}