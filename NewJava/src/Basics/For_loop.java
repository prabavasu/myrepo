package Basics;

import java.util.Scanner;

//For loop - Initialize check condition and increment or decrement in single line
//for loop also entry check
public class For_loop {

	public static void main(String[] args) {
		System.out.println(" Enter the Limit :");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}

	}
}