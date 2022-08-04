package com.globalogic.ds;
import java.util.Stack;
public class StackCollections {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
//		while(!stack.isEmpty()){
//			System.out.println(stack.peek());
//			stack.pop();
//		}
	
		stack.clear();
		
		while(!stack.isEmpty()){
			System.out.println(stack.peek());
			stack.pop();
		}
	}

}
