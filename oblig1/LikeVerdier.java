/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package likeverdier;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
public class LikeVerdier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        int num_c;
        int num_d;
        System.out.println(" angi nummer c");
        num_c=userInput.nextInt();
        System.out.println(" angi nummer d");
        num_d=userInput.nextInt();
        if (num_c==num_d){
            System.out.println(" de er like");
        }
        if (num_c<num_d){
            System.out.println("nummer c er mindre enn nummer d");
        }
        else  {
        System.out.println("nummer c er mer enn nummer d");
    }
        // TODO code application logic here
    }
    
}
