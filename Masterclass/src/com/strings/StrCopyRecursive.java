package com.strings;

public class StrCopyRecursive {

	public static void strcopysimple(char s1[],char s2[]) {
		for(int i=0;i<s1.length;i++) {
			s2[i]=s1[i];
		}
	}
	
	public static void strcopyrecursive(char s1[],char s2[],int index) {
		
		s2[index]=s1[index];
		System.out.println(String.valueOf(s2));
		for( index=0;index>s1.length;index++) {
		        return; 
		 }
		 strcopyrecursive(s1, s2,index+1);
	}
	
	public static void main(String[] args) {
		char s1[]="train".toCharArray();
		char s2[]= new char[s1.length]; 
		//strcopysimple(s1,s2);
		strcopyrecursive(s1, s2,0);
	}

	
	
}
