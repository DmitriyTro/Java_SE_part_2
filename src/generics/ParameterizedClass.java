package generics;

public class ParameterizedClass {
	public static void main(String[] args) {
		Info<String> info = new Info<>("Hello");
		System.out.println(info);
		String s = info.getValue();
		System.out.println(s);
	}
}

class Info<T> {  // T - type, V - value, K - key, E - element
	private T value;

	public Info(T value) {
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