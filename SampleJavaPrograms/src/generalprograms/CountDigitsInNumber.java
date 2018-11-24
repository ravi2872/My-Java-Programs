package generalprograms;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		System.out.println();

	}

	private int countOfDigits(long value) {
		int count = 0;

		for (; value != 0; value /= 10, ++count) {
		}

		return count;
	}
}
