package practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfWordsInString {
	
	
	public static Map<String, Integer> occuranceOfWords(String str) {
		String [] strArr= str.split(" ");
		
		Map<String, Integer> map= new HashMap<>();
		
		Map<String, Integer> resMap= new HashMap<>();
		for(int i=0;i<strArr.length;i++) {
			Integer count= map.get(strArr[i]);
			if(count==null) {
				map.put(strArr[i], 1);
			}
			else
				map.put(strArr[i], ++count);
			
		}
		
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			//System.out.println(e.getKey() +": "+e.getValue());
			if(e.getValue()>1) {
				System.out.println("duplicate word: "+ e.getKey()+" :"+ e.getValue());
				resMap.put(e.getKey(), e.getValue());
			}
		}
		return resMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		occuranceOfWords(str);
		//Map<String,Integer>
		System.out.println();

	}

}
