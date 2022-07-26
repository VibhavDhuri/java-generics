package javagenerics;

public class Generics {
	public static float compareTo(float num1, float num2, float num3) {

		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	public static void main(String[] args) {

		Generics number = new Generics();
		System.out.println("1st test case max float:" + number.compareTo(4.1f, 0.6f, 1.2f));
		System.out.println("2nd test case max float:" + number.compareTo(5.7f, 6.0f, 1.7f));
		System.out.println("3rd test case max float:" + number.compareTo(4.1f, 2.1f, 5.2f));
	}
}