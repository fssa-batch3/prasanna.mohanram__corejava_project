package day05.practice;

class Student {
	String name;
	int id;
	Department department;

	public Student(String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", Department=" + department.getDetails() + "]";
	}
}

class Department {
	String deptName;
	int deptId;

	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}

	public String getDetails() {
		return (this.deptName + "\n" + "Department Id: " + this.deptId);
	}
}

public class StudentMain {
	public static void main(String[] args) {

		Department stuDept = new Department("IT", 7);
		Student student = new Student("Prasanna", 7, stuDept);
		System.out.println(student);
	}
}
