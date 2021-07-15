package collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExp1 {
	public static void main(String[] args) {
		Map<Student4, Double> map = new HashMap<>();
		Student4 st1 = new Student4("Anna", "Ivanova", 3);
		Student4 st2 = new Student4("Mariya", "Petrova", 1);
		Student4 st3 = new Student4("Sergey", "Tregulov", 4);
		map.put(st1, 7.5);
		map.put(st2, 8.7);
		map.put(st3, 9.1);
		System.out.println(map);
//		System.out.println(map.containsKey(st1));
//		System.out.println(st1.hashCode());
//		st1.course = 4;
//		System.out.println(map.containsKey(st1));
//		System.out.println(st1.hashCode());

//		System.out.println(map);
//		Student3 st4 = new Student3("Sergey", "Tregulov", 4);
//		boolean result = map.containsKey(st4);
//		System.out.println("result = " + result);
//		System.out.println(st3.equals(st4));
//		System.out.println(st3.hashCode());
//		System.out.println(st4.hashCode());

//		for (Map.Entry<Student3, Double> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
//
//		Map<Integer, String> map2 = new HashMap<>(16, 0.75f); // 16 * 0.75 = 12 elem
	}
}

final class Student4 {
	final String name;
	final String surname;
	final int course;

	public Student4(String name, String surname, int course) {
		this.name = name;
		this.surname = surname;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student4{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", course=" + course +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student4 student4 = (Student4) o;
		return course == student4.course && Objects.equals(name, student4.name) && Objects.equals(surname, student4.surname);
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