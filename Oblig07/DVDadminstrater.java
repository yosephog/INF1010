
package dvdadminstrater;

import java.util.ArrayList;
import java.util.Scanner;
public class DVDadminstrater {

   
    public static void main(String[] args) {
       
        
        
       
        
     
         Scanner in=new Scanner(System.in);
         
        
        ArrayList<Person>members=new ArrayList<>();
         
        Person temp1=new Person();
           temp1.menu();
        System.out.println("enter choice");
        while(in.hasNextLine()){
        String choice=in.nextLine();
        if(choice.equalsIgnoreCase("A")){
            temp1.extit();
        }
        if(choice.equalsIgnoreCase("N")){
            temp1.addPerson("",0);
            temp1.getName();
        
           members.add(temp1);
        }
        
       if(choice.equalsIgnoreCase("K")){
           temp1.addDVD();
           
           
       }
       if(choice.equalsIgnoreCase("L")){
          temp1.borrow();
          
       }
        if(choice.equalsIgnoreCase("O")){
           
            
             members.add(temp1);
            
               
                
               
                   
       System.out.println(" name " + temp1.getName()+ " " + " title " + temp1.getTitle());
       
            }
        if(choice.equalsIgnoreCase("R")){
            temp1.returnDvd();
        }
        if(choice.equalsIgnoreCase("V")){
       System.out.println(" the name is " + temp1.getName()+
       "" + "the movie is " + temp1.getTitle());
       System.out.println(members.add(temp1));
       
          
        }
        
        
      temp1.menu();
      System.out.println("enter your choice");
       
    }
    
}}
