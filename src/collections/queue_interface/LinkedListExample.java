package collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Anna");
		queue.add("Oleg");
		queue.add("Ivan");
		queue.add("Mariya");
		queue.offer("Aleksandr");
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue.element());
		System.out.println();
		System.out.println(queue.poll());
		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.remove("Mariya"));
		System.out.println(queue);
	}
}
