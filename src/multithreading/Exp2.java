package multithreading;

public class Exp2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
//		MyThread1 myThread1 = new MyThread1();
//		MyThread2 myThread2 = new MyThread2();
//		myThread1.start();
//		myThread2.start();


		Exp2 thread = new Exp2();
		thread.start();


		for (int i = 1000; i > 0; i--) {
			System.out.println(i);
		}

	}
}

//class MyThread1 extends Thread {
//
//	@Override
//	public void run() {
//		for (int i = 1; i <= 1000; i++) {
//			System.out.println(i);
//		}
//	}
//}
//
//class MyThread2 extends Thread {
//
//	@Override
//	public void run() {
//		for (int i = 1000; i > 0; i--) {
//			System.out.println(i);
//		}
//	}
//}