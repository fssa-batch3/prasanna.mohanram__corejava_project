package day06.practice;

import java.util.ArrayList;

public class TaskFindMethod {

	public static void main(String[] args) throws Exception {
		ArrayList<TaskMain> taskList = new ArrayList<>();
		taskList.add(new TaskMain("Taskplay", 3));
		taskList.add(new TaskMain("Taskeating", 2));
		taskList.add(new TaskMain("Taskstudying", 1));
		taskList.add(new TaskMain("Tasktakingnotes", 4));
		taskList.add(new TaskMain("Taskexercise", 5));

		boolean findTask = findTaskByName("Taskplay", taskList);
		System.out.println("Task " + findTask);
	}

	public static boolean findTaskByName(String name, ArrayList<TaskMain> tasks) throws Exception {
		for (TaskMain task : tasks) {
			if (task.taskName.equals(name)) {
				return true;
			}
		}
		throw new Exception("Not found");

	}

}
