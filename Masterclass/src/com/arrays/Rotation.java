package com.arrays;

import java.awt.print.Printable;
import java.util.Scanner;

public class Rotation {

	
	public static void rotate(int array[], int d, int n) {
		for(int i=0;i<d;i++) {
			leftrotate(array,n);
		}
	}
	
	public static void leftrotate(int[] array, int n) {
		int temp= array[0];
		int i;
		for( i=0;i<n-1;i++) {
			array[i]=array[i+1];
			System.out.println("aaaaa"+array[i]);
		}
		System.out.println("aaaa"+i);
		array[i]=temp;
	}

	public static void printArray(int arr[]) 
	    { 
	        for (int i = 0; i < arr.length; i++) 
	            System.out.print(arr[i] + " "); 
	    } 
	
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7};
		
		//leftrotate(arr, 4);
		rotate(arr, 1, 7);
		printArray(arr);
		
	}
	
}
