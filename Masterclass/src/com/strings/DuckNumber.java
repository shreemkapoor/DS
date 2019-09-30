package com.strings;

public class DuckNumber {

	public static void checkDuck(String s) {
		int count=0;
		if(s.charAt(0)=='0') {
			System.out.println("Not a duck number");
		}
		else {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='0') {
					count++;
				}
			}
			if(count>0) {
				System.out.println("Number is a duck number");
			}
			else 
				System.out.println("Not a duck number");
		}
	}
	
	public static void main(String[] args) {
		checkDuck("7769");
	}
}
