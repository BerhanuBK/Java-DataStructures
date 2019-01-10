package com.berhanubkelecha.datastructures;

public class AddingNumbers {

	public long sum=0;
	public int num;
	public MyStack myStack;
	
	public AddingNumbers(int number) {
		num=number;
		myStack = new MyStack(num);
	}
	
	public long add() {
		
		while (num>0){
			myStack.push(num--);
			
		}
		
		while(!myStack.isEmpty()) {
			
			System.out.println(myStack.peek()+"\t"+sum);
			sum+=myStack.pop();
			
		}
		
		return sum;
	}
	
	
}
