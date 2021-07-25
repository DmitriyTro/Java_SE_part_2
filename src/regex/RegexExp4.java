package regex;

public class RegexExp4 {
	public static void main(String[] args) {
		String s1 = "Privet,   moy drug!       Kak       dela?";
		System.out.println(s1);

//		s1 = s1.replace("Kak", "Java");

//		s1 = s1.replaceAll(" {2,}", " ");

//		s1 = s1.replaceAll("\\bd\\w+", "4444");

		s1 = s1.replaceFirst("\\bd\\w+", "4444");

		System.out.println(s1);
	}
}
