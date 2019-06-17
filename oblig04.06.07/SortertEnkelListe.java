
package yosephogoppgave04;
import java.util.Iterator;

public class SortertEnkelListe<T extends Comparable <T> & Lik > implements AbstraktSortertEnkelListe<T> , Iterable<T> {
    
    Node first;
    Node last;
    T input;
   
    
     private class Node {
        
        T data;
        Node next;
       
        
        Node(T data){
            
            this.data=data;
        }
        
    }
    
     // puts element on alphabatical order
    public void settInn(T element){
        Node ny=new Node(element);
          if(first==null){
             
             first=ny;
             last=ny;
            
             return;
         }
        
         
         if(first.data.compareTo(element)>0){
             ny.next=first;
             first=ny;
             
             return;
         }
         
          Node prev=first;
         Node curr=first.next;
         
         while(curr != null){
             if(curr.data.compareTo(element)>0){
                 ny.next=curr;
                 prev.next=ny;
               
                 return;
             }
             curr=curr.next;
             prev=prev.next;
            
         }
         prev.next=ny;
         last=ny;
         
       
       
    }
    
   public T finn(String t){
       
       Node temp=first;
       while(temp!=null){
           if(temp.data.samme(t)){
               System.out.println("the element found is "+ ""+ temp.data);
               return temp.data;
           }
           temp=temp.next;
       }
      //System.out.println("the element couldnt be found");
       return null;
   }
   
   
   public void print(){
       Node temp=first;
       while(temp!=null){
           System.out.println("the element is " + " " + temp.data);
           temp=temp.next;
       }
   }
            
    public Iterator  iterator(){
        return new MinIterator();
    }
    
    class MinIterator  implements Iterator<T> {
      
       Node temp=first;
      
       
        public boolean hasNext() {
            return temp!=null;
        }

      
        public T next() {
            T data=(T) temp.data;
            temp=temp.next;
            return data;
            
        }
        
    }
}
