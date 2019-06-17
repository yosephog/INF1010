
package bondegard;

import java.util.Scanner;

/**
 *
 * @author gena1010
 */
public class Bondegard {

    Griss[] grisebinge = new Griss[30];
      Ku[] fjos = new Ku[30];
      Hest[] stall = new Hest[5];
    public static void main(String[] args) {
        
       
      System.out.println("enter your choice");  
      int choice=display();
      
      if(choice==0){
          System.exit(choice);
      }
      if (choice==1){
       Griss y=new Griss();
       y.entry();
       y.display();
       }
      if(choice==2){
          Hest h=new Hest();
          h.entry();
          h.display();
          
      }
      if (choice==3){
          Ku k=new Ku();
          k.entry();
          k.display();
      }
      if (choice==4){
          
      }
      if(choice==5){
          
      }
    }
    public static int display()
	{

		System.out.println("-----------Menu------------");
		System.out.println( "0 to close   ");
		System.out.println( "1 Register one Pig   ");
		System.out.println( "2 Register one Horse   ");
		System.out.println( "3 Register one Cow   ");
		System.out.println( "4 Sale One Amimal   ");
		System.out.println( "5 print the list of animals in the farm");
		Scanner in = new Scanner(System.in);
		int menu=in.nextInt();

		return menu;
    
}

}