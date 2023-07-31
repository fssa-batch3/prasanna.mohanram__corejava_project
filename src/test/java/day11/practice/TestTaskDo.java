package day11.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day11.practice.*;

public class TestTaskDo {

	@Test
	public void testValidTask() throws DAOException {
		SQlTask task = new SQlTask("Learn java", "Completed");

		Assertions.assertTrue(TaskDo.createTask(task));

	}

	@Test
	public void testInValidTask() {

		try {
			SQlTask task = null;
			TaskDo.createTask(task);
		}

		catch (DAOException ex) {
			Assertions.assertEquals("Task object cannot be null", ex.getMessage());
		}
	}

}