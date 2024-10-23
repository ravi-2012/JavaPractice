package practice.java;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet; 

public class collectionJavaPractice {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		//List<String> list2 = new LinkedList<String>();
		List<String> list3 = new ArrayList<String>();
		// List <Integer> list3 = new Vector<Integer>();
		// List <String> list4 = new Stack<String>();
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new TreeSet<String>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<String, String> map1 = new HashMap<String, String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("Bubul");
		list.add("Momon");

		set1.add("Ravi");
		set1.add("Vijay");
		set1.add("Ravi");
		set1.add("Ajay");

		for (String s : list) {
			if (s.equalsIgnoreCase("Ravi"))
				list3.add(s);

			// System.out.println(s); //System.out.println(s); }
			System.out.println(list3);

		}

		set1.addAll(list);
		System.out.println(set1);

		set2.addAll(list);
		System.out.println(set2);

		map.put(1, "RAVI");
		map.put(4, "Vijay");
		map.put(2, "SANA");
		map.put(3, "Vijay");

		map1.put("b", "RAVI");
		map1.put("t", "Vijay");
		map1.put("c", "SANA");
		map1.put("a", "Vijay");

		System.out.println(map);
		System.out.println(map1);

		List<String> list4 = new ArrayList<String>();
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			try {
				if (e.getKey() == 5)
					System.out.println(e.getValue());
				list4.add(e.getValue());
			} catch (Exception exp) {
				exp.printStackTrace();
				// System.out.println(list4);
			} finally {
				System.out.println("mai gareeb hu toh kya karu");
			}
			Collections.sort(list4);
			System.out.println(list4);

		}
		
				// Create an empty hash map
				HashMap<String, Integer> map6
					= new HashMap<>();

				// Add elements to the map
				map6.put("vishal", 10);
				map6.put("sachin", 30);
				map6.put("vaibhav", 20);

				// Finding the Set of keys from
				// the HashMap
				Set<String> keySet = map6.keySet();

				// Creating an ArrayList of keys
				// by passing the keySet
				ArrayList<String> listOfKeys
					= new ArrayList<String>(keySet);

				// Getting Collection of values from HashMap
				Collection<Integer> values = map6.values();

				// Creating an ArrayList of values
				ArrayList<Integer> listOfValues
					= new ArrayList<>(values);

				System.out.println("The Keys of the Map are "
								+ listOfKeys);

				System.out.println("The Values of the Map are "
								+ listOfValues);
			}
		

	

}
