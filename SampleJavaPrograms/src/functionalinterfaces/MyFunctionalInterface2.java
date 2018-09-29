package functionalinterfaces;

public interface MyFunctionalInterface2 {
	default int myFunc() {
		System.out.println("My Func2");
		return 0;
	}
}
