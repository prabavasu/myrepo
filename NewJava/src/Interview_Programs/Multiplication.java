package Interview_Programs;

import java.util.Scanner;
//write  a program to print the  multiplication table
public class Multiplication {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the table :");
		int t =in.nextInt();
		System.out.println("Enter the limit :");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(t+ "x" + i + " = "+(t*i));//(2 x 1 = (2*1))

		}
	}
}
