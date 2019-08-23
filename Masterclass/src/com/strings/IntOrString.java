package com.strings;

public class IntOrString {
	
	public static boolean check(String s) {
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))==false) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void checkint() {
		String s1="abc";
		String s2="1234.8";
		
		try {
			Integer.parseInt(s2);
			System.out.println("Input is an Integer value");
		}catch (Exception e) {
			System.out.println("Input is not an integer");
		}
	}

	public static void main(String[] args) {

        String str = "67905q"; 
		/*
		 * if (check(str)) System.out.println("Integer"); else
		 * System.out.println("String");
		 */
      
      checkint();
	}

}
