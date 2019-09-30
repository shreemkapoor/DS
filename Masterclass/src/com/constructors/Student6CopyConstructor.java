package com.constructors;


//Java program to initialize the values from one object to another object.  
class Student6CopyConstructor{  
  int id;  
  String name;  
  //constructor to initialize integer and string  
  Student6CopyConstructor(int i,String n){  
  id = i;  
  name = n;  
  }  
  //constructor to initialize another object  
  Student6CopyConstructor(Student6CopyConstructor s){  
  id = s.id;  
  name =s.name;  
  }  
  void display(){System.out.println(id+" "+name);}  
 
  public static void main(String args[]){  
  Student6CopyConstructor s1 = new Student6CopyConstructor(111,"Karan");  
  Student6CopyConstructor s2 = new Student6CopyConstructor(s1);  
  s1.display();  
  s2.display();  
 }  
}  