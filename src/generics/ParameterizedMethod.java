package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
	public static void main(String[] args) {
		ArrayList<Integer> aL = new ArrayList<>();
		aL.add(10);
		aL.add(20);
		aL.add(5);
		int a = GenMethod.getSecondElement(aL);
		System.out.println(a);
	}
}

class GenMethod {
	public static <T> T getSecondElement(ArrayList<T> aL) {
		return aL.get(1);
	}
}