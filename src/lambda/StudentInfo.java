package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {

	void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
		for (Student s : al) {
			if (pr.test(s)) {
				System.out.println(s);
			}
		}
	}

//	void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//		for (Student s : al) {
//			if (s.avgGrade > grade) {
//				System.out.println(s);
//			}
//		}
//	}
//
//	void printStudentsUnderAge(ArrayList<Student> al, int age) {
//		for (Student s : al) {
//			if (s.age < age) {
//				System.out.println(s);
//			}
//		}
//	}
//
//	void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//		for (Student s : al) {
//			if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//				System.out.println(s);
//			}
//		}
//	}
}

class Test {
	public static void main(String[] args) {
		Student st1 = new Student("Ivan", 'm', 22, 2, 8.3);
		Student st2 = new Student("Nikolay", 'm', 28, 3, 7.4);
		Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
		Student st4 = new Student("Petr", 'm', 20, 1, 8);
		Student st5 = new Student("Mariya", 'f', 24, 3, 9.1);
		ArrayList<Student> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);

		StudentInfo info = new StudentInfo();

//		info.testStudents(students, new CheckOverGrade());
//		System.out.println("-------------------------------");
//		info.testStudents(students, new StudentChecks() {
//			@Override
//			public boolean check(Student s) {
//				return s.age < 25;
//			}
//		});
//		info.testStudents(students, (Student s) -> {return s.avgGrade > 8;});
//		info.testStudents(students, s -> s.avgGrade > 8);

//		StudentChecks sc = s -> s.avgGrade > 8;
//		info.testStudents(students, sc);


		Predicate<Student> p1 = student -> student.avgGrade > 8;
		Predicate<Student> p2 = student -> student.sex == 'm';

//		info.testStudents(students, p1.and(p2));
		info.testStudents(students, p1.or(p2));
		System.out.println("-------------------------------");
		info.testStudents(students, p1.negate());

//		System.out.println("-------------------------------");
//		info.testStudents(students, (Student s) -> {return s.age < 25;});
//		System.out.println("-------------------------------");
//		info.testStudents(students, (Student s) -> {return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';});
//		info.printStudentsOverGrade(students, 8);
//		System.out.println("-------------------------------");
//		info.printStudentsUnderAge(students, 25);
//		System.out.println("-------------------------------");
//		info.printStudentsMixCondition(students, 20, 9.5, 'f');
	}
}

//interface StudentChecks {
//	boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks {
//	@Override
//	public boolean check(Student s) {
//		return s.avgGrade > 8;
//	}
//}