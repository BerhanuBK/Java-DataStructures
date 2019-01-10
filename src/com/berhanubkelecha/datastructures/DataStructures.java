package com.berhanubkelecha.datastructures;

public class DataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack myStack=new MyStack(5);
		
		myStack.push(25);
		System.out.println(myStack.peek());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.isFull());
		
		System.out.println("Summing 5 Numbers");
		
		AddingNumbers addingNumbers=new AddingNumbers(5);
		
		System.out.println("The summation is"+addingNumbers.add());
	}

}
