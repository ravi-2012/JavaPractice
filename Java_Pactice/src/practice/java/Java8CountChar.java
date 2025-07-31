package practice.java;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8CountChar {
	
	public static void main(String[] args) {
		String s = "Upasana Roy !!!!!123";
		Map<Character, Long> res = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		res.forEach((letter,count)->System.out.print(letter+":"+count +" "));
		System.out.println("result without space");
		Map<Character, Long> res1 = s.chars().mapToObj(c->(char)c)
				.filter(ch->ch!=' ').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		res1.forEach((letter,count)->System.out.print(letter+":"+count));
		System.out.println("result with only characters ignoring special char, numbers");
		Map<Character, Long> res2 = s.toLowerCase().chars().mapToObj(c->(char)c).filter(Character::isAlphabetic).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		res2.forEach((letter,count)->System.out.print(letter+":"+count));
		
		System.out.println("result with only characters ignoring special char, numbers in sorted order");
		res2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry->System.out.print(entry.getKey()+":"+entry.getValue()));
		
		System.out.println("result with only characters ignoring special char, numbers in sorted order withput function.identity ");
		Map<Character,Long> res3 = s.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		res3.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry->System.out.print(entry.getKey()+":"+entry.getValue()));
	}


}
