/**
 * 
 */
package com.ashwin.hadoop.hw1;

/**
 * @author Diesel
 *
 */

class Overriding{  
		void run(){System.out.println("Vehicle is running");}  
		}  

		class AwesomeBike extends Overriding{  
		void run(){System.out.println("Bike is running safely");}  
		  
		public static void main(String args[]){  
			AwesomeBike obj = new AwesomeBike();  
		obj.run();  
		}
}
