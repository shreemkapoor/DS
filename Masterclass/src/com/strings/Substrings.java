package com.strings;

public class Substrings {
	
	static String str = "abc";
	int n=str.length();
	static char[] arrstr = str.toCharArray();
	static int arr[] = new int[]{1, 2, 3, 4}; 
	 static void subArray( int n) 
	    { 
	        // Pick starting point 
	        for (int i=0; i <n; i++) 
	        { 
	            // Pick ending point 
	            for (int j=i; j<n; j++) 
	            { 
	                // Print subarray between current starting
	                // and ending points 
	                for (int k=i; k<=j; k++) 
	                    System.out.print(arrstr[k]+" "); 
	                System.out.print("\n");
	            } 
	        } 
	    } 
	 
	public static void main(String[] args) {
		  subArray(arrstr.length); 
	}

}
