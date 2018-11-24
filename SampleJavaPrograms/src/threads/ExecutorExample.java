package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> submit = service.submit(new MyCallable());
		try {
			System.out.println(submit.get());
		} catch (InterruptedException | ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// service.shutdown();
		try {
			if (service.awaitTermination(2, TimeUnit.SECONDS)) {
				System.out.println(submit.get());
			}
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
