



public class Hylle <T> implements GenHylle<T> {
    
    private int counter;
    private T[] shelf;
    private T input;
    private int position;
    public Hylle(){
        
        counter=0;
        shelf= (T[]) new Object[100];
        
    }
    
    /*
    this method return the number of book in the T array 
    and not the size of the T array that is 100
    */
    public int getSize(){
        
        return counter;
    }
    
    /*
     this method put a book at a given position and prints out
      an error message if the position is taken
    */
    public void settInn(T t,int pos){
        
       position=pos;
        if(shelf[position]==null){
            
            input=t;
            shelf[position]=input;
            counter++;
           
        }
        else
            System.out.println(" ERROR the position is already taken");
    }
    
    /*
    this method returns the book that is puted in the shelf
    */
    public T getInput(){
        
        return input;
    }
    
    /*
      this method return the position a book is putted in
    */
    public int getPosition() {
        
    return position;
}
    
    /*
     this method just check if a given position is taken
    and returns true if NUll and false if taken
    */
    public boolean sjekk(int pos){
        
       return shelf[pos]==null;
    }
    
    /*
     this method takes out a book from a given position and
    print out error message if the position is empty (NULL)
    */
    public void taUt(int pos) {
        if(!sjekk(pos)){
            shelf[pos]=null;
            counter--;
            System.out.println("the book at position " + pos + " is removed");
        }
        else 
            System.out.println(" ERROR the position is allready empty");
    }
    
   
}
