package day07.practice;

import java.time.*;
import java.util.*;

public class RemovingDuplicateTasks {
	private int id;
	private String name;
	private LocalDate deadline;

	public RemovingDuplicateTasks(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		RemovingDuplicateTasks otherTask = (RemovingDuplicateTasks) obj;
		return id == otherTask.id && name.equals(otherTask.name) && deadline.equals(otherTask.deadline);
	}

	public int hashCode() {
		return id ^ name.hashCode() ^ deadline.hashCode();
	}

	public String toString() {
		return "Task ID: " + id + ", Name: " + name + ", Deadline: " + deadline;
	}

	public static void main(String[] args) {
		ArrayList<RemovingDuplicateTasks> taskList = new ArrayList<>();
		taskList.add(new RemovingDuplicateTasks(1, "Task 1", LocalDate.parse("2023-07-15")));
		taskList.add(new RemovingDuplicateTasks(2, "Task 2", LocalDate.parse("2023-07-15")));
		taskList.add(new RemovingDuplicateTasks(3, "Task 3", LocalDate.parse("2023-07-16")));
		taskList.add(new RemovingDuplicateTasks(1, "Task 1", LocalDate.parse("2023-07-15")));

		System.out.println("Original Task List:");
		for (RemovingDuplicateTasks task : taskList) {
			System.out.println(task);
		}

		HashSet<RemovingDuplicateTasks> uniqueTasks = new HashSet<>(taskList);
		taskList.clear();
		taskList.addAll(uniqueTasks);

		System.out.println("\nTask List after removing duplicates:");
		for (RemovingDuplicateTasks task : taskList) {
			System.out.println(task);
		}
	}
}