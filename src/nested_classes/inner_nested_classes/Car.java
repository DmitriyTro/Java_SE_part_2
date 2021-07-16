package nested_classes.inner_nested_classes;

public class Car {
	String color;
	int doorCount;
	Engine engine;

	public Car(String color, int doorCount) {
		this.color = color;
		this.doorCount = doorCount;
//		this.engine = this.new Engine(horsePower);
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

//	void method() {
//		System.out.println(Engine.countOfObjects);
//		Engine e = new Engine(200);
//		System.out.println(e.horsePower);
//	}

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

	public class Engine {
		private int horsePower;
		public final static int A = 5;

		public Engine(int horsePower) {
			this.horsePower = horsePower;
			System.out.println(doorCount);
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
//		Car.Engine engine = new Car.Engine(256);
//		Car car = new Car("black", 4, 300);

		Car car = new Car("Black", 4);
		Car.Engine engine = car.new Engine(150);
		car.setEngine(engine);
		System.out.println(engine);
		System.out.println(car);

//		Car.Engine engine2 = new Car("Yellow", 4).new Engine(200);
	}
}
