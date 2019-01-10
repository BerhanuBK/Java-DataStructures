package com.berhanubkelecha.datastructures;

public class MyStack {
	public int maxsize;
	private long[] stackArray;
	public int top;
	
	MyStack(){
		maxsize=0;
		stackArray=new long[maxsize];
		top=-1;
	}
	
	public MyStack(int s) {
		maxsize=s;
		stackArray=new long[maxsize];
		top=-1;
	}
	
	public void push(long i) {
		stackArray[++top]=i;
	}
	
	public long pop() {
		return stackArray[top--];
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isFull() {
		return (top==(maxsize-1));
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
}
