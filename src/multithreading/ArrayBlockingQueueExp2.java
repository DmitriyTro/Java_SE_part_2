package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExp2 {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue =
				new ArrayBlockingQueue<>(4);

		// Producer
		new Thread(() -> {
			int i = 0;
			while (true) {
				try {
					queue.put(++i);
					System.out.println("Producer dobavil: " + i + " " + queue);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		// Consumer
		new Thread(() -> {
			int i = 0;
			while (true) {
				try {
					Integer j = queue.take();
					System.out.println("Consumer zabral: " + j + " " + queue);
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}
