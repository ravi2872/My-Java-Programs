package threads.producerconsumer;

public class MyObject {
	private int number;

	public void getNumber() {
		System.out.println("Cosuming: " + number);
	}

	public void setNumber(int number) {
		this.number = number;
		System.out.println("Producing: " + number);
	}

}
