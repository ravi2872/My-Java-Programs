package lambda.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import streams.Person;

public class MethodReferenceExample {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Ravi", 29, (float) 20000.00),
				new Person("kumar", 28, (float) 20000.00), new Person("Raja", 32, (float) 33000.00),
				new Person("santu", 28, (float) 24400.00), new Person("chandu", 26, (float) 12300.00),
				new Person("parmesh", 31, (float) 11000.00), new Person("parmesh1", 31, (float) 11000.00));

		// Using For Each Loop
		System.out.println("Using For Each Loop");
		for (Person s : list) {
			System.out.println(s.getName() + " " + s.getAge() + " " + s.getSal());
		}

		// using lambda expressions
		System.out.println("\nusing lambda expressions");

		list.forEach(s -> System.out.println(s.getName() + " " + s.getAge() + " " + s.getSal()));

		// Using Method Reference

		System.out.println("\n Using Method Reference");

		Consumer<String> c = System.out::println;
		list.stream().filter(p -> p.getName().startsWith("R")).forEach(MethodReferenceExample::printMessage);

		System.out.println("\n Using Method Reference Predicate");
		list.stream().filter(MethodReferenceExample::myCondition).forEach(MethodReferenceExample::printMessage);

	}

	private static void printMessage(Person s) {
		System.out.println(s.getName() + " " + s.getAge() + " " + s.getSal());
	}

	private static boolean myCondition(Person s) {
		return s.getName().startsWith("R");
	}

	public void sayHi(String msg) {
		System.out.println("Hi " + msg);
	}
}
