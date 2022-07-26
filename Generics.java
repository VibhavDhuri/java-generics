package javagenerics;

public class Generics {

	public static void main(String[] args) {

		System.out.println("Maximum number out of three integers is: " + maximum(11, 18, 200));
		System.out.println("Maximum number out of three float is: " + maximum(45f, 75f, 88f));
		System.out.println("Maximum among three string is: " + maximum("Apple", "Peach", "Banana"));
	}

	public static <T extends Comparable<T>> T maximum(T num1, T num2, T num3) {

		if (num2.compareTo(num1) > 0) {
			return num2;
		} else if (num3.compareTo(num2) > 0) {
			return num3;
		} else {
			return num1;
		}

	}
}