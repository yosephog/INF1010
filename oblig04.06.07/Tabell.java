
package yosephogoppgave04;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class Tabell<T> implements AbstraktTabell<T>,Iterable<T>{
    
    T [] tabellList;
    int counter;
    T input;
    Tabell(int length){
        
        tabellList= (T[]) new Object[length];
    }
    
    public boolean setElement(T element, int index){
       
        if(index <= tabellList.length && index >= 0){
            if(tabellList[index]==null){
            input=element;
            tabellList[index]=input;
            counter++;
            return true;
        }
        }
        
            return false;
      }
    // you have changed this look at it again
    public T finnElement(int index){
        
        if(tabellList[index]!= null){
            
           //System.out.println("the element found is " + " " + tabellList[index]);
           return tabellList[index];
        }
        else
           // System.out.println("the element at that index cant be found ");
        return null;
    }
    
    public Iterator iterator(){
        return new MinIterator();
    }
    
    private class MinIterator implements Iterator<T> {
       private int counter;
       private T inputt;
       MinIterator(){
           while(counter <tabellList.length && tabellList[counter] !=null ){
               counter++;
           }
       }
        public boolean hasNext() {
           return counter < tabellList.length && tabellList[counter] != null;
        }

        @Override
        public T next() {
            if(counter < tabellList.length){
                 inputt=tabellList[counter];
                while(counter <tabellList.length && tabellList[counter] != null){
                    counter ++;
                }
                return inputt;
            }
            else 
             throw new NoSuchElementException();
        }
        
        
    }
}
