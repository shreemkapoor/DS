package com.constructors;

/* Whenever a class (child class) extends another class (parent class),
 *  the sub class inherits state and behavior in the form of variables and methods from its super class
 *   but it does not inherit constructor of super class because of following reasons:

Constructors are special and have same name as class name. So if constructors were inherited in child class
 then child class would contain a parent class constructor which is against the constraint that constructor 
 should have same name as class name */

class Parent
{
    public Parent()
    {
        System.out.println("Parent class no-args constructor called");
    }
    public Parent(String name)
    {
        System.out.println("Parent class Parameterized constructor called by "+name);
    }
}

/* public */class Child extends Parent
{
    public Child()
    {
        this("JIP");
        System.out.println("Child class no-args constructor called");
    }
    public Child(String name)
    {
        super("JIP");
        System.out.println("Child class Parameterized constructor called by "+name);
    }
    public static void main(String args[])
    {
        Child c = new Child();
    }
}