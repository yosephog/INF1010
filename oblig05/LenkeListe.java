



public class LenkeListe < E extends Comparable <E>>  {
   
  private int counter=0;
    private Node first;
    private Node last;
    
   
    
  private  class Node {
        private Node next;
        private E data;
        
        Node(E data){
            this.data=data;
        }
        
    }
    
   public boolean tom(){
       return counter==0;
   }
    
     public void leggTil(E e){
         Node ny=new Node(e);
        
        if(first==null){
             
             first=ny;
             last=ny;
             counter++;
             return;
         }
        
         
         if(first.data.compareTo(e)>0){
             ny.next=first;
             first=ny;
             counter++;
             return;
         }
         
          Node prev=first;
         Node curr=first.next;
         
         while(curr != null){
             if(curr.data.compareTo(e)>0){
                 ny.next=curr;
                 prev.next=ny;
               
                 return;
             }
             curr=curr.next;
             prev=prev.next;
             counter++;
         }
         prev.next=ny;
         last=ny;
         
     }
     public E fjernMinste(){
       if(first!=null){
           E d= first.data;
           first=first.next;
           counter--;
           return d;
        
       }
       else 
           return null;
     }
     public boolean inneholder(E e){
       return  first.data.compareTo(e)== 0;
     }
     
 
 
 public void print(){
     Node temp=first;
     while(temp!=null){
         System.out.println("the element is "+ " " + temp.data);
         temp=temp.next;
     }
 }
 public void getCounter(){
     System.out.println("the number of elements are" + " " + counter);
 }
  

}
