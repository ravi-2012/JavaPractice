package practice.java;

public class ReverseStringWithSpecialCharacter {

	public static void main(String[] args) {
		
	String str= "r@av&i#sha*k)ar(";
	
	char[] s=str.toCharArray();
	int len= s.length;
	int start= 0;
	int end= s.length-1;
	
	while(start<end) {
		if(!Character.isLetterOrDigit(s[start])) {
			start++;
		}
		else if(!Character.isLetterOrDigit(s[end])) {
			end--;
		}
		else {
			char temp= s[start];
			s[start]=s[end];
			s[end]=temp;
			start++;
			end--;
		}
	}
		String output= new String(s);
		System.out.println(output);

	}

}
