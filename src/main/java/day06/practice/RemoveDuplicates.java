package day06.practice;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		List<String> uniqCity = new ArrayList<String>();

		for (int i = 0; i < cityList.size(); i++) {
			String city = cityList.get(i);
			boolean repeated = false;

			for (int j = 0; j < uniqCity.size(); j++) {
				if (city.equals(uniqCity.get(j))) {
					repeated = true;
					break;
				}
			}

			if (!repeated) {
				uniqCity.add(city);
			}
		}

		List<String> printCity = new ArrayList<String>();

		for (int i = 0; i < uniqCity.size(); i++) {
			String city = uniqCity.get(i);
			if (!city.equals("Mumbai")) {
				printCity.add(city);
			}
		}

		for (int i = 0; i < printCity.size(); i++) {
			System.out.println(printCity.get(i));
		}
	}
}
