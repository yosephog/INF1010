/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package billettpris;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
public class BillettPris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput= new Scanner (System.in);
        int alder;
        System.out.println(" angi alder");
        alder=userInput.nextInt();
        if (alder<12) {
           
                System.out.println(" du betaler halv pris ");
            }
       else if (alder>67){
        System.out.println("du betaler halv pris");
        }
        else {
            System.out.println(" du beltaler full pris");
        }
        // TODO code application logic here
    }
    
}
