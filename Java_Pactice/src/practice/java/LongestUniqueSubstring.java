package practice.java;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

	public static int longestUniqueSubstring(String s) {

		int left = 0, right = 0, maxLen = 0;
		Set<Character> set = new HashSet<>();

		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				maxLen = Math.max(maxLen, right - left + 1);
				right++;
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}

		return maxLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabccade";

		System.out.println(longestUniqueSubstring(s));

	}

}
