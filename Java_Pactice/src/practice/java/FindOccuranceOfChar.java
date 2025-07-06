package practice.java;

import java.util.HashMap;
import java.util.Map;

public class FindOccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="RaviShankarKumar";
		String str1 = str.toLowerCase();
		HashMap<Character,Integer> storeMap= new HashMap<>();
		
		char[] arr= str1.toCharArray();
		
		for(Character c:arr) {
			
			Integer count= storeMap.get(c);
			
			if(count==null) {
				storeMap.put(c, 1);
				
			}
			else
				storeMap.put(c, ++count);
			
		}
		
		for(Map.Entry<Character, Integer> e:storeMap.entrySet()) {
			if(e.getKey().equals('r')) {
				System.out.println("Character :"+e.getKey()+": " +e.getValue());
			}
		}
	}

}
