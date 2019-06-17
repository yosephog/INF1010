
package yosephogoppgave04;


public interface AbstraktTabell <T> {
   
    /**
     * the method puts an element at a specific place
     * if the place is not taken
     * 
     * @param element the element to be sett inn
     * 
     * @param index the position where the element is 
     * going to be sett inn.
     * 
     * @return  true if the element is sett inn or 
     * returns false if the element is not sett inn
     */
    public boolean setElement(T element, int index);
    
    /**
     * the method find the element according to the index
     * and prints out that element. if the elemnt is not
     * found, it prints out element not found.
     * 
     * @param index the position where we are expecting
     * to find the element
     */
    
    public T finnElement(int index);
    
}
