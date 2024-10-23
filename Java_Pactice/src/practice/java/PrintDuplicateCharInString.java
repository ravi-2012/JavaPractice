package practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintDuplicateCharInString {

	public static void main(String[] args) {

		String str = "aabbccdefgghijklmaabbcc";

		char[] arr = str.toCharArray();
		System.out.println(arr);
		// using for loop

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);

			}
		}

		System.out.println("*******using HashMap*********");
		// using HashMap
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : arr) {
			Integer count = map.get(c);
			if (count == null) {

				map.put(c, 1);

			} else {
				map.put(c, ++count);

			}
		}

		// printing the duplicate value

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + ":" + e.getValue());
			}
		}
	}

}
