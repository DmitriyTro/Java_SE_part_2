package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(3);

		int result = list.stream().reduce((accumulator, element) ->
				accumulator * element).get();
		System.out.println(result);
//		 5, 8, 2, 4, 3
//		 accumulator = 5 (5*8) = 40 (40*2) = 80 (80*4) = 320 (320*3) = 960
//		 element =     8          2           4           3

		int result2 = list.stream().reduce(1, (accumulator, element) ->
				accumulator * element);
		System.out.println(result2);
//		5, 8, 2, 4, 3
//		 accumulator = 1 (5*1) = 5 (5*8) = 40 (40*2) = 80 (80*4) = 320 (320*3) = 960
//		 element =     5         8          2           4           3

//		List<Integer> list10 = new ArrayList<>();
//		Optional<Integer> o = list10.stream().reduce((accumulator, element) ->
//				accumulator * element);
//		if (o.isPresent()) {
//			System.out.println(o.get());
//		} else {
//			System.out.println("Not present");
//		}

		List<String> list3 = new ArrayList<>();
		list3.add("privet");
		list3.add("kak dela?");
		list3.add("ok");
		list3.add("poka");

		String result3 = list3.stream().reduce((a, e) ->
				a + " " + e).get();
		System.out.println(result3);
	}
}