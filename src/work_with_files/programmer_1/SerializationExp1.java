package work_with_files.programmer_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExp1 {
	public static void main(String[] args) {
		List<String> employees = new ArrayList<>();
		employees.add("Anna");
		employees.add("Ivan");
		employees.add("Elena");

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("employees1.bin"))) {

			oos.writeObject(employees);
			System.out.println("Done!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
