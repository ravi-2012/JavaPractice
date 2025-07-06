package practice.java;

import java.util.Arrays;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,7,9};
		int[] b = {2,4,6,8};
		int[] c = new int[a.length+b.length];
		int i=0,j=0,k = 0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		for(int z=0;z<c.length;z++) {
			System.out.println(c[z]);
		}
		System.out.println();
		Arrays.stream(c).forEach(z->System.out.println(z));
	}

}
