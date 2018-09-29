package functionalinterfaces;

public interface MyFunctionalInterface {
	default int myFunc() {
		System.out.println("My Func");
		return 0;
	}
}
