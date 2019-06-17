



public interface GenHylle <T> {
    
    /**
     * this method return  the number of books in the shelf
     * and not the size of the shelf
     *
     * @return  int value
     * @see integer number
     */
    
    public int getSize();
    
    
    /**
     *  this method check for a given position is taken
     * 
     * @param pos the position that is looked for.
     * @return a boolean value true if it is empty and false if not
     */
     
    public boolean sjekk(int pos);
    
    
    /**
     * this method put a value after checking if the position is free
     * if the position is take it prints out error message
     * 
     * @param t the vlaue that is going to be put in the shelf
     * @param pos the position to be filled
     */
    
    public void settInn(T t,int pos);
    
    /**
     * returns the title and author of the book
     * 
     * @return a T value that is putted in
     */
    public T getInput();
    
    /**
     *  this method just return the position of a given book
     * 
     * @return an int value
     */
     public int getPosition();
     
     
    /**
     * this method takes out a value at a given position
     * if the position is empty it prints out error message
     * 
     * @param pos the value to be taken out
     */
    
    public void taUt(int pos);
}
