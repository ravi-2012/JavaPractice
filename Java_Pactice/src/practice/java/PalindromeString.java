package practice.java;

public class PalindromeString {

	public static boolean palindromeCheck(String str) {

		int n = str.length();
		//int flag = 0;

		for (int i = 0; i < n / 2; i++) {
			int index = (n - 1) - i;
			if (str.charAt(i) != str.charAt(index)) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(palindromeCheck("abgdgba"));

	}

}
