package com.linkedList;

public class PrintMiddle {
	
	Node head;
	
	class Node{
		Node next;
		int data;
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
	
	public void getMiddle() {
	    Node current=head;
	    int length=0;
	    Node middle = head;
	    while(current.next != null){
	          length++;
	          if(length%2 ==0){
	              middle = middle.next;
	          }
	          current = current.next;
	      }
	    
	      if(length%2 == 1){
	          middle = middle.next;
	      }

	      System.out.println("length of LinkedList: " + length);
	      System.out.println("middle element of LinkedList : " + middle.data);
	    
	}
	
	public void middle() {
		Node slow =head;
		Node fast = head;
		if(head!=null) {
			while (fast!=null && fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			System.out.println("Middle element is :" +slow.data);
		}
				
	}

	public static void main(String[] args) {
		PrintMiddle print = new PrintMiddle();
		print.push(1);
		print.push(2);
		print.push(3);
		print.push(4);
		//print.push(5);
		print.middle();
	}

}
