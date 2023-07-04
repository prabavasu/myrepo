package Basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();//5
		int a=-1,b=1,c;
		for(int i=1;i<=n;i++)//1<=5 2<=5 3<=5 4<=5 4<=5 5<=5 6<=5
		{
			c=a+b;//-1+1 =>0 1+0 =>1 0+1  => 1 1+1 => 2 1+2 =>3
			System.out.println(c);
			a=b;  //1 -0 1 1 2
			b=c;//0 1 1 2 3

		}

	}

}
