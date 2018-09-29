package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExceptionThreadPool {
	private static int myInt;

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		List<Future<Integer>> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			myInt = i;
			Future<Integer> future = es.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					System.out.println("** Started " + myInt);
					if (myInt == 4 || myInt == 8) {
						throw new RuntimeException();
					}
					Thread.sleep(2000);
					return myInt;
				}
			});
			list.add(future);
		}
		for (Future<Integer> future : list) {
			try {
				System.out.println(future.get());
			} catch (ExecutionException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
