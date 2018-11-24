package threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Thread.sleep(10000);
		throw new Exception();
	}

}
