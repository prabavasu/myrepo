package Basics;

import java.util.Scanner;

public class if_Statement {

	//if Condition in java
	
	public static void main(String[] args) {
		int age=18;
		System.out.println("Enter your age :");
		Scanner in=new Scanner(System.in);
		age=in.nextInt();
		if(age>=18)
		{
			System.out.println("You are eliible for vote.... ");
		}
	}

}
