package practice.java;

public class SwappingTwoStrings {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";

		System.out.println("***********Before Swap**************");
		System.out.println("Value of a :" + a);
		System.out.println("Value of b :" + b);

		// concat a and b and ref a
		a = a + b;

		// storing the value of a in b

		b = a.substring(0, (a.length() - b.length()));

		// storing the value of b into a

		a = a.substring(b.length());

		System.out.println("***********After Swap**************");
		System.out.println("Value of a :" + a);
		System.out.println("Value of b :" + b);
	}

}
