package practice.java;

public class MagicalString {

	public static void main(String[] args) {
		
		//alphabetical reverse
		System.out.println(magicalString("abcdefghijklmnopqrstuvwxyz"));

	}

	static String magicalString(String S) {
		
		String revAlpha = "zyxwvutsrqponmlkjihgfedcba";
		String magStr = "";

		for (int i = 0; i < S.length(); i++) {
			magStr = magStr + revAlpha.charAt(S.charAt(i) - 'a');
		}

		return magStr;
	}

}
