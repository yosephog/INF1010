

import java.util.HashMap;


public class Bok implements TilUtlaan {
    
    private String title;
    private String forfatter;
    
    // beholder for alle boker som er satt inn eller returnert 
    HashMap<String ,String> bokList;  
    
    // beholder for bokeer som er lannt ut
    HashMap<String, String> bokLant;
    
    public Bok(String title, String forfatter){
        
       this.title=title;
       this.forfatter= forfatter;
       bokList=new HashMap<>();
        bokLant=new HashMap<>();
         
    }
    
    public void settInnBok(){
        
       // setter inn en bok title og forfatteren
       bokList.put(this.title, this.forfatter);
       System.out.println("the book is puted successfully");
       
   }
    
    public void lannUt(String bokId){
        
         if(bokList.containsKey(bokId)){
             
             this.title=bokId;
             bokLant.put(this.title,this.forfatter);
             bokList.remove(bokId);
             System.out.println("the book is successful loaned");
             
         }
         
         else 
             System.out.println(" the book cant be loaned");
        
    }
   
     /* this method allows only to return books that are loaned in the first place
        one cannot return a book that is not borrowed in the first place
    */
    public void returnere(String bokId){
        
        if(bokLant.containsKey(bokId)){
            
            this.title=bokId;
            bokList.put(this.title,this.forfatter);
            bokLant.remove(bokId);
            System.out.println("the book is returned successfully");
            
        }
        
         else
            System.out.println(" the book cant be returned");
       
      }
    
    
   public String toString(){
       
       return this.title + " " + this.forfatter;
   }
}


