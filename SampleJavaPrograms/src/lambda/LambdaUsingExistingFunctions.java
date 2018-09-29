package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import streams.Person;

public class LambdaUsingExistingFunctions {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Ravi", 29, (float) 20000.00),
				new Person("kumar", 28, (float) 20000.00), new Person("Raja", 32, (float) 33000.00),
				new Person("santu", 28, (float) 24400.00), new Person("chandu", 26, (float) 12300.00),
				new Person("parmesh", 31, (float) 11000.00), new Person("parmesh1", 31, (float) 11000.00));

		Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));

		System.out.println("\nWith Own Condition \n");

		printValuesWithCondition(list, p -> p.getName().startsWith("c"));

		System.out.println("\nWith existing Condition \n");

		printValuesWithExistingCondition(list, s -> s.getName().startsWith("R"));

		System.out.println("\nWith existing Conditions \n");

		printValuesWithExistingConditions(list, s -> s.getName().startsWith("R"),
				person -> System.out.println(person.getName()));
	}

	private static void printValuesWithCondition(List<Person> list, Condition condition) {
		for (Person person : list) {
			if (condition.test(person)) {
				System.out.println(person.getName() + " " + person.getAge() + " " + person.getSal());
			}
		}
	}

	private static void printValuesWithExistingCondition(List<Person> list, Predicate<Person> predicate) {
		for (Person person : list) {
			if (predicate.test(person)) {
				System.out.println(person.getName() + " " + person.getAge() + " " + person.getSal());
			}
		}
	}

	private static void printValuesWithExistingConditions(List<Person> list, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : list) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}
