package day09.practice;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Task1 {

	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;

	Task1(int id, String name, LocalDate deadline, int priority) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
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

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
}

class DeadLine1 implements Comparator<Task1> {

	@Override
	public int compare(Task1 o1, Task1 o2) {
		LocalDate t1 = o1.getDeadline();
		LocalDate t2 = o2.getDeadline();

		if (t1 == t2) {
			if (o1.getPriority() == o2.getPriority())
				return 0;
			else if (o1.getPriority() > o2.getPriority()) {
				return 1;
			} else
				return -1;
		} else if (ChronoUnit.DAYS.between(t1, t2) > 0) {
			return -1;
		} else {
			return 1;
		}
	}
}

public class SortingTasksWithPriority {
	public static void main(String[] args) {

		Task1 Task1 = new Task1(3, "Coding", LocalDate.of(2022, 10, 22), 3);
		Task1 Task2 = new Task1(5, "Product Design", LocalDate.of(2022, 10, 01), 1);
		Task1 Task3 = new Task1(1, "Software Design", LocalDate.of(2022, 10, 07), 2);
		Task1 Task4 = new Task1(3, "Coding", LocalDate.of(2022, 10, 22), 4);

		ArrayList<Task1> arrList = new ArrayList<Task1>();
		arrList.add(Task1);
		arrList.add(Task2);
		arrList.add(Task3);
		arrList.add(Task4);

		Collections.sort(arrList, new DeadLine1());

		Iterator<Task1> itr = arrList.iterator();
		while (itr.hasNext()) {
			Task1 ans = itr.next();
			System.out
					.println(ans.getId() + ", " + ans.getName() + ", " + ans.getDeadline() + ", " + ans.getPriority());
		}
	}
}