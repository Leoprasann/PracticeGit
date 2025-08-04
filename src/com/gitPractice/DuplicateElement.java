package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
public static void main(String[] args) {
	int arr[]= {1,6,4,7,8,9,4,2,7};
	Set<Integer> uniqueNumber=new HashSet<>();
	boolean isDuplicateExit=false;
	for( int i=0;i<arr.length;i++) {
		if(uniqueNumber.contains(arr[i])) {
			isDuplicateExit=true;
			System.out.println("Duplicate Element" + arr[i]);
			
		}
		else {
			uniqueNumber.add(arr[i]);
			
		}
	}
	if(!isDuplicateExit) {
		System.out.println(-1);
	}
}
}
