
package yosephogoppgave04;

import java.util.Iterator;
public interface AbstraktSortertEnkelListe<T extends Comparable<T> & Lik>{
    
    public void settInn(T t);
    
    public T finn(String t);
    
    public Iterator <T> iterator();
     
}
