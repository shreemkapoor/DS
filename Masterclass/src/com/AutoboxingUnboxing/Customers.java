package com.AutoboxingUnboxing;

import java.util.ArrayList;

public class Customers {
 
	private String name;
	ArrayList<Double> transactions = new ArrayList<Double>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Double> getDoubleList() {
		return transactions;
	}		
	public void setDoubleList(ArrayList<Double> transactions) {
		this.transactions = transactions;
	}
	
	
	public Customers(String name, double initialAmount) {
		this.name = name;
		this.transactions= new ArrayList<Double>();	
		addtransaction(initialAmount);
	}	
	
	public void addtransaction(double amount) {
		transactions.add(amount);
	}
	
	
}
