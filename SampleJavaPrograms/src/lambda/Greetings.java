package lambda;

public interface Greetings {
	void sayHello(String s);

	default void sayHai() {
		System.out.println("Ravi");
	}
}
