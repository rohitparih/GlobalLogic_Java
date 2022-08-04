package com.globalogic.ds;

public class SelectionSort {
	public static void print(int arr[]){
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,1,8,7,4};
		
		//Selection Sort
		for(int i=0 ; i<arr.length ; i++){
			int smallest = i;
			for(int j=i+1 ; j<arr.length ; j++){
				if(arr[smallest]>arr[j]){
					smallest=j;
				}
			}
			int temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		print(arr);
	}
}
