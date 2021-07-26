package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerExp2 {
	public static void main(String[] args) {
		Scanner scanner = null;
		Set<String> set = new TreeSet<>();

		try {
			scanner = new Scanner(new FileReader(new File("test1.txt")));
			scanner.useDelimiter("\\W");
			while (scanner.hasNext()) {
				String word = scanner.next();
				set.add(word);
			}
			for (String word : set) {
				System.out.println(word);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
