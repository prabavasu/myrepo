package Interview_Programs;

import java.util.Scanner;

public class Perfect {
//write a program to check the given number is perfect number or not.
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in) ;
		System.out.println("Enter the number : ");
		int n =in.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				{
		sum+=i;//1+2+3
				}
	}
if(sum==n)
{
	System.out.println(n + " is a perfect number");
	
}else
{
	System.out.println(n + "not a perfect number");
	
}
}
}
