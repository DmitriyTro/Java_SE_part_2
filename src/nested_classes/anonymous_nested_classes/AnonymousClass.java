package nested_classes.anonymous_nested_classes;

public class AnonymousClass {
	private int x = 5;

	public static void main(String[] args) {
		Math m = new Math(){
			int c = 10;
			void abc(){}
			@Override
			public int doOperation(int a, int b) {
				AnonymousClass ac = new AnonymousClass();
				return a + b + ac.x;
			}
		};

		System.out.println(m.doOperation(3, 7));

		Math2 m2 = new Math2(){
			@Override
			public int doOperation(int a, int b) {
				return a * b;
			}
		};

		System.out.println(m2.doOperation(3, 3));
	}
}

interface Math {
	int doOperation(int a, int b);
}

class Math2 {
	int doOperation(int a, int b) {
		return a / b;
	}
}