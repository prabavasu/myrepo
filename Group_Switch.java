package Basics;

import java.util.Scanner;

//Group switch
public class Group_Switch {

	public static void main(String[] args) {
char c;
System.out.println("Enter the charecter :");
Scanner in =new Scanner(System.in);
c=in.next().charAt(0);	
switch(c) // Group of conditions or cases in a single statement

{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println(c+" is a Vowels ");
break;
default:
System.out.println(c+ " is a consonant");
break;
}
	}

}
