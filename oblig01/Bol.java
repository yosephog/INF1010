



public class Bol <T> {
    
    private int counter;
    private T input;
    
   public Bol(){
        
        counter=0;
    }
   
    // returner true hvis counteren er 0
    public boolean tomt(){
       return counter==0;
          
    }
    
    // setter in T t hvis det er tomt 
    public void settInn(T t){
        
        if(tomt()){
            
            input=t;
            counter++;
           
        }
        else 
            System.out.println("Bolet er allready fullt");
     
    }
    
    // sinker teller av en og returnere null siden bolet vil bli tom
    public T taUt(){
    counter--;
    return null;
       
            
    }
    // returner det som er settInn
    public T getInput(){
        return this.input;
    }
   
    
   
}
