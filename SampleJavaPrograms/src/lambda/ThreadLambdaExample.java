package lambda;

public class ThreadLambdaExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Print Inside Runnable");
			}
		});

		thread.start();

		Thread thread2 = new Thread(() -> System.out.println("Print Inside Runnable Lambda"));
		thread2.start();
	}

}
