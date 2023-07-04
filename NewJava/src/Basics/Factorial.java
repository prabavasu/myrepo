package Basics;

import java.util.Scanner;

public class Factorial {
//Most asking Interview Question
	
//1.Write a program to find factorial of given number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();//5
			int f=1;
		for(int i=1;i<=n;i++)//1<=5 2<=5 3<=5 4<=5 5<=5 6<=5
		{
			f=f*i;//1*1 => 1*2 => 2*3 =>6*4 => 24*5 =>120 
		}
		System.out.println("Factoril of"+ n+"is"+f);

	}
	// don't put i =0 because multiplication
}
