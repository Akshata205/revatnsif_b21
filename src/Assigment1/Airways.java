package Assigment1;

import java.util.Scanner;

public class Airways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String source;
		String destination;
		
		try(Scanner sc=new Scanner(System.in);){
		
		
		System.out.println("enter the name");
		name=sc.nextLine();
		
		
		System.out.println("enter the source");
		source=sc.nextLine();
		
		System.out.println("enter the destination");
		destination=sc.nextLine();
		
		
		System.out.println("dear "+name+",welcome to onboard from "+source+" to "+destination+" thank you for choosing sky airlines.Enjoy your flight");
		}


	}

}
