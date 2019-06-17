
package yosephogoppgave04;


public class YngsteForstReseptListe extends EnkelReseptListe {
    
    
     public void settInnYngste(Resepter r){
            Node ny=new Node(r);
          if(first==null){
            first=ny;
            last=ny;
        }
        else {
            ny.next=first;
            first=ny;
        }
        }
}
    
