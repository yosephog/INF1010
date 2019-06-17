/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enkelkalkulator;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
public class EnkelKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner innleser=new Scanner(System.in);
        int nummer1,nummer2,svar1,svar2,svar3;
        System.out.println(" tast in two nummer");
        nummer1=innleser.nextInt();
        nummer2=innleser.nextInt();
        svar1=nummer1+nummer2;
       
        System.out.println(" summern er " + svar1);
        
        System.out.println("tast in two nummer");
        nummer1=innleser.nextInt();
        nummer2=innleser.nextInt();
        svar2=nummer1*nummer2;
        System.out.println(" produkte er " + svar2);
        
        System.out.println("taste in two nummer");
        nummer1=innleser.nextInt();
        nummer2=innleser.nextInt();
        svar3=nummer1-nummer2;
        System.out.println("diffference er " + svar3);
        {
            int num1,num2,Svar1,Svar2,Svar3;
            System.out.println(" tast inn two nummer");
            num1=innleser.nextInt();
            num2=innleser.nextInt();
           
            Svar1=num1+num2;
            Svar2=num1*num2;
            Svar3=num1-num2;
            System.out.println(" summen er " + Svar1);
            System.out.println("produkten er " + Svar2);
            System.out.println(" difference er " + Svar3);
            
        }
        
        
        
       }
    
        
    
    
    
    
    
    
    
    
    
}
