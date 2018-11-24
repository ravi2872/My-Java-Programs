package sapient;

public class Test2 {
	void display(Test t) {
		System.out.println("Test");
	}

	void display(String t) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		new Test().display(null);
	}
}
