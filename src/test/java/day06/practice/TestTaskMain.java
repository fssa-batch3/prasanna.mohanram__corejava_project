package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day06.practice.*;

public class TestTaskMain {

	@Test
	public void testValidTask() {

		Assertions.assertTrue(TaskMain.validatetaskName("Taskplay"));

	}

	@Test
	public void testInValidTask() {

		try {
			TaskMain.validatetaskName(null);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("TaskName cannot be null or empty", ex.getMessage());
		}

		try {
			TaskMain.validatetaskName("a");
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The  task name should be  minimum 2 letters and maximum 200 letters",
					ex.getMessage());
		}

	}

	@Test
	public void testValidpriority() {

		Assertions.assertTrue(TaskMain.validatetaskpriority(5));

	}

	@Test
	public void testInValidpriority() {

		try {
			TaskMain.validatetaskpriority(0);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("InValid priority", ex.getMessage());
		}

	}
}
