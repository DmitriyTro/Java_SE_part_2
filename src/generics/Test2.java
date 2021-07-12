package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		X x = new Y();
		List<X> list1 = new ArrayList<X>();

		Info1<Integer> info1 = new Info1<>(100);
		System.out.println(info1);
	}
}

class X {

}

class Y extends X {

}

class Info1<T extends  Number> { /* <T extends  Number & I1 & I2> */
	private T value;

	public Info1(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Info { " +
				"value = " + value +
				" }";
	}
}

interface I1 {

}

interface I2 {

}