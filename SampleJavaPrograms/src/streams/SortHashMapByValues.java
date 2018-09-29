package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValues {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("ABC", "DEF");
		map.put("DEF", "ABC");
		map.put("XYZ", "XYZ");
		System.out.println(map);

		sortMapByValues(map);
	}

	private static void sortMapByValues(Map<String, String> map) {
		Set<Entry<String, String>> entries = map.entrySet();
		List<Entry<String, String>> list = new ArrayList<>(entries);
		Collections.sort(list, new Comparator<Entry<String, String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		System.out.println(list);
		list.stream().forEach(s -> System.out.println(s.getKey() + "   " + s.getValue()));
	}

}
