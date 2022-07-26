package javagenerics;

public class Generics {

	public static String compareTO(String name1, String name2, String name3) {

		if (name1.length() > name2.length() && name1.length() > name3.length()) {
			return name1;
		} else if (name1.length() < name2.length() && name2.length() > name3.length()) {
			return name2;
		} else if (name1.length() < name3.length() && name2.length() < name3.length()) {
			return name3;
		} else if (name1.length() > name2.length() && name1.length() == name3.length()) {
			return ("These two strings are equally great: " + name1 + " & " + name3);
		} else if (name1.length() > name3.length() && name1.length() == name2.length()) {
			return ("These two strings are equally great: " + name1 + " & " + name2);
		} else if (name2.length() > name1.length() && name2.length() == name3.length()) {
			return ("These two strings are equally great: " + name2 + " & " + name3);
		} else
			return ("All strings are equal.");
	}

	public static void main(String[] args) {
		Generics value = new Generics();
		System.out.println("max Number for 1st test case=" + value.compareTO("Apple", "banana", "peach"));
		System.out.println("max Number for 2nd test case=" + value.compareTO("peach", "banana", "peach"));
		System.out.println("max Number for 3rd test case=" + value.compareTO("banana", "apple", "orange")); // position.
	}
}