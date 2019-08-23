package com.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterOfeachWord {
	 static void printFirst(String s) 
	    { 
	        Pattern p = Pattern.compile("\\b[a-zA-Z]"); 
	        Matcher m = p.matcher(s); 
	  
	        while (m.find()) 
	            System.out.print(m.group()); 
	  
	        System.out.println(); 
	    } 
	 
	 
	 static void firstLetter(String s) {
		 char[] words = s.toCharArray();
		 int k=0;
		 char temp = 0;
		 for(int i=0;i<words.length;i++) {
			k=i;
			 while(i<words.length && words[i]!=' ') {
				 i++; 
			 } 
				 temp = words[k];
				 System.out.print(temp);
		 }
	 }
	 
	  
	    public static void main(String[] args) 
	    { 
	        String s1 = "Geeks for Geeks"; 
	        String s2 = "A Computer Science Portal for Geeks"; 
	        printFirst(s1); 
	        printFirst(s2); 
	        
	        firstLetter(s1);
	    } 
}
