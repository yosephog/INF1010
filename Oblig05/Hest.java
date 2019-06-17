/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bondegard;

import java.util.Scanner;

/**
 *
 * @author gena1010
 */
public class Hest {
    String name;
    
    void entry(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter name");
        this.name=in.next();
        
        
    
}
    void display(){
        System.out.println("name is " + this.name);
    
}
}
