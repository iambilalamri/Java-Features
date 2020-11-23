package javaversion8;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;

public class JavaVersion8 {

	public static void main(String[] args) {
		System.out.println("Hello Java version 8");
		List<String> colors = Arrays.asList("red", "green", "blue", "yellow", "gray", "white", "black");
		double[] numbers = { 12.2, 15.3, 14, 36.1, 4.6, 12.7, 1.5 };
		List<String> names = Arrays.asList("Larry", "Steve", "James");

		/**
		 * Functional Interface: Implementation utilisant une expression Lambda
		 */
		FunctionnaInterface obj1 = () -> System.out.println("Implementation de la fonction1()");
		obj1.function1();
		System.out.println(obj1.addOperand(15, 30));
		obj1.modulo(15, 4);
		FunctionnaInterface.print("Static method implemented in interface in JAVA");
		/**
		 * Expection Lambda
		 */
		names.stream().filter(name -> name.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);
		colors.forEach(color -> System.out.print(color + ","));

		/**
		 * Parallel Array Sorting
		 */
		System.out.println("\n*****************************");
		for (double i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println("");
		Arrays.parallelSort(numbers);
		System.out.println("Eléments du tableau après le tri");
		for (double i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println("\n*****************************");
		
		/**
		 * Java TIME
		 */
		// Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date=" + today);

		// Creating LocalDate by providing input arguments
		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Specific Date=" + firstDay_2014);

		// Try creating date by providing invalid inputs
		// LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
		// Exception in thread "main" java.time.DateTimeException:
		// Invalid date 'February 29' as '2014' is not a leap year

		// Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST=" + todayKolkata);

		// java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
		// LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));

		// Getting date from the base date i.e 01/01/1970
		LocalDate dateFromBase = LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date= " + dateFromBase);

		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
		System.out.println("100th day of 2014=" + hundredDay2014);
	}
}
