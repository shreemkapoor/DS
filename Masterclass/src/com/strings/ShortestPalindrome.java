package com.strings;

import java.util.Scanner;

public class ShortestPalindrome {

	public static String shortestPalindrome(String s) {
	    int i=0; 
	    int j=s.length()-1;
	 
	    while(j>=0){
	        if(s.charAt(i)==s.charAt(j)){
	            i++;
	        }
	        j--;
	    }
	 
	    if(i==s.length())
	        return s;
	 
	    String suffix = s.substring(i);
	    String prefix = new StringBuilder(suffix).reverse().toString();
	    String mid = shortestPalindrome(s.substring(0, i));
	    return prefix+mid+suffix;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter a String to find out shortest palindrome");
		 
		String str=in.nextLine();
		 
		System.out.println("Shortest palindrome of "+str+" is "+shortestPalindrome(str));
	}

}
