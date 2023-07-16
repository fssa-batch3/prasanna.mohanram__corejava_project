package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicatesTasks {
	
	@Test
	public void testValidRemoveDuplicate() {
		
		ArrayList<Task> taskList = new ArrayList<>();
		Assertions.assertTrue(RemovingDuplicateTasks.addTaskToArray(taskList));
		
		
	}

	
	@Test
	public void testInvalidAddTastToArray() {
		
		try {
			RemovingDuplicateTasks.addTaskToArray(null);
			Assertions.fail("Add Task To Array Method is Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("ArrayList Is Cann't Be Null", ex.getMessage());
		}
		
	}
	
	
	@Test
	public void testvalidAddTastToArray() {
		
		ArrayList<Task> taskList = new ArrayList<>();
		String day1 = "2023-07-14";
		LocalDate date1 = LocalDate.parse(day1);
		Task t1 = new Task(1, "Read Books", date1);

		taskList.add(t1);
		taskList.add(new Task(2, "Read Notes", date1));
		taskList.add(t1);
		taskList.add(new Task(3, "Learn Java", date1));
		Assertions.assertTrue(RemovingDuplicateTasks.removeduplicates(taskList));
		
	}
	
	@Test
	public void testInvalidRemoveDuplicateToArrayList() {
		
		try {
			RemovingDuplicateTasks.removeduplicates(null);
			Assertions.fail("Remove Duplicates Task To Array Method is Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("HashSet is connot be null", ex.getMessage());
		}
		
	}
	
}