package com.collections.collect;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		//for adding the element at particular index
		l1.add(4,16);
		
		//remove element at the specified position
		l1.remove(0);
		
		//it will set new element at particular index by replacing initial element
		l1.set(2, 25);
		
		//for Importing all the elements of l2 in l1
		l1.addAll(l2);
		
		//it will check if that element is contained in list or not
		l1.contains(2);
		
		//checking the index of element from first
		l1.indexOf(1);
		
		//checking the element of index from last too
		l1.lastIndexOf(4);
		
		//returns the size of the ArrayList
		l1.size();
		
		//sort the elements in list by ascending order
		Collections.sort(l1);
		
		//sorting in descending order
		Collections.sort(l1, Collections.reverseOrder());
		
		
		for(int i=0 ; i<l1.size() ; i++) {
			System.out.print(l1.get(i));
			System.out.print(", ");
		}
	}
}
