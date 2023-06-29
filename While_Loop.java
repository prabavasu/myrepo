package Basics;

import java.util.Scanner;

//while Loop //Initialize values -check condition  and increment or decrement
//while loop is an entry check
public class While_Loop {

	public static void main(String[] args) {
		System.out.println(" Enter the Limit :");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();//3
		int i=1;

		while(i<=n) //1<=3 2<=3 3<=3 4<=3
		{
			System.out.println(i); //1 2 3 
			i++; //2 3 
		}
	}
}


