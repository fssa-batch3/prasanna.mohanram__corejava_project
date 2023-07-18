package day09.practice;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Task {

	private int id;
	private String name;
	private LocalDate deadline;

	Task(int id, String name, LocalDate deadline) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
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

class DeadLine implements Comparator<Task> {

	@Override
	public int compare(Task o1, Task o2) {
		LocalDate t1 = o1.getDeadline();
		LocalDate t2 = o2.getDeadline();

		if (t1 == t2)
			return 0;
		else if (ChronoUnit.DAYS.between(t1, t2) > 0) {
			return -1;
		} else
			return 1;
	}
}

public class SortingTasks {
	public static void main(String[] args) {

		Task task1 = new Task(3, "Coding", LocalDate.of(2022, 10, 22));
		Task task2 = new Task(5, "Product Design", LocalDate.of(2022, 10, 01));
		Task task3 = new Task(1, "Software Design", LocalDate.of(2022, 10, 07));
		Task task4 = new Task(3, "Coding", LocalDate.of(2022, 10, 22));

		ArrayList<Task> arrList = new ArrayList<Task>();
		arrList.add(task1);
		arrList.add(task2);
		arrList.add(task3);
		arrList.add(task4);

		Collections.sort(arrList, new DeadLine());

		Iterator<Task> itr = arrList.iterator();
		while (itr.hasNext()) {
			Task ans = itr.next();
			System.out.println(ans.getId() + "," + ans.getName() + "," + ans.getDeadline());
		}
	}
}