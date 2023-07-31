package day12.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import day11.practice.*;

class DBConnection {
	static final String DB_URL = "jdbc:mysql://urt9p8hqgjhtscaf:t6YMvvnZUcUMvPWWIBeU@bagyxb4r4ehqw2ijgble-mysql.services.clever-cloud.com:3306/bagyxb4r4ehqw2ijgble";
	static final String DB_USER = "urt9p8hqgjhtscaf";
	static final String DB_PASSWORD = "t6YMvvnZUcUMvPWWIBeU";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	}
}

class TaskDAO {
	private Connection getConnection() throws SQLException {
		return DBConnection.getConnection();
	}

	public void createTask(Task task) {
		try (Connection con = getConnection()) {
			String query = "INSERT INTO task_details(task_id, task_name, status) VALUES(?, ?, ?)";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setInt(1, task.getId());
			psmt.setString(2, task.getName());
			psmt.setInt(3, task.getStatus() ? 1 : 0);

			int num = psmt.executeUpdate();
			System.out.println("affected row/rows :" + num);
		} catch (SQLException e) {
			System.out.println("Creating task failed");
		}
	}

	public void updateTask(Task task) {
		try (Connection con = getConnection()) {
			String query = "UPDATE task_details SET task_name = ? WHERE task_id = ?";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, task.getName());
			psmt.setInt(2, task.getId());

			int num = psmt.executeUpdate();
			System.out.println("affected row/rows :" + num);
		} catch (SQLException e) {
			System.out.println("Updating task failed");
		}
	}

	public void deleteTask(int taskId) {
		try (Connection con = getConnection()) {
			String query = "DELETE FROM task_details WHERE task_id = ?";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setInt(1, taskId);

			int num = psmt.executeUpdate();
			System.out.println("affected row/rows :" + num);
		} catch (SQLException e) {
			System.out.println("Delete task failed");
		}
	}

	public List<Task> getAllTasks() {
		try (Connection con = getConnection()) {
			String query = "SELECT * FROM task_details";
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(query);
			ArrayList<Task> tasks = new ArrayList<>();

			while (rs.next()) {
				tasks.add(new Task(rs.getInt("task_id"), rs.getString("task_name"), rs.getInt("status") == 1));
			}
			return tasks;
		} catch (SQLException e) {
			System.out.println("Getting all list details failed");
		}
		return null;
	}
}

public class TaskManagement {

	public static void main(String[] args) {

		Task task1 = new Task(200, "Gym", true);
		Task task2 = new Task(201, "Jogging", true);
		Task task3 = new Task(201, "Sports", true);

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://urt9p8hqgjhtscaf:t6YMvvnZUcUMvPWWIBeU@bagyxb4r4ehqw2ijgble-mysql.services.clever-cloud.com:3306/bagyxb4r4ehqw2ijgble",
					"urt9p8hqgjhtscaf", "t6YMvvnZUcUMvPWWIBeU");
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

		TaskDAO taskDAO = new TaskDAO();
		taskDAO.createTask(task1);
		taskDAO.createTask(task2);
		taskDAO.updateTask(task3);
		taskDAO.deleteTask(201);
		taskDAO.deleteTask(200);

		System.out.println(taskDAO.getAllTasks());

	}
}