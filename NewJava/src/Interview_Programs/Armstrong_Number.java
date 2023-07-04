package Interview_Programs;

import java.util.Scanner; /*

important 153 ,370,371,407,1634

The first few Armstrong numbers between 0 to 999 are 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370,
 371, 407. Some other Armstrong numbers are 1634, 8208, 9474,
*/

public class Armstrong_Number {
	//write a program to check whether the given 3 digit number is armstrong or not
	public static void main(String[] args) {
Scanner in =new Scanner(System.in);
System.out.println("Enter 3 digit number :");
int number =in.nextInt();
int temp=number;	
int digit1,digit2,digit3;

digit3=temp%10;//3
temp=temp/10; //12

digit2=temp%10;//2
temp =temp/10;//1

digit1 =temp%10;
int result =(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
if(number==result)
{
	System.out.println(number + "  is a armstrong number ");
	
}
else
{
	System.out.println(number + "  not  a armstrong number ");

}
	
	}
}

