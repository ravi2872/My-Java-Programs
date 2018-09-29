package overriding;

public class Parent {
	public void display() {
		System.out.println("Parent Display");
	}

	public void display(String name) {
		System.out.println("Parent Display: " + name);
	}
}
