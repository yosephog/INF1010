/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negativtall;

/**
 *
 * @author gena1010
 */
public class NegativTall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] nummer={1, 4, 5, -2, -4, 6, 10, 3, -2};
        int i;
        int count=0;
        for (i=0;i<nummer.length;i++){
            if(nummer[i]<0){
                count++;
                
                System.out.println("det negative er " +nummer[i]);
            }
            
            while (nummer.length<0&& nummer[i]<0)
            System.out.println(nummer[i]);
            
            
        }
        for (i=0;i<nummer.length;i++){
            if (nummer[i]<0){
                nummer[i]=nummer[i] * -1;
                System.out.println("nummere blir "+nummer[i]);
            
        }
    }
    }
}           
   // TODO code application l    

