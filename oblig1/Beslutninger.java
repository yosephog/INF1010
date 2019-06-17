/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beslutninger;

/**
 *
 * @author gena1010
 */
 import java.util.Scanner;
public class Beslutninger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput=new Scanner (System.in);
        int alder;
        System.out.println(" angi alder ");
        alder=userInput.nextInt();
        if (alder>=18) {
        System.out.println(" Du er myndig ");
    }
        else { 
                System.out.println(" Du er ikke myndig");
                }
        
        // TODO code application logic here
    }
    
}
