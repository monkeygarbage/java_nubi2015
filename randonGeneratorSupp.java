package com.ely;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Size of Arraylist (sizeofarray variable) can be varied to increase/decrease elements in the array which starts at no. 1 
 * Number of elements to draw (balls2draw) can be varied to increase/decrease elements to be randomly drawn from the arraylist
 */
public class LotGen1 {

static ArrayList<Integer> alist = new ArrayList<>();
static ArrayList<Integer> finlist = new ArrayList<>();
static ArrayList<Integer> suplist = new ArrayList<>();
static int sizeofarray = 45;
static int balls2draw = 7;
static int sup2draw = 2;
static Random rand = new Random();	



public static void main(String[] args) {

	
valuePopulator();
genElements();
getSortResult();

Supplement.supp2();

}//main


private static void getSortResult() {
	/**
	 * Iterate through the value of elements in Arraylist using For Each and print
	 * summary of output
	 */
	
	System.out.println("The result of the random selection from " + sizeofarray + " balls  : ");
	Collections.sort(LotGen1.finlist);
	for (int int3 : LotGen1.finlist) {
		System.out.print(" " + int3 + " ");
	}
	
}


private static void genElements() {
	/**
	 * Selects the elements in the ArrayList based on the output of the valuePopulator function
	 */
	int alistsize = 0;
	int rand1 = 0;	
	
	for (int i = 0; i < LotGen1.balls2draw; i++) {
		alistsize = LotGen1.alist.size();
		rand1 = rand.nextInt(alistsize);	
		
	//	System.out.println("Random Index no " + (rand1)  + "  based on current size of arraylist  " + LotGen1.alist.size()  );
		
		//System.out.println("Item on Roll " + (i+1)  + " is =  " + LotGen1.alist.get(rand1) );
		LotGen1.alist.get(rand1) ;
	
		//	System.out.println("Putting Item from Roll " + (i+1) + " to the FinalArraylist" + LotGen1.finlist.add(LotGen1.alist.get(rand1))+ "\n");
		LotGen1.finlist.add(LotGen1.alist.get(rand1));
		
		//Removes the selected number from the arraylist
		LotGen1.alist.remove(rand1);  
		
	}  
	   //Size of the Arraylist after the run
	   //System.out.println(LotGen1.alist.size());
	
}


private static void valuePopulator() {
	/**
	 * Generates values of Arraylist Elements based on the defined sizeofarray
	 */
	
	for (int i = 1; i < (LotGen1.sizeofarray + 1); i++) {
		
		LotGen1.alist.add(i);
	}
	

}
}

//class



class Supplement {

       public static void supp2(){	
   
	   int alistsize2 = 0;
	   int rand2 = 0;	
		
		for (int i = 0; i < LotGen1.sup2draw; i++) {
			alistsize2 = LotGen1.alist.size();
			rand2 = LotGen1.rand.nextInt(alistsize2);	
			
		//	System.out.println("Random Index no " + (rand1)  + "  based on current size of arraylist  " + LotGen1.alist.size()  );
			
			//System.out.println("Item on Roll " + (i+1)  + " is =  " + LotGen1.alist.get(rand1) );
			LotGen1.alist.get(rand2) ;
		
			//	System.out.println("Putting Item from Roll " + (i+1) + " to the FinalArraylist" + LotGen1.finlist.add(LotGen1.alist.get(rand1))+ "\n");
			LotGen1.suplist.add(LotGen1.alist.get(rand2));
			
			//Removes the selected number from the arraylist
			LotGen1.alist.remove(rand2);  
			
		}  
		System.out.println("\n" + "The result of the supplementary selection from " + LotGen1.sup2draw + " balls  : ");
		Collections.sort(LotGen1.suplist);
		for (int int3 : LotGen1.suplist) {
			System.out.print(" " + int3 + " ");
		}
	}// Methos

	   
	   
	     }// class
       
       



