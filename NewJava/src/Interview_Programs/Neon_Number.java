package Interview_Programs;

import java.util.Scanner;

public class Neon_Number {

//Write a program to check the given number is NeonNumber or not;
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in) ;
		System.out.println("Enter the number : ");
		int n =in.nextInt();
		int sum=0;
		int square =n*n;
		while(square>0)
		{
			int digit = square%10;
			sum +=digit;
			square =square/10;

		}
		if(sum==n)
		{
			System.out.println(n + " is a Neon Number ");

		}else
		{
			System.out.println(n +" not a Neon Number ");
		}

	}

}
