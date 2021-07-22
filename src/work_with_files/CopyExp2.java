package work_with_files;

import java.io.*;

public class CopyExp2 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream
				("C:\\Users\\Дмитрий\\Desktop\\WChPA6PbK80.jpg");
		     FileOutputStream fos = new FileOutputStream("pic.jpg");
		) {
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			System.out.println("Done!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
