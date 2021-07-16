package nested_classes.static_nested_classes;

public class Car {
	String color;
	int doorCount;
	Engine engine;
	static int a;

	public Car(String color, int doorCount, Engine engine) {
		this.color = color;
		this.doorCount = doorCount;
		this.engine = engine;
	}

	void method() {
		System.out.println(Engine.countOfObjects);
		Engine e = new Engine(200);
		System.out.println(e.horsePower);
	}

	@Override
	public String toString() {
		return "My car{ " +
				"color = '" + color + '\'' +
				", doorCount = " + doorCount +
				", engine = " + engine +
				" }";
	}

	interface I {

	}

	public static class Engine extends Z {
		private int horsePower;
		static int countOfObjects;

		public Engine(int horsePower) {
			this.horsePower = horsePower;
			System.out.println(a);
			countOfObjects++;
		}

		@Override
		public String toString() {
			return "Engine{ " +
					"horsePower = " + horsePower +
					" }";
		}
	}
}

class Test {
	public static void main(String[] args) {
		Car.Engine engine = new Car.Engine(256);
		System.out.println(engine);

		Car car = new Car("red", 2, engine);
		System.out.println(car);
	}
}

class Z {

}