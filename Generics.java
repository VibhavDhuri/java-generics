package javagenerics;

public class Generics {
	public static Integer compareTo(Integer num1, Integer num2, Integer num3) {

		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	public static void main(String[] args) {

		Generics integer = new Generics();

		System.out.println("1st test case max integer:" + integer.compareTo(5, 3, 2));
		System.out.println("2nd test case max integer:" + integer.compareTo(2, 6, 3));
		System.out.println("3rd test case max integer:" + integer.compareTo(1, 2, 3));

	}
}