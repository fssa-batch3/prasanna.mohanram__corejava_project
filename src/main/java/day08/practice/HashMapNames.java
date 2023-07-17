package day08.practice;

import java.util.*;

//public class HashMapNames {
//	public static void main(String[] args) {
//
//		String[] s = { "Ram", "Ram", "Superman", "Spider", "hey", "hello", "hey", "Spider" };
//		Map<String, Integer> nameMap = new TreeMap<String, Integer>();
//
//		for (int i = 0; i < s.length; i++) {
//			if (nameMap.get(s[i]) == null) {
//				nameMap.put(s[i], 1);
//			} else {
//				int count = nameMap.get(s[i]);
//				count++;
//				nameMap.put(s[i], count);
//			}
//		}
//		for (String names : nameMap.keySet()) {
//
//			Integer count = nameMap.get(names);
//			System.out.println(names + ": " + count);
//		}
//	}
//}

public class HashMapNames {
	public static void main(String[] args) {
		String[] s = { "Ram", "Ram", "Superman", "Spider", "hey", "hello", "hey", "Spider" };
		Map<String, Integer> nameMap = countNames(s);

		for (String names : nameMap.keySet()) {
			Integer count = nameMap.get(names);
			System.out.println(names + ": " + count);
		}
	}

	public static Map<String, Integer> countNames(String[] namesArray) {
		Map<String, Integer> nameMap = new TreeMap<>();

		for (String name : namesArray) {
			nameMap.put(name, nameMap.getOrDefault(name, 0) + 1);
		}

		return nameMap;
	}
}
