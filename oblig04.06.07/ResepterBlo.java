
package yosephogoppgave04;


public final class ResepterBlo extends Resepter{
    
   private double pris;
    
    
    public ResepterBlo (int unikNUmmer,String colour, Pasienter p,Leger lg,
   LegeMidler lm, int reit 
            ){
        
        super(unikNUmmer,colour,p,lg,lm,reit);
        this.pris=pris;
    }
    /*
    gets the price for a blo medicine
    */
    public double getPris(){
        
        return this.pris;
    }
    
}
