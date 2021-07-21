package multithreading;

public class InterruptionExp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main starts");

		InterruptedThread thread = new InterruptedThread();
		thread.start();
		Thread.sleep(2000);
		thread.interrupt();

		thread.join();
		System.out.println("main ends");
	}
}

class InterruptedThread extends Thread {
	double sqrtSum = 0;

	@Override
	public void run() {
		for (int i = 1; i <= 1_000_000_000; i++) {
			if (isInterrupted()) {
				System.out.println("Поток хотят прервать");
				System.out.println(sqrtSum);
				return;
			}
			sqrtSum += Math.sqrt(i);
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				System.out.println("Поток хотят прервать во время сна");
				System.out.println(sqrtSum);
				return;
			}
		}
		System.out.println(sqrtSum);
	}
}