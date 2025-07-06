package practice.java;

public class PalindromeString {

	public static boolean palindromeCheck(String str) {

		int n = str.length();
		//int flag = 0;

		for (int i = 0; i < n / 2; i++) {
			int index = (n - 1) - i;
			if (str.charAt(i) != str.charAt(index)) {
//				flag = 1;
//				continue;
				return false;
			}
//			} else {
//				flag = 0;
//			}
		}
		return true;
//		if (flag == 1)
//			System.out.println(str + " " + "is a palindrome");
//
//		else if (flag == 0)
//			System.out.println(str + " " + "is not a palindrome");
	}

	public static void main(String[] args) {

		System.out.println(palindromeCheck("abgdgba"));

	}

}
