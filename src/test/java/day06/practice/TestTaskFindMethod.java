package day06.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day06.practice.*;

public class TestTaskFindMethod {

	@Test
	public void testValidFindTask() throws Exception {

		ArrayList<TaskMain> taskList = new ArrayList<>();
		taskList.add(new TaskMain("play", 3));
		taskList.add(new TaskMain("eating", 2));
		taskList.add(new TaskMain("studying", 1));
		taskList.add(new TaskMain("takingnotes", 4));
		taskList.add(new TaskMain("exercise", 5));

		boolean findTask = TaskFindMethod.findTaskByName("play", taskList);

		Assertions.assertTrue(findTask);

	}

	@Test
	public void testInValidFindTask() {

		try {
			ArrayList<TaskMain> taskList = new ArrayList<>();
			taskList.add(new TaskMain("play", 3));
			taskList.add(new TaskMain("eating", 2));
			taskList.add(new TaskMain("studying", 1));
			taskList.add(new TaskMain("takingnotes", 4));
			taskList.add(new TaskMain("exercise", 5));

			boolean findTask = TaskFindMethod.findTaskByName("playing", taskList);

			Assertions.fail("testInValidFindTask failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Not found", ex.getMessage());
		}

	}

}