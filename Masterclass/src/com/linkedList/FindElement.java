package com.linkedList;

import com.linkedList.Insert.Node;

public class FindElement {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	  public void push(int new_data) {
	    	Node new_node = new Node(new_data);
	    	new_node.next=head;
	    	head=new_node;
	    }
	
	public boolean search(int key) {
		Node current=head;
		while(current !=null ) {
			if(current.data ==key) {
				return true;
			}
			current=current.next;
		}
		return false;
		
	}
	
	//recursive find element
	public boolean searchrecur(Node head,int key) {
		
		if(head==null) {
			return false;
		}
		
		if(head.data==key) {
			return true;
		}
		
		return searchrecur(head.next,key);
	}
			
			
	public static void main(String[] args) {

		FindElement llist = new FindElement(); 
		   
	        /*Use push() to construct below list 
	        14->21->11->30->10  */
	        llist.push(10); 
	        llist.push(30); 
	        llist.push(11); 
	        //llist.push(21); 
	        llist.push(14); 
	  
	        if (llist.searchrecur(llist.head,2)) { 
	            System.out.println("Yes"); 
	        }
	        else
	            System.out.println("No"); 
	}

}
