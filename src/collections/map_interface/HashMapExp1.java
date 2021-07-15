package collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExp1 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1122, "Zaur Tregulov");
		map1.put(3568, "Ivan Petrov");
		map1.put(6578, "Mariya Sidorova");
		map1.put(15897, "Nikolay Ivanov");
//		map1.put(98745, "Nikolay Ivanov");
//		map1.put(1122, "Anna Sidorova");
//		map1.put(null, "Anna Sidorova");
//		map1.put(8532, null);
//		map1.putIfAbsent(3568, "Petr Petrov");
//		map1.remove(15897);
		System.out.println(map1);
//		System.out.println(map1.containsValue("Ivan Petrov"));
//		System.out.println(map1.containsKey(1446));
		System.out.println(map1.get(1122));
		System.out.println(map1.keySet());
		System.out.println(map1.values());
	}
}
