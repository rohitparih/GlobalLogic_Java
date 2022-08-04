package com.globalogic.ds;

public class CircularQueue {
	static class CQueue {
		static int[] arr;
		static int size;
		static int rear = -1, front = -1;

		CQueue(int n) {
			this.size = n;
			arr = new int[n];
		}

		public static boolean isEmpty() {
			return rear == -1 && front == -1;
		}

		public static boolean isFull() {
			return (rear + 1) % size==front;
		}

		public static void add(int data) {
			if (isFull()) {
				System.out.println("OverFlow");
				return;
			}
			if (isEmpty()) {
				front = 0;
			}
			rear = (rear + 1) % size;
			arr[rear] = data;
		}

		public static int remove() {
			if (isEmpty()) {
				System.out.println("Already Empty");
				return -1;
			}
			int result = arr[front];
			if (front == rear) {
				front = rear = -1;
			} else {
				front = (front + 1) % size;
			}
			return result;
		}
		
		public static int peek(){
			if (isEmpty()) {
				System.out.println("Circular Queue is Empty");
				return -1;
			}
			return arr[front];
		}
	}
	
	public static void main(String[] args) {
		CQueue q = new CQueue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		
		while(!q.isEmpty()){
			System.out.println(q.remove());
		}
	}
}
