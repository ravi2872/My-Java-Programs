package sapient;

class Parent {
	static void test() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	static void test() {
		System.out.println("Child");
	}
}

public class Test4 {

	public static void main(String[] args) {
		Parent p = new Child();
		p.test();
	}

}
