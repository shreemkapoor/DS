package com.strings;

public class RemovePunctuation {

	static void remove(String str) {
		str = str.replaceAll("\\p{Punct}","");	
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		remove("Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks");
	}

}
