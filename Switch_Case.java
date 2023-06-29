package Basics;

import java.util.Scanner;

// Switch case statement in java
public class Switch_Case {

	public static void main(String[] args) {
int a,b,c,ch;
System.out.println("Additon");
System.out.println("Subtraction ");
System.out.println("Multiplication");
System.out.println("Division");
System.out.println("Enter your choice ");
Scanner in=new Scanner(System.in);
ch=in.nextInt();
System.out.println("Enter 2 No's :");
a=in.nextInt();
b=in.nextInt();
switch(ch) //we can use only inside case values
{
    case 1: //we  can use numeric and character also
    	c=a+b;
	System.out.println(" Addition : "+c);
	break;  /*we don't use break in this place
	it will automatically go to next case   
    */
    case 2:
    	c=a-b;
	System.out.println(" Subtraction :"+c);
	break;
	case 3:
		c=a*b;
		System.out.println(" Multiplication :"+c);
    break;
    case 4:
    	c=a/b;
    	System.out.println("  Division :"+c);
default://Out of case values provides it shows like this
	System.out.println("Invalid Selection");
	break;
	
}

	}

}
