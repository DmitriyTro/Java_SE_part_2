package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class Exp1 {
	public static void main(String[] args) throws ClassNotFoundException,
			NoSuchFieldException, NoSuchMethodException {
		Class employeeClass1 = Class.forName("reflection.Employee");
//		Class employeeClass2 = Employee.class;
//
//		Employee emp = new Employee();
//		Class employeeClass3 = emp.getClass();

//		Field someField = employeeClass1.getField("id");
//		System.out.println("Type of id field = " + someField.getType());

//		Field[] fields = employeeClass1.getFields();
//		for (Field field : fields) {
//			System.out.println("Type of " + field.getName() + " " + field.getType());
//		}
//
//		System.out.println("*****************");
//
//		Field[] allFields = employeeClass1.getDeclaredFields();
//		for (Field field : allFields) {
//			System.out.println("Type of " + field.getName() + " " + field.getType());
//		}

//		Method someMethod1 = employeeClass1.getMethod("increaseSalary");
//		System.out.println("Return type = " + someMethod1.getName() + " "
//				+ someMethod1.getReturnType() + ", parameter types = " + Arrays.toString(someMethod1.getParameterTypes()));
//
//		System.out.println("******************");
//
//		Method someMethod2 = employeeClass1.getMethod("setSalary", double.class);
//		System.out.println("Return type = " + someMethod2.getName() + " "
//				+ someMethod2.getReturnType() + ", parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));

//		Method[] methods = employeeClass1.getMethods();
//		for (Method method : methods) {
//			System.out.println("Name of method = " + method.getName() + ", return type = " + method.getName() + " "
//					+ method.getReturnType() + ", parameter types = " + Arrays.toString(method.getParameterTypes()));
//		}

//		System.out.println("******************");
//
//		Method[] allMethods = employeeClass1.getDeclaredMethods();
//		for (Method method : allMethods) {
//			System.out.println("Name of method = " + method.getName() + ", return type = " + method.getName() + " "
//					+ method.getReturnType() + ", parameter types = " + Arrays.toString(method.getParameterTypes()));
//		}
//
//		System.out.println("******************");
//
//		Method[] allMethods2 = employeeClass1.getDeclaredMethods();
//		for (Method method : allMethods2) {
//			if (Modifier.isPublic(method.getModifiers())) {
//				System.out.println("Name of method = " + method.getName() + ", return type = " + method.getName() + " "
//						+ method.getReturnType() + ", parameter types = " + Arrays.toString(method.getParameterTypes()));
//			}
//		}

//		Constructor constructor1 = employeeClass1.getConstructor();
//		System.out.println("Constructor has " + constructor1.getParameterCount() +
//				" parameters, their types are: " + Arrays.toString(constructor1.getParameterTypes()));
//
//		System.out.println("*******************");
//
//		Constructor constructor2 = employeeClass1.getConstructor(int.class, String.class, String.class);
//		System.out.println("Constructor has " + constructor2.getParameterCount() +
//				" parameters, their types are: " + Arrays.toString(constructor2.getParameterTypes()));

		Constructor[] constructors = employeeClass1.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("Constructor " + constructor.getName() + ", has " + constructor.getParameterCount() +
					" parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));
		}
	}
}