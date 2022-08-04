package com.globalogic.ds;

public class SelectionSortPractice1 {
	public static void swap(int f, int s){
		int temp = f;
		f=s;
		s=temp;
	}
	
//	public static void print(int array[]){
//		for(int a : array){
//			System.out.println(a);
//		}
//	}
	
	public static void print(int arr[]){
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] array = { 7, 3, 8, 2, 6, 94, 1 };
		for(int i=0 ; i<array.length ; i++){
			int smallest = i;
			for(int j=i+1 ; j<array.length ; j++){
				if(array[j]<array[smallest]){
					smallest = j;
				}
			}
//			swap(array[smallest], array[i]);
			int temp = array[smallest];
			array[smallest]=array[i];
			array[i]=temp;
		}
		print(array);
	}
}
