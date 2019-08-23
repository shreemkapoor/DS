package com.arrays;

//Incomplete
public class Unionintersection {

	public static void union( int arr1[],int arr2[]) {
		int temp[]= arr1;
		int x=0;
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i]!=arr1[j]) {
				temp[x]=arr2[i];	
				}
			}
		}
		for(int i =0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		System.out.println("new array : ");
		
	}
	
	public static void main(String[] args) {
		int[] arr1= {1,7,10,13,4};
		int[] arr2= {4,2,13,6};
		union(arr1,arr2);
	}

}
