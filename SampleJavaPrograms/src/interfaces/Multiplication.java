package interfaces;

interface Multiplication {
	int multiply(int a, int b);

	default int square(int a) {
		return multiply(a, a);
	}
}
