/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekster;

/**
 *
 * @author gena1010
 */
public class Tekster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                 
                 String tekst1="INF1000";
                 String tekst2="inf1000";
                 String fag="INF1100INF1000INF1010";
                 String fagname=fag.substring(7, fag.length()-7);
                 
                 int result=tekst1.compareTo(tekst2);
                 if (result<0){
                     System.out.println("tekst 2 er større");
                 }
                 else if(result>0){
                     System.out.println("tekest 1 er større");
                 }
                 else if (result==0){
                     System.out.println("de er like");
                 }
               
                 System.out.println(fagname);
                 String setning="Agnes i senga";
        for (String part : setning.split(" ")) {
    System.out.print(new StringBuilder(part).reverse().toString());
    System.out.print(" ");
    }
        // TODO code application logic here
    }
    
}
