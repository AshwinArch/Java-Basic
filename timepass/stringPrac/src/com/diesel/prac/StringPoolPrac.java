package com.diesel.prac;

import java.util.ArrayList;

public class StringPoolPrac {
	public static void main(String args[])
	{
		ArrayList str1=new ArrayList();
		str1.add("Ashwin");
		str1.add("Ashwin");
		ArrayList str2=new ArrayList();
		str2.addAll(str1);
		if(str1==str2)
		{
			System.out.println("==");
			
			System.out.println(str1);
			System.out.println(str2);
		}
		if (str1.equals(str2) )
		{
			System.out.println(".equals");
			System.out.println(str1);
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
		}
		else
		{

			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
		}
		
	}

	
}
