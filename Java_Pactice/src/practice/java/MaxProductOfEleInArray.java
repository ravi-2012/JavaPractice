package practice.java;

import java.util.ArrayList;
import java.util.List;

public class MaxProductOfEleInArray {
	
	public static List<Integer> maxProduct(int[]arr) {
		int max = Integer.MIN_VALUE;
		List<Integer> list= new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]*arr[j]>max) {
					max= arr[i]*arr[j];	
					list.clear();
					list.add(arr[i]);
					list.add(arr[j]);
				}				
			}
			
		}
		return list;
	}
	// by finding the largest 2 number we can get the results
	
	public static void maxProductOfElement(int []arr) {
		int largest= Integer.MIN_VALUE;
		int secLargest= Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>largest) {
				
				secLargest= largest;
				largest=num;
			}
			else if(num>secLargest && num!=largest) {
				secLargest=num;
			}
		}
		
		System.out.println(largest+","+secLargest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {13,1,3,4,15,6,2,8,12};
		
		//System.out.println(maxProduct(arr));
		maxProductOfElement(arr);

	}

}
