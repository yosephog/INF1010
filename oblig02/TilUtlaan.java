



public interface TilUtlaan {
    
    /**
     * this method puts in a book and one can 
     * put the same book twice
     */
    public void settInnBok();
    
    /**
     * 
     * @param bokId the book to loaned id
     */
    public void lannUt(String bokId);
    
    /**
     * this method returns a book that is loand
     * and one cant return a book that was never loaned
     * 
     * @param bokId the id for the book to be returned
     */
     public void returnere(String bokId);
     
     /**
      * this method converts the T type of the book title 
      * and author
      * 
      * @return  a String value of the book title and author
      */
    
    public String toString();
}
