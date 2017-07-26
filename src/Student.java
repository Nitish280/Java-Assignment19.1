import java.util.HashSet;
import java.util.Iterator;

/*
 * here we creating a program of hashset
 * which add all the object of Student
 */
//here we are creating a class student
public class Student {
	// here we are taking three different type of variable
	String name;

	int rollNo;

	String department;
	// here we are creating a constructor

	public Student(String name, int rollNo, String department) {
		this.name = name;

		this.rollNo = rollNo;

		this.department = department;
	}

	// here we are using the getter n setter
	// for three different properties

	public String getname() {
		return name;

	}

	public void setname(String name) {
		this.name = name;

	}

	public int getrollNo() {
		return rollNo;

	}

	public void setname(int rollNo) {
		this.rollNo = rollNo;

	}

	public String getdepartment() {
		return department;

	}

	public void setdepartment(String department) {
		this.department = department;
	}

	// here we are using tostring() method
	// it will return the value of the object
	@Override
	public String toString() {
		return name + ", " + rollNo + ", " + department;
	}

	// here we are taking the main method
	public static void main(String[] args) {
		// TODO Auto-generated method

		// here we are creating the object of hashset
		HashSet<Student> set = new HashSet<Student>();

		// here we are Adding elements in HashSet

		set.add(new Student("Nitish", 12, "ECE"));

		set.add(new Student("Vishal", 10, "EEE"));

		set.add(new Student("Abhishek", 15, "Civil"));

		set.add(new Student("Bhwani", 20, "IT"));

		set.add(new Student("Vishwas", 52, "CS"));

		set.add(new Student("Mithun", 31, "IT"));
		// here we are Iterating through the HashSet

		Iterator<Student> it = set.iterator();

		while (it.hasNext()) {
			Student student = (Student) it.next();

			System.out.println(student);

		}
	}
}
