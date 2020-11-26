package amrib.algorithms;

public class Algorithms {

	Integer checkMax(Integer[] ints) {
		Integer maxValue = 0;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > maxValue) {
				maxValue = ints[i];
			}
		}
		return maxValue;
	}

	Integer checkMin(Integer[] ints) {
		Integer minValue = 0;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] < minValue) {
				minValue = ints[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ints = { -1, 7, 3, 12, -6, 15 };
		System.out.println("Hello People");
		Algorithms e = new Algorithms();
		System.out.println("Max Value: " + e.checkMax(ints));
		System.out.println("Min Value: " + e.checkMin(ints));
	}

	public static void exercice14() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void exercice13() {
		for (char ch1 = 'E'; ch1 >= 'A'; ch1--) {
			for (char ch2 = 'A'; ch2 <= ch1; ch2++) {
				System.out.print(ch2);
			}
			System.out.println();
		}
	}

	public static void exercice12() {
		for (char ch1 = 'A'; ch1 <= 'E'; ch1++) {
			for (char ch2 = 'E'; ch2 >= ch1; ch2--) {
				System.out.print(ch1);
			}
			System.out.println();
		}
	}

	public static void exercice11() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void exercice10() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void exercice9() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void exercice8() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void exercice7() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void exercice5() {
		for (char ch1 = 'A'; ch1 <= 'E'; ch1++) {
			for (char ch2 = 'A'; ch2 <= 'E'; ch2++) {
				System.out.print(ch1);
			}
			System.out.println();
		}
	}

	public static void exercice4() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void exercice3() {
		System.out.println("@");
		for (int i = 5; i >= 1; i--) {
			System.out.print("@");
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.println(" @");
		}
		for (int j = 0; j < 5; j++) {
			System.out.print("@ ");
		}
	}

	public static void exercice2() {
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			for (int k = 6; k >= i; k--) {
				System.out.print("&");
			}
			System.out.println("");
		}
	}

	public static void exercice1() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 6; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}