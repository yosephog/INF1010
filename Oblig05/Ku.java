
package bondegard;

import java.util.Scanner;

/**
 *
 * @author gena1010
 */
public class Ku {
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