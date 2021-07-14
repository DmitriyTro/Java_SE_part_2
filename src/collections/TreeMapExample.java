package collections;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Double, Student3> treeMap = new TreeMap<>();
		Student3 st1 = new Student3("Zaur","Tregulov", 3);
		Student3 st2 = new Student3("Mariya","Ivanova", 1);
		Student3 st3 = new Student3("Sergey","Petrov", 4);
		Student3 st4 = new Student3("Vasiliy","Smirnov", 3);
		Student3 st5 = new Student3("Mariya","Petrova", 1);
		Student3 st6 = new Student3("Anna","Kapustina", 4);
		Student3 st7 = new Student3("Elena","Sidorova", 3);
		treeMap.put(5.8, st1);
		treeMap.put(8.2, st6);
		treeMap.put(6.4, st2);
		treeMap.put(9.1, st7);
		treeMap.put(7.2, st3);
		treeMap.put(7.9, st5);
		treeMap.put(7.5, st4);

		System.out.println(treeMap);
//		System.out.println(treeMap.get(6.4));
//		treeMap.remove(5.8);
//		System.out.println(treeMap);
//		System.out.println(treeMap.descendingMap());
//		System.out.println(treeMap.tailMap(7.3));
//		System.out.println(treeMap.headMap(7.3));
//		System.out.println(treeMap.lastEntry());
	}
}
