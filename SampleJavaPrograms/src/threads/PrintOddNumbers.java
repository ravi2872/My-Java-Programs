package threads;

public class PrintOddNumbers extends Thread {

	@Override
	public void run() {
		try {
			printOddNumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized void printOddNumber() throws InterruptedException {
		System.out.println("Printing Odd Number");
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				Thread.sleep(1000);
				notify();
				wait();
			}
		}
	}
}
