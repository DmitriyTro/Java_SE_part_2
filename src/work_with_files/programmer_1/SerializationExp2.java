package work_with_files.programmer_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExp2 {
	public static void main(String[] args) {
		Car car = new Car("Nissan Tiida", "white");
		Employee employee = new Employee("Mariya", "Ivanova", "IT",
				28,
				750, car);

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("employees2.bin"))) {

			oos.writeObject(employee);
			System.out.println("Done!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
