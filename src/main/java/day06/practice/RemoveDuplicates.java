package day06.practice;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		List<String> uniquecityList = new ArrayList<String>();

		for (String city : cityList) {
			if (uniquecityList.contains(city)) {

				continue;
			} else {
				uniquecityList.add(city);
			}

		}

		System.out.println(uniquecityList);

	}

	public static List<String> removeDuplicate(List<String> cityList) throws IllegalArgumentException {
		List<String> uniquecityList = new ArrayList<String>();
		if (cityList == null || cityList.size() == 0) {
			throw new IllegalArgumentException("Array cannot be empty");

		}
		for (String city : cityList) {
			if (!uniquecityList.contains(city)) {
				uniquecityList.add(city);
			}

		}
		return uniquecityList;
	}
}