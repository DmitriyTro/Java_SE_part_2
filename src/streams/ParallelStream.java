package streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	// 1 2 3 4 5 ... 1_000_000_000
	// 1 p: 250_000_000
	// 2 p: 250_000_001 to 500_000_000
	// 3 p: 500_000_001 to 750_000_000
	// 4 p: 750_000_001 to 1_000_000_000

	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(10.0);
		list.add(5.0);
		list.add(1.0);
		list.add(0.25);

		double sumResult = list.parallelStream()
				.reduce((a, e) -> a + e).get();
		System.out.println("sum : " + sumResult);
	}
}
