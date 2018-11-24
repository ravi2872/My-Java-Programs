package generalprograms;

public class PalindromCheck {

	public static void main(String[] args) {
		boolean palindromeString = isPalindromeString("asddsa");
		if (palindromeString) {
			System.out.println("palindromeString");
		} else {
			System.out.println("Not palindromeString");
		}
	}

	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
		System.out.println(length / 2);
		for (int i = 0; i < length / 2; i++) {

			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}

}
