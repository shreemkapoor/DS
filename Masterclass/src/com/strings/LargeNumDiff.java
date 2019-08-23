package com.strings;

public class LargeNumDiff {
static int x;
static int y;
static int temp;
	public static void main(String[] args) {
		String str1="6010";
		String str2="6000";
		
		str1= refineZeroes(str1);
		str2= refineZeroes(str2);
		 
		if(str1.length()<str2.length()) {
			String temp= str1;
			str1=str2;
			str2=temp;
		}
		
		int a=1;
		String result="";
		char ch[]=str1.toCharArray();
		char ch1[]=str2.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
		 x= ch[i];
		 if(a>ch1.length) {
			 temp=x-'0';
		 }
		 for(int j=ch1.length-a;j>=0;j--) { 
			 y= ch1[j];
			temp=x-y;
			 if(temp<0) {
				 x+=10;
				 int z=Character.getNumericValue(ch[i-1]);
				 z--;
				 
				ch[i-1]=(char) (z+'0') ;
				 temp=x-y;
			 }
			 a++;
			 break;
		 }
		 result=temp+result;
		 y=48;
		 x=48;
		 temp=0;
		}
		System.out.println(result);
		
	}
	private static String refineZeroes(String str1) {
		String temp="";
		boolean flag=false;
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='0' || flag==true) {
				temp+=ch[i];
				flag=true;
			}
			
		}
		System.out.println(temp);
		return temp;
	}
 
}
