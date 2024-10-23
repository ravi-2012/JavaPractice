package practice.java;

import java.util.Arrays;

public class StringSort {

	static String sortString(String str) {

		char temp;
		char[] charArr = str.toCharArray();
		int len = charArr.length;
		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++) {
				if (charArr[i] > charArr[j]) {
					temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}

			}
		}

		return Arrays.toString(charArr);
	}

	public static void main(String[] args) {
		
		System.out.println(sortString("12365874"));

	}

}
