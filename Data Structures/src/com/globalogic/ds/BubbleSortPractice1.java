package com.globalogic.ds;

public class BubbleSortPractice1 {
	public static void main(String[] args) {
		int[] array = {6,3,7,3,1,9,5};
		
//		Bubble Sort
		for(int i=0 ; i<array.length ; i++){
			for(int j=0; j<array.length-1-i; j++){
				if(array[j]>array[j+1]){
					
//					Swaping Code
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int a : array){
			System.out.println(a);
		}
	}
}
