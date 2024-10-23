package practice.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateElementInArray {

	public static void main(String[] args) {

		String[] arr = new String[] { "Java","Java" ,"C", "C","Python", "C++", };

		// using for loop

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					System.out.println(arr[j]);
				}
			}
		}
		System.out.println("*************using hashset************");
		// using HashSet

		Set<String> hashSet = new HashSet<String>();

		for (String s : arr) {
			if (hashSet.add(s) == false) {
				System.out.println(s);
			}
		}

		System.out.println("*************using HashMap************");
		// using HashMap
		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String s1 : arr) {
			Integer count = storeMap.get(s1);
			
			if(count==null) {
				storeMap.put(s1, 1);
			}
			else {
				storeMap.put(s1, ++count);
			}

		}
		//Printing the duplicate value form HashMap
		
		Set<Entry<String, Integer>> dupMap=storeMap.entrySet();
		
		for(Entry<String, Integer> e:dupMap) {
			
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}

	}

}
