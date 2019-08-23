package com.linkedList;

import com.linkedList.Insert.Node;

public class NthNode {

	Node head;
	
	  class Node 
	    { 
	        int data; 
	        Node next; 
	        Node(int d) {data = d; next = null; } 
	    } 
	    
	    public void push(int new_data) {
	    	Node new_node = new Node(new_data);
	    	new_node.next=head;
	    	head=new_node;
	    }
	    
	    public void printList() {
			  Node tnode = head; 
		         while (tnode != null) 
		         { 
		             System.out.print(tnode.data+" ");
		             tnode = tnode.next; 
		         } 
		}
	    
	    
	    public void getElement(int n) {
	    	  Node tnode = head; 
			  int count=0;
		/*
		 * while(tnode.next!=null) { tnode=tnode.next; }
		 */
		         while (tnode != null) 
		         { 
		        	 if(count==n) {
		        		 System.out.println("Element is : "+tnode.data);
		        	 }
		             tnode = tnode.next; 
		             count++;
		         } 
	    	
	    }
	
	public static void main(String[] args) {
		NthNode llist = new NthNode();
		llist.push(1);
		llist.push(7);
		llist.push(4);
		llist.push(2);
		llist.push(6);
		
		//llist.printList();
		System.out.println();
		llist.getElement(3);
	}

}
