package com.linkedList;

import java.util.LinkedList;

import com.linkedList.NthNode.Node;

public class PairwiseSwap {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void pairwise() {
		Node temp= head;
		while(temp!=null && temp.next!=null){
			int k=temp.data;
			temp.data=temp.next.data;
			temp.next.data=k;
			temp=temp.next.next;
		}
	}
	
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
	}
	
	 public void push(int new_data) {
	    	Node new_node = new Node(new_data);
	    	new_node.next=head;
	    	head=new_node;
	    }
	
	public static void main(String[] args) {

		
		PairwiseSwap pair = new PairwiseSwap();
		pair.push(1);
		pair.push(2);
		pair.push(3);
		pair.push(4);
		pair.push(5);
		pair.push(6);
		pair.pairwise();
		pair.print();
	}

}
