package practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MoveEvenToRightInArray {
		
	static void separateOddEven(int[] arr) {
		int left =0;
		int right= arr.length-1;
		
		while(left<right) {
			//find the first even number from right
			while(left<right && arr[right]%2!=0) {
				right--;
			}
			//find the first odd number from left
			while(left<right && arr[left]%2==0) {
				left++;
			}
			if(left<right) {
				//If left is still less than right, swap the element
				int temp= arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
	}
	
	static ArrayList<Integer> moveEvenToRight(int[] arr) {
		List<Integer> inputList= Arrays.stream(arr)
			      .boxed()
			      .collect(Collectors.toList());
		List<Integer> evenList= inputList.stream().filter(i-> i%2==0).collect(Collectors.toList());
		List<Integer> oddList = inputList.stream().filter(i-> i%2!=0).collect(Collectors.toList());
		
		List<Integer> finalList= new ArrayList<Integer>();
		finalList.addAll(evenList);
		finalList.addAll(oddList);
		
		return (ArrayList<Integer>) finalList;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {4,2,6,1,8,7,5};
		System.out.println(moveEvenToRight(arr));
		int[] arr1= {4,2,6,1,8,7,5};
		separateOddEven(arr1);
		for (int i : arr1) {
			
			System.out.print(i + " ");
			
		}
	}

}
