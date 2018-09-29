package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import streams.Person;

public class Unit1Excercise {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Ravi", 29, (float) 20000.00),
				new Person("kumar", 28, (float) 20000.00), new Person("Raja", 32, (float) 33000.00),
				new Person("santu", 28, (float) 24400.00), new Person("chandu", 26, (float) 12300.00),
				new Person("parmesh", 31, (float) 11000.00), new Person("parmesh1", 31, (float) 11000.00));

		System.out.println("\n Sort List By Name\n");

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		// printAll(list);

		// list.sort((Person p1, Person p2) ->
		// p1.getName().compareTo(p2.getName()));

		// prints the names which all persons starts with "c"
		printNameStartsWithC(list);
		printNameStartsWithCConditionally(list, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getName().startsWith("c");
			}
		});
	}

	private static void printNameStartsWithCConditionally(List<Person> list, Condition condition) {
		for (Person person : list) {

		}
	}

	private static void printNameStartsWithC(List<Person> list) {
		for (Person person : list) {
			if (person.getName().startsWith("c")) {
				System.out.println(person.getName() + " " + person.getAge() + " " + person.getSal());
			}
		}
	}

	private static void printAll(List<Person> list) {
		list.stream().forEach(s -> System.out.println(s.getName() + " " + s.getAge() + " " + s.getSal()));
	}

}

interface Condition {
	boolean test(Person p);
}
