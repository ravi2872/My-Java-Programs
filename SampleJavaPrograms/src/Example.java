import java.util.HashSet;

public class Example {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("D");
		set.add("B");
		set.add("A");
		System.out.println(set);
	}

	static final int hash(Object key) {
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}
}
