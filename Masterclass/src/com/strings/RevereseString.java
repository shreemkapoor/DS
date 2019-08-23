package com.strings;

import java.util.Arrays;

public class RevereseString {

	static void reverseSimple(String s) {
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			 reverse = reverse + s.charAt(i);
		}
		System.out.print(reverse);
	}
	
	
	static void reverseToCharArray(String s) {
		char[] temp = s.toCharArray();
		int left=0;
		int right = s.length()-1;
		for(left=0;left < right; left++,right--) {
			char tempp=temp[left];
			temp[left]=temp[right];
			temp[right]=tempp;
		}
		for(char c:temp) {
			System.out.print(c);
		}
		System.out.println(Arrays.toString(temp));
	}
	
	
	public static void main(String[] args) {
		//reverseSimple("shreem");
		reverseToCharArray("naman");
	}

}
