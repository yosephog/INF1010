



public class Mus {
    
    private String navn;
    private boolean lever;
    
   public Mus(String navn,boolean lever){
        
        this.navn=navn;
        this.lever=lever;
    }
    // Metoden returnere true hhvis musen levere
    public boolean getLever(){
        
        return this.lever;
    }
    // Metoden setter statusen av musen til true hvis mussen lever eller false hvis ikke
   public void setLever(boolean leve){
       
       this.lever=leve;
       
   }
    // Methoden returner navnet av mussen 
    public String getNavn(){
        
        return this.navn;
        
    }
  
}
