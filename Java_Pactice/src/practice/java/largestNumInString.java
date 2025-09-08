package practice.java;

public class largestNumInString {

	public static void main(String[] args) {
		String str= "ra3v8iSh2a55n6k1ar";
		String s= str.replaceAll("[^0-9]", "");
		char [] arr= s.toCharArray();
		System.out.println(s);
		
		int largest= Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(Character.getNumericValue(arr[i])>largest)
				largest= Character.getNumericValue(arr[i]);
		}
		System.out.println(largest);

	}

}
