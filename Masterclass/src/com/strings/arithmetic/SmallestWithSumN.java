package com.strings.arithmetic;

public class SmallestWithSumN {
	
	static void sumN(int n) {
		 if(n==0) {
			 System.out.print("0");
		 }
		 
		 if(n%9!=0) {
			 System.out.print(n%9);
		 }
		 
		  for (int i = 1; i <= (n / 9); ++i) { 
		        System.out.print("9"); 
		  
		  }
		  
		 for(int i=0;i<n;++i) {
		 System.out.print("0");
		 }
	}

	public static void main(String[] args) {
		
		
		int s=7;
		int a =s%10;
		char b=(char)a;
		System.out.println(a);
		System.out.println((char)(a+40));
		System.out.println(b);
		
		String sss="Abc";
		char[] ass= sss.toCharArray();
		for(int i=0;i<1;i++) {
			//System.out.println(sss.charAt(i)-'0');
			//System.out.println(sss.charAt(i));
		}
		
		//sumN(10);
	}

}
