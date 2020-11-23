package amrib.javaversion9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class JavaVersion9 {

	public static void main(String[] args) {
		List list1 = List.of();
		System.out.println(list1);

		List list2 = List.of("Banane", "Pomme", "Fraise", "Abricot");
		System.out.println(list2);

		System.out.println("*************************");
		Map map1 = Map.of();
		System.out.println(map1);

		Map<String, String> map2 = new HashMap();
		map2.put("name", "John travis");
		map2.put("age", "27");
		map2.put("dateBirth", "15-12-2019");
		map2.put("hobbies", "Futsal");
		System.out.println(map2);

		System.out.println("*************************");
		Set set1 = Set.of();
		System.out.println(set1);

		Set<String> set2 = new HashSet<>();
		set2.add("value1");
		set2.add("value1");
		set2.add("value3");
		set2.add("value4");
		System.out.println(set2);

		System.out.println("*************************");
		Map.Entry<Integer, String> immutableMapEntry1 = Map.entry(1, "one");
		System.out.println(immutableMapEntry1);
		Map.Entry<Integer, String> immutableMapEntry2 = Map.entry(2, "two");
		System.out.println(immutableMapEntry2);
		Map.Entry<Integer, String> immutableMapEntry3 = Map.entry(3, "three");
		System.out.println(immutableMapEntry3);
		Map<Integer, String> immutableMap = Map.ofEntries(immutableMapEntry1, immutableMapEntry2, immutableMapEntry3);
		System.out.println(immutableMap);

		System.out.println("***************************");
		// Take the part which respect the condition
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> i < 7).forEach(System.out::println);
		System.out.println("***************************");
		// Drop the part which respect the condition
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(i -> i < 5).forEach(System.out::println);

	}
}
