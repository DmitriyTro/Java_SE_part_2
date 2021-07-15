package collections.map_interface;

import java.util.Hashtable;
import java.util.Objects;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Double, Student3> ht = new Hashtable<>();
		Student3 st1 = new Student3("Zaur","Tregulov", 3);
		Student3 st2 = new Student3("Mariya","Ivanova", 1);
		Student3 st3 = new Student3("Sergey","Petrov", 4);
		Student3 st4 = new Student3("Vasiliy","Smirnov", 3);
		ht.put(7.8, st1);
		ht.put(9.3, st2);
		ht.put(5.8, st3);
		ht.put(6.0, st4);

		System.out.println(ht);
	}
}

class Student3 {
	final String name;
	final String surname;
	final int course;

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
}