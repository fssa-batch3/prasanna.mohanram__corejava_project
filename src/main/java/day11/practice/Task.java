package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import day11.solved.ConnectionUtil;

public class Task {
	private int id;
	private String name;
	private boolean status;

	public Task(String name, boolean status) {
		this.setName(name);
		this.setStatus(status);

	}

	public Task(int i, String string, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}

// Create Junit Test case and test the TaskDao.createTask method
class TaskDo {

	public static boolean createTask(SQlTask task) throws DAOException {

		if (task == null) {
			throw new DAOException("Task object cannot be null");

		}

		String url = "jdbc:mysql://localhost:3306/Task";
		String userName = "root";
		String password = "123456";
		Connection con = null;
		// Write code here to get connection

		try {
			con = DriverManager.getConnection(url, userName, password);

		}

		catch (SQLException ex) {
			throw new DAOException("Connection is not created");
		}

		String query = "INSERT INTO Task (name,status) VALUES (?,?)";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, task.name);
			preparedStatement.setString(2, task.status);
			preparedStatement.executeUpdate();
		} catch (SQLException ex) {
			throw new DAOException("Cant run prepared statement");

		}

		ConnectionUtil.close(con, null, null);
		System.out.println("Task completed");
		return true;
		// Create insert statement
		// Execute insert statement
		// close connection
	}

	public static void main(String[] args) throws DAOException {

		SQlTask task1 = new SQlTask("Learn java", "Completed");
		try {
			createTask(task1);

		} catch (DAOException ex) {
			throw new DAOException(ex.getMessage());

		}

	}
}