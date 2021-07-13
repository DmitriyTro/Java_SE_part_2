package collections;

import java.util.ArrayList;

public class ArrayListMethods3 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Ivan");
		arrayList.add("Mariya");
		arrayList.add("Zaur");
		System.out.println(arrayList);

		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("!!!");
		arrayList2.add("???");
		arrayList.addAll(1, arrayList2);
		System.out.println(arrayList);
		arrayList2.clear();
		System.out.println(arrayList2);
		int index = arrayList.indexOf("Ivan");
		System.out.println(index);
		System.out.println(arrayList.size());
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.contains("Zaur"));
	}
}
