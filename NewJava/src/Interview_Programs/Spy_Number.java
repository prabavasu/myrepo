package Interview_Programs;

import java.util.Scanner;

public class Spy_Number {

	//Write a program to check the given number is spy or not;
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in) ;
		System.out.println("Enter the number : ");
		int n =in.nextInt();
		int sum=0,prod=1;
        int temp =n;
		while(n>0)
		{
			int digit = n%10;
			sum +=digit;
			prod *=digit;
			n=n/10;

		}
		if(sum==prod)
		{
			System.out.println( temp + " is a Spy Number");

		}else
		{
			System.out.println(temp + " not a Spy  Number ");
		}

	}

}


