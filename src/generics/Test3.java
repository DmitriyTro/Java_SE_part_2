package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<?> list = new ArrayList<Integer>();

		List<? extends Number> list2 = new ArrayList<Integer>();
		List<? super Number> list5 = new ArrayList<Object>();

		ArrayList<Double> list3 = new ArrayList<>();
		list3.add(3.14);
		list3.add(3.15);
		list3.add(3.16);
		showListInfo(list3);
		System.out.println(sum(list3));

		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(3);
		list4.add(6);
		list4.add(9);
		list4.add(2);
		System.out.println(sum(list4));
	}

	static void showListInfo(List<?> list) {
		System.out.println("This list have elements: " + list);
	}

	public static double sum(ArrayList<? extends Number> aL) {
		double sum = 0;
		for (Number n : aL) {
			sum += n.doubleValue();
		}
		return sum;
	}
}
