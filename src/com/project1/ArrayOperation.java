package com.project1;

import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {
		
		
		int arr[] = {15,25,35,45,55};
		int arr2[] = new int [6];
		
		System.out.println("Length of arr2 :"+arr2.length);
		
		for(int i=0; i<arr2.length ; i++ ) {
			System.out.println("Enter Your Number:");
			Scanner sc = new Scanner(System.in);
			int aa = sc.nextInt();
			arr2[i]=aa;
		}
        System.out.println("Valus in array:");
        for (int ar:arr2) {
        	System.out.println(ar);
        }
	}

}
