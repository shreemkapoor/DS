package com.abstraction;


abstract class Bike{  
	
	static {
		System.out.println("abc");
	}
	
	 {
		System.out.println("abcde");
	}
	
	   Bike(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}
	   
	   public static void main(String args[]){  
			  Bike obj = new Honda();  
			 obj.run();  
			  obj.changeGear();  
			 }  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class Honda extends Bike{  
		 Honda(){
			 
			 System.out.println("Honda leli");
		 }
	 void run(){System.out.println("running safely..");}  
	 }  
	//Creating a Test class which calls abstract and non-abstract methods  
	 class TestAbstraction2{  
	
	}  