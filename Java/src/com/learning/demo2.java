package com.learning;

import java.util.ArrayList;
import java.util.HashMap;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al = new ArrayList<Integer>(); 
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    al.add("abcd");
	    al.add(false);
	    ArrayList ald = new ArrayList<>();  
	    ald.add_All_items(al);
	HashMap<String,Integer> hm =new  HashMap()<String,Integer>();
	    int total = 0; 
	    for(Object ob:al)
	    {
	      total = total + (int) ob;
	    }
	    System.out.println(total);}

}
