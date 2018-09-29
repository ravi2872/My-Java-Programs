import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
public class ABC extends Thread implements Runnable {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		HashMap hashMap = new HashMap();
		hashMap.put("1", "dfsd");
		hashMap.put(2, "xf");
		try {
			Thread t = new Thread(new ABC());
			t.start();
		} catch (Exception e) {
			System.out.println("dfsdf");
		}
	}
}
