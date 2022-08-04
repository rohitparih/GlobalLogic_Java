package com.globalogic.ds;

public class QueueLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	static class LQueue{
		static Node head = null;
		static Node tail=null;
		
		public static boolean isEmpty(){
			return head==null & tail==null;
		}
		
		public static void add(int data){
			Node newNode = new Node(data);
			if(isEmpty()){
				head=tail=newNode;
				return;
			}
			tail.next=newNode;
			tail=newNode;
		}
		
		public static int remove(){
			if(isEmpty()){
				System.out.println("Queue is alredy Empty");
				return -1;
			}
			int front = head.data;
			if(head==tail){
				tail=null;
			}
			head=head.next;
			return front;
		}
		
		public static int peek(){
			if(isEmpty()){
				System.out.println("Empty Queue");
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String[] args) {
		LQueue q = new LQueue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.remove();
		while(!q.isEmpty()){
			System.out.println(q.remove());
		}
	}
}
