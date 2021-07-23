package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExp {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Дмитрий\\Desktop\\test3.txt");
		File folder = new File("C:\\Users\\Дмитрий\\Desktop\\A");
		File file2 = new File("C:\\Users\\Дмитрий\\Desktop\\A\\test1.txt");
		File folder2 = new File("C:\\Users\\Дмитрий\\Desktop\\B");

		System.out.println("File absolute path: " + file.getAbsolutePath());
		System.out.println("Folder absolute path: " + folder.getAbsolutePath());
		System.out.println("---------------------------------------");

		System.out.println("File path is absolute? " + file.isAbsolute());
		System.out.println("Folder path is absolute? " + folder.isAbsolute());
		System.out.println("---------------------------------------");

		System.out.println("File path is directory? " + file.isDirectory());
		System.out.println("Folder path is directory? " + folder.isDirectory());
		System.out.println("---------------------------------------");

		System.out.println("File is exists? " + file.exists());
		System.out.println("File2 is exists? " + file2.exists());
		System.out.println("Folder is exists? " + folder.exists());
		System.out.println("Folder2 is exists? " + folder2.exists());
		System.out.println("---------------------------------------");

		System.out.println("Create file2: " + file2.createNewFile());
		System.out.println("Create folder2: " + folder2.mkdir());
		System.out.println("---------------------------------------");

		System.out.println("File2 length: " + file2.length());
		System.out.println("Folder length: " + folder.length());
		System.out.println("---------------------------------------");

//		System.out.println("Folder delete: " + folder.delete());
//		System.out.println("Folder2 delete: " + folder2.delete());
//		System.out.println("File2 delete: " + file2.delete());
		System.out.println("---------------------------------------");

		File[] files = folder.listFiles();
		System.out.println(Arrays.toString(files));
		System.out.println("---------------------------------------");

		System.out.println("File is hidden? " + file2.isHidden());
		System.out.println("Can read file? " + file2.canRead());
		System.out.println("Can write file? " + file2.canWrite());
		System.out.println("Can execute file? " + file2.canExecute());

	}
}
