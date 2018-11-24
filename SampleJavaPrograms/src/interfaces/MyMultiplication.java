package interfaces;

public class MyMultiplication {
	public static void main(String[] args) {
		Multiplication product = new Multiplication() {

			@Override
			public int multiply(int x, int y) {
				return x * y;
			}
		};

		int square = product.square(2);
		int multiplication = product.multiply(2, 3);
		System.out.println(square + "   " + multiplication);
	}
}
