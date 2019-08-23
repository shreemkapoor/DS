package com.strings;

import java.util.Arrays;

public class PangramCheck {

	static void checkPangram(String pangram) {
		int[] ascii= new int[128];
		char[] chars= pangram.toLowerCase().toCharArray();
		
		for(int i=0;i<chars.length;i++) {
			int test= chars[i];
			if(test<128) {
				ascii[test]+=1;
			}
		}
		//System.out.println(Arrays.toString(ascii));
		for(int i=97;i<=122;i++) {
			if(ascii[i]==0) {
				System.out.println("String is not a pangram");
				System.exit(1);
			}
		}
		System.out.println("String is a pangram");
	}
	
	 public static boolean checkPangramgeeks (String str) 
	    { 
	        // Create a hash table to mark the  
	        // characters present in the string 
	        // By default all the elements of  
	        // mark would be false. 
	        boolean[] mark = new boolean[26]; 
	  
	        // For indexing in mark[] 
	        int index = 0; 
	  
	        // Traverse all characters 
	        for (int i = 0; i < str.length(); i++) 
	        { 
	            // If uppercase character, subtract 'A' 
	            // to find index. 
	            if ('A' <= str.charAt(i) &&  
	                    str.charAt(i) <= 'Z') 
	                          
	                index = str.charAt(i) - 'A'; 
	  
	                // If lowercase character, subtract 'a' 
	                // to find index. 
	            else if('a' <= str.charAt(i) &&  
	                        str.charAt(i) <= 'z') 
	                              
	                index = str.charAt(i) - 'a'; 
	  
	            // Mark current character 
	            mark[index] = true; 
	        } 
	  
	        // Return false if any character is unmarked 
	        for (int i = 0; i <= 25; i++) 
	            if (mark[i] == false) 
	                return (false); 
	  
	        // If all characters were present 
	        return (true); 
	    } 
	
	public static void main(String[] args) {
		checkPangram("The quick brown fox umps over the lazy dog");
		//checkPangramgeeks("The quick brown fox jumps over the lazy dog");
		String str = "The quick brown fox jumps over the lazy dog";
		if (checkPangramgeeks(str) == true) 
            System.out.print(str + " is a pangram."); 
        else
            System.out.print(str+ " is not a pangram."); 
	}

}
