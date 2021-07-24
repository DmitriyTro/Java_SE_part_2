package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExp2 {
	public static void main(String[] args) {
//		String s1 = "ABCD ABCE ABCFABCGABCH";
//		Pattern pattern1 = Pattern.compile("ABC");

//		String s1 = "ABDOP";
//		Pattern pattern1 = Pattern.compile("AB[C-F]OP");

//		String s1 = "abcd abce abc5abcg6abch";
//		Pattern pattern1 = Pattern.compile("abc[e-g4-7]");

//		String s1 = "abcd abce abc5abcg6abch";
//		Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");

//		String s1 = "abcd abce abc5abcg6abch";
//		Pattern pattern1 = Pattern.compile("abc(e|5)");

//		String s1 = "abcd abce abc5abcg6abch";
//		Pattern pattern1 = Pattern.compile("abc.");

//		String s1 = "abcd abce abc5abcg6abch";
//		Pattern pattern1 = Pattern.compile("^abc.");

//		String s1 = "abcd abce abc5abcg6abch";
//		Pattern pattern1 = Pattern.compile("abch$");

//		String s1 = "abcd abce abc5abcg6abch";
//		Pattern pattern1 = Pattern.compile("\\d");

//		String s1 = "abcd abce abc5abcg6abch";
//		Pattern pattern1 = Pattern.compile("\\w");

//		String s1 = "abcd abce abc5abcg6abch";
//		Pattern pattern1 = Pattern.compile("\\w+");

		String s1 = "abcd abce abc5abcg6abch";
		Pattern pattern1 = Pattern.compile("\\w{4}");

		Matcher matcher1 = pattern1.matcher(s1);
		while (matcher1.find()) {
			System.out.println("Position: " + matcher1.start() + "   " + matcher1.group());
		}
	}
}
