/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlesing;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
public class Innlesing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        String ord;
	String filNavn = "winnie.txt";
	Scanner winnieFil = new Scanner(new File(filNavn));
       

	while (winnieFil.hasNextLine()) {
	    ord = winnieFil.nextLine();
	    System.out.println(ord);


 }	     

 



 


 


	
	
	int antall = 0;
	Scanner in = new Scanner(System.in);
	String text = in.nextLine();
        

	
	

	while (winnieFil.hasNextLine()) {
	    ord = winnieFil.nextLine();
	    if (ord.equals(text)){
		antall += 1;
	    }
}
	    

	    System.out.println("Antall :  " + antall);


        

 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }	     

 
}


 

    

    
  
 


        // TODO code application logic here
    
    

