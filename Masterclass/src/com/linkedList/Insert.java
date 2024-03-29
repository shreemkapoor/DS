package com.linkedList;

public class Insert {
	
	 Node head;  // head of list 
	  
	    /* Linked list Node*/
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
	    
	    public void insertAfter(Node prev_node,int new_data) {
	    	 if (prev_node == null) 
	         { 
	             System.out.println("The given previous node cannot be null"); 
	             return; 
	         } 
	    	Node new_node = new Node(new_data);
	    	new_node.next=prev_node.next;
	    	prev_node.next=new_node;
	    }
	    
	    public void append(int new_data) {
	    	Node new_node = new Node(new_data);
	    	if(head==null) {
	    		head= new Node(new_data);
	    		return;
	    	}
	    	
	    	new_node.next = null; 
	    	Node last=head;
	    	while(last.next!=null) {
	    		last=last.next;
	    	}
	    	
	    	last.next=new_node;
	    	return;
	    }
	    
	    public void printlist() {
	    	Node headnode=head;
	    	while(headnode!=null) {
	    		System.out.print(" "+headnode.data);
	    		headnode=headnode.next;
	    	}
	    }
	    
	    
	public static void main(String[] args) {
		  /* Start with the empty list */
		Insert llist = new Insert(); 
  
        // Insert 6.  So linked list becomes 6->NUllist 
        llist.append(6); 
        // Insert 7 at the beginning. So linked list becomes 
        // 7->6->NUllist 
        llist.push(7); 
        // Insert 1 at the beginning. So linked list becomes 
        // 1->7->6->NUllist 
        llist.push(1); 
        // Insert 4 at the end. So linked list becomes 
        // 1->7->6->4->NUllist 
        llist.append(4); 
        // Insert 8, after 7. So linked list becomes 
        // 1->7->8->6->4->NUllist 
        llist.insertAfter(llist.head.next, 8); 

        System.out.println("\nCreated Linked list is: "); 
        llist.printlist(); 
			
	}
}
