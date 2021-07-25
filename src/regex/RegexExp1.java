package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExp1 {
	public static void main(String[] args) {
		String s =
				"Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
						" email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
						" Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
						" email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
						" Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
						" email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

//		Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//		Pattern pattern = Pattern.compile("\\+\\d{9}");
//		Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
//		String s1 = "poka abc       Zaur  dom   kino  abdffewew";
//		Pattern pattern = Pattern.compile("\\w\\s+\\w");
//		String s1 = "abcd abc3 abd78ffewew";
//		Pattern pattern = Pattern.compile("\\D{2,6}");

//		String s1 = "ABCABABCABC";
//		Pattern pattern = Pattern.compile("(AB){2,3}");

//		String s1 = "ABCABABCABCDABABABDDABBAD";
//		Pattern pattern = Pattern.compile("D(AB){2,3}");

//		String s1 = "ABCABABCABCDABABABDDABBAD";
//		Pattern pattern = Pattern.compile("D(AB)?");

//		String s1 = "ABCABABCABCDABABABDDABBAD";
//		Pattern pattern = Pattern.compile("D(AB)*");

//		String s1 = "abcd adce adcfaabcgabc";
//		Pattern pattern = Pattern.compile("\\Aabcd");

		String s1 = "abcd adce adcfaabcgabc";
		Pattern pattern = Pattern.compile("abc\\z");
		Matcher matcher = pattern.matcher(s1);

		while (matcher.find()) {
			System.out.println("Position: " + matcher.start() + "   " + matcher.group());
		}
	}
}
