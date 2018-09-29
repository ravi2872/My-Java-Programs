package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExceptionThread {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(10000);
					System.out.println("Finished: " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				throw new RuntimeException();
			}
		});
		executor.submit(t);

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(2000);
					System.out.println("Finished: " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				throw new RuntimeException();
			}
		});
		executor.submit(t2);
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		System.out.println("In Main");
		executor.shutdown();
		while (!executor.awaitTermination(2, TimeUnit.SECONDS)) {
			System.out.println("Waiting... for threads to complete");
		}
		System.out.println("In Main Finished");
	}

}
