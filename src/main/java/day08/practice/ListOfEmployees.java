package day08.practice;

import java.util.*;

//public class ListOfEmployees {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How many persons you want to give?");
//		int n = sc.nextInt();
//
//		Map<String, List<String>> departMap = new HashMap<>();
//
//		for (int i = 0; i < n; i++) {
//			System.out.println("Enter Input Like: HR, Name");
//			String s = sc.next();
//
//			if (s == null || "".equals(s)) {
//				throw new IllegalArgumentException("Input cann't be Empty or Null");
//			}
//
//			String[] departName = s.split(",");
//
//			if (departName.length < 2 || departName.length > 2) {
//				throw new IllegalArgumentException("Input Must hava Department and the Employee Name");
//			}
////			System.out.println(departName);
//
//			if (departMap.get(departName[0]) == null) {
//				departMap.put(departName[0], new ArrayList<>());
//				departMap.get(departName[0]).add(departName[1]);
//			} else {
//				departMap.get(departName[0]).add(departName[1]);
//			}
//		}
//		System.out.println(departMap);
//	}
//}

public class ListOfEmployees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many persons you want to give?");
		int n = sc.nextInt();

		Map<String, List<String>> departMap = new HashMap<>();

		int i = 0;
		while (i < n) {
			System.out.println("Enter Input Like: HR, Name");
			String s = sc.next();

			if (s == null || "".equals(s)) {
				throw new IllegalArgumentException("Input cannot be Empty or Null");
			}

			String[] departName = s.split(",");

			if (departName.length != 2) {
				throw new IllegalArgumentException("Input Must have Department and the Employee Name");
			}

			if (!departMap.containsKey(departName[0])) {
				departMap.put(departName[0], new ArrayList<>());
			}

			departMap.get(departName[0]).add(departName[1]);

			i++;
		}

		System.out.println(departMap);
	}
}
