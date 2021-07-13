package collections;

import java.util.ArrayList;

public class ArrayListMethods1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Ivan");
		arrayList.add("Mariya");
		arrayList.add("Zaur");
		arrayList.add(1, "Misha");
		arrayList.set(1, "Anna");
		arrayList.remove(3);
		System.out.println(arrayList.get(2));
		for (String s : arrayList) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
