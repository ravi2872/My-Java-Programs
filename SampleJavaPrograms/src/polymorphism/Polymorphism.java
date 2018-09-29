package polymorphism;

interface A {

}

class B implements A {
	void print() {
		System.out.println("Print");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		A a = new B();
		((B) a).print();
	}

}
