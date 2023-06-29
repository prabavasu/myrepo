package Basics;

import java.util.Scanner;

//do while  initialize values print and last check condition
//do loop is an exit check  loop

public class Do_While_Loop {

	public static void main(String[] args) {
		System.out.println("Enter your limit :");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int i=2;
		do
		{
			System.out.println(i);
			i+=2;
		}while(i<=n);

	}
}