package threads;

public class PrintMyNumbers {

	public static void main(String[] args) {
		MyNumber myNumber = new MyNumber();
		myNumber.setNumber(new Integer(0));
		PrintMyEvenNumber evenNumber = new PrintMyEvenNumber(myNumber);
		PrintMyOddNumber oddNumber = new PrintMyOddNumber(myNumber);
		Thread thread = new Thread(evenNumber);
		Thread thread2 = new Thread(oddNumber);
		thread.start();
		thread2.start();
	}

}
