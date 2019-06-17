/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumtall;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
public class SumTall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner userInput=new Scanner(System.in);
       System.out.println("enter tall");
       int tall=userInput.nextInt();
       int sum =0;
       
       while (tall!=0){
           
        sum=sum+tall;   
         System.out.println("enter tal");
       tall=userInput.nextInt();  
       
       }
       
           System.out.println("summen er " + sum);
           
        
       
            
        
        
      
        // TODO code application logic here

    
}

}