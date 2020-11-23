package amrib.javaversion11;

import java.util.stream.Collectors;

public class JavaVersion11 {

	public static void main(String[] args) {

		// Méthode isBlank()
		String s = "Anupam";
		System.out.println(s.isBlank()); // false
		String s1 = "";
		System.out.println(s1.isBlank()); // true
		// Methode Lignes()
		String str = "JD\nJD\nJD";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));

		// Methode strip() = trim()
		String str2 = " JD ";
		System.out.print("Start");
		System.out.print(str2.strip());
		System.out.println("End");
		// Methode stripLeading()
		System.out.print("Start");
		System.out.print(str2.stripLeading());
		System.out.println("End");
		// Methode stripTrailing()
		System.out.print("Start");
		System.out.print(str2.stripTrailing());
		System.out.println("End");

		// Methode repeat()
		String str3 = "=".repeat(2);
		System.out.println(str3); // prints ==
	}

}
