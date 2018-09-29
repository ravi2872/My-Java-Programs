package strings;

public class StringPoolEx {

	public static void main(String[] args) {
		String str = "asdsa";
		StringBuffer sb = new StringBuffer("sdfsd");
		StringBuilder sbld = new StringBuilder("adada");
		// String str2 = new String("Ravi");
		// str2.intern();
		// str.subSequence(0, 5);
		// foo(null);

		str.hashCode();
		sb.hashCode();
		sbld.hashCode();
		String s1 = "abc";
		String s2 = new String("abc");
		s2 = s2.intern();
		str.substring(0, 2);
		System.out.println(s1 == s2);

	}

	// public static void foo(String s) {
	// System.out.println("String");
	// }

	public static void foo(Object sb) {
		System.out.println("Object");
	}

	public static void foo(Exception sb) {
		System.out.println("Exception");
	}

	public static void foo(NullPointerException sb) {
		System.out.println("NullPointerException");
	}

	private static boolean isPalindrome(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}
}
