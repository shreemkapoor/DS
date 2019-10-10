package com.inheritance;

class Animal {
	
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
    public static void main(String[] args) {
    	//Dog a = new Animal();
    	Animal an = new Animal();
    	Dog d= new Dog();
    	Animal b = new Dog();
        b.show();
    	//Animal a = new Animal();
    	
    	
    	//d.derivedfun();
    	b.derivedfun();
        d.show();
        d.derivedfun();
    }
}