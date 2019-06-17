
package yosephogoppgave04;

import java.util.Iterator;


public class EnkelReseptListe implements Iterable<Resepter> {
    
    public Node first;
    public Node last;
   
    
    public EnkelReseptListe(){
        first=null;
        last=null;
    }
    
    public class Node {
        Resepter data;
        Node next;
        
      public  Node(Resepter data){
            this.data=data;
        }
    }
    public void settInnResepter(Resepter r){
       // input=r;
        Node ny=new Node(r);
        if(first==null){
            first=ny;
            last=ny;
        }
        else {
            last.next=ny;
            last=ny;
        }
    }
    public void finnResepter(int num){
        Resepter input=first.data;
        if(input.getUnikNummer()==num){
            System.out.println("The resept number found is " + " " + input.getUnikNummer());
        }
        else 
            System.out.println("the resept number cant be found");
    }
    public void print(){
        Node temp=first;
        while(temp != null){
            System.out.println( temp.data.legeNavn.getNavn() + " " + temp.data.pasientNavn.getNavn()
            + " " + temp.data.midler.getNavn()  + " " +temp.data.getPrice()+ " " + temp.data);
            temp=temp.next;
        }
    }
    
    
    
  
    public  Iterator iterator(){
        return new MinIterator();
    }
    
    public class MinIterator implements Iterator {
        
        Node temp=first;
        
        public boolean hasNext(){
            return temp.data!=null;
        }
        public Resepter next(){
              Resepter data=(Resepter) temp.data;
            temp=temp.next;
            return data;
        }
    }
    
}
