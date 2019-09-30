package com.linkedList;

import com.linkedList.NthNode.Node;

public class RemoveDupSorted {
	Node head;
	
	class Node{
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
	
	void remove() {
		  Node curr = head; 
		  
	        /* Traverse list till the last node */
	        while (curr != null) { 
	             Node temp = curr; 
	            /*Compare current node with the next node and  
	            keep on deleting them until it matches the current  
	            node data */
	            while(temp!=null && temp.data==curr.data) { 
	                temp = temp.next; 
	            } 
	            /*Set current node next to the next different  
	            element denoted by temp*/
	            curr.next = temp; 
	            curr = curr.next; 
	        } 
	}
			
	 public void printList() {
		  Node tnode = head; 
	         while (tnode != null) 
	         { 
	             System.out.print(tnode.data+" ");
	             tnode = tnode.next; 
	         } 
	}
   

	public static void main(String[] args) {

		RemoveDupSorted rem = new RemoveDupSorted();
		rem.push(20);
		rem.push(16);
		rem.push(13);
		rem.push(13);
		rem.push(12);
		rem.push(11);
		
		rem.remove();
		rem.printList();
	}

}
