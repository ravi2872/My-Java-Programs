package threads;

public class PrintMyEvenNumber implements Runnable {

	private MyNumber myNumber;

	public PrintMyEvenNumber(MyNumber myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	synchronized public void run() {
		if (myNumber.getNumber() % 2 == 0) {
			System.out.println(myNumber);
			myNumber.setNumber(myNumber.getNumber() + 1);
		}
		try {
			myNumber.notify();
			myNumber.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
