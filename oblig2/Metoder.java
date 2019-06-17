/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metoder;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
public class Metoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        String navn,bosted;
       
       int i;
       int endvalue=3;
       for(i=0; i<endvalue;i++){
           System.out.println(" skriv in navn ");
        navn=userInput.nextLine();
        System.out.println( " skrive in bosted ");
        bosted=userInput.nextLine();
        System.out.println("Hei " + navn + " du er fra " + bosted);
           
       }
       
        
        
       
   
        
        // TODO code application logic here
    }
    
}
