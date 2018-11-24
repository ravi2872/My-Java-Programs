package sapient;

class Parent1 {
	Child1 test(int i) {
		System.out.println("Parent");
		return null;
	}
}

class Child1 extends Parent1 {
	Parent1 test(int i) {
		System.out.println("Child");
		return null;
	}
}

public class Test6 {

	public static void main(String[] args) {
		Parent1 p = new Child1();
		p.test(5);
	}

}
