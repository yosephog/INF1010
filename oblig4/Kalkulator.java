/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author gena1010
 */
import java.util.Scanner;
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        int svar = addisjon(1);
        System.out.println("summen er " +svar);
        int svar2=subtraksjon(2);
        System.out.println("differencen er " + svar2);
        int svar3=multi(3);
        System.out.println("det blir" +svar3);
        int svar4=divisjon(4);
        // TODO code application logic here
    }
    public static int addisjon(int sum){
        Scanner in=new Scanner(System.in);
        System.out.println("enter nummer");
        int nummer1=in.nextInt();
        System.out.println("enter nummer");
       int nummer2=in.nextInt();
        sum=nummer1+nummer2;
         return sum;
                }
    
    public static int subtraksjon(int dif){
        Scanner in=new Scanner(System.in);
        System.out.println("enter nummer");
       int nummer1=in.nextInt();
       System.out.println("enter nummer");
       int nummer2=in.nextInt();
       dif=nummer1 - nummer2;
       return dif;
        
    }
    public static int multi(int total){
        Scanner  in=new Scanner(System.in);
        System.out.println("enter nummer");
       int nummer1=in.nextInt();
        System.out.println("enter numer");
        int nummer2=in.nextInt();
        total=nummer1*nummer2;
        return total;
    }
    public static int divisjon(int div){
        Scanner in =new Scanner(System.in);
        System.out.println("enter nummer");
        int nummer1=in.nextInt();
        System.out.println("enter nummer");
        int nummer2=in.nextInt();
        div=nummer1/nummer2;
        return div;
    }
}
