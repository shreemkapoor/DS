package com.linkedList;

import com.linkedList.Deletion.Node;

public class Length {
	
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
	
	public void printList() {
		  Node tnode = head; 
		  int count=0;
	         while (tnode != null) 
	         { 
	             System.out.print(tnode.data+" ");
	             tnode = tnode.next; 
	             count++;
	         } 
	         System.out.println("\nNumber of elements are :"+count);
	}

	
	 public int getCountRec(Node node) 
	    { 
	        // Base case 
	        if (node == null) 
	            return 0; 
	  
	        // Count is this node plus rest of the list 
	        return 1 + getCountRec(node.next); 
	    } 
	  
	    /* Wrapper over getCountRec() */
	    public int getCount() 
	    { 
	        return getCountRec(head); 
	    } 
	    

	public static void main(String[] args) {

		Length llist = new Length();
		llist.push(1);
		llist.push(7);
		llist.push(4);
		llist.push(2);
		llist.push(6);
		
		llist.printList();
		
		 System.out.println("Count of nodes is " + 
                 llist.getCount()); 
	}

}
