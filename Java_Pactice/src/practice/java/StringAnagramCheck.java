package practice.java;

public class StringAnagramCheck {
	public static boolean isAnagram(String str1, String str2) {
	    str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
	    str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

	    if (str1.length() != str2.length()) {
	        return false;
	    }

	    int[] count = new int[26]; // For English alphabets

	    for (int i = 0; i < str1.length(); i++) {
	        count[str1.charAt(i) - 'a']++;  // Increment for str1
	        count[str2.charAt(i) - 'a']--;  // Decrement for str2
	    }

	    for (int c : count) {
	        if (c != 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		
		System.out.println(isAnagram(s1, s2));
		
	}

}
