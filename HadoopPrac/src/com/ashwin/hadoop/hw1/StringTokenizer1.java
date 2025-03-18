/**
 * 
 */
package com.ashwin.hadoop.hw1;
import java.util.StringTokenizer;
/**
 * @author Diesel
 *
 */
public class StringTokenizer1
{	
	 public static void main(String args[]){  
		 StringTokenizer st = new StringTokenizer("my name is khan"," ");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	   }  
}
