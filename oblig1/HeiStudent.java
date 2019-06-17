/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication23;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Hei student");
        String navnet="yoseph gebrehiwet ";
        System.out.println(" Hello " + navnet);
        int num1,num2,Svar;
        num1=1;
        num2=43;
        Svar=num1+num2;
        System.out.println(" summen er " + Svar);
        
        Scanner userInput=new Scanner(System.in);
        int nummer1,nummer2,svar;
        System.out.println("angi det først nummeret du vil legge til");
        nummer1=userInput.nextInt();
        System.out.println(" angi det andre nummeret du vil legge til");
        nummer2=userInput.nextInt();
        svar=nummer1 + nummer2;
        System.out.println(nummer1+ " + " + nummer2 + " = " + svar);
        
        
        
    }
    
}
