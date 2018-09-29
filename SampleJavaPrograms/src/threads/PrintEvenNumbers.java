package threads;

public class PrintEvenNumbers extends Thread {

	@Override
	public void run() {
		try {
			printEvenNumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized void printEvenNumber() throws InterruptedException {
		System.out.println("Printing Even Number");
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				Thread.sleep(1000);
				notify();
				if (i != 0) {
					wait();
				}
			}
		}
	}

}
