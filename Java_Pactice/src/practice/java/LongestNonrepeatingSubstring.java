package practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LongestNonrepeatingSubstring {
	
	public static int lengthOfLongestSubstring(String s) {
		TreeMap<String, Integer> storeMap= new TreeMap<>();
	    String subString="";          
	        for(int i=0;i<s.length();i++){
	            for(int j=i+1;j<=s.length();j++){
	            	subString= s.substring(i, j);
	            		storeMap.put(subString, subString.length());
	            }
	        }
	        int maxCount=0;
	        for(Map.Entry<String, Integer> e:storeMap.entrySet()) {
	        	if(e.getValue()>maxCount)
	        		maxCount=e.getValue();
	        		System.out.println(e.getKey()+ ": "+e.getValue());
	        }
	        System.out.println("printing max count value= "+maxCount);
			return maxCount;    	            
	    }    

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		lengthOfLongestSubstring("abcabcbb");

	}

}
