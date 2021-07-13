package collections;

import java.util.*;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		ArrayList<String> arrayList2 = new ArrayList<>(200);
		arrayList.add("Ivan");
		arrayList.add("Mariya");
		arrayList.add("Zaur");
		System.out.println(arrayList);
	}
}
