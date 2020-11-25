package amrib.javaversion14;

import java.util.Arrays;
import java.util.List;

public class JavaVersion14 {

	public static void main(String[] args) {
		var string1 = "Le mot cle (var) vaut toutes les type primitif, wrapper ou object";
		var string2 = new String("Hello from Home");
		var integer = 15;
		var doubles = 15.32;
		var chars = 'A';
		var booleans = true;
		var list1 = List.of(5, 6, 4, 5, 6, 88, 9, 5, 4);
		var list2 = Arrays.asList("red", "green", "blue", "black");
		System.out.println("******************************");
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(integer);
		System.out.println(doubles);
		System.out.println(chars);
		System.out.println(booleans);
		System.out.println(list1);
		System.out.println(list2);
	}
}
