
package yosephogoppgave04;


public abstract class LegeMidler {
    
    private String navn;
    private int unikNummer;
    private double pris;
    
    public LegeMidler(int unikNummer,String navn, double pris){
        
        this.navn=navn;
        this.unikNummer=unikNummer;
        this.pris=pris;
        
    }
    
    public String getNavn(){
        
        return this.navn;
    }
    
   
    
    public int getUnikNummer(){
      
        return this.unikNummer;
    }
    public double getPris(){
        
        return this.pris;
    }
    
}
