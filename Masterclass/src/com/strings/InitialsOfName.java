package com.strings;

public class InitialsOfName {
	
	public static void printInitials(String s) {
		System.out.print(Character.toUpperCase(s.charAt(0)));
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				System.out.print(" "+Character.toUpperCase( s.charAt(i+1)));
			}
		}
	}
	

	public static void main(String[] args) {
		printInitials("Shreem kapoor");
	}

}
