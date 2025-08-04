package com.gitPractice;

public class DuplicateArray {
	public static void main(String[] args) {
		int arr[]= {10,20,10,30,50,20};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]){
					System.out.println(" Duplicate number is the:"+arr[j]);
					
				}
		}
	}
		
	}
}



