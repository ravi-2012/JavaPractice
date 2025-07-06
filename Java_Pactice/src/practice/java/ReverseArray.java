 package practice.java;

public class ReverseArray {

	public static void main(String[] args) {

		int []arr= {1,2,3,8,9,10,4,5};
		System.out.println(arr.length);
		
		reverseArrayUtil(arr,0,arr.length);
		
		for(int i:arr) {
			System.out.print(i +" ");
		}
	}

	public static void reverseArrayUtil(int[] arr, int start,int end) {

		int temp;
		
//		while(start<end) {
//			temp=arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//			start++;
//			end--;
//		}
		
		for(int i=0;i<end-1;i++) {
			temp=arr[i];
			arr[i]=arr[end-1];
			arr[end-1]=temp;
			end--;
		}

	}

}
