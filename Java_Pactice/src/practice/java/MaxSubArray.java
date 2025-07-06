package practice.java;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,-2,-3,1,5,3,8,9};
		int sum =0;
		for(int i =0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				sum = sum+a[i];
			}
		}
		System.out.println(sum);

	}

}
