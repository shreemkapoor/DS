package com.arrays;

public class PairSum {

	public static int findpair(int arr[],int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==x) {
					System.out.println("Elements are ("+arr[i]+","+arr[j]+")");
					count++;
					System.out.print("aaa");
				}
			}
		}
		System.out.println("number"+count);
		return count;
	}
	
	public static void main(String[] args) {
		int array[]= {1,7,10,13,7};
		findpair(array,14);
			System.out.println("Array has elements with sum");
	
	}
}
