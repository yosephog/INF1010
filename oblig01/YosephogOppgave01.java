



public class YosephogOppgave01 {

    
    public static void main(String[] args) {
       // 1
        // opprett en rotteBol og en musBol
         Bol<Rotte> rotteBol=new Bol <> ();
        Bol<Mus> musBol=new Bol <>();
        
        // 2
         Katt katt1=new Katt ("Tom"); // oppretter en katt
         
         //3
          katt1.jakt(musBol, rotteBol);  // katten gor po jakt po en tom bol
          
          //4
          Rotte rotte1=new Rotte("Ronny",true,false); // oppretter en rotte
          
          //5
          rotteBol.settInn(rotte1);  // setter rotten i bolet
          
          //6
          katt1.jakt(musBol,rotteBol); // katten gor po jakt
          
         // 7
          Mus muss1=new Mus("jerry",true); // oppretter en muss
          
          //8
           musBol.settInn(muss1); // setter musen i bolet
           
           //9
        Mus muss2 = new Mus ("mick",true); // oppretter andre muss
        
         //10
         musBol.settInn(muss2); // prover o sette en mus i et bol som er tatt
        
        
        //11
        
       katt1.jakt(musBol, rotteBol); // katten gor po jakt 
       
     }
    
}
