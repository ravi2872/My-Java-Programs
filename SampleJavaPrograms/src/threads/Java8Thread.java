package threads;

public class Java8Thread {

	public static void main(String args) {
		new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread Finished");
		}).start();
	}

}
