/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yosephogoppgave04;

/**
 *
 * @author yoseph
 */
public class EldsteForstReseptListe extends EnkelReseptListe {
    
    
    
     public void settInnEldeste(Resepter r){
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
     
}
