package collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Zaur");
		set.add("Oleg");
		set.add("Marina");
		set.add("Igor");

		set.remove("Zaur");
//		System.out.println(set);
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains("Marina"));
	}
}
