package day08.misc;

import java.util.*;

public class HashMapCount {
	public static void main(String[] args) {

		String[] s = { "prasanna", "balaji", "prasanna" };
		Map<String, Integer> countMap = new HashMap<String, Integer>();

		for (int i = 0; i < s.length; i++) {
			if (countMap.get(s[i]) == null) {
				countMap.put(s[i], 1);
			} else {
				int count = countMap.get(s[i]);
				count++;
				countMap.put(s[i], count);
			}
		}
		System.out.println(countMap);
		Map<String, Integer> countMap1 = new TreeMap<String, Integer>(countMap);
		System.out.println(countMap1);

	}
}
