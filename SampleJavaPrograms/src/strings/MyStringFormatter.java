package strings;

import java.util.Locale;

public class MyStringFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is %s format example";
		System.out.println(String.format(str, "string"));
		String str1 = "We are displaying no %d";
		System.out.println(String.format(str1, 10));
		/**
		 * String format by specifying Locale details
		 */
		System.out.println("String format with Locale info:");
		System.out.println(String.format(Locale.CHINA, str1, 10));
	}

}
