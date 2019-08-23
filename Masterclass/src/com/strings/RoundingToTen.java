package com.strings;

public class RoundingToTen {
	
	public static void rounding(int s) {
		int a=(s/10)*10;
		int b= a+10;
		
		if(s%10<5) {
			System.out.println("Rounded Number is :"+a);
		}
		else 
			System.out.println("Rounded number is :"+b);
	}

	public static void main(String[] args) {
		rounding(42226);
		
	}

}
