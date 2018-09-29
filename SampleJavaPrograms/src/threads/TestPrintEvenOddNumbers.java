package threads;

public class TestPrintEvenOddNumbers {

	public static void main(String[] args) {
		PrintEvenNumbers even = new PrintEvenNumbers();
		Thread evenThread = new Thread(even);
		PrintOddNumbers odd = new PrintOddNumbers();
		Thread oddThread = new Thread(odd);
		evenThread.start();
		oddThread.start();

	}

}
