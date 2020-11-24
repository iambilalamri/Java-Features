package amrib.javaversion12;

import java.text.NumberFormat;
import java.util.Locale;

public class JavaVersion12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Compact Formatting is:");
		NumberFormat upvotes = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
		upvotes.setMaximumFractionDigits(1);

		System.out.println(upvotes.format(2592) + " upvotes");

		NumberFormat upvotes2 = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
		upvotes2.setMaximumFractionDigits(2);
		System.out.println(upvotes2.format(2011) + " upvotes");

		System.out.println("************************");

	}
}
