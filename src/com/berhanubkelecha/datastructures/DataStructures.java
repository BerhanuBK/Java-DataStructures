package com.berhanubkelecha.datastructures;

public class DataStructures {

	public static void main(String[] args) {
		MyStack myStack=new MyStack(5);
		
		myStack.push(25);
		System.out.println(myStack.peek());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.isFull());
		
		System.out.println("Summing 5 Numbers");
		
		AddingNumbers addingNumbers=new AddingNumbers(5);
		
		System.out.println("The summation is"+addingNumbers.add());
		
		System.out.println("Working on Arrays");
		
		int[] Array=new int[50];
		
		for( int i=0; i<50; i++) {
			Array[i]=10+(int)(10 *Math.random());
		//	System.out.println(Array[i]);
		}
		
		int searchNum=10+(int)(10 *Math.random());
		
		System.out.println(searchNum);
				
		boolean flag=false;
		
		for (int j=0;j<50;j++) {
			if(Array[j]==searchNum)
				System.out.println(searchNum+" is found at "+j);
			flag=true;	
		}
		
		if(!flag)
			System.out.println("Not Found");	
		
		System.out.println("Finding the first repeating and non repeating letters in Arrays");
		
		String wordsRepeating="heWordsthatRepeat";
		char chars[]=wordsRepeating.toCharArray();
		
		flag=false;
		
		char[] foundChars=new char[wordsRepeating.length()];
		char[] nonfoundChars=new char[wordsRepeating.length()];
		
		for(int i=0; i<chars.length; i++){
			flag=false;
			for (int j=0; j<chars.length; j++){
					if((chars[i]==chars[j])&&(j!=i)) {						
						flag=true;
						foundChars[i]=chars[i];
					}					
			}
			
			if(flag==false)
				nonfoundChars[i]=chars[i];
		}
		
		
		for (int k=0;k<chars.length;k++)
		{
			if(foundChars[k] != Character.MIN_VALUE) {		
				System.out.println("Repeating: the first repeating letter : "+foundChars[k]);
				break;
			}
			
		}
		for (int k=0;k<chars.length;k++)
		{
			if(nonfoundChars[k] != Character.MIN_VALUE) {		
				System.out.println("Non Repeating: the first non repeating letter :"+nonfoundChars[k]);
				break;
			}
		}
	}
}
