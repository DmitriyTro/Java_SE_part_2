package lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Test3 {

	public static ArrayList<Car> createThreeCars(Supplier<Car> supplier) {
		ArrayList<Car> aL = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			aL.add(supplier.get());
		}
		return aL;
	}

	public static void main(String[] args) {
		ArrayList<Car> ourCars = createThreeCars(() ->
				new Car("Nissan Tiida", "Silver Metalic", 1.6));
		System.out.println("Our cars: " + ourCars);
	}
}

class Car {
	String model;
	String color;
	double engine;

	public Car(String model, String color, double engine) {
		this.model = model;
		this.color = color;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car{" +
				"model='" + model + '\'' +
				", color='" + color + '\'' +
				", engine=" + engine +
				'}';
	}
}