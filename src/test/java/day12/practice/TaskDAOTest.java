package day12.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import day11.practice.Task;

public class TaskDAOTest {
	private TaskDAO taskDAO;
	private Connection connection;

	@Before
	public void setup() throws SQLException {
		connection = DBConnection.getConnection();
		taskDAO = new TaskDAO();
		clearDatabase();
	}

	@After
	public void cleanup() throws SQLException {
		clearDatabase();
		if (connection != null) {
			connection.close();
		}
	}

	@Test
	public void testCreateTask() {
		Task task = new Task(200, "Gym", true);
		taskDAO.createTask(task);
		List<Task> tasks = taskDAO.getAllTasks();
		assertEquals(1, tasks.size());
		assertEquals(task, tasks.get(0));
	}

	@Test
	public void testUpdateTask() {
		Task task = new Task(200, "Gym", true);
		taskDAO.createTask(task);

		task.setName("Workout");
		task.setStatus(false);
		taskDAO.updateTask(task);

		List<Task> tasks = taskDAO.getAllTasks();
		assertEquals(1, tasks.size());
		assertEquals(task, tasks.get(0));
	}

	@Test
	public void testDeleteTask() {
		Task task = new Task(200, "Gym", true);
		taskDAO.createTask(task);

		taskDAO.deleteTask(200);

		List<Task> tasks = taskDAO.getAllTasks();
		assertEquals(0, tasks.size());
	}

	@Test
	public void testGetAllTasks() {
		Task task1 = new Task(200, "Gym", true);
		Task task2 = new Task(201, "Jogging", true);

		taskDAO.createTask(task1);
		taskDAO.createTask(task2);

		List<Task> tasks = taskDAO.getAllTasks();
		assertEquals(2, tasks.size());
		assertEquals(task1, tasks.get(0));
		assertEquals(task2, tasks.get(1));
	}

	private void clearDatabase() throws SQLException {
		if (connection != null) {
			Statement stmt = connection.createStatement();
			stmt.execute("DELETE FROM task_details");
			stmt.close();
		}
	}
}
