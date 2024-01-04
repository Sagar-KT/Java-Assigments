package com.Assigment;

import java.util.Scanner;

public class Swap {

	
	public static void swap(Scanner sc) {
		System.out.println("enter A");
		int a = sc.nextInt();
		System.out.println("enter B");
		int b = sc.nextInt();

		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap"+a);
		System.out.println("After swap"+b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		swap(sc);

	}

}
