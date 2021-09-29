package com.bridgelabz.LinkedList;

import java.util.Scanner;

public class MyNode<K> {
	private static MyNode head;
	private static MyNode tail;
	private static int counter;
	private int key;
	private MyNode next;
	
	 {
		
		counter = 0;
	}
	
	MyNode(){
		counter++;
		System.out.println(" node has been ceated , now set values to them");
	}
	
	public void setKey() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of key of Node");
		this.key = sc.nextInt();
	}
	
	public int getKey() {
		return this.key;
	}
	
	public void setNext(MyNode m) {
		this.next = m;
	}
	
	public MyNode getNext() {
		
		return this.next;
	}
	
	//method to get how many nodes have been created
	public int getCounter() {
		return MyNode.counter;
	}
	
	//method to set head value
	public static int setHead(MyNode n) {
		if(MyNode.counter == 0 ) {
			MyNode.head = null;
			return 0;
		}
		else {
			MyNode.head = n;
			return n.hashCode();
		}
	}
	
	//method to set tail
	public static int setTail(MyNode p) {
		MyNode End =p;
		if(MyNode.counter == 0) {
			MyNode.tail = null;
			return 0;
		}
		else {
			if(End.getNext() == null) {
				MyNode.tail = p;
				return p.hashCode();
			}
			else {
				while(End.getNext()!= null) {
					End = End.getNext();
				}
				MyNode.tail = End;
				return End.hashCode();
				
			}
			
		}
	}
	
	

}
