package practice.java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UncommonWordIn2Sentences {

	public static void main(String[] args) {
		String s1= "My name is Praveen singh";
	    String s2= "My name is Ravi";
				
	   String[] strArr= uncommonFromSentences(s1, s2);	
	  for(String s:strArr)
		  System.out.println(s);

	}
	   public static String[] uncommonFromSentences(String A, String B) {
	        Map<String, Integer> count = new HashMap<String, Integer>();
	        for (String word: A.split(" "))
	            count.put(word, count.getOrDefault(word, 0) + 1);
	        for (String word: B.split(" "))
	            count.put(word, count.getOrDefault(word, 0) + 1);

	        List<String> ans = new LinkedList<String>();
	        for (String word: count.keySet())
	            if (count.get(word) == 1)
	                ans.add(word);

	        return ans.toArray(new String[ans.size()]);
	    }
	
	
//	static void uncommonWord(String s1,String s2) {
//		
//		String[] arr1= s1.split(" ");
//		String[] arr2= s2.split(" ");
//		String uncommon = null;
////		for(String s:arr1) {
////			System.out.println(s);
////		}
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(!arr1[i].equals(arr2[j])) {
//					System.out.println(uncommon);
//					
//				}
//					
//			}
//			
//			}
//	
//		}
	
	
		
	}


