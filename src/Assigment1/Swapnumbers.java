package Assigment1;

import java.util.Scanner;

public class Swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int first=sc.nextInt();
		
		System.out.println("enter second number");
		int second=sc.nextInt();
		
		first=first^second;
		second=first^second;
		first=first^second;
		
		System.out.println("after swaping");
		System.out.println("first number"+first);
		System.out.println("second number"+second);
		

	}

}
