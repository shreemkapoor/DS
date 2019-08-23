package com.AutoboxingUnboxing;

import java.util.ArrayList;

public class Branches {
	
	private String name;		
	ArrayList<Customers> customerList= new ArrayList<Customers>();
	
	
	public boolean addCustomer(String customerName, double initialAmount) {
		customerList.add(new Customers(customerName, initialAmount));
		return true;
	}
}
