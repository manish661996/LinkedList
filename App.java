package com.bridgelabz.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
   
    	
    	// creating linked list and appending nodes at the starting
    	//creating first node
    	MyNode firstnode = new MyNode();
    	firstnode.setKey();
    	firstnode.setNext(null);
    	 System.out.println("first node key value : " +firstnode.getKey());
         System.out.println("first node next value : " +firstnode.getNext());
         System.out.println("Hash code of first node : "+ firstnode.hashCode());
         System.out.println("After creating first node head is pointing to : " +MyNode.setHead(firstnode));
         System.out.println("After creating first node tail is pointing to : " +MyNode.setTail(firstnode));
         System.out.println(MyNode.setHead(firstnode));
         System.out.println(MyNode.setTail(firstnode));
         
         //creating second node
         MyNode secondnode = new MyNode();
         secondnode.setKey();
         secondnode.setNext(firstnode);
         System.out.println("second node key value : " +secondnode.getKey());
         System.out.println("second node next value : " +secondnode.getNext());
         System.out.println("Hash code of second node : "+ secondnode.hashCode());
         System.out.println("After creating second node head is pointing to : " +MyNode.setHead(secondnode));
         System.out.println("After creating second node tail is pointing to : " +MyNode.setTail(secondnode));
         
         //creating third node
         MyNode thirdnode = new MyNode();
         thirdnode.setKey();
         thirdnode.setNext(secondnode);
         System.out.println("third node key value : " +thirdnode.getKey());
         System.out.println("third node next value : " +thirdnode.getNext());
         System.out.println("Hash code of third node : "+ thirdnode.hashCode());
         System.out.println("After creating third node head is pointing to : " +MyNode.setHead(thirdnode));
         System.out.println("After creating third node tail is pointing to : " +MyNode.setTail(thirdnode));
         
         
         
         
    }
}
