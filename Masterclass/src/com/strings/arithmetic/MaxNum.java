package com.strings.arithmetic;

import java.util.Arrays;

public class MaxNum {
	
	
	static void sum(String s) {
		String temp="";
		int sum =0;
		int max=0;
		char[] a = s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				temp+= ch;
			}
			else 
			{
				if(Integer.parseInt(temp)>max) {
					max=Integer.parseInt(temp);
					max=0;
					temp="0";
				}
			}
		}
		if(Integer.parseInt(temp)>max) {
			max=Integer.parseInt(temp);
		}
		System.out.println( max);
	}

	public static void main(String[] args) {
		
		String str = "100klh564abc365RR";  
		sum(str);
        
	}

}
