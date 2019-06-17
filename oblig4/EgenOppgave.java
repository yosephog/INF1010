/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egenoppgave;

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
       System.out.println("enter 1 for addisjon");
       int valg=in.nextInt();
       if(valg==1){
         int svar=  addisjon();
           System.out.println("summen er " + svar);
       } else {
           System.out.println("try again");
       }
    }
    public static int addisjon(){
        Scanner in=new Scanner(System.in);
        System.out.println(" enter nummer");
        int nummer1=in.nextInt();
        System.out.println("enter nummer");
        int nummer2=in.nextInt();
        int sum=nummer1+nummer2;
        return sum;
        
    }
}