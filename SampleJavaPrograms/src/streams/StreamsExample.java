package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Ravi", 29, (float) 20000.00),
				new Person("kumar", 28, (float) 20000.00), new Person("Raja", 32, (float) 33000.00),
				new Person("santu", 28, (float) 24400.00), new Person("chandu", 26, (float) 12300.00),
				new Person("parmesh", 31, (float) 11000.00), new Person("parmesh1", 31, (float) 11000.00));

		List<Person> list2 = Arrays.asList(new Person("Ravi", 29, (float) 20000.00),
				new Person("Ravi", 28, (float) 20000.00), new Person("Ravi", 32, (float) 33000.00),
				new Person("Ravi", 28, (float) 24400.00), new Person("Ravi", 26, (float) 12300.00),
				new Person("Ravi", 31, (float) 11000.00), new Person("Ravi", 31, (float) 11000.00));

		List<Person> finalList = new ArrayList<>();

		// List<Person> list2 = new ArrayList<>();
		list.stream().forEach(s -> System.out.println(s.getName() + " " + s.getAge() + " " + s.getSal()));
		boolean allMatch = list2.stream().allMatch(p -> p.getName().equals("Ravi"));
		System.out.println("allMatch: " + allMatch);
		System.out.println("\nSal < 15000\n");
		finalList = list.stream().filter(p -> p.getSal() < 15000f).collect(Collectors.toList());
		finalList.stream().forEach(p -> System.out.println(p.getName() + " " + p.getAge() + " " + p.getSal()));

		// System.out.println("\nSort with Age\n");
		//
		// Comparator<Person> salComparator2 = (Person p1, Person p2) ->
		// p1.getAge() - p2.getAge();
		// Collections.sort(list, salComparator2);
		// list.forEach(p -> System.out.println(p.getName() + " " + p.getAge() +
		// " " + p.getSal()));

		System.out.println("\nSort With name :\n");
		list.sort((p1, p2) -> p2.getName().compareTo(p1.getName()));
		list.forEach(p -> System.out.println(p.getName() + " " + p.getAge() + " " + p.getSal()));
	}

}
