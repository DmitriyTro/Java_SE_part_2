package collections;

import java.util.Hashtable;

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
