package generics;

public class Test1 {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("Hello", 20);
		System.out.println("Value 1 = " + pair.getFirstValue() + ", Value 2 = " + pair.getSecondValue());

		Pair<Integer, Double> pair2 = new Pair<>(100, 20.50);
		System.out.println("Value 1 = " + pair2.getFirstValue() + ", Value 2 = " + pair2.getSecondValue());

		OtherPair<String> otherPair = new OtherPair<>("Bye", "Ok");
		System.out.println("Value 1 = " + otherPair.getFirstValue() + ", Value 2 = " + otherPair.getSecondValue());

	}
}

class Pair<V1, V2> {
	private V1 value1;
	private V2 value2;

	public Pair(V1 value1, V2 value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public V1 getFirstValue() {
		return value1;
	}

	public V2 getSecondValue() {
		return value2;
	}
}

class OtherPair<V> {
	private V value1;
	private V value2;

	public OtherPair(V value1, V value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public V abc(V val) {
		return val;
	}

	public V getFirstValue() {
		return value1;
	}

	public V getSecondValue() {
		return value2;
	}
}