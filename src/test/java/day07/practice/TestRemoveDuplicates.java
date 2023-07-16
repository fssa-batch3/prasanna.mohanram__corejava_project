package day07.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicates {

	@Test
	public void testremoveduplicates() {

		ArrayList<Integer> arrList = new ArrayList<>();
		Assertions.assertTrue(RemoveDuplicates.addnumtoarraylist(arrList));

	}

	@Test
	public void testInvaildArrayList() {

		try {
			RemoveDuplicates.addnumtoarraylist(null);
			Assertions.fail("Invalid ArrayList Method Is Failded");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("ArrayList is Cann't be Null", ex.getMessage());
		}

	}

}