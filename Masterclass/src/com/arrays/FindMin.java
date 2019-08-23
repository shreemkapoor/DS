package com.arrays;

import java.util.Scanner;

public class FindMin {
	
	public static int[] getArray(int numbers) {
		System.out.println("Enter "+ numbers+" integer values:\r" );
		Scanner sc = new Scanner(System.in);
		int[] array = new int[numbers];
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		//printArray(array);
		return array;
	}
	
	public static void printArray(int[] array) {
		System.out.println("Your Array elements are :");
		for(int i =0;i<array.length;i++) {
			System.out.println(""+array[i]);
		}
	}
	
	public static int findMinimum(int[] array){
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			int value = array[i];
		
			if(value<min) {
				min=value;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
	int[] enteredArray = getArray(5);
	int minimumvalue = findMinimum(enteredArray);
	System.out.println("Minimum Value : "+ minimumvalue);
	}

}
