package com.linkedList;

public class Deletion {
	
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
	    
	     public void printList() 
	     { 
	         Node tnode = head; 
	         while (tnode != null) 
	         { 
	             System.out.print(tnode.data+" "); 
	             tnode = tnode.next; 
	         } 
	     } 
	     
	     public void delete(int key) {
	    	 Node temp=head;
	    	 Node prev=null;
	    	 
	    	 if(temp !=null && temp.data==key) {
	    		 head=temp.next;
	    		 return;
	    	 }
	    	 
	    	 while(temp != null && temp.data !=key) {
	    		 prev=temp;
	    		 temp=temp.next;
	    	 }
	    	 
	    	  if (temp == null) { return;} 
	    	  
	          // Unlink the node from linked list 
	          prev.next = temp.next; 
	     }
	     
	     //Delete complete list at once.
		    void deleteList() 
		    { 
		        head = null; 
		    } 
		
	   
	    
	public static void main(String[] args) {

		Deletion new_node= new Deletion();
		new_node.push(7);
		new_node.push(1);
		new_node.push(3);
		new_node.push(2);
		
		new_node.printList();
		
		new_node.delete(1); // Delete node at position 4 
		  
	        System.out.println("\nLinked List after Deletion at position 4:"); 
	        new_node.printList(); 
	}

}
