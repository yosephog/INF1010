



public class Katt {
    
    private String navn;
   
    public Katt(String navn){
      
        this.navn=navn;
    }
    // reture kattens navn
    public String getNavn(){
        
        return this.navn;
    } 
    
   public void jakt(Bol<Mus> musBolet,Bol<Rotte>rotteBol){
       
        Mus m=musBolet.getInput(); // henter muss fra mussBolet
        
        Rotte r= rotteBol.getInput();// henter rotte fra rotteBolet
        
        // sjekker om musBolet er ikke tomt og mussen i bolet lever
        // so katten kan go po jakt
         if(!musBolet.tomt() && m.getLever())
         {
             
            System.out.println("katten " + " " + getNavn() + " " + "gjorde et angrep på " + " " + m.getNavn() );
             m.setLever(false);
            System.out.println("Mussen " + " " + m.getNavn() + " " + "gikk fra å være levende til å være død " );
            
             musBolet.taUt();
             return;
         }
         
         // sjekker rotteBol etter musBolet og angreper rotten hvis det finner rotte i rotteBOl som lever
          if(!rotteBol.tomt() && r.getLever())
          {
              System.out.println("Katten " + " " + getNavn() + " " + " gjore et angrep på " + " " + r.getNavn() );
              r.setSkadet(true);
              r.setLever(false);
             
              System.out.println("Rotta"+ " " + r.getNavn() + " " + " gikk fra til å være skadet");
             
              rotteBol.taUt();
          }
          
          // skriver ut om begge musBolet og rotteBolet er tome, eller musse og rotte dod
         else  
              System.out.println("Katten " + " " + getNavn() + " " + "fant ingen gnagere. Jakten avsluttes.");
   }
    
         
    }
        
        
     
                
               
                 
                    
               
                
               
            
        
    

