package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExp1 {
	public static void main(String[] args) {
		Map<Student3, Double> map = new HashMap<>();
		Student3 st1 = new Student3("Anna", "Ivanova", 3);
		Student3 st2 = new Student3("Mariya", "Petrova", 1);
		Student3 st3 = new Student3("Sergey", "Tregulov", 4);
		map.put(st1, 7.5);
		map.put(st2, 8.7);
		map.put(st3, 9.1);

		System.out.println(map);
		Student3 st4 = new Student3("Sergey", "Tregulov", 4);
//		boolean result = map.containsKey(st4);
//		System.out.println("result = " + result);
//		System.out.println(st3.equals(st4));
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
	}
}

class Student3 {
	String name;
	String surname;
	int course;

	public Student3(String name, String surname, int course) {
		this.name = name;
		this.surname = surname;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student3{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", course=" + course +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student3 student3 = (Student3) o;
		return course == student3.course && Objects.equals(name, student3.name) && Objects.equals(surname, student3.surname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname, course);
	}

//	@Override
//	public int hashCode() {
//		return name.length() * 7 + surname.length() * 11 + course * 53;
//	}
}