// Java swing application to find keywords in a file
// Under construction
//Testbranch05Dec19.V1

package com.ely;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class CombineFrSwing extends JApplet  {

	public static File file;
	public static String[] srword = {"java","test"};

	  public static void SwingSandbox() {
	    final JFrame frame = new JFrame("File Reviewer - Keywords");

	    JButton btnFile = new JButton("Select File to be Reviewed");
	    btnFile.addActionListener(new ActionListener() {
	        //Handle open button action.
	    	 public void actionPerformed(ActionEvent e) {
	    		
	    			JFileChooser chooser = new JFileChooser();
	    		  //  chooser.setCurrentDirectory(new java.io.File("."));
	    			chooser.setCurrentDirectory(new java.io.File("C:\\temp\\"));	    			
	        
	    		    chooser.setDialogTitle("Choose File to Scan");
	    		    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	    		    chooser.setAcceptAllFileFilterUsed(false);
	       
	    			    
	    	    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
	    	    {
	    	  //System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
	    	 // System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
	    	    System.out.println ("The file you selected is at" + " " + chooser.getSelectedFile());
	    	    } 
	    	    else 
	    	       { System.out.println("No Selection ");  }
	    	 
	    	
	    	//This code checks if   
	    		       
	    		     
	    		     if (srword.length > 0) {


	    		     String searchword = srword[0];
	    		         
	    		     try {

	    		     int LineCount = 0;
	    		     String line = "";


	    		     BufferedReader bReader = new BufferedReader(new FileReader(chooser.getSelectedFile()));



	    		     while ((line = bReader.readLine()) != null) { LineCount++;


	    		     int posFound = line.indexOf(searchword);


	    		     if (posFound > - 1) {

	    		System.out.println("Search word found at position " + posFound + " on line " + LineCount);

	    		   }   

	    		 }

	    		 
	    		// Close the reader.

	    		    bReader.close();

	    		 
	    		           }
	    		            catch (IOException f) {


	    		     System.out.println("Error: " + f.toString());

	    		    }

	    		    }

	    		 else {



	    		System.out.println("Did not find any of the keywords you are looking for");

	    		      }
 		 
	    	 }
	     	/**
	        public void actionPerformed(ActionEvent e) {
	            final JFileChooser fc = new JFileChooser(); 
	            int returnVal = fc.showOpenDialog(frame);
	            if (returnVal == JFileChooser.APPROVE_OPTION) {
	                file = fc.getSelectedFile();
	                //This is where a real application would open the file.
	                System.out.println("File: " + file.getName() + ".");    
	            } else {
	                System.out.println("Open command cancelled by user.");
	            }
	            System.out.println(returnVal);
	        }
	        */
	        
	        
	        
	        
	    });

	    frame.getContentPane().add(btnFile);
	    frame.setSize(300, 200);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	  }


	  public static void main(String[] args) throws Exception {
	    
		  /**
		   * You can also call the SwingSandbox function by instantiating the deletetester class and
		   * calling the SwingSandbox function. Refer to commented code below 
		   * */
		  
		   //deletetester del = new deletetester();
		   //  del.SwingSandbox();
		   //This is a function call to class function SwingSandbox  
		  
		  SwingSandbox();
	
	  }
	}


