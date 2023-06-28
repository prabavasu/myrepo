package Basics;

import java.util.Scanner;

public class Get_Input_From_Users {

	public static void main(String[] args) {
		//Get_Input_From_Users - Scanner Class
		
		//a2+b2+2ab
		Scanner in =new Scanner(System.in);
		//int a,b,c;
		float a,b,c;
		System.out.println("Enter 2 nos");
		//a=in.nextInt();
		//b=in.nextInt();
		a=in.nextFloat();
		b=in.nextFloat();
		c=(a*a)+(b*b)+(2*a*b);
		System.out.println("Result is :"+c);
			/*
			 * in.nextInt();
			 * in.nextFloat();
			 * in.nextDouble();
			 * in.next();Single word -String
			 * in.nextLine(); More Words 
			 * 
			 */
	}

}
