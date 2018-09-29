package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortObjects {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee("3"));
		set.add(new Employee("2"));
		set.add(new Employee("1"));

		List<Employee> list = new ArrayList<>(set);
		Collections.sort(list);
		list.forEach(s -> System.out.println(s.getEmpId()));
	}

}
