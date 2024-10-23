package practice.java;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Selenium";
		int len = s.length();
		String rev = "";

		// using for loop
		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}

		System.out.println(rev);

		// using increment operator
		String rev1 = "";
		for (int i = 0; i < len; i++) {
			int index = (len - 1) - i;
			rev1 = rev1 + s.charAt(index);

		}

		System.out.println(rev1);

		// using StringBuffer class

		StringBuffer strBfr = new StringBuffer(s);
		System.out.println(strBfr.reverse());

		String s1 = "Amit";
		String s2 = new String("Amit");

		if (s1 == s2) {
			System.out.println(true);
		} else
			System.out.println(false);
	}

}
