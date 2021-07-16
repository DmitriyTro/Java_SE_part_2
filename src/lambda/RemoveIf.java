package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
	public static void main(String[] args) {
		ArrayList<String> aL = new ArrayList<>();
		aL.add("Hello");
		aL.add("Bye");
		aL.add("Ok");
		aL.add("lambdas");
		aL.add("java");
		aL.removeIf(element -> element.length() < 5);
//		Predicate<String> pr = element -> element.length() < 5;
//		aL.removeIf(pr);
		System.out.println(aL);
	}
}
