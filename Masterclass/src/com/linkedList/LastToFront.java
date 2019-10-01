package com.linkedList;

public class LastToFront {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void push(int data) {
		Node node = new Node(data);
		node.next=head;
		head=node;
	}
	
	void lasttofront() {
		Node last=head;
		Node prev=null;
		while(last.next!=null) {
			prev=last;
			last=last.next;
		}
		
		prev.next=null;
		last.next=head;
		head=last;
		//System.out.println(last.data+" "+prev.data);
	}
	
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		LastToFront pair = new LastToFront();
		pair.push(1);
		pair.push(2);
		pair.push(3);
		pair.push(4);
		pair.push(5);
		pair.push(6);
		pair.lasttofront();
		pair.print();
	}

}
