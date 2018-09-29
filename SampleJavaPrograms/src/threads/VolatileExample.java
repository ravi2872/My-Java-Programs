package threads;

public class VolatileExample {
	private static volatile boolean active;

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				while (active) {
				}
				System.out.println("Started");

				while (!active) {
				}
				System.out.println("Stopped");
			}
		});
		t1.start();
		System.out.println("Starting");
		Thread.sleep(1000);
		active = true;

		Thread.sleep(1000);
		System.out.println("Stopping");
		active = false;
	}

}
