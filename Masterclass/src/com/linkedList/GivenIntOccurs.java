package com.linkedList;

public class GivenIntOccurs {
	
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
		Node new_node = new Node( new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public void getCount(int num) {
		Node current = head;
		int count=0;
		while(current!=null) {
			if(current.data==num) {
				count++;
			}
			current=current.next;
		}
		System.out.println(num+" comes "+count+" times");
	}
	
	public static void main(String[] args) {

		GivenIntOccurs llist = new GivenIntOccurs();
		llist.push(1);
		llist.push(7);
		llist.push(1);
		llist.push(1);
		llist.push(6);
		llist.push(6);
		llist.push(6);
		llist.push(6);
		llist.push(6);
		
		llist.getCount(6);
	}

}
