package com.strings;

public class AllCharsSame {

	public static boolean allCharactersSame(String s) {
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(0)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		 String s = "aava"; 
		    if (allCharactersSame(s)) 
		        System.out.println("Yes"); 
		    else
		        System.out.println("No"); 
		          
	}

}