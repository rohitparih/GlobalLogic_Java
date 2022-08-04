package com.globalogic.ds;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class QueueArray {
	static class Queue {
		static int[] arr;
		static int size;
		static int rear= -1;
		
		Queue(int n){
			arr=new int[n];
			this.size=n;
		}
		
		public static boolean isempty(){
			return rear==-1;
		}
		
		public static void add(int data){
			if(rear==size-1){
				System.out.println("OverFlow");
				return;
			}
			rear++;
			arr[rear]=data;
		}
		
		public static int remove(){
			if(isempty()){
				System.out.println("Queue is already Empty");
				return -1;
			}
			int front = arr[0];
			for(int i=0 ; i<rear ; i++){
				arr[i]=arr[i+1];
			}
			rear--;
			return front;
		}
		
		public static int peek(){
			if(isempty()){
				System.out.println("Empty Queue");
				return -1;
			}
			return arr[0];
		}
	}
	public static void main(String[] args) {
		Queue qu = new Queue(4);
		qu.add(1);
		qu.add(2);
		qu.add(3);
		qu.add(4);
		
		qu.remove();
		System.out.println(qu.peek());
		}
	}

