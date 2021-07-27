package reflection;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exp2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Class employeeClass = Class.forName("reflection.Employee");

//		Employee o = (Employee) employeeClass.newInstance();
//		System.out.println(o);

		Constructor<Employee> constructor1 = employeeClass.getConstructor();
		Employee obj1 = constructor1.newInstance();

		Constructor constructor2 = employeeClass.getConstructor(int.class,
				String.class, String.class);
		Object obj2 = constructor2.newInstance(5, "Anna", "IT");
		System.out.println(obj2);

		Method method = employeeClass.getMethod("setSalary", double.class);
		method.invoke(obj2, 800.88);
		System.out.println(obj2);
	}
}
