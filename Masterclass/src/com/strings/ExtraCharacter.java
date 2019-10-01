	package com.strings;

public class ExtraCharacter {

	//This is not correct/complete
	public static char findextra(String s1, String s2) {
		String shortstr;
		String longstr;
		
		if(s1.length()>s2.length()) {
			shortstr=s2;
			longstr=s1;
		}else {
			shortstr=s1;
			longstr=s2;
		}
		
		int smallStrCodeTotal = 0;
        int largeStrCodeTotal = 0; 
        int i=0;
        for(;i<shortstr.length();i++) {
        	smallStrCodeTotal=shortstr.charAt(i);
        	largeStrCodeTotal=longstr.charAt(i);
        }
        System.out.println(longstr.charAt(i));
        largeStrCodeTotal=longstr.charAt(i);
        int finalchar= largeStrCodeTotal-smallStrCodeTotal;
        System.out.println("aaaaaaaaaa"+finalchar);
		return (char) finalchar;
	}
	
	
	static char findExtraCharcter(char []strA, char[] strB) 
	{ 
	    // store string values in map 
	    int[] m1 = new int[256]; 
	  
	    // store second string in map with frequency 
	    for (int i = 0; i < strB.length; i++) 
	        m1[strB[i]]++; 
	  
	    // store first string in map with frequency 
	    for (int i = 0; i < strA.length; i++) 
	        m1[strA[i]]--; 
	  
	    for (int i=0;i<m1.length;i++) 
	    { 
	  
	        // if the frequency is 1 then this 
	        // character is which is added extra 
	        if (m1[i]== 1) 
	            return (char) i;
	    } 
	    return Character.MIN_VALUE; 
	} 
	
	
	
	
	public static void main(String[] args) {
		 String s1 = "abce"; 
	        String s2 = "cbdae"; 
	          
	       // char extraChar = findextra(s1, s2); 
	      //  System.out.println("Extra character: " + extraChar); 
	        
	        System.out.println(findExtraCharcter(s1.toCharArray(), s2.toCharArray())); 
	        
	}
}
