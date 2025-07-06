package practice.java;

public class SumOFValueInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 8, 2, 4, 5};
		int target =10;
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length; j++) {
			if(arr[i]+arr[j]==10)
			{
				System.out.println(arr[i] + " " +arr[j]+ " ");
			}
		}
		}

		/*
		 * for (int e : arr) { System.out.print(e + " "); }
		 */
	}
}
