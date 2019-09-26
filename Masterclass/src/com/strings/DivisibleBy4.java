package com.strings;

public class DivisibleBy4 {
	
	public static void main(String[] args) {
		
		String str = "363588395960667043875487";
		int n = str.length();
		
		if(n==0) {
			System.out.println("Empty String");
			return;
		}
		
		if(n==1) {
			if((str.charAt(n-1) - '0')%4==0) {
				System.out.println("Divisible");
			}
			else {
		    	   System.out.println("Not divisible");
		       }
		}else {
			int last = str.charAt(n-1) - '0'; 
	        int second_last = str.charAt(n-2) - '0'; 
	       if( (second_last*10 + last) % 4 == 0) {
	    	   System.out.println("Divisible");
	       }else {
	    	   System.out.println("Not divisible");
	       }
		}
		
        
	}
}
