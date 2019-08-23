package com.strings;

public class FindCountDuplicates {

	static void checkPangram(String pangram) {
		int[] ascii= new int[128];
		char[] chars= pangram.toLowerCase().toCharArray();
		
		for(int i=0;i<chars.length;i++) {
			int test= chars[i];
			if(test<128) {
				ascii[test]+=1;
			}
		}
		
		for(int i=97;i<=122;i++) {
			if(ascii[i]>1) {
				System.out.println(Character.toString((char)i)+"-"+ascii[i]);
			}
		}
	}
	
	public static void main(String[] args) {

		checkPangram("javaaa");
		
	}

}

