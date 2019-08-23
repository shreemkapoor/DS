package com.arrays;

import java.util.Arrays;

public class ReverseArray {
	
	public static void reverse(int[] array) {
		int maxlength = array.length-1;
		int halflength = array.length/2;
		
		for(int i=0;i<halflength;i++) {
			int temp= array[i];
			array[i] = array[maxlength-i];
			array[maxlength-i]=temp;
		}
	}
	
	public static void main(String[] args) {
	
		int[] array= {1,2,4,7,5,6};
		System.out.println("Normal array "+ Arrays.toString(array));
		
		reverse(array);
		System.out.println("Reversed array " +Arrays.toString(array));
	}
}
