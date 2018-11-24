package sapient;

import java.util.HashMap;
import java.util.Iterator;

public class Test7 {
	public static void main(String[] args) {
		int i = 0;
		while (true) {
			if (i++ == 4) {
				break;
			}
			++i;
		}
		System.out.println("i = " + (i++));
		HashMap map = new HashMap<>();
		map.put("1", "two");
		map.put(2, "four");
		System.out.println(map);
		Iterator iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}
}
