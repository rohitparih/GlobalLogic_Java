package com.globalogic.ds;

public class LinkedList {
	Node head;
//	Node Class
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next=null;
		}
	}
	
	public void addF(String data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.next=head;
		head = newNode;
	}
	
	public void addL(String data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next!=null){
			currNode = currNode.next;
		}
		currNode.next=newNode;
	}
	
	public void printList(){
		if(head==null){
			System.out.println("Empty List");
			return;
		}
		Node currNode = head;
		while(currNode!=null){
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}
	
	public void deleteF(){
		if(head==null){
			System.out.println("Empty List");
			return;
		}
		head = head.next;
	}
	
	public void deleteL(){
		if(head==null){
			System.out.println("Empty List");
			return;
		}
		if(head.next==null){
			head=null;
			return;
		}
		Node secondLastNode=head;
		Node lastNode=head.next;
		while(lastNode.next!=null){
			lastNode=lastNode.next;
			secondLastNode=secondLastNode.next;
		}
		secondLastNode.next=null;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addF("am");
		list.addF("I");
		list.addL("Rohit");
		list.addL("Parihar");
		list.printList();
		list.deleteL();
		list.deleteF();
		list.printList();
	}
}
