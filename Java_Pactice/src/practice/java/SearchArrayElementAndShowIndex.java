package practice.java;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchArrayElementAndShowIndex {
	
	public static ArrayList<Integer> indicesOfsearchedEle(int ele){
		ArrayList <Integer> indicesList= new ArrayList<>();
		int [] arr= {1,2,3,4,5,6,7,8,9,10,4,6,7,8};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				indicesList.add(i);
			}
		}
		return indicesList;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int searchEle= sc.nextInt();
		ArrayList<Integer> indexList=indicesOfsearchedEle(searchEle);
		System.out.println(!indexList.isEmpty()?indexList:"Number Not found");
		sc.close();
	}
}
