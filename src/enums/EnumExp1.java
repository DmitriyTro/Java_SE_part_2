package enums;

public class EnumExp1 {

	void method(String dayOfWeek) {
		System.out.println("Today is " + dayOfWeek);
	}

	public static void main(String[] args) {
		EnumExp1 e = new EnumExp1();
		e.method("Monday");
	}
}
