package day08.practice;

import java.util.*;

public class HashMapNames {
	public static void main(String[] args) {

		String[] s = { "Ram", "Ram", "Superman", "Spider", "hey", "hello", "hey", "Spider" };
		Map<String, Integer> nameMap = new TreeMap<String, Integer>();

		for (int i = 0; i < s.length; i++) {
			if (nameMap.get(s[i]) == null) {
				nameMap.put(s[i], 1);
			} else {
				int count = nameMap.get(s[i]);
				count++;
				nameMap.put(s[i], count);
			}
		}
		for (String names : nameMap.keySet()) {

			Integer count = nameMap.get(names);
			System.out.println(names + ": " + count);
		}
	}
}
