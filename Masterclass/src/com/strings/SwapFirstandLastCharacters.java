package com.strings;

public class SwapFirstandLastCharacters {
	
	public static String swap(String str) {
		char[] words= str.toCharArray();
		
		for(int i=0;i<words.length;i++) {
			int k =i;
			
	           while (i < words.length && words[i] != ' ')  
	                i++; 
	              	
	            // Swapping 
	            char temp = words[k]; 
	            words[k] = words[i - 1]; 
	            words[i - 1] = temp; 
	  
	            // We assume that there is only one space 
	            // between two words. 
	        } 
		System.out.println(words);
	        return new String(words); 
	}

	public static void main(String[] args) {

		swap("geeks for geeks");
	}
}
