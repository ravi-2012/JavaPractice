package practice.java;

public class PalindromeString {

	public static void palindromeCheck(String str) {

		int n = str.length();
		int flag = 0;

		for (int i = 0; i < n / 2; i++) {
			int index = (n - 1) - i;
			if (str.charAt(i) == str.charAt(index)) {
				flag = 1;
				continue;
			} else {
				flag = 0;
			}

		}
		if (flag == 1)
			System.out.println(str + " " + "is a palindrome");

		else if (flag == 0)
			System.out.println(str + " " + "is not a palindrome");
	}

	public static void main(String[] args) {

		palindromeCheck("abgdgdba");

	}

}
