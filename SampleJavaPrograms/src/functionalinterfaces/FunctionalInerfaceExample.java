package functionalinterfaces;

public class FunctionalInerfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface2 functionalInterface = new FunctionalInterfaceImpl();
		functionalInterface.myFunc();
	}

}
