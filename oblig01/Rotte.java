



public class Rotte {
    
    private String navn;
    private boolean lever;
    private boolean skadet;
    
    public Rotte(String navn,boolean lever,boolean skadet){
        
        this.navn=navn;
        this.lever=lever;
        this.skadet=skadet;
    }
    // Returnere navnet av Rotten
    public String getNavn(){
        
        return this.navn;
        
    }
    // Metoden returnere true hvis rotten er ikke skadet og lever 
    // hvis ikke returnere false
    public boolean getLever(){
        
        return !this.skadet && this.lever==true;
        
    }
    //Metoden setter om rotten lever (true) eller ikke (false)
    public void setLever(boolean leve){
        
        this.lever=leve;
    }
    // Metoden setter om rotten er skadet(true) eller ikke(false)
    public void setSkadet(boolean skad){
        
        this.skadet=skad;
    }
    // returner boolean vardien som er oppgitt po meoden setSkadet
    public boolean getSkadet(){
        
        return this.skadet;
        
    }
}
