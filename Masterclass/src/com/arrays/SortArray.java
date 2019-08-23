package com.arrays;

import java.util.Scanner;

public class SortArray {

	public static int[] getArray(int numbers) {
		System.out.println("Enter "+ numbers+"integer values:\r" );
		Scanner sc = new Scanner(System.in);
		int[] array = new int[numbers];
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	public static void  printArray(int[] array) {
		for(int i =0;i<array.length;i++) {
			System.out.println(""+array[i]);
		}
	}
	
	public static int[] sortArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					int temp=0;
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		//getArray(4);
		//printArray(getArray(4));
		printArray(sortArray(getArray(3)));
		
		
	}

}
