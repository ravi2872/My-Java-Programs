package overriding;

public class Child extends Parent {
	public void display() throws RuntimeException {
		System.out.println("Child Display");
	}

	public void display(String name) {
		System.out.println("Child Display: " + name);
	}
}
