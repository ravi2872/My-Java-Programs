package functionalinterfaces;

public class FunctionalInterfaceImpl implements MyFunctionalInterface, MyFunctionalInterface2 {

	@Override
	public int myFunc() {
		System.out.println("Func Impl");
		return MyFunctionalInterface.super.myFunc();
	}

}
