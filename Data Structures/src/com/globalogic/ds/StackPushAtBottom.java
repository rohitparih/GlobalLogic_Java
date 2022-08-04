package com.globalogic.ds;

import java.util.Stack;

public class StackPushAtBottom {
	public static void pushAtBottom(int data, Stack<Integer> Stack){
		if(Stack.isEmpty()){
			Stack.push(data);
			return; 
		}
		int top = Stack.pop();
		pushAtBottom(data, Stack);
		Stack.push(top);
	}
	public static void main(String[] args) {
		Stack<Integer> Stack = new Stack<>();
		Stack.push(1);
		Stack.push(2);
		Stack.push(3);
		Stack.push(4);
		Stack.push(5);
		pushAtBottom(7, Stack);
		while(!Stack.isEmpty()){
			System.out.println(Stack.peek());
			Stack.pop();
		}
	}
}
