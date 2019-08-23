package com.linkedList;

public class Loop {
	
	Node head;
	Node slow ;
	Node fast ;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public void append(int data) {
		Node new_node = new Node(data);
		if(head==null) {
			head=new_node;
			return;
		}
		new_node.next=null;
		Node last= head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=new_node;
		return;
	}

	
	public void printlist() {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	public void loop(int k) {
		Node last=head;
		int count=0;
		while(count<k) {
			last=last.next;
			count++;
		}
		Node joint= last;
		
		while(last.next!=null) {
			last=last.next;
		}
		last.next=joint;
	}
	
	public void detectloop() {
		 slow =head;
		 fast =head;
		boolean loopExists=false;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast)
			{
				loopExists=true;
				System.out.println("Loop exists");
				break;
			}
		}
		if(loopExists==true) {
			slow=head;
			while(slow!=fast) {
				slow=slow.next;
				fast=fast.next;
			}
			System.out.println(slow.data+" is the starting point of loop");
		}
		else {
			System.out.println("Loop does not exist");
		}
	}
	
	public void removeLoop() {
		while(slow!=fast) {
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Loop loop = new Loop();
		loop.append(1);
		loop.append(2);
		loop.append(3);
		loop.append(4);
		loop.append(5);
		loop.append(6);
		
		loop.loop(2);
		
		//loop.printlist();
		
		loop.detectloop();
	}

}
