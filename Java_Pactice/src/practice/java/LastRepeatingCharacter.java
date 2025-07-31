package practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LastRepeatingCharacter {
	
	public static Character lastreapeatingChar(String str) {
		
		char[] arr= str.toCharArray();
		
		Map<Character,Integer> storeMap= new HashMap<>();
		
		for(Character c: arr) {
			Integer count= storeMap.get(c);
			
			if(count==null) {
				storeMap.put(c, 1);
			}
			else
				storeMap.put(c, ++count);
		}
		
		Set<Entry<Character,Integer>> s=storeMap.entrySet();
		
		for(Entry<Character,Integer> e: s) {
			
			if(e.getValue()>1) {
				System.out.println(e.getKey()+ ": "+ e.getValue());
			}
			
		}
		//last repeating char
		for(int i=str.length()-1;i>=0;i--) {		
			// first repeating character
		//for(int i=0;i<str.length();i++) {
			char currentChar= str.charAt(i);
			if(storeMap.get(currentChar)>1) {
				return currentChar;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		String str= "rameshkumar";
		//lastreapeatingChar(str);
		// TODO Auto-generated method stub
		
		System.out.println(lastreapeatingChar(str));

	}

}
