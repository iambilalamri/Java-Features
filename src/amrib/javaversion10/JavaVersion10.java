package amrib.javaversion10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaVersion10 {

	public static void main(String[] args) {

		/**
		 * On peut remplacer le type "Integer" et "List<Integer>" par le mot clé "var"
		 * var numbers = List.of(1,2,3,4,5,6,7,8,9); 
		 * ou var numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
		// inferred value ArrayList<String>
		// Index of Enhanced For Loop
		System.out.println("Loop1: ");
		for (Integer number : numbers) {
			System.out.print(number + ",");
		}
		System.out.println("");
		// Local variable declared in a loop
		System.out.println("Loop2: ");
		for (Integer i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + ",");
		}
		System.out.println();
		System.out.println("**********************************");
		List<String> actors = new ArrayList<>();
		actors.add("Jack Nicholson");
		actors.add("Marlon Brando");
		System.out.println("1: " + actors); // prints [Jack Nicholson, Marlon Brando]
		// New API added - Creates an UnModifiable List from a List.
		List<String> copyOfActors = List.copyOf(actors);
		System.out.println("2: " + copyOfActors); // prints [Jack Nicholson, Marlon Brando]
		// copyOfActors.add("Robert De Niro"); Will generate an
		// UnsupportedOperationException
		actors.add("Robert De Niro");
		System.out.println("3: " + actors);// prints [Jack Nicholson, Marlon Brando, Robert De Niro]
		System.out.println("4: " + copyOfActors); // prints [Jack Nicholson, Marlon Brando]

		String str = "";
		Optional<String> name = Optional.ofNullable(str);
		// New API added - is preferred option then get() method
		name.orElseThrow(); // same as name.get()

		// New API added - Collectors.toUnmodifiableList
		List<String> collect = actors.stream().collect(Collectors.toUnmodifiableList());
		// collect.add("Tom Hanks"); // Will generate an
		// UnsupportedOperationException
	}
}
