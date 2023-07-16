package day07.practice;

import java.time.*;
import java.util.*;

//public class RemovingDuplicateTasks {
//	private int id;
//	private String name;
//	private LocalDate deadline;
//
//	public RemovingDuplicateTasks(int id, String name, LocalDate deadline) {
//		this.id = id;
//		this.name = name;
//		this.deadline = deadline;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public LocalDate getDeadline() {
//		return deadline;
//	}
//
//	public boolean equals(Object obj) {
//		if (obj == this) {
//			return true;
//		}
//		if (obj == null || obj.getClass() != this.getClass()) {
//			return false;
//		}
//		RemovingDuplicateTasks otherTask =  (RemovingDuplicateTasks) obj;
//		return id == otherTask.id && name.equals(otherTask.name) && deadline.equals(otherTask.deadline);
//	}
//
//	public int hashCode() {
//		return id ^ name.hashCode() ^ deadline.hashCode();
//	}
//
//	public String toString() {
//		return "Task ID: " + id + ", Name: " + name + ", Deadline: " + deadline;
//	}
//
//	public static void main(String[] args) {
//		ArrayList<RemovingDuplicateTasks> taskList = new ArrayList<>();
//		taskList.add(new RemovingDuplicateTasks(1, "Task 1", LocalDate.parse("2023-07-15")));
//		taskList.add(new RemovingDuplicateTasks(2, "Task 2", LocalDate.parse("2023-07-15")));
//		taskList.add(new RemovingDuplicateTasks(3, "Task 3", LocalDate.parse("2023-07-16")));
//		taskList.add(new RemovingDuplicateTasks(1, "Task 1", LocalDate.parse("2023-07-15")));
//
//		System.out.println("Original Task List:");
//		for (RemovingDuplicateTasks task : taskList) {
//			System.out.println(task);
//		}
//
//		HashSet<RemovingDuplicateTasks> uniqueTasks = new HashSet<>(taskList);
//		taskList.clear();
//		taskList.addAll(uniqueTasks);
//
//		System.out.println("\nTask List after removing duplicates:");
//		for (RemovingDuplicateTasks task : taskList) {
//			System.out.println(task);
//		}
//	}
//}





class Task {

	// Created Getter and Setter Methods for the Attributes
	private int id;
	private String name;
	private LocalDate deadline;

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

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public Task(int id, String name, LocalDate deadline) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

}

public class RemovingDuplicateTasks {

	public static boolean removeduplicates(ArrayList<Task> tasks) throws IllegalArgumentException {
		
		if(tasks == null) {
			throw new IllegalArgumentException("HashSet is connot be null");
		}

		HashSet<Task> hashOfSet = new HashSet<Task>(tasks);

		System.out.println(hashOfSet);

		return true;

	}

	public static boolean addTaskToArray(ArrayList<Task> taskList) throws IllegalArgumentException {

		if (taskList == null) {
			throw new IllegalArgumentException("ArrayList Is Cann't Be Null");
		}

		String day1 = "2023-07-14";
		LocalDate date1 = LocalDate.parse(day1);
		Task t1 = new Task(1, "Read Books", date1);

		taskList.add(t1);
		taskList.add(new Task(2, "Read Notes", date1));
		taskList.add(t1);
		taskList.add(new Task(3, "Learn Java", date1));

		removeduplicates(taskList);

		return true;

	}

	public static void main(String[] args) {

		ArrayList<Task> taskList = new ArrayList<>();
		
		addTaskToArray(taskList);

	}

}