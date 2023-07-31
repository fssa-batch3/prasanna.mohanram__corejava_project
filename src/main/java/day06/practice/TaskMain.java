package day06.practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskMain {
	public String taskName;

	public int priority;

	public TaskMain(String taskName, int priority) {
		validatetaskName(taskName);
		validatetaskpriority(priority);
		this.taskName = taskName;
		this.priority = priority;
	}

	public static boolean validatetaskName(String taskName) throws IllegalArgumentException {
		if (taskName == null || taskName.isEmpty()) {
			throw new IllegalArgumentException("TaskName cannot be null or empty");
		}
		String nameregex = "^[a-zA-Z]{2,200}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(taskName);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("The  task name should be  minimum 2 letters and maximum 200 letters");

		}
		return true;

	}

	public static boolean validatetaskpriority(int priority) throws IllegalArgumentException {
		if (priority <= 0) {
			throw new IllegalArgumentException("InValid priority");
		}
		return true;

	}

	public static void main(String[] args) {

		ArrayList<TaskMain> taskList = new ArrayList<>();
		taskList.add(new TaskMain("Taskplay", 3));
		taskList.add(new TaskMain("Taskeating", 2));
		taskList.add(new TaskMain("Taskstudying", 1));
		taskList.add(new TaskMain("Tasktakingnotes", 4));
		taskList.add(new TaskMain("Taskexercise", 5));

		for (TaskMain task : taskList) {
			System.out.println("TaskName " + task.taskName);
			System.out.println("Taskpriority " + task.priority);

			System.out.println();

		}

	}
}