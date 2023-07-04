package Interview_Programs;

import java.util.Scanner;

public class Reverse_Number {
//write a program to find reverse of n digit Numbers
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number : ");
int n =sc.nextInt();//123
int reverse=0,rem;
while(n>0)//123!=0 12!=0 1!=0 0!=0
{
rem=n%10; //3 2 1
reverse=(reverse*10)+rem; //(0*10)+3 => 3 (3*10)+2 =>32 (32*10)+1 =>321 
n=n/10; //12 1 0
}
System.out.println("Reverse Number :"+reverse);
}
}
