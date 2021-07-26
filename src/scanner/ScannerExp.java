package scanner;

import java.util.Scanner;

public class ScannerExp {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Vvedite chislo");
//		int i = scanner.nextInt();
//		System.out.println("Vvedenoe chislo: " + i);

//		System.out.println("Vvedite 2 chisla");
//		int x = scanner.nextInt();
//		int y = scanner.nextInt();
//		System.out.println("Chastnoe = " + x / y);
//		System.out.println("Ostatok  = " + x % y);

//		System.out.println("Napishite paru slov");
//		String s = scanner.nextLine();
//		System.out.println("Vi napisali: " + s);

		Scanner scanner1 = new Scanner("Privet!\nKak dela?");
		while (scanner1.hasNextLine()) {
			System.out.println(scanner1.nextLine());
		}
	}
}
