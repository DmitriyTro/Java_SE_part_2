package collections.list_interface;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(-3);
		arrayList.add(8);
		arrayList.add(12);
		arrayList.add(-8);
		arrayList.add(0);
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(1);
		arrayList.add(150);
		arrayList.add(-30);
		arrayList.add(19);

		Collections.sort(arrayList);
		System.out.println(arrayList);
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		Collections.shuffle(arrayList);
		System.out.println(arrayList);

//		int index = Collections.binarySearch(arrayList, 12);
//		System.out.println(index);

//		Employee emp1 = new Employee(100, "Zaur", 12345);
//		Employee emp2 = new Employee(15, "Ivan", 6542);
//		Employee emp3 = new Employee(123, "Petr", 8542);
//		Employee emp4 = new Employee(16, "Mariya", 5678);
//		Employee emp5 = new Employee(182, "Kolya", 125);
//		Employee emp6 = new Employee(15, "Sasha", 9874);
//		Employee emp7 = new Employee(250, "Elena", 1579);
//		List<Employee> list = new ArrayList<>();
//		list.add(emp1);
//		list.add(emp2);
//		list.add(emp3);
//		list.add(emp4);
//		list.add(emp5);
//		list.add(emp6);
//		list.add(emp7);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		int index2 = Collections.binarySearch(list, new Employee(182, "Kolya", 125));
//		System.out.println(index2);

//		int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//		System.out.println(Arrays.toString(array));
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		int index3 = Arrays.binarySearch(array, 150);
//		System.out.println(index3);
	}
}

class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", salary=" + salary +
				'}';
	}

	@Override
	public int compareTo(Employee anotherEmp) {
		int result = this.id - anotherEmp.id;
		if (result == 0) {
			result = this.name.compareTo(anotherEmp.name);
		}
		return result;
	}
}
