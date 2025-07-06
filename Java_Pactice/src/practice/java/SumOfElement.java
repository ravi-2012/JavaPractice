package practice.java;

public class SumOfElement {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=10;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i] + " "+arr[j]);
				}
			}
		}

	}

}
