package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day09.practice.*;

public class TestSortingTasksWithPriority {

	@Test

	public void testValidarray1() {

		ArrayList<SortingTasksWithPriority> taskList = new ArrayList<>();

		taskList.add(new SortingTasksWithPriority(1, "taseat", LocalDate.of(2023, 7, 19)));
		taskList.add(new SortingTasksWithPriority(5, "tasklearn", LocalDate.of(2023, 7, 11)));
		taskList.add(new SortingTasksWithPriority(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new SortingTasksWithPriority(3, "tasklearn", LocalDate.of(2023, 7, 17)));

		ArrayList<SortingTasksWithPriority> taskList2 = new ArrayList<>();
		taskList2.add(new SortingTasksWithPriority(5, "tasklearn", LocalDate.of(2023, 7, 11)));
		taskList2.add(new SortingTasksWithPriority(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList2.add(new SortingTasksWithPriority(3, "tasklearn", LocalDate.of(2023, 7, 17)));
		taskList2.add(new SortingTasksWithPriority(1, "taseat", LocalDate.of(2023, 7, 19)));
		ArrayList<SortingTasksWithPriority> actualUniqueList1 = SortingTasksWithPriority.sortNumberTask(taskList);

		Assertions.assertIterableEquals(actualUniqueList1, taskList2);

	}

	@Test

	public void testInValid() {

		try {

			SortingTasksWithPriority.sortNumberTask(null);
			Assertions.fail("testInValidarray failed");
		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("The array cannot be empty", ex.getMessage());

		}

	}

}