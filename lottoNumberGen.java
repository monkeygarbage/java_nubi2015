/**
 * Author: monkeyfilo@yahoo.com (ccaoile)
 * Note: Email me to collaborate algorithms 
 * /

package com.ely;

import java.util.ArrayList;
import java.util.Random;

public class LotGen1 {

static ArrayList<Integer> alist = new ArrayList<>();
static ArrayList<Integer> finlist = new ArrayList<>();
static int sizeofarray = 42;
static int balls2draw = 6;


public static void main(String[] args) {

Random rand = valuePopulator();
genElements(rand);
getResults();

}//main


private static void getResults() {
	/**
	 * Iterate through the value of elements in Arraylist using For Each and print
	 * summary of output
	 */
	
	System.out.println("The result of the random selection from " + sizeofarray + " balls  : ");
	for (int int3 : LotGen1.finlist) {
		System.out.print(" " + int3 + " ");
	}
}


private static void genElements(Random rand) {
	/**
	 * Selects the elements in the ArrayList based on the output of the valuePopulator function
	 */
	int alistsize = 0;
	int rand1 = 0;	
	
	for (int i = 0; i < LotGen1.balls2draw; i++) {
		alistsize = LotGen1.alist.size();
		rand1 = rand.nextInt(alistsize);	
		
		System.out.println("Random Index no " + (rand1)  + "  based on current size of arraylist  " + LotGen1.alist.size()  );
		System.out.println("Item on Roll " + (i+1)  + " is =  " + LotGen1.alist.get(rand1) );
		System.out.println("Putting Item from Roll " + (i+1) + " to the FinalArraylist" + LotGen1.finlist.add(LotGen1.alist.get(rand1))+ "\n");
		LotGen1.alist.remove(rand1);  
		
	}  
	   //Size of the Arraylist after the run
	   //System.out.println(LotGen1.alist.size());
	
}


private static Random valuePopulator() {
	/**
	 * Generates values of Arraylist Elements based on the defined sizeofarray
	 */
	Random rand = new Random();	
	for (int i = 1; i < (LotGen1.sizeofarray + 1); i++) {
		
		LotGen1.alist.add(i);
	}
	
	
	return rand;
}
}//class



