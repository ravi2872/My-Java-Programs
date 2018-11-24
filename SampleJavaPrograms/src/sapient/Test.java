package sapient;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		/*
		 * float f = \u0038; System.out.println(f);
		 */
		int i = 2;
		int x[] = { 10, 20, 50, 45, 95, 14 };
		x[i] = x[i = i + 1];
		System.out.println(x[i]);
	}

	private static int check() {
		try {
			throw new IOException();
		} catch (Exception e) {
			System.out.println("catch");
			return 1;
		} finally {
			System.out.println("finally");
			return 1;
		}
	}

}
