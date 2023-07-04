package com.learning;
//Regular Expression came first in PerlLanguage   
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		String input = "My mobile number is 9884010000";
		//		Pattern patternObj = Pattern.compile("\\d{10}"); //digits {} - count 
		//		Matcher matcherObj = patternObj.matcher(input);
		//		while(matcherObj.find())
		//		{
		//			System.out.println(matcherObj.group());//group given input condition
		//			System.out.println(matcherObj.start());//check index position
		//			System.out.println(matcherObj.end());
		//
		//		}
		//
		//	}
		//	-----------------
		//
		//		String input = "My mobile number is 9884010000";
		//		//Pattern patternObj = Pattern.compile("[0123456789]");
		//		Pattern patternObj = Pattern.compile("[0-9]");
		//		Matcher matcherObj = patternObj.matcher(input);
		//		while(matcherObj.find())
		//		{
		//			System.out.println(matcherObj.group());
		//			//System.out.println(matcherObj.start());
		//			//	System.out.println(matcherObj.end());
		//
		//		}
		//}		//--------------------
		//-----------------


		////	String password = "Chennai is the capital city";
		//	
		//	  Pattern patternObj = Pattern.compile("\\d	");
		//	  String password = "Chennai 600042 is Velachery";
		//	  Matcher matcherObj = patternObj.matcher(password);
		//	    int count = 0;		
		//	    while(matcherObj.find())
		//	    {
		//	      count++;
		//	      System.out.print(matcherObj.group());
		//	    }
		//	  System.out.println(count);
		//}

		//-----------------
		String match = "-";
		String input = "28-March-2023";
		Pattern patternObj = Pattern.compile(match);
		String[] items = patternObj.split(input);
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]);
		}


	}
}