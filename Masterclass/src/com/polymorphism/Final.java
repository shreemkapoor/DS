package com.polymorphism;

public class Final {
	
	
	
	 final int a;
	 Final() {
		a=20;
		System.out.println("a : "+a);
	}


	public static void main(String[] args) {
		
		String abc= "hello";
		abc="qwe";
		System.out.println(abc);
		
		Final av = new Final();
		final int a;
		a=10;
		System.out.println("a : "+a);
	}

}
