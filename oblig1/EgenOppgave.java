/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package egen.oppgave;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
public class EgenOppgave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String passord;
        System.out.println(" angi passord");
        passord=in.next();
        if (passord.equals ("yoseph")){
        System.out.println(" det er rikte");
    }
        else {
                System.out.println("det er ikke rikte");
                }
                
        // TODO code application logic here
    }
    
}
