/**
 * 
 */
package com.ashwin.hadoop.hw1;

/**
 * @author Diesel
 *
 */
class SuperBike{  
	  final void run(){System.out.println("running...");}  
	}
		class FinalMethod extends SuperBike{  
		   public static void main(String args[]){  
		    new FinalMethod().run();  
		   }  
	
}
