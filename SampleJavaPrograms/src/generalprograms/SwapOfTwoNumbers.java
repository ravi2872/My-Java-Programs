package generalprograms;

public class SwapOfTwoNumbers {
	public static void main(String[] args) {
		System.out.println("Swapping of 2 numbers");
		int a = 2, b = 3;
		System.out.println("a =" + a + " b = " + b);
		a = a + b; // a = 5, b = 3
		b = a - b; // a=5, b=2
		a = a - b; // a=3, b=2
		System.out.println("After Swap");
		System.out.println("a =" + a + " b = " + b);
	}
}
