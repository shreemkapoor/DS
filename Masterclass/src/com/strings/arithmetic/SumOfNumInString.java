package com.strings.arithmetic;

public class SumOfNumInString {
	
	static int sum(String s) {
		String temp="";
		int sum =0;
		char[] a = s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				temp+= ch;
			}
			else 
			{
				sum+=Integer.parseInt(temp);
				temp="0";	
			}
		}
		 return sum + Integer.parseInt(temp);  
	}

	public static void main(String[] args) {
		String str = "12abc20yz68";  
	      
        System.out.println(sum(str)); 
		
	}

}
