
package dvdadminstrater;


import java.util.ArrayList;
import java.util.Scanner;
public class Person {
    String name;
    String title;
    int i;
    
    
   DVD temp=new DVD();
     
   
     ArrayList<DVD> newDVD=new ArrayList<>();
  public  Person(){
        name="";
        title="";
     newDVD= new ArrayList<>();
        i=0;
    }
      
      
    
    void setName(String n,int c){
       
        this.name=n;
        this.i=c;
        
           newDVD.add( temp);
        }
       
        
    
    
        
    
    void setTitle(String t){
        this.title=t;
        
    }
    String getName(){
        
        
        return this.name;
    }
    
    String getTitle(){
        
        return this.title;
    }
    
    
    void extit(){
        System.out.println("good by");
            System.exit(0);
    }
    void addPerson(String n, int c){
       this.name=n;
       this.i=c;
         Scanner in = new Scanner(System.in);
System.out.println("if you want to add new nameY/N");
 
while ( in.nextLine().equalsIgnoreCase("y")) {
  
    System.out.println("Enter  name");
    
    this.name = in.nextLine();
    newDVD.add(c,temp);
    
    System.out.println("if you want to add a new person enter Y/N");
  
         
    }    
   
    
}
   

        
    void borrow(){
        Scanner in=new Scanner(System.in);
        System.out.println(" do you want to borrow a dvd Y/N ");
        while(in.nextLine().equalsIgnoreCase("Y")){
            System.out.println("who is going to borrow the dvd");
            this.name=in.nextLine();
           
            System.out.println("who are you going to borrow it from");
            this.name=in.nextLine();
            System.out.println("what is the title of the dvd");
            this.title=in.nextLine();
            if(this.title.equalsIgnoreCase(title)){
            System.out.println("do you want to borrow more Y/N");
             
        }
            else{
                System.out.println("the person dont have that dvd");
            }
            newDVD.add(temp);
    }
    }
    void addDVD(){
      
        Scanner in=new Scanner(System.in);
        System.out.println("do you want to add DVD? if yes press Y "
                + "if no press N ");
       
      
      while(in.nextLine().equalsIgnoreCase("Y")){
         
          System.out.println("who bought the dvd ");
          this.name=in.nextLine();
         newDVD.add(temp);
          System.out.println("enter title of the dvd");
         this.title= in.nextLine();
         newDVD.add(temp);
         System.out.println(" if you want to continue Y/N");
         newDVD.add(temp);
          // ENTER THE SEARCH FUNCTION HERE SO IT IS NOT A REAPETED TITLE
         
        
             }
    }
    void viewDetail(){
        Scanner in=new Scanner (System.in);
        System.out.println("do you want to see the detail of a person Y/N");
        while(in.nextLine().equalsIgnoreCase("Y")){
            System.out.println("Type in the persons name");
            // try to put a boolean value for found and not found for persons name
            this.name=in.nextLine();
            
        }
    }
    void showArchive(DVD list){
      
       
       
           
           
                   
            
        }
    void showDvd(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name of the person to see his/her DVD");
        this.name=in.nextLine();
        if(name.equalsIgnoreCase(temp.getOwner())){
            System.out.println(newDVD.add(temp));
        }
        else if (name.equalsIgnoreCase("*")){
            System.out.println(newDVD);
        }
        
    }
    void returnDvd()   {
        Scanner in=new Scanner(System.in);
        System.out.println(" what is the titlel of the dvd you tok");
        this.title=in.nextLine();
        if(title.equalsIgnoreCase(temp.getTitle())){
        System.out.println(" who do you borrow it from");
        this.name=in.nextLine();
        if(name.equalsIgnoreCase(temp.getOwner())){
            System.out.println("thank you for returning");
        } else{
            System.out.println("Sorry but try again");
        }
    } 
    }
    
     void menu(){
        System.out.println("........ choice your selection.......");
         System.out.println(" press A to exit");
          System.out.println("press K to buy,to ask who bought and the title");
           System.out.println(" press L to borrow");
            System.out.println(" press N to register a new person");
             System.out.println(" press O to check the archive");
              System.out.println("press R to return a borrowed item");
               System.out.println(" press V to see a person detail or "
                       + " press * to see all the users detail");
                
    }
}
