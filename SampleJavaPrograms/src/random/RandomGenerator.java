package random;

import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("A" + getRandomNumber());
		}
	}

	private static int getRandomNumber() {
		Random random = new Random();
		int val = random.nextInt(100000);
		if (val > 10000) {
			return val;
		}
		return getRandomNumber();
	}

}
