package series;

import java.util.Scanner;

public class FebonicceSeries {
	public static void main(String[] args) {
		System.out.println("Enter number upto which Fibonacci series to print: ");
		int num = new Scanner(System.in).nextInt();
		int prev = 0;
		int feb = 1;
		for (int i = 0; i < num; i++) {
			if (i == 0 || i == 1) {
				System.out.print(i + " ");
				continue;
			}
			feb = feb + prev;
			System.out.print(feb + " ");
			prev = feb;
		}
	}
}
