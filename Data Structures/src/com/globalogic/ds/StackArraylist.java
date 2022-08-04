package com.globalogic.ds;

import java.util.*;

import com.globalogic.ds.StackLinkedListScratch.Stack;

public class StackArraylist {
	static class StackA {
		static ArrayList<Integer> list = new ArrayList<>();

		public static boolean isEmpty() {
			return list.size() == 0;
		}

		public static void push(int data) {
			list.add(data);
		}

		public static int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return top;
		}

		public static int peek() {
			if (isEmpty()) {
				return -1;
			}
			return list.get(list.size() - 1);
		}
	}

	public static void main(String[] args) {
		StackA Stack = new StackA();
		Stack.push(1);
		Stack.push(2);
		Stack.push(3);
		Stack.push(4);
		Stack.push(5);
		
//		System.out.println(Stack.peek());
//		System.out.println(Stack.pop());
//		System.out.println(Stack.peek());
		while(!Stack.isEmpty()){
			System.out.println(Stack.peek());
			Stack.pop();
		}
	}
}
