package maps;

public class Modular {

	public static void main(String[] args) {
		final int HASH_BITS = 0x7fffffff;
		String str = "ABC";
		int hashCode = str.hashCode();
		int i = (hashCode ^ (hashCode >>> 16)) & HASH_BITS;
		System.out.println(hashCode + "   " + i);
	}

}
