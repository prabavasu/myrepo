package Basics;

import java.util.Scanner;

public class Sum_and_Average {
//write  program to find sum and average of given n numbers. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n=sc.nextInt();
		int sum=0,a;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Number :"+i+" ");
			a=sc.nextInt();
			sum+=a;//sum=sum+a;
		}
		System.out.println("The Sum  of given number is :"+sum);
		System.out.println("The average  of given number is :"+sum/n);

	}

}
