package Basics;

public class Break_and_Continue {
//break and continue used for loop
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==5)
				continue; //intermediately don't print
			if(i==8)
				break;// break the condition 
		}

		}

	}
