
/*Semi-complex Calculator using scanner class, Double helper class, Casting Double, Methods, Basic Validation 
Enter a numeric value:  (Number formatting Exception for input string: "x")
Enter a numeric value:
Choose an operation (+ - * \):
The answer is xx.xx

Author: Cesar Caoile (monkeyfilo)
*/


package com.ely;

import java.util.Scanner;


public class simple_calculator {
	
	public static void main (String[] args) {
	   
		double d1 = 0;
		double d2 = 0;
		String mes = "noerror";
		
		try {
			d1 = getInput("Enter a numeric value ");    
		}
		catch (NumberFormatException e) {
			mes = e.getMessage();
			
			}
		
		try{
		   d2 = getInput("Enter a numeric value ");
		}
		catch (NumberFormatException e) {
			mes = e.getMessage(); 
		     } 
				
		
	    String op1 = getops("Choose an operation (+ - * /)");
		
	    if (mes.contentEquals("noerror")) {
			
	    switch (op1) {
		case "+":
			System.out.println("The answer is " + (d1 + d2) );
			break;

		case "-":
			System.out.println("The answer is " + (d1 - d2) );
			break;

		case "*":
			System.out.println("The answer is " + (d1 * d2) );
			break;

		case "/":
			System.out.println("The answer is " + (d1 / d2) );
			break;

		default:
			System.out.println("Choose a valid operation");
			break;
	    }
	    
	    }
	    else {
	    	System.out.println("Number formar exception " + mes);
	    }
	    
		} // Main Method	


	static double getInput (String str1) throws NumberFormatException {
	   //Scanner Class 
	   Scanner scn1 = new Scanner(System.in);
	   System.out.print(str1);
       String sinput = scn1.nextLine();
       double db = Double.parseDouble(sinput); // Double helper class using parse double
		return db;
		}
	
		
    static String getops(String str) {
    	//Scanner Class 
 	   Scanner scn1 = new Scanner(System.in);
 	   System.out.print(str);
       String sinput = scn1.nextLine();
 	   return sinput;	
        }
    
} // Class
