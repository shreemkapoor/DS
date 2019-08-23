package com.strings;
import java.util.regex.Pattern;
public class ReverseWords {

	static String reverse( String s) {
		 
		String[] temp = s.split(" ");
		for(int i=temp.length-1;i>=0;i--) {
			System.out.print(temp[i]+" ");
		}
		return "";
	}
	
	public static void main(String[] args) {
		reverse("Hello bro man as");
	}

}
