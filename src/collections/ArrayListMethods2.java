package collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
	public static void main(String[] args) {
		Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
		Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
		Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
		Student st4 = new Student("Petr", 'm', 32, 4, 7);
		Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
		ArrayList<Student> studentsList = new ArrayList<>();
		studentsList.add(st1);
		studentsList.add(st2);
		studentsList.add(st3);
		studentsList.add(st4);
		studentsList.add(st5);
		System.out.println(studentsList);
		Student st6 = new Student("Mariya", 'f', 23, 3, 7.4);
//		studentsList.add(st6);
//		studentsList.remove(st6);
		System.out.println(studentsList);
		int index = studentsList.indexOf(st6);
		int lastIndex = studentsList.lastIndexOf(st5);
		System.out.println(index);
		System.out.println(lastIndex);
		System.out.println(studentsList.contains(st4));
	}
}

class Student {
	private String name;
	private char sex;
	private int age;
	private int course;
	private double avgGrade;

	public Student(String name, char sex, int age, int course, double avgGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name = '" + name + '\'' +
				", sex = " + sex +
				", age = " + age +
				", course = " + course +
				", avgGrade = " + avgGrade +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
	}
}