package Interview_Programs;

import java.util.Scanner;

public class Prime_Numbers {
//write a program to print prime numbers between 1 to
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int f=0;
		for(int no=1;no<=999;no++)
		{
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				f++;
			}
		}
		if(f==2)
		{
			System.out.println(no+ " is a  Prime Number");

		}
f=0;
}
}
}