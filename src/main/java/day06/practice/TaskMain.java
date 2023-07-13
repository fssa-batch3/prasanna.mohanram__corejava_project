package day06.practice;

import java.util.*;

class Task {
	public String taskName;
	public int priority;

	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "TaskName : " + taskName + " - priority : " + priority + "\n";
	}

}

public class TaskMain {
	public static void main(String[] args) {

		Task task1 = new Task("Booking Ticket", 1);
		Task task2 = new Task("Eating Dinner", 2);
		Task task3 = new Task("Watching Youtube", 3);
		Task task4 = new Task("Completing the works", 4);

		ArrayList<Task> arrayTask = new ArrayList();
		arrayTask.add(task1);
		arrayTask.add(task2);
		arrayTask.add(task3);
		arrayTask.add(task4);

		System.out.println(arrayTask);
	}
}
