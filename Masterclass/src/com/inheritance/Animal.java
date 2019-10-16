package com.inheritance;

class Animal {
	
	 public static void main(String[] args) {
	    	//Dog a = new Animal();
	    	Animal an = new Animal();
	    	System.out.println("1: "+(an instanceof Dog));//true  
	    	Dog d= new Dog();
	    	System.out.println("2: "+(d instanceof Dog));
	    	Animal b = new Dog();
	    	System.out.println("3: "+(b instanceof Animal));
	    	System.out.println("4: "+(b instanceof Dog));
	        b.show();
	    	//Animal a = new Animal();
	    	
	    	
	    	//d.derivedfun();
	    	b.derivedfun();
	        d.show();
	        d.derivedfun();
	    }
	
	
	
	
	
	
	
	Animal(){
		System.out.println("Animal Constructor");
	}
	
	static {
		System.out.println("Animal Static Block");
	}
	
   public  void show() {
       System.out.println("Base::show() called");
    }
 
   void basefun() {
	   System.out.println("Base fun called");
   }
   void derivedfun() {
		System.out.println("child");
	}
 
}	
  
class Dog extends Animal {
	
	
	public void show() {
       System.out.println("Derived::show() called");
    }
}
  
class Main {
   
}