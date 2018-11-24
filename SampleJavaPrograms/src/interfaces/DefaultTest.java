package interfaces;

public class DefaultTest {
	public static void main(String[] args) {
		Interface1 interface1 = new InterfaceImpl();
		interface1.myMethod();
		interface1.hashCode();
	}
}
