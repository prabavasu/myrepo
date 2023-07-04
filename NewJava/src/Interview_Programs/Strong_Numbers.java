package Interview_Programs;

import java.util.Scanner;

public class Strong_Numbers {

	public static void main(String[] args) {
		int num,OriginalNum,rem,fact,sum=0;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the Number :");
		num =in.nextInt();
		OriginalNum =num;
		while(num>0)
		{
			rem=num%10;
			//System.out.println(" Remainder " + rem );
			fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;//fact=fact*i;
			}
			//System.out.println(" fact :" +  fact );
			sum+=fact;
			fact=num =num/10;

		}
if(sum==OriginalNum)
{
	System.out.println(OriginalNum + " is a Strong Number");
}else
{
	System.out.println(OriginalNum + " not  a Strong Number");

}
	
	}

}
	
