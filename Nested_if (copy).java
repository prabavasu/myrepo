package Basics;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {

		/*
		   A company insure its driver inn the following cases:
		        a.if the driver is married.
		        b.if the driver is unmarried, male & above 30 years of age.
		        c.If the driver is unmarried,female & above 25 years of age.

		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Marital status  M/U: ");
		char marital=in.next().charAt(0);
				if(marital=='u'|| marital=='u')
				{
					System.out.println("Enter the Gender M/F: ");
					char gender =in.next().charAt(0);
 System.out.println("Enter the age :");
 int age =in.nextInt();
 if(gender=='M'||gender=='m'&& age>=30)
{
	System.out.println("You are the Eligible for insurance ");
}
else if(gender=='F'||gender=='f'&& age>=20)
{
	System.out.println("You are the Eligible for insurance ");
}
else
{
	System.out.println("You are Not Eligible for insurance ");

}
}
				else if(marital =='m'||marital=='M')
				{
					System.out.println("You are the Eligible for insurance ");

				}
				else
				{
					System.out.println("Invalid Input");
				}
				}
}
