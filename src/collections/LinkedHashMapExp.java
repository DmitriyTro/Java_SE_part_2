package collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExp {
	public static void main(String[] args) {
		LinkedHashMap<Double, Student3> lhm =
				new LinkedHashMap<>(16, 0.75f, true);
		Student3 st1 = new Student3("Zaur","Tregulov", 3);
		Student3 st2 = new Student3("Mariya","Ivanova", 1);
		Student3 st3 = new Student3("Sergey","Petrov", 4);
		Student3 st4 = new Student3("Vasiliy","Smirnov", 3);
		lhm.put(5.8, st1);
		lhm.put(7.5, st4);
		lhm.put(6.4, st2);
		lhm.put(7.2, st3);

		System.out.println(lhm);
		System.out.println(lhm.get(5.8));
		System.out.println(lhm.get(7.5));
		System.out.println(lhm);
	}
}
