
package yosephogoppgave04;


public abstract class Resepter {
    
    private int unikNummer;
    private int reit; 
    LegeMidler midler;
    Leger legeNavn;
    Pasienter pasientNavn;
    double pris;
    String colour;
    
    public Resepter(int unikNummer,String colour,Pasienter pasientNavn,Leger legeNavn,LegeMidler midler
    ,int reit) {
        
        this.unikNummer=unikNummer;
        this.reit=reit;
        this.midler=midler;
        this.legeNavn=legeNavn;
        this.pasientNavn=pasientNavn;
        this.pris=pris;
        this.colour=colour;
    }
     // this method returns the number of reits if it greater than 1
    //and retur 0 if the reit is 0
    public int getreit(){
         if(this.reit > 0)
             return this.reit;
         else 
             return 0;
    }
    
   
    
     public int getUnikNummer(){
        
       return this.unikNummer;
        
        
    }
     public double getPrice(){
         return this.pris;
     }
    public String toString(){
        
        return this.unikNummer + " " + this.reit;
    }
    
    public LegeMidler getLegeMidler(){
        return this.midler;
    }
    public Leger getLeger(){
        return this.legeNavn;
    }
    public String getColour(){
        return this.colour;
    }
}
